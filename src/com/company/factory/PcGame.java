package com.company.factory;

public class PcGame implements Game{

    private String name;
    private GameType type;

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public GameType getGameType() {
        return null;
    }

    PcGame(String name, GameType type){
        this.name = name;
        this.type = type;
    }
}
