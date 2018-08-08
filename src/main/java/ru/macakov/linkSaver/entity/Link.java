package ru.macakov.linkSaver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Links")
public class Link {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    @Column(name = "tittle", nullable = false)
    private String tittle;
    @Column(name = "url", nullable = false)
    private String url;

}
