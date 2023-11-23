package com.myanimelist.myAnimeListClone.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ıtem_character")
public class ItemCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "anime_characters",
            joinColumns = @JoinColumn(name = "character_id"))
    private List<Anime> animeList;


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "manga_characters",
            joinColumns = @JoinColumn(name = "character_id"))
    private List<Manga> mangaList;
    @Column
    private String description;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ıtem_character_voiceActors",
            joinColumns = @JoinColumn(name = "itemCharacter_id"))
    private List<VoiceActor> voiceActors;

}