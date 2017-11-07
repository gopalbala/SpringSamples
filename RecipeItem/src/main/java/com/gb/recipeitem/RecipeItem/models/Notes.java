package com.gb.recipeitem.RecipeItem.models;

import javax.persistence.*;

/**
 * Created by gbalasubramanian on 07/11/17.
 */
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    Recipe recipe;

    @Lob
    String recipeNotes;

}
