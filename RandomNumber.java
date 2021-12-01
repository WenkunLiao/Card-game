import java.util.Random;
/**
 *  This class generates random numbers that will be used to generate a card
 *  
 *  @author Wenkun Liao
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
     */
    public int setMaxValue(int max)
    {
        generatedNumber = 1 + (int)(Math.random() * max);
        return generatedNumber;
    }
}
