package com.example.shantanu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI {

    @GetMapping("/")
    public String sayHello()
    {
        return "Welcome to Application";
    }

    @GetMapping("/check")
    public String checkPayment()
    {
        return "72572.293";
    }

    @GetMapping("/search")
    public String search(@RequestParam String q)
    {
        DataBaseStore db = new DataBaseStore();
        return db.getSearch(q);
    }
}
