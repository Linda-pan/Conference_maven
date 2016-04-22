package com.linda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jpan on 2016/4/22.
 */
@Controller
@RequestMapping("")
public class indexController {

    @RequestMapping("")
    public String index(){
        return "/index";
    }
}
