package com.swopnil.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.swopnil.demo.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
    ModelAndView view=new ModelAndView("index");
    return view;
    }

    @GetMapping("/empForm")
    public ModelAndView empForm(){
        ModelAndView view= new ModelAndView("empForm");
        return view;
    }

    @PostMapping("/saveEmp")
    public String  addEmp(@ModelAttribute("employee") Employee employee){
return  null;
    }



}
