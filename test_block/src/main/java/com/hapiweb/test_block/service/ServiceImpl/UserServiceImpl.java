package com.hapiweb.test_block.service.ServiceImpl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.hapiweb.test_block.dao.UserMapper;
import com.hapiweb.test_block.dto.UserDTO;
import com.hapiweb.test_block.entity.User;
import com.hapiweb.test_block.entity.UserExample;
import com.hapiweb.test_block.model.Status;
import com.hapiweb.test_block.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public String getPk(){
        return UUID.randomUUID().toString();
    }

    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getGenkey())
                .sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }


    @Override
    @Transactional
    public UserDTO register(UserDTO userDTO) {
        // todo
        //1、检查字段
        if(userDTO.getUser().getUsername()==null
                ||userDTO.getUser().getPassword()==null
                ||userDTO.getUser().getUsername().trim()==""
        ){
            UserDTO userDTOrt = new UserDTO();
            userDTOrt.setCode(Status.CANT_BE_EMPTY.getCode());
            userDTOrt.setMessage((Status.CANT_BE_EMPTY.getDisc()));
            return userDTOrt;
        }
        //2、检查似乎否存在用户
        UserExample userExample1 = new UserExample();
        UserExample.Criteria criteria1 = userExample1.createCriteria();
        criteria1.andUsernameEqualTo(userDTO.getUser().getUsername());
        List<User> result = userMapper.selectByExample(userExample1);
        if (result.size()!=0){
            UserDTO userDTOrt = new UserDTO();
            userDTOrt.setCode(Status.USER_ALREADY_EXISTS.getCode());
            userDTOrt.setMessage((Status.USER_ALREADY_EXISTS.getDisc()));
            return userDTOrt;
        }
        //3、若不存在则插入用户
        User userins = new User();
        BeanUtils.copyProperties(userDTO.getUser(), userins);
        String newUserPk = getPk();
        userins.setGenkey(newUserPk);
        userMapper.insert(userins);
        //4、返回注册的新用户
        User userrt = userMapper.selectByPrimaryKey(newUserPk);
        UserDTO userDTOrt = new UserDTO();
        userDTOrt.setUser(userrt);
        userDTOrt.setCode(Status.REGISTER_SUCCESS.getCode());
        userDTOrt.setMessage(Status.REGISTER_SUCCESS.getDisc());
        return userDTOrt;
    }

    @Override
    @Transactional
    public UserDTO signinByUsername(UserDTO userDTO) {

        //1、检查字段
        if(userDTO.getUser().getUsername()==null
                ||userDTO.getUser().getPassword()==null
                ||userDTO.getUser().getUsername().trim()==""
        ){
            UserDTO userDTOrt = new UserDTO();
            userDTOrt.setCode(Status.CANT_BE_EMPTY.getCode());
            userDTOrt.setMessage((Status.CANT_BE_EMPTY.getDisc()));
            return userDTOrt;
        }
        //2、检查用户名是否存在
        boolean signinflag = false;
        User queryed = null;
        UserExample userExample1 = new UserExample();
        UserExample.Criteria criteria1 = userExample1.createCriteria();
        criteria1.andUsernameEqualTo(userDTO.getUser().getUsername());
        List<User> result = userMapper.selectByExample(userExample1);
        if(result.size()!=0){
            queryed = result.get(0);
            //3、检查密码是否正确
            if(userDTO.getUser().getPassword()==queryed.getPassword())
                signinflag = true;
        }
        if (!signinflag){
            UserDTO userDTOrt = new UserDTO();
            userDTOrt.setCode(Status.USER_OR_PW_ERR.getCode());
            userDTOrt.setMessage((Status.USER_OR_PW_ERR.getDisc()));
            return userDTOrt;
        }
        //4、生成token
        UserDTO userDTOrt = new UserDTO();
        userDTOrt.setCode(Status.SIGNIN_SUCCESS.getCode());
        userDTOrt.setMessage((Status.SIGNIN_SUCCESS.getDisc()));
        userDTOrt.setUser(queryed);
        String token = getToken(userDTOrt.getUser());
        Map<String, String> tokenMap = new HashMap<>();

        userDTOrt.setToken(token);
        //5、返回用户与token
        return userDTOrt;
    }

    @Override
    public UserDTO signout(UserDTO userDTO) {
        return null;
    }

}
