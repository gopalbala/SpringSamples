package com.gb.recipeitem.RecipeItem.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by gbalasubramanian on 07/11/17.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;
}
