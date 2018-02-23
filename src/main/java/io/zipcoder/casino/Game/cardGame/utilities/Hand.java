package io.zipcoder.casino.Game.cardGame.utilities;


import java.util.ArrayList;

public class Hand {
    private ArrayList<Card>hand;

    public Hand() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card){
        hand.add(card);

    }
    public void removeCard(Card card){
        hand.remove(card);
    }

    public void clear(){
        hand.clear();
    }

    public boolean hasCard(Card thisCard){

        if (hand.contains(thisCard)) {
            return true;
        }
        return false;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }





}
