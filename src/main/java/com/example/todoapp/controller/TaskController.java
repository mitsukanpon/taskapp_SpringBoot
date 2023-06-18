package com.example.todoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.todoapp.entity.Task;
import com.example.todoapp.Mapper.TaskMapper;

@Controller
public class TaskController {

    @Autowired
    TaskMapper taskMapper;

    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Task> list = taskMapper.selectAll();
        model.addAttribute("tasks", list);
        return "index";
    }

    @RequestMapping(value = "/add")
    public String add(Task task) {
        taskMapper.add(task);
        return "redirect:/";
    }

    @RequestMapping(value = "/update")
    public String update(Task task) {
        taskMapper.update(task);
        return "redirect:/";
    }
}
