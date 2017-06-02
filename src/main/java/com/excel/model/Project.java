package com.excel.model;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/2.
 */
@Entity
@Table(name = "project")
public class Project {
    private Integer id;
    private String name;
    private String technology;//所用技术
    private String remarks;//备注

    @Id
    @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "technology")
    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
