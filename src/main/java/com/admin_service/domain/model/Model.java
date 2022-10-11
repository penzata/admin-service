package com.admin_service.domain.model;

import javax.persistence.*;

@Entity
@Table(name="models")
public class Model {
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer manufacturerId;
    private String name;

    public Model() {
    }

    public Model(Integer id, Integer manufacturerId, String name) {
        this.id = id;
        this.manufacturerId = manufacturerId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

