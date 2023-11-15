package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.*;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_animeLicensors",
            joinColumns = @JoinColumn(name = "anime_id"))

    private List<AnimeLicensor> animeLicensors;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_animeStudios",
            joinColumns = @JoinColumn(name = "anime_id"))
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
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_Characters",
            joinColumns = @JoinColumn(name = "anime_id"))
    private List<Character> Characters;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<VoiceActor> voiceActors;
    @Column
    @OneToMany(mappedBy = "anime")
    private List<Staff> staffs;
    @Column
    @ManyToMany
    private List<Anime> relatedAnime;
    @Column
    private String background;
    @Column
    private String posterUrl;
    @OneToMany(mappedBy = "anime")
    @Column
    private List<Review> reviews;

    /*

    TODO Opening Theme
    TODO Ending Theme
     */

}