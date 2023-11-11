package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

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
    private AnimeType animeType;
    @Column
    private Long episode;
    @Column
    private Date startDate;
    @Column
    private Date finalDate;
    @Column
    private String broadcastTime;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    private List<AnimeProducer> animeProducers;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    private List<AnimeLicensor> animeLicensors;
    @Column
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "anime")
    private List<AnimeStudio> animeStudios;
    @Column
    private String source;
    @Column
    private List<Genre> genreList;
    @Column
    @Enumerated(EnumType.STRING)
    private Theme theme;
    @Column
    @Enumerated(EnumType.STRING)
    private Demographic demographic;
    @Column
    private String duration;
    @Column
    private String rating;
    @Column
    private String title;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<Title> alternativeTitles;
    @Column
    private String synopsis;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<AnimeCharacter> animeCharacters;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<VoiceActor> voiceActors;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<Staff> staffs;
    @Column
    @ManyToAny
    private List<Anime> relatedAnime;


    /*
    TODO Background
    TODO Related Anime
    TODO Opening Theme
    TODO Ending Theme
    TODO Reviews
     */

}