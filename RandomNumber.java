import java.util.Random;
/**
 *  This class generates random numbers that will be used to generate a card
 *  
 *  @author Wenkun Liao
 *  @version created 17 April 2020
 */
public class RandomNumber
{
    private int generatedNumber;
    private int max;

    /**
     * Constructor for objects of class RandomNumber
     */
    public RandomNumber(int maxValue)
    {
        max = maxValue;
        generatedNumber = 0;
    }

    /**
     * Generate a random number based on the max value given
     * 
     * @para    max     an integer given to the method to get the range of generated number
     * @return          return the generated number
     */
    public int setMaxValue(int max)
    {
        generatedNumber = 1 + (int)(Math.random() * max);
        return generatedNumber;
    }
}
