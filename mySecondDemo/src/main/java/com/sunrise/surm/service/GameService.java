package com.sunrise.surm.service;

import com.sunrise.surm.dao.GameDao;
import com.sunrise.surm.entity.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameDao gameDao;
    public void addGame(Game game) { gameDao.save(game);}

    public List<Game> list() {return gameDao.findAll();}

}
