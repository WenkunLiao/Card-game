
/**
 * This class stores the detail of the generated card.
 *
 * @author Wenkun Liao
 */
public class Card
{
    private int suit;
    private int number;

    /**
     * Parameterised constructor for objects of class Card.
     * 
     * @param   suit    the number that going to be suit type of the card
     *          number  the number that goint to be number type of the card
     */
    public Card(int suit, int number)
    {
        this.suit = suit; 
        this.number = number;
    }
    
    /**
     * Non-parameterised constructor for objects of class Card.
     */
    private Card()
    {
        suit = 1;
        number = 1;
    }
    
    /**
     * Method to return the property of the card
     * 
     * @return      return the suit type and number type of the card
     */
    public String displayState()
    {
        String suitType = "";
        String numberType = "";
        String cardType ="";
        
        switch (suit)
        {
            case 1: suitType = "Hearts"; break;
            case 2: suitType = "Diamonds";break;
            case 3: suitType = "Clubs";break;
            case 4: suitType = "Spades";break;
        }
        
        switch (number)
        {
            case 1: numberType = "Ace"; break;
            case 2: numberType = "2"; break;
            case 3: numberType = "3"; break;
            case 4: numberType = "4"; break;
            case 5: numberType = "5"; break;
            case 6: numberType = "6"; break;
            case 7: numberType = "7"; break;
            case 8: numberType = "8"; break;
            case 9: numberType = "9"; break;
            case 10: numberType = "10"; break;
            case 11: numberType = "Jack"; break;
            case 12: numberType = "Queen"; break;
            case 13: numberType = "King"; break;
        }
        
        cardType = suitType + numberType;
        return cardType;
    }

    /**
     * Method to return card number 
     * 
     * @return      return the card number
     */
    public int getCardNumber()
    {
        return this.number;
    }
    
    /**
     * Method to return card suit
     * 
     * @return      return the card suit
     */
    public int getCardSuit()
    {
        return this.suit;
    }
    
    /**
     * Method to return set a new card based on the parameter
     * 
     * @param  suit    the number going to be new card suit
     *         number  the number goint to be new card number
     */
    public void setCard(int suit, int number)
    {
        this.suit = suit;
        this.number = number;
    }
}
