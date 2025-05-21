package com.javaspring.dslist.services.games;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.dslist.dto.GameMinDTO;
import com.javaspring.dslist.entity.Game;
import com.javaspring.dslist.exception.GameFandByIdNotFoundException;
import com.javaspring.dslist.projections.GameMinProjection;
import com.javaspring.dslist.repository.GameRepository;

@Service
public class GameSearchByListUseCase {

    @Autowired 
    private GameRepository gameRepository;


    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){

        List<GameMinProjection> searchByList = this.gameRepository.searchByList(listId);

        if (searchByList == null) {
            throw new GameFandByIdNotFoundException();
        }
        return searchByList.stream().map(x -> new GameMinDTO(x)).toList();
    }
    
}
