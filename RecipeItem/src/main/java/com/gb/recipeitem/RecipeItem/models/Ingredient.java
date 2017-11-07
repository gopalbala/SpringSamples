package com.gb.recipeitem.RecipeItem.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by gbalasubramanian on 07/11/17.
 */
@Getter
@Setter
@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;

    String description;
    BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    UnitOfMeasure unitOfMeasure;

    @ManyToOne
    Recipe recipe;
}
