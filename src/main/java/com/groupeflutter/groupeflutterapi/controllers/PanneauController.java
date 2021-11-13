package com.groupeflutter.groupeflutterapi.controllers;

import com.groupeflutter.groupeflutterapi.Model.Panneaux;
import com.groupeflutter.groupeflutterapi.services.PanneauServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class PanneauController
{
    @Autowired
    private PanneauServiceImp panneauServiceImp;

    @PostMapping("/addPanneau")
    public Panneaux addPanneau(@RequestBody Panneaux panneaux)
    {
        return panneauServiceImp.addPanneau(panneaux);
    }

    @GetMapping("/getAllPanneaux")
    public List<Panneaux> getAllPanneaux()
    {
        return panneauServiceImp.getAllPanneaux();
    }

    @GetMapping("/getPanneauById/{id}")
    public Panneaux getPanneauById(@PathVariable("id") Long panneauId)
    {
        return panneauServiceImp.getPanneauById(panneauId);
    }

    @PutMapping("/updatePanneau/{id}")
    public String updatePanneau(@RequestBody Panneaux panneaux, @PathVariable("id") Long panneauId)
    {
        panneauServiceImp.updatePanneau(panneaux, panneauId);
        return "Mise à jour éffectuée avec succès";
    }
}
