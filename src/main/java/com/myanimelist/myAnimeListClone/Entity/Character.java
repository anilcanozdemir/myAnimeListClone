package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "character")
public class Character {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_Characters",
            joinColumns = @JoinColumn(name = "Character_id"))
    private List<Anime> animeList;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "manga_Characters",
            joinColumns = @JoinColumn(name = "Character_id"))
    private List<Manga> mangaList;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "voiceActors_Characters",
            joinColumns = @JoinColumn(name = "Character_id"))
    @Column
    private List<VoiceActor> voiceActors;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String japaneseName;
    @Column
    private String nickname;
    /*
    TODO ANIME RELATIONS : SUPPORTING ROLE OR MAIN CHARACTER SELECTION ? HOW TO DO
        TODO MANGA RELATIONS : SUPPORTING ROLE OR MAIN CHARACTER SELECTION ? HOW TO DO
     */
    @Column
    private String biography;
    @Column
    private String pictureUrl;


}