import java.util.*;
/**
 * This class lists the rules for the game.
 *
 * @author Wenkun Liao
 * @version created 26 April 2020
 */
public class Game
{
    private Player cardGamePlayer;
    private int guessSuit;
    private int guessNumber;
    private int hiddenSuit;
    private int hiddenNumber;
    private String suitGuessed;
    private String hiddenSuitType;
    private String hiddenNumberType;
    private int score;
    private int totalGamesPlayed;
    private int gameWon;
    private int gameLost;
    private int numberOfAttemptSuit;
    private int numberOfAttemptNumber;
    private int continueGame;
    
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        cardGamePlayer = new Player();
        guessSuit = 0;
        guessNumber = 0;
        hiddenSuit = 0;
        hiddenNumber = 0;
        suitGuessed = "";
        hiddenSuitType = "";
        hiddenNumberType = "";
        score = 40;
        totalGamesPlayed = 0;
        gameWon = 0;
        gameLost = 0;
        numberOfAttemptSuit = 0;
        numberOfAttemptNumber = 0;
        continueGame = 2;
    }
    
    /**
     * Method to make the rules for the section of guessing card number
     * 
     */
    public void attemptGuessNumber()
    {
        if (guessNumber == hiddenNumber)
        {
            System.out.println("Congratulation! You win the game!");
            totalGamesPlayed ++;
            gameWon ++;
        }
        else
        {
            if (numberOfAttemptNumber == 1)
            {
                System.out.println("Oops, it's wrong, have another try |･ω･`)");
                score -= 2;
            }
            if (numberOfAttemptNumber == 2)
            {
                score -= 6;
                if (score <= 0)
                {
                    System.out.println("Game Over! ");
                    totalGamesPlayed ++;
                    gameLost ++;
                }
                
                else
                {
                    System.out.println("Oops, it's wrong, have another try |･ω･`)");
                }
            }
            if (numberOfAttemptNumber == 3)
            {
                score -= 12;
                if (guessNumber > hiddenNumber)
                {
                    if (score <= 0)
                    {
                        System.out.println("Game Over! You are run out of scores T.T");
                        System.out.println("The correct answer is " + hiddenNumberType);
                        totalGamesPlayed ++;
                        gameLost ++;
                    }
                    else
                    {
                        System.out.println("Oops, it's wrong, try a smaller number |･ω･`)");
                    }
                }
                else
                {
                    if (score <= 0)
                    {
                        System.out.println("Game Over! You are run out of scores T.T");
                        System.out.println("The correct answer is " + hiddenNumberType);
                        totalGamesPlayed ++;
                        gameLost ++;
                     }
                    else
                    {
                         System.out.println("Oops, it's wrong, try a bigger number |･ω･`)");
                    }
                }
            }
            if (numberOfAttemptNumber == 4)
            {
                   score -= 20;
                   System.out.println("Game Over! The correct answer is " + hiddenNumberType + "|･ω･`)");
                   totalGamesPlayed ++;
                   gameLost ++;
            }
        }
   
    }
    
    /**
     * Method to make the rules for the section of guessing card suit
     * 
     */
    public void attemptGuessSuit()
    {
        if (guessSuit == hiddenSuit)
        {
            System.out.println("Correct! You got it.");
        }
        else 
        {
            if (numberOfAttemptSuit == 1)
            {
                System.out.println("Oops, it's wrong, have another try |･ω･`)");
                score -= 5;
            }
            if (numberOfAttemptSuit == 2)
            {
                System.out.println("Oops, it's wrong, have another try |･ω･`)");
                score -= 10;
            }
            if (numberOfAttemptSuit == 3)
            {
                System.out.println("Your guess is " + suitGuessed + ". But correct answer is " + 
                                   hiddenSuitType + "!");
                score -=15;
            }
        }
    }
    
    /**
     * Method to get whether player want to player another game.
     * 
     * @return if player wants to have another game, method will return 1, otherwise it will return 0
     */
    public int continueGame()
    {
        System.out.println("Would you like to have a new game? Y / N");
        Scanner reset = new Scanner(System.in);
        String resetInput = reset.nextLine();
        while (!resetInput.equals("Y") && 
               !resetInput.equals("N"))
        {
            System.out.println("Please enter Y / N");
            reset = new Scanner(System.in);
            resetInput = reset.nextLine();
        }
        
        switch (resetInput)
        {
            case "Y":
                resetGame();
                return 1; 
            case "N":
                displayResult();
                return 0;
        }
        return 0;
    }
    
    /**
     * Method to know whether player has a correct guess of card suit
     * 
     * @return  return true if player guesses correctly
     */
    public boolean compareNumber()
    {
        return guessNumber == hiddenNumber;
    }
    
    /**
     * Method to know whether player has a correct guess of card number
     * 
     * @return  return true if player guesses correctly
     */
    public boolean compareSuit()
    {
        return guessSuit == hiddenSuit;
    }
    
    /**
     * Method to print out player's highest score
     * 
     */
    public void displayHighestScore()
    {
        System.out.println("Your highest score is " + cardGamePlayer.getHighestScore());
    }
    
    /**
     * Method to print out the overall result about the all games
     * 
     */
    public void displayResult()
    {
        System.out.println("Total games played: " + totalGamesPlayed);
        System.out.println("You won " + gameWon + " Games!");
        System.out.println("You lost " + gameLost + " Games!");
    }
    
    /**
     * Method to print out player's score for current game
     * 
     */
    public void displayScore()
    {
        System.out.println("Your score is " + score);
    }
    
    /**
     * Method to get how many attempts player has on guessing card number
     * 
     * @return  return how many attempts player has on guessing card number
     */
    public int getNumberOfAttemptNumber()
    {
        return numberOfAttemptNumber;
    }
    
    /**
     * Method to get how many attempts player has on guessing card suit
     * 
     * @return  return how many attempts player has on guessing card suit
     */
    public int getNumberOfAttemptSuit()
    {
        return numberOfAttemptSuit;
    }
    
    /**
     * Method to get player's name
     * 
     * @return  return player's name
     */
    public String getPlayerName()
    {
        return cardGamePlayer.getPlayerName();
    }
    
    /**
     * Method to get player's score for current game
     * 
     * @return  return player's score for current game
     */
    public int getScore()
    {
        return score;
    }
    
    /**
     * Method to renew player's data at the end of each game
     * 
     */
    public void renewPlayerData()
    {
        cardGamePlayer.setScore(score);
        if (score > cardGamePlayer.getHighestScore())
            cardGamePlayer.setHighestScore(score);
        cardGamePlayer.setGamesPlayed(totalGamesPlayed);
        cardGamePlayer.setGamesWon(gameWon);
    }

    /**
     * Method to reset game if player chooses to have another game
     * 
     */
    public void resetGame()
    {
        guessSuit = 0;
        guessNumber = 0;
        hiddenSuit = 0;
        hiddenNumber = 0;
        suitGuessed = "";
        hiddenSuitType = "";
        hiddenNumberType = "";
        score = 40;
        numberOfAttemptSuit = 0;
        numberOfAttemptNumber = 0;
    }

    /**
     * Method to generate a new card
     * 
     * @param   card    the card that goning to be the new card
     */
    public void setCard(Card card)
    {
        hiddenSuit = card.getCardSuit();
        hiddenNumber = card.getCardNumber();
        switch (hiddenSuit)
        {
            case 1: hiddenSuitType = "Hearts"; break;
            case 2: hiddenSuitType = "Diamonds";break;
            case 3: hiddenSuitType = "Clubs";break;
            case 4: hiddenSuitType = "Spades";break;
        }
        
        switch (hiddenNumber)
        {
            case 1: hiddenNumberType = "Ace"; break;
            case 2: hiddenNumberType = "2"; break;
            case 3: hiddenNumberType = "3"; break;
            case 4: hiddenNumberType = "4"; break;
            case 5: hiddenNumberType = "5"; break;
            case 6: hiddenNumberType = "6"; break;
            case 7: hiddenNumberType = "7"; break;
            case 8: hiddenNumberType = "8"; break;
            case 9: hiddenNumberType = "9"; break;
            case 10: hiddenNumberType = "10"; break;
            case 11: hiddenNumberType = "Jack"; break;
            case 12: hiddenNumberType = "Queen"; break;
            case 13: hiddenNumberType = "King"; break;
        }
    }
        
    /**
     * Method to set what player guesses for card number
     * 
     */
    public void setNumber()
    {
        numberOfAttemptNumber ++;
        System.out.println("Which card number would you guess? (Please enter a number between 1 to 13)");
        Scanner guessCardNumber = new Scanner(System.in);
        guessNumber = guessCardNumber.nextInt();
        while (guessNumber < 0 || 
               guessNumber > 13)
        {
            numberOfAttemptNumber --;
            System.out.println("Error! Please enter a number between 1 to 13");
            switch (numberOfAttemptNumber)
            {
                case 1:
                    score += 2; break;
                case 2:
                    score += 6; break;
                case 3:
                    score += 12; break;
                case 4:
                    score += 20; break;
            }
            break;
        }
        if (guessNumber > 0 &&
            guessNumber < 13)
            cardGamePlayer.getGuessNumber(guessNumber);
        
    }

    /**
     * Method to set player's name
     * 
     */
    public void setPlayer()
    {
       System.out.println("Please enter your name!");
       Scanner name = new Scanner(System.in);
       cardGamePlayer.setPlayerName(name.nextLine());
       while (cardGamePlayer.getPlayerName().equals(""))
       {
           System.out.println("Error! Please enter a valid name");
           name = new Scanner(System.in);
           cardGamePlayer.setPlayerName(name.nextLine());
       }
       System.out.println("Welcome!" + cardGamePlayer.getPlayerName());

    }
    
    /**
     * Method to set what player guesses for card suit
     * 
     */
    public void setSuit()
    {
        numberOfAttemptSuit ++;
        System.out.println("Which suit would you guess? (Please enter H, D, C or S)" );
        Scanner suit = new Scanner(System.in);
        suitGuessed = suit.nextLine();
        switch (suitGuessed)
        {
            case "H": 
                guessSuit = 1; break;
            case "D": 
                guessSuit = 2; break;
            case "C": 
                guessSuit = 3; break;
            case "S": 
                guessSuit = 4; break;            
            default: 
                numberOfAttemptSuit --;
                System.out.println("Please enter a single characrer(H, D, C, or S).");
                switch (numberOfAttemptSuit)
                {
                    case 1: 
                        score += 5; break;
                    case 2:
                        score += 10; break;
                    case 3:
                        score += 15; break;
                }
        }
        if (suitGuessed.equals("H") ||
            suitGuessed.equals("D") ||
            suitGuessed.equals("C") ||
            suitGuessed.equals("S"))
            cardGamePlayer.getGuessSuit(suitGuessed);
    }
    
    /**
     * Method to print welcome message at the start of game
     * 
     */
    public void startGame()
    {
        System.out.println("Welcome to Card Guessing Game!");
    }
}   

