
/**
 * This class gather the methods to start a game.
 *
 * @author Wenkun Liao
 * @version created 3 May 2020
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
            System.out.print("Do you know?\n");
            System.out.print("In the 1837 edition of Foster's Complete Hoyle, R. F. Foster wrote: 'the game of poker, as first played in the United States, five cards to each player from a twenty-card pack, is undoubtedly the Persian game of As-Nas.'\n");
            newGame.renewPlayerData();
            reset = newGame.continueGame();            
         }
        while (reset == 1);
        newGame.displayHighestScore();
    }
}
