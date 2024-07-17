package com.example.food_master.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.food_master.model.Foodstock;
import com.example.food_master.repository.FoodRepository;

@Controller
@RequestMapping("/foods")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

    @GetMapping
    public String foodList(Model model) {
        List<Foodstock> foods = foodRepository.findAll();
        model.addAttribute("foods", foods);
        return "food-list"; // ビューの名前を返す
    }
}
