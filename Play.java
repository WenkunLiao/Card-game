import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.lang.*;
import javax.script.*;
/**
 * This class gather the methods to start a game.
 *
 * @author Wenkun Liao
 */
public class Play
{
    
    /**
     * Method to run the game
     * 
     */
    public void PlayAGame()
    {
        Game newGame = new Game();
        newGame.startGame();
        newGame.setPlayer();
        int reset = 0;
        do
        {
            RandomNumber suit = new RandomNumber(4);
            RandomNumber number = new RandomNumber(13);
            Card card = new Card(suit.setMaxValue(4), number.setMaxValue(13));
            newGame.setCard(card);
            while (!newGame.compareSuit() && 
                   newGame.getNumberOfAttemptSuit() < 3)
            {
                newGame.setSuit();
                newGame.attemptGuessSuit();
            }
            while (!newGame.compareNumber() && 
                   newGame.getNumberOfAttemptNumber() < 4 && 
                   newGame.getScore() > 0)
            {
                newGame.setNumber();
                newGame.attemptGuessNumber();
            }


            newGame.renewPlayerData();
            reset = newGame.continueGame();            
         }
        while (reset == 1);
        newGame.displayHighestScore();
    }
}
