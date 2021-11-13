package com.groupeflutter.groupeflutterapi.services;

import com.groupeflutter.groupeflutterapi.Model.Category;
import com.groupeflutter.groupeflutterapi.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp implements CategoryService
{
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public String addCategory(Category category) {
        categoryRepository.save(category);
        return "Ajouter avec succès !";
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }
}
