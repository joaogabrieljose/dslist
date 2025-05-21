package com.javaspring.dslist.services.games;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.entity.Game;
import com.javaspring.dslist.exception.GameNotFoundException;
import com.javaspring.dslist.repository.GameRepository;

@Service
public class GameUseCase {

    @Autowired 
    private GameRepository gameRepository;

    public List<GameMinDTO> getGame(){

       
    List<Game> resultado =  gameRepository.findAll(); 
       
    
       if (resultado.isEmpty()) {
        throw new GameNotFoundException();
       }

        List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
       return dto; 
    }
    
}
