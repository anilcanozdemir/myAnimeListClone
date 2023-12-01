package com.myanimelist.myAnimeListClone.DTOs;

import com.myanimelist.myAnimeListClone.Entity.Genre;
import com.myanimelist.myAnimeListClone.Entity.Item.Anime;
import com.myanimelist.myAnimeListClone.Entity.Item.Manga;
import com.myanimelist.myAnimeListClone.Entity.Item.Review;
import com.myanimelist.myAnimeListClone.Entity.ItemCharacter;
import com.myanimelist.myAnimeListClone.Enums.AnimeType;
import com.myanimelist.myAnimeListClone.Enums.Demographic;
import com.myanimelist.myAnimeListClone.Enums.ItemStatus;
import com.myanimelist.myAnimeListClone.Enums.Theme;
import lombok.Value;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * DTO for {@link Anime}
 */
@Value
public record AnimeUpdateRequestDto(Long id, Integer episodeCount, ItemStatus itemStatus, Date startDate,
                                    Date finishDate, Set<Genre> genreSet, Theme theme, Demographic demographic,
                                    String snopsis, List<ItemCharacter> characters, List<Review> itemReviews,
                                    AnimeType animeType, Integer durationByMinute, Manga adaptionManga,
                                    List<Anime> alternativeVersionAnime, List<Anime> sideStoryAnimes,
                                    List<Anime> spinOfAnimes) implements Serializable {
}