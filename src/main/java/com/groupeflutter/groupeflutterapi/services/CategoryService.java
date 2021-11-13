package com.groupeflutter.groupeflutterapi.services;

import com.groupeflutter.groupeflutterapi.Model.Category;

import java.util.List;

public interface CategoryService
{
    String addCategory(Category category);
    List<Category> getAllCategory();
}
