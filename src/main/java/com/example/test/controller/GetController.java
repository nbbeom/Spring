package com.example.test.controller;


import com.example.test.model.searchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET , path = "/getMethod")
    public String getRequest(){
        return "hi";
    }
    @GetMapping("/getParam") //http://localhost:8080/api/getParam?id=1234&pwd=abcd
    public String getParam(@RequestParam String id, @RequestParam String pwd){
        System.out.println("id : "+id);
        System.out.println("pwd : "+ pwd);
        return id+pwd;
    }

    //localhost:8080/api/getMultiParam?account=abcd&email=study@gmail.com&page=10
    @GetMapping("/getMultiParam")
    public searchParam getMultiParameter(searchParam sp){
        System.out.println(sp.getAccount());
        System.out.println(sp.getEmail());
        System.out.println(sp.getPage());

    return sp;
    }


}
