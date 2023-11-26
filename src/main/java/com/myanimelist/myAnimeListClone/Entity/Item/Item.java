package com.myanimelist.myAnimeListClone.Entity.Item;

import com.myanimelist.myAnimeListClone.Entity.Genre;
import com.myanimelist.myAnimeListClone.Entity.ItemCharacter;
import com.myanimelist.myAnimeListClone.Enums.Demographic;
import com.myanimelist.myAnimeListClone.Enums.ItemStatus;
import com.myanimelist.myAnimeListClone.Enums.Theme;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.util.Date;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@MappedSuperclass
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private Integer episodeCount;
    @Enumerated(EnumType.STRING)
    @Column
    private ItemStatus itemStatus;
    @Column
    private Date startDate;
    @Column
    private Date finishDate;
    @ElementCollection(targetClass = Genre.class)
    @CollectionTable(name = "item_genre", joinColumns = @JoinColumn(name = "item_id"))
    @Enumerated(EnumType.STRING)
    private Set<Genre> genreSet;
    @Column
    @Enumerated(EnumType.STRING)
    private Theme theme;
    @Column
    @Enumerated(EnumType.STRING)
    private Demographic demographic;
    @Column
    private String snopsis;
    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "item_characters",
            joinColumns = @JoinColumn(name = "item_id"))

    private List<ItemCharacter> characters;
}