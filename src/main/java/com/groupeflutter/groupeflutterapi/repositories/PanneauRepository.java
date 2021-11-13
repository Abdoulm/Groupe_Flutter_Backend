package com.groupeflutter.groupeflutterapi.repositories;

import com.groupeflutter.groupeflutterapi.Model.Panneaux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PanneauRepository extends JpaRepository<Panneaux, Long>
{

}
