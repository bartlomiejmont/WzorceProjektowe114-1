package com.company.factory;

public class RpgGameFactory implements GameFactory{
    @Override
    public PcGame createPcGame(String title) {
        return new PcGame(title, GameType.PC_GAME);
    }

    @Override
    public BoardGame createBoardGame(String title) {
        return new BoardGame(title, GameType.BOARD_GAME);
    }
}
