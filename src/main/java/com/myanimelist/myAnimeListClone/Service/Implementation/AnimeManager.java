package com.myanimelist.myAnimeListClone.Service.Implementation;

import com.myanimelist.myAnimeListClone.Core.Exception.AnimeNotFoundException;
import com.myanimelist.myAnimeListClone.Core.ModelMapper.AnimeMapper;
import com.myanimelist.myAnimeListClone.Core.Result.DataResult;
import com.myanimelist.myAnimeListClone.Core.Result.Result;
import com.myanimelist.myAnimeListClone.Core.Result.SuccesDataResult;
import com.myanimelist.myAnimeListClone.Core.Result.SuccessResult;
import com.myanimelist.myAnimeListClone.DTOs.AnimeResponseDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeSaveRequestDto;
import com.myanimelist.myAnimeListClone.DTOs.AnimeUpdateRequestDto;
import com.myanimelist.myAnimeListClone.Entity.Item.Anime;
import com.myanimelist.myAnimeListClone.Repository.AnimeRepository;
import com.myanimelist.myAnimeListClone.Service.Contracts.AnimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AnimeManager implements AnimeService {
    private final AnimeRepository animeRepository;
    private final AnimeMapper animeMapper;

    @Override
    public Result add(AnimeSaveRequestDto animeSaveRequestDto) {

        Anime savedAnime = animeRepository.save(animeMapper.saveRequestDtoToEntity(animeSaveRequestDto));
        return new SuccessResult("To city   :" + savedAnime.getId() +
                " with id  : " + savedAnime.getAnimeName() +
                "  airport added.");
    }

    @Override
    public DataResult<AnimeResponseDto> deleteByid(Long id) {
        Optional<Anime> airport = animeRepository.findById(id);
        airport.ifPresent(animeRepository::delete);
        return new SuccesDataResult<>("Anime with id  " + id + "  deleted successfully.",
                airport.map(animeMapper::entitytoResponseDto)
                        .orElseThrow(() -> new AnimeNotFoundException(id)));

    }

    @Override
    public DataResult<List<AnimeResponseDto>> getAll() {
        List<Anime> airportList = this.animeRepository.findAll();
        if (airportList.isEmpty()) {
            throw new AnimeListEmptyException();
        }
        return new SuccesDataResult<>("AnimeList successfully called.",
                airportList.stream()
                        .map(animeMapper::entitytoResponseDto)
                        .toList());
    }

    @Override
    public DataResult<AnimeResponseDto> getById(Long id) {
        Optional<Anime> airport = this.animeRepository.findById(id);
        return new SuccesDataResult<>("Company with id " + id + "successfully called.",
                airport.map(animeMapper::entitytoResponseDto)
                        .orElseThrow(() -> new AnimeNotFoundException(id)));
    }


    @Override
 
    public Result update(AnimeUpdateRequestDto animeUpdateRequestDto) {
        Optional<Anime> animeOld = this.animeRepository.findById(animeUpdateRequestDto.id());
        if (animeOld.isPresent()) {
            animeRepository.save(animeMapper.updateRequestDtoEntity(animeUpdateRequestDto));
        }
        throw new AnimeNotFoundException(animeUpdateRequestDto.id());
    }
}
