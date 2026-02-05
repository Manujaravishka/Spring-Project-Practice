package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/request")
@RestController
public class RequestController {
    @PostMapping
    public String post(@RequestHeader("Authorization") String authorization,
        @RequestHeader("token")String token){
        return "Hello World!6" + authorization+": Token" +token;
    }
    @PostMapping("querystring")
    public String getQueryStringParameters(@RequestParam("name") String name, @RequestParam("address")String address, @RequestParam("id")String id){
        return "Hello World!7 "+ name+" : "+address + " : " +id + " : ";
    }
    @PostMapping("pathvariable/{name}/{address}")
    public String getPathVariables(@PathVariable("name") String name, @PathVariable("address")String address  )
}
