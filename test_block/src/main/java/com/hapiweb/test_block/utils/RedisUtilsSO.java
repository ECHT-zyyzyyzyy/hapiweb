package com.hapiweb.test_block.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class RedisUtilsSO {

    @Autowired
    @Qualifier("redisTemplateStringObject")
    RedisTemplate<String, Object> redisTemplate;

    public boolean haskey(String str){
        return redisTemplate.hasKey(str);
    }

    public boolean set(String str, Object obj, Long time){
        if(str!=null&&str.trim()!=""&&obj!=null&&time>0L){
            redisTemplate.opsForValue().set(str, obj, time);
            return true;
        }
        return false;
    }

    public boolean del(String str){
        return redisTemplate.delete(str);
    }

    public Object get(String str){
        return str == null ? null : redisTemplate.opsForValue().get(str);
    }

}
