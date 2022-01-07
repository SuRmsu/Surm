package com.sunrise.surm.dao;

import com.sunrise.surm.entity.Game;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GameDao  {

    private List<Game> gameDaoList = new ArrayList<>();
    public void save(Game game) {
        gameDaoList.add(game);

    }
    public List<Game> findAll(){
        return gameDaoList;
    }



}
