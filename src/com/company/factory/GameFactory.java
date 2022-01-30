package com.company.factory;

public interface GameFactory {
    PcGame createPcGame(String title);
    BoardGame createBoardGame(String title);
}
