package com.groupeflutter.groupeflutterapi.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @JsonBackReference
    @ManyToOne
    @JoinColumn()
    private Category category;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String audio;


}
