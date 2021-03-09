package com.example.test.controller;

import com.example.test.model.searchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    //html <form>
    //ajax 검색
    // html post body-> data
    //json xml multipart form /textplain

    @PostMapping("/postMethod")
    public searchParam postMethod(@RequestBody searchParam sp){

        return sp;

    }
}
