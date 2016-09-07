package com.exppublishing.hfyhq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @author Aelanna
 * @since 9/6/2016
 */
@Controller
public class SiteController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("time", new Date());
        return "index";
    }
}