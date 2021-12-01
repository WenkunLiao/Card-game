import java.util.*;
import java.io.*;
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
            try{
            File file = new File("./service.txt");
            InputStreamReader read = new InputStreamReader(new FileInputStream(file));
            BufferedReader br = new BufferedReader(read);
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null)
            {
                System.out.println(lineTxt);
            }
            read.close();
            }
            catch(Exception e){}
            System.out.println("\n");
            newGame.renewPlayerData();
            reset = newGame.continueGame();            
          }
        while (reset == 1);
        newGame.displayHighestScore();
    }
}
