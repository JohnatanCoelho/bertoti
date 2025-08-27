package com.projectrest.creatine.dto;

import com.projectrest.creatine.entities.Creatine;

import java.util.Objects;

public class CreatineDTO {

        private Long id;
        private String name;
        private String shortDescription;
        private String longDescription;
        private Double price;

   public CreatineDTO(){}

    public CreatineDTO(Creatine entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.shortDescription = entity.getShortDescription();
        this.longDescription = entity.getLongDescription();
        this.price = entity.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CreatineDTO that = (CreatineDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
