package com.titzko.assets.controller;

import com.titzko.service.HelloWorldService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assets")
@RequiredArgsConstructor
public class AssetsController {

    private final HelloWorldService helloWorldService;

    @GetMapping()
    public String getHelloWorldMsg(Model model) {
        model.addAttribute("msg", helloWorldService.getHelloWorldMsg());
        return "hello-world";
    }

    @GetMapping("/overview")
    public String getOverview() {
        return "overview";
    }
}
