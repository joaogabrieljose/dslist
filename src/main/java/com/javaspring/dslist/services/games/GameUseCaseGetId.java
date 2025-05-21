package com.javaspring.dslist.services.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.dslist.dto.GameDTO;
import com.javaspring.dslist.entity.Game;
import com.javaspring.dslist.exception.GameFandByIdNotFoundException;
import com.javaspring.dslist.repository.GameRepository;

@Service
public class GameUseCaseGetId {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findByIdGame(Long id){

        Game result = this.gameRepository.findById(id).get();
        if (result == null) {
            throw new GameFandByIdNotFoundException();
        }

        GameDTO dto = new GameDTO(result);
        return dto;
    }
    
}
