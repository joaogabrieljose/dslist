package com.javaspring.dslist.services.gamesList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.dslist.dto.GameListDTO;
import com.javaspring.dslist.entity.GameList;
import com.javaspring.dslist.exception.GameListListNotNullException;
import com.javaspring.dslist.repository.GameListRepository;

@Service
public class GameListUseCase {
    
    @Autowired
    private GameListRepository gameListRepository;

    public List<GameListDTO> findAllList(){

        List<GameList> create = this.gameListRepository.findAll();
        if (create == null) {
            throw new GameListListNotNullException();
        }
        List<GameListDTO> dto =  create.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
    
}
