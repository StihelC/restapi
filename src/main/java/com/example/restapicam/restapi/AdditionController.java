package com.example.restapicam.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")
public class AdditionController {

    @GetMapping
    public @ResponseBody int add(@RequestParam(required = true) int num1, @RequestParam(required = true) int num2) {
        return num1 + num2;
    }
}
