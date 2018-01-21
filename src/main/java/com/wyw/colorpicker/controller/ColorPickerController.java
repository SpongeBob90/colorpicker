package com.wyw.colorpicker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyw
 * @date 2018/01/20
 */
@Controller
public class ColorPickerController {

    @GetMapping(value = "/demoPage")
    public String demoPage(){
        return "html/demo.html";
    }

}
