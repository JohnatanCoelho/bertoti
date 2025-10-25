package com.projectrest.creatine.dto;

import com.projectrest.creatine.entities.Creatine;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class CreatineDTO {

    private Long id;
    private String name;
    private String shortDescription;
    private String image;
    private Double price;

    public CreatineDTO(Creatine creatine){
        id = creatine.getId();
        image = creatine.getImage();
        name = creatine.getName();
        shortDescription = creatine.getShortDescription();
        price = creatine.getPrice();
    }
}
