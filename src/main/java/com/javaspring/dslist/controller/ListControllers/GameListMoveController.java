package com.javaspring.dslist.controller.ListControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.dto.ReplacementDTO;
import com.javaspring.dslist.services.gamesList.GameListMoveUseCase;

@RestController
@RequestMapping("/list")
public class GameListMoveController {

    @Autowired
    private GameListMoveUseCase gameListMoveUseCase;

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId,@RequestBody  ReplacementDTO body ){

        this.gameListMoveUseCase.Move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }
    
}
