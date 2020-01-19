package com.gyf.web.controller;

import com.gyf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author QY3022
 */
@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("username","zhangsan");
        model.addAttribute("age",20);
        List<Student> list = new ArrayList<Student>();
        Student stu1 = new Student(111,"one1","男");
        list.add(stu1);
        Student stu2 = new Student(222,"one2","男");
        list.add(stu2);
        Student stu3 = new Student(333,"one3","女");
        list.add(stu3);
        model.addAttribute("stuList",list);
        return "stu/list";
    }

}
