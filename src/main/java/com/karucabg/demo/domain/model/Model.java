package com.karucabg.demo.domain.model;

import javax.persistence.*;

@Entity
@Table(name="models")
public class Model extends Manufacturer{
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue
    private Integer id;
    private final Integer manufacturerId;
    private String name;


    public Model(Integer id, Integer manufacturerId, String name) {
        this.id = id;
        this.manufacturerId = manufacturerId;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
