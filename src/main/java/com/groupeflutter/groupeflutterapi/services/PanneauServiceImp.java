package com.groupeflutter.groupeflutterapi.services;

import com.groupeflutter.groupeflutterapi.Model.Panneaux;
import com.groupeflutter.groupeflutterapi.repositories.PanneauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PanneauServiceImp implements PanneauService
{
    //Injection du repository
    @Autowired
    private PanneauRepository panneauRepository;

    //Methode pour ajouter un panneau
    @Override
    public Panneaux addPanneau(Panneaux panneaux) {
        return panneauRepository.save(panneaux);
    }

    //Methode pour récupérer tous les panneaux
    @Override
    public List<Panneaux> getAllPanneaux() {
        return panneauRepository.findAll();
    }

    //Methode pour récupérer un panneau par Id
    @Override
    public Panneaux getPanneauById(Long panneauId) {
        return panneauRepository.findById(panneauId).get();
    }

    //Methode pour modifier un panneau
    @Transactional
    public void updatePanneau(Panneaux panneaux, Long panneauId)
    {
        Panneaux panneauExistant = panneauRepository.getById(panneauId);

        panneauExistant.setNom(panneaux.getNom());
        panneauExistant.setPhoto(panneaux.getPhoto());
        panneauExistant.setAudio(panneaux.getAudio());
        panneauExistant.setDescription(panneaux.getDescription());

    }
}
