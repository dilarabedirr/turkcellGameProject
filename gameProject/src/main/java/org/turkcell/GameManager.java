package org.turkcell;

public class GameManager implements GameService{
    @Override
    public void add(Game game) {
        System.out.println("Oyun eklendi : \n"+ game.toString());
    }
}
