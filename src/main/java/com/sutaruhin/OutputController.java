package com.sutaruhin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("output")
    public String output(@RequestParam(required = false) String text1, InputForm inputForm, Model model) {
        model.addAttribute("output1", text1);
        model.addAttribute("output2", inputForm);
        return "output";
    }
}