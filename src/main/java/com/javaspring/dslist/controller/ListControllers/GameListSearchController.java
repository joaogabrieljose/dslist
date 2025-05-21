package com.javaspring.dslist.controller.ListControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaspring.dslist.services.games.GameSearchByListUseCase;

@RestController
@RequestMapping("/list")
public class GameListSearchController {

    @Autowired
    private GameSearchByListUseCase gameSearchByListUseCase;

    @GetMapping(value = "/{listId}/games")
    public ResponseEntity<?> findBySearch(@PathVariable Long listId){

        try {

            var searc =  this.gameSearchByListUseCase.findByList(listId);
            return ResponseEntity.ok().body(searc);
            
        } catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
    
}
