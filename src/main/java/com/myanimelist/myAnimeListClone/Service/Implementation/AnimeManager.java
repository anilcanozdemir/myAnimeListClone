package com.myanimelist.myAnimeListClone.Service.Implementation;

import com.myanimelist.myAnimeListClone.Core.ModelMapper.AnimeMapper;
import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Repository.AnimeRepository;
import com.myanimelist.myAnimeListClone.Service.Contracts.AnimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeManager implements AnimeService {
    private final AnimeRepository animeRepository;
    private final AnimeMapper animeMapper;

    @Override
    public Result add(AnimeSaveRequestDto animeSaveRequestDto) {

        animeRepository.save(animeMapper.saveRequestDtoToEntity(animeSaveRequestDto));

        return null;
    }

    @Override
    public DataResult<AnimeResponseDto> deleteByid(Long id) {
        animeRepository.delete(animeRepository.findById(id).orElseThrow());
        return null;
    }

    @Override
    public DataResult<List<AnimeResponseDto>> getAll() {
        List<AnimeResponseDto> animeResponseDtos=animeRepository.findAll().stream().map(animeMapper::entitytoResponseDto).toList();
        return null;
    }

    @Override
    public DataResult<AnimeResponseDto> getById(Long id) {
        AnimeResponseDto animeResponseDto=animeMapper.entitytoResponseDto(animeRepository.findById(id).orElseThrow());
        return null;
    }



    @Override
    public Result update(AnimeUpdateRequestDto animeUpdateRequestDto) {
        animeRepository.save(animeMapper.updateRequestDtoEntity(animeUpdateRequestDto));
        return null;
    }
}
