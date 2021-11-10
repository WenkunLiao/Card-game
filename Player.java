import java.util.*;
/**
 * Player class stores the detail of game players.
 *
 * @author Wenkun Liao
 */
public class Player
{
    private String name;
    private int score;
    private int guess;
    private int highestScore;
    private int numberOfGamesPlayed;
    private int numberOfGameWon;
   
    /**
     * Default constructor for objects of class Player
     */
    public Player()
    {
        name = "";
        score = 0;
        guess = 0;
        highestScore = -99;
        numberOfGamesPlayed = 0;
        numberOfGameWon = 0;
    }
    
    /**
     * Default constructor for objects of class Player
     */    
    public Player(String playerName)
    {
        name = playerName;
        score = 0;
        guess = 0;
        highestScore = 0;
        numberOfGamesPlayed = 0;
        numberOfGameWon = 0;
    }
    
    /**
     * Method to return player's guess number
     * 
     * @param  guessNumber  the number player guessed
     * @return      return the number player guessed
     */
    public int getGuessNumber(int guessNumber)
    {
        return guessNumber;
    }
    
    /**
     * Method to return player's guess suit
     * 
     * @param  guessSuit  the suit player guessed
     * @return      return the suit player guessed
     */
    public String getGuessSuit(String guessSuit)
    {
        return guessSuit;
    }
        
    /**
     * Method to return how many games player has won
     * 
     * @return      return the number of games player has won
     */
    public int getGamesWon()
    {
        return numberOfGameWon;
    }
    
    /**
     * Method to return player's highest score
     * 
     * @return      return the highest score
     */
    public int getHighestScore()
    {
        return highestScore;
    }
    
    /**
     * Method to return how many games player has played
     * 
     * @return      return the number of games player has played
     */
    public int getNumbersOfGamesPlayed()
    {
        return numberOfGamesPlayed;
    }
    
    /**
     * Method to return player's name
     * 
     * @return      return player's name
     */
    public String getPlayerName()
    {
        return name;
    }
    
    /**
     * Method to return player's score in current game
     * 
     * @return      return player's score in current game
     */
    public int getScore()
    {
        return score;
    }

    /**
     * Method to renew the highest score based on the parameter
     * 
     * @param  newHighest  the number that is going to be new highest score
     */
    public void setHighestScore(int newHighest)
    {
        highestScore = newHighest;
    }
    
    /**
     * Method renew how many games player has played
     * 
     * @param  newNumber  the number going to be the new number of games player has played
     */
    public void setGamesPlayed(int newNumber)
    {
        numberOfGamesPlayed = newNumber;
    }
    
    /**
     * Method to renew how many games player has won
     * 
     * @param  newWon  the number going to be the new number of games player has won
     */
    public void setGamesWon(int newWon)
    {
        numberOfGameWon = newWon;
    }
    
    /**
     * Method to renew player's name
     * 
     * @param  newName  the String entered by the player to be his or her new name
     */      
    public void setPlayerName(String newName)
    {
        name = newName;
    }
    
    /**
     * Method to renew the score of current game
     * 
     * @param  newScore  the number to be the new score of current game
     */
    public void setScore(int newScore)
    {
        score = newScore;
    }
}
