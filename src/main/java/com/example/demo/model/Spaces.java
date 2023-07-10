package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Spaces {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "spaces")
    @GenericGenerator(name = "spaces", strategy = "increment")
    private Long id;
    private String name;
    private String stage;
    private Boolean disabled;
    private Boolean occupied;
    private Boolean reserved;
    private Boolean electric;
    private Boolean close;

    protected Spaces() {}

    public Spaces(String name, String stage, Boolean disabled, Boolean occupied, Boolean reserved, Boolean electric, Boolean close) {
        this.name = name;
        this.stage = stage;
        this.disabled = disabled;
        this.occupied = occupied;
        this.reserved = reserved;
        this.electric = electric;
        this.close = close;
    }

    @Override
    public String toString() {
        return "Spaces{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stage='" + stage + '\'' +
                ", disabled=" + disabled +
                ", occupied=" + occupied +
                ", reserved=" + reserved +
                ", electric=" + electric +
                ", close=" + close +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStage() {
        return stage;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public Boolean getElectric() {
        return electric;
    }

    public Boolean getClose() {
        return close;
    }

}
