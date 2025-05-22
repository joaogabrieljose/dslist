package com.javaspring.dslist.services.gamesList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaspring.dslist.dto.GameListDTO;
import com.javaspring.dslist.entity.Game;
import com.javaspring.dslist.projections.GameMinProjection;
import com.javaspring.dslist.repository.GameListRepository;
import com.javaspring.dslist.repository.GameRepository;

@Service
public class GameListMoveUseCase {


    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private GameListRepository gameListRepository;



    @Transactional
    public void Move (Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> list = this.gameRepository.searchByList(listId);

        GameMinProjection obj =  list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex: destinationIndex;
        int max =  sourceIndex < destinationIndex? destinationIndex : sourceIndex;

        for(int i = min;  i<= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
    
}
