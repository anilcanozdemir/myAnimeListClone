package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "anime_studio")
public class AnimeStudio {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String japaneseName;
    private Date establishedDate;
    private String description;
    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_animeStudios",
            joinColumns = @JoinColumn(name = "animeStudio_id"))
    private List<Anime> animeList;
    private String availableAt;

}