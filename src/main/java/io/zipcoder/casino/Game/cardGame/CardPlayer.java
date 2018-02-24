package io.zipcoder.casino.Game.cardGame;

import io.zipcoder.casino.Game.cardGame.utilities.Hand;
import io.zipcoder.casino.Player;
import io.zipcoder.casino.Profile;

public class CardPlayer extends Player {


    private boolean isCurrentPlayer;
    protected Hand hand;
    protected int score;

    public CardPlayer(Profile someProfile) {
        super(someProfile);
        cardPlayerHand = new Hand();
        setHand(cardPlayerHand);
    }

    public void setScore(int newScore){

        this.score = newScore;
    }

    public int getScore(){

        return this.score;
    }

    public void setHand (Hand aHand) {
        this.cardPlayerHand = aHand;
    }

    public Hand getHand () {
        return cardPlayerHand;
    }


}
