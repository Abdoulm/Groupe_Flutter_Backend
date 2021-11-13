package com.groupeflutter.groupeflutterapi.services;

import com.groupeflutter.groupeflutterapi.Model.Panneaux;

import java.util.List;

public interface PanneauService
{
    /*___________________Les methodes des différentes fonctionnalités_________________________*/
    Panneaux addPanneau(Panneaux panneaux);
    List<Panneaux> getAllPanneaux();
    Panneaux getPanneauById(Long panneauId);
    void updatePanneau(Panneaux panneaux, Long panneauId);
}
