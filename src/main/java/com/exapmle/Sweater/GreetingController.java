package com.exapmle.Sweater;

import com.exapmle.Sweater.domain.Message;
import com.exapmle.Sweater.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private MessageRepo messageRepo;
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World")
                    String name, //на вход метода поступает параметр name, по дефолту идет "world"
            Map<String,Object> model) //моель это то куда мы будем складывать данные. которые хотим вернуть пользователю
    {
        model.put("name", name); //в поле name кладем то что мы получили
        return "greeting"; //возвращаем шаблон с именем greeting, ожидается что все шаблоны будут лежать в папке templates или ее дочерних папках
    }
    @GetMapping
    public String helloPage(Map<String,Object> model){
        Iterable<Message> messages=messageRepo.findAll();
        model.put("messages",messages);
        return "main";
    }

    @PostMapping("add")
    public String add(@RequestParam String text //аннотация. которая выдергивает данные из запроса
            ,@RequestParam String tag,Map<String,Object> model){
        Message message=new Message(text,tag);
        messageRepo.save(message);
        Iterable<Message> messages= messageRepo.findAll();
        model.put("messages",messages);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter,Map<String,Object> model){
        Iterable<Message> messages;

        if(filter==null||filter.isEmpty())
            messages=messageRepo.findAll();
        else
            messages=messageRepo.findByTag(filter);
        model.put("messages",messages);
        return "main";
    }
}
