package com.choicho.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }

    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello helloworldJson()
    {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }

    @GetMapping(value = "helloworld/page")
    public String helloworld(){
        return "helloworld";
    }

    @Getter
    @Setter
    private static class Hello {
        public String message;
    }
}
