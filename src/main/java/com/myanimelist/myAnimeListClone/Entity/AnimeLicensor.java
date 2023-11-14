package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.*;
import lombok.Cleanup;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "anime_licensor")
public class AnimeLicensor {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    private String japaneseName;
    @Column
    private String synonyms;
    @Column
    private Date establishedDate;
    @Column
    private Date dissolvedDate;
    @Column
    private String information;
    @Column
    private String availableAt;
    @Column
    private String resources;
    @Column
    private String logoUrl;
    @Column
    @ManyToMany
    private List<Anime> animeList;
}