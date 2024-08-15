package com.example.studysample.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.studysample.dto.UserForm;

@Controller
@RequestMapping("/")
public class HomeController {
    // GetMappingとして設定
    @GetMapping // <- localhost:8080/?keyword=test
    public String index(
            @RequestParam(name = "keyword", required = false, defaultValue = "なし") String str,
            Model model) {
        model.addAttribute("message", str);
        return "index";
    }

    @GetMapping("/many/{age}/{name}/{job}")
    // localhost:8080/many/17/-/engineer
    public String manyQueryParam(
            @PathVariable("name") String name,
            @PathVariable("age") int age,
            @PathVariable("job") String job,
            Model model) {

        if (name.equals("-")) {
            name = "名無し";
        }

        String message = age >= 18 ? "18歳以上なので成人です" : "18未満なので未成年です";

        model.addAttribute("aaa", name);
        model.addAttribute("age", age);
        model.addAttribute("job", job);
        model.addAttribute("message", message);
        return "many";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        return "showForm";
    }

    @GetMapping("login") // localhost:8080/login
    public String login(@RequestParam(name = "id") String id, @RequestParam(name = "password") String password) {
        return null;
    }

    @GetMapping("/hobby")
    public String showHobby(
            @RequestParam(name = "hobbys") List<String> hobbys,
            @RequestParam(name = "name", required = false, defaultValue = "匿名") String name,
            Model model) {

        model.addAttribute("hobbys", hobbys);
        model.addAttribute("name", name);
        return "hobby";
    }

    @GetMapping("/hobbyForm")
    public String showHobbyForm(Model model) {
        return "hobbyForm";
    }

    @PostMapping("/many")
    public String manyQueryPostParam(
            @ModelAttribute UserForm userForm,
            Model model) {

        model.addAttribute("userInput", userForm);
        return "manyPost";
    }

}