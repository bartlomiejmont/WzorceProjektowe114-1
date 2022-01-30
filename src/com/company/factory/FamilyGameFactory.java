package com.company.factory;

public class FamilyGameFactory implements GameFactory{
    @Override
    public PcGame createPcGame(String title) {
        return new PcGame("Monopoly", GameType.PC_GAME);
    }

    @Override
    public BoardGame createBoardGame(String title) {
        return new BoardGame("Monopoly", GameType.BOARD_GAME);
    }
}
