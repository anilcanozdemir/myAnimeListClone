package com.myanimelist.myAnimeListClone.Core.ModelMapper;

import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Entity.Item.Anime;
import org.springframework.stereotype.Component;

@Component
public class AnimeMapper implements MapperProfile<AnimeResponseDto, AnimeSaveRequestDto, AnimeUpdateRequestDto, Anime> {
    /*TODO

     */
    @Override
    public AnimeResponseDto entitytoResponseDto(Anime anime) {
        return new AnimeResponseDto(anime.getId(), anime.getEpisodeCount(),anime.getItemStatus(),anime.getStartDate(),anime.getFinishDate(),anime.getGenreSet(),anime.getTheme(),anime.getDemographic()
        , anime.getSnopsis(), anime.getCharacters(),anime.getItemReviews(),anime.getAnimeType(),anime.getDurationByMinute(),
                anime.getAdaptionManga(),anime.getAlternativeVersionAnime(),
                anime.getSideStoryAnimes(),anime.getSpinOfAnimes());
    }

    @Override
    public Anime saveRequestDtoToEntity(AnimeSaveRequestDto animeSaveRequestDto) {
        return null;
    }

    @Override
    public Anime updateRequestDtoEntity(AnimeUpdateRequestDto animeUpdateRequestDto) {
        return null;
    }
}
