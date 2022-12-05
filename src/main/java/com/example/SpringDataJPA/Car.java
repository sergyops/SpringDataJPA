package com.example.SpringDataJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Car {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;
    private String model;
    private Integer fabricate;
    //constructores

    public Car() {
    }

    public Car(Long id, String manufacturer, String model, Integer fabricate) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.fabricate = fabricate;
    }

    //getter y setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return fabricate;
    }

    public void setYear(Integer year) {
        this.fabricate = fabricate;
    }

    //tostring (método para ver en la terminal)

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", fabricate=" + fabricate +
                '}';
    }
}
