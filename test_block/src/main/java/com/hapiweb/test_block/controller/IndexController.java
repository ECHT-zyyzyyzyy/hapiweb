package com.hapiweb.test_block.controller;

import com.hapiweb.test_block.model.Status;
import com.hapiweb.test_block.model.webModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @ResponseBody
    @GetMapping("/toIndex")
    public webModel ToIndex(){
        return new webModel("index", Status.SUCCESS.getCode(), "hello!");
    }

}
