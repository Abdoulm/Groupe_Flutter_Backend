package com.groupeflutter.groupeflutterapi.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomCategory;

    @Column(nullable = false)
    private String imageCategory;

    @Column(nullable = false)
    private String audioCategory;

    @Column(nullable = false)
    private String descriptionCategory;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Panneaux> panneaux;
}
