package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    @GetMapping("index1")
    public String index1(){
        return "Hello World!";
    }
    @GetMapping("index2")
    public String index2(){
        return "Helloo";

    }
    @GetMapping("index3")
    public String index3(){
        return "Mnuja";
    }


}

