package com.groupeflutter.groupeflutterapi.controllers;

import com.groupeflutter.groupeflutterapi.Model.Category;
import com.groupeflutter.groupeflutterapi.services.CategoryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/category")
public class CategoryController
{
    @Autowired
    CategoryServiceImp categoryServiceImp;

    @PostMapping("/addCategory")
    public String addCategory(@RequestBody Category category)
    {
        return categoryServiceImp.addCategory(category);
    }

    @GetMapping("/getAllCategory")
    public List<Category> getAllCategory()
    {
        return categoryServiceImp.getAllCategory();
    }
}
