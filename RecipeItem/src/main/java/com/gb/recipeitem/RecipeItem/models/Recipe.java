package com.gb.recipeitem.RecipeItem.models;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.ast.Not;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by gbalasubramanian on 07/11/17.
 */
@Getter
@Setter
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "recipe")
    Set<Ingredient> ingredients;

    @Lob
    Byte[] image;

    @Enumerated(value = EnumType.STRING)
    Difficulty difficulty;

    @OneToOne(cascade = CascadeType.ALL)
    Notes notes;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
    Set<Category> categories;
}
