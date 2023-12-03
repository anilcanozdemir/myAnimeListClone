package com.myanimelist.myAnimeListClone.Service.Implementation;

import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Service.Contracts.AnimeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeManager implements AnimeService {

    @Override
    public Result add(AnimeSaveRequestDto animeSaveRequestDto) {
        return null;
    }

    @Override
    public DataResult<AnimeResponseDto> deleteByid(Long id) {
        return null;
    }

    @Override
    public DataResult<List<AnimeResponseDto>> getAll() {
        return null;
    }

    @Override
    public DataResult<AnimeResponseDto> getById(Long id) {
        return null;
    }

    @Override
    public Result updateById(AnimeUpdateRequestDto animeUpdateRequestDto, Long id) {
        return null;
    }
}
