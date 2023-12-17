package com.myanimelist.myAnimeListClone.Entity.Item;

import com.myanimelist.myAnimeListClone.Enums.AnimeType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "anime")
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Anime extends Item {
    @Column
    @Enumerated(EnumType.STRING)

    private AnimeType animeType;
    @Column

    private Integer durationByMinute;

    /*TODO Related AnimeList relation check*/
    @ManyToOne
    @JoinColumn(name = "adaption_manga_id")
    private Manga adaptionManga;
    private List<Anime> alternativeVersionAnime;
    private List<Anime> sideStoryAnimes;
    private List<Anime> spinOfAnimes;

    private String animeName;


}