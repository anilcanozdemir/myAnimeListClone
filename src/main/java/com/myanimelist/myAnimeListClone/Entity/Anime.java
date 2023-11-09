package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.AnimeType;
import com.myanimelist.myAnimeListClone.Enums.Genre;
import com.myanimelist.myAnimeListClone.Enums.Theme;
import com.myanimelist.myAnimeListClone.Enums.Demographic;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "anime")
public class Anime {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    /*
    Information
     */
    @Column
    @Enumerated(EnumType.STRING)
    AnimeType animeType;
    @Column
    Long episode;
    @Column
    Date startDate;
    @Column
    Date finalDate;
    @Column
    String broadcastTime;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    List<AnimeProducer> animeProducers;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    List<AnimeLicensor> animeLicensors;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    List<AnimeStudio> animeStudios;
    @Column
    String source;
    @Column
    List<Genre> genreList;
    @Column
    Theme theme;
    @Column
    Demographic demographic;
    @Column
    String duration;
    @Column
    String Rating;
    /*
    TODO Alternative Titles
    TODO Synopsis
    TODO Background
    TODO Related Anime
    TODO Characters & Voice Actors
    TODO Staff
    TODO Opening Theme
    TODO Ending Theme
    TODO Reviews
     */

}