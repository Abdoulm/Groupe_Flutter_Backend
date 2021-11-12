package com.groupeflutter.groupeflutterapi.Model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Panneaux implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String photo;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Categories categorie;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String audio;


}
