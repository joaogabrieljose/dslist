package com.javaspring.dslist.controller.ListControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.dto.GameListDTO;
import com.javaspring.dslist.services.gamesList.GameListUseCase;

@RestController
@RequestMapping("/list")
public class GameListController {


    @Autowired
    private GameListUseCase gameListUseCase;


    @GetMapping("")
    public ResponseEntity<?> gameList(){

        try {

            var list = this.gameListUseCase.findAllList();
            return ResponseEntity.ok().body(list);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
