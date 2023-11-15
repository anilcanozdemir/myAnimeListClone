package com.myanimelist.myAnimeListClone.Entity.Company;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass

/*
    TODO Bazı Entitylerin bu classtan inherit alması lazım
    AnimeLicensor AnimeProducer AnimeStudio etc.
* */
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}