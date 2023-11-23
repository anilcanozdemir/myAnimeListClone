package com.myanimelist.myAnimeListClone.Entity;

import com.myanimelist.myAnimeListClone.Enums.Language;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "voice_actor")
public class VoiceActor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "ıtem_character_voiceActors",
            joinColumns = @JoinColumn(name = "itemCharacter_id"))
    private List<ItemCharacter> characterList;
    private Language language;
}