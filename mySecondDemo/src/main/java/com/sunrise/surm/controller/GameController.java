package com.sunrise.surm.controller;

import com.sunrise.surm.entity.Game;
import com.sunrise.surm.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    @Autowired
    private GameService gameService;

    @RequestMapping("add")
    public Game add(Game game) {
        gameService.addGame(game);
        return game;
    }

    @GetMapping("list")
    public List<Game> list() {return gameService.list();}
}
