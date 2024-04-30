package com.example.apidury.service;

import com.example.apidury.model.Category;
import com.example.apidury.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    public List<Category> loadAll(){
        return categoryRepository.findAll();
    }

    public Optional<Category> get(String id){
        return categoryRepository.findById(id);
    }

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    public Category updateCategory(Category category){
        Optional<Category> categorydb = categoryRepository.findById(category.getId());

        if(categorydb.isPresent()){
            Category categoryUpdate = categorydb.get();
            categoryUpdate.setName(category.getName());
            categoryUpdate.setColor(category.getColor());
            return categoryUpdate;
        }else{
            throw new RuntimeException("Category not found!");
        }
    }

    public void deleteCategory(String id){
        Category category = categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Not found!"));

        categoryRepository.delete(category);
    }
}
