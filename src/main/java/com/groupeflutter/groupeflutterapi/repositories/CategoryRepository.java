package com.groupeflutter.groupeflutterapi.repositories;

import com.groupeflutter.groupeflutterapi.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>
{

}
