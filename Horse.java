
/**
 * Write a description of class Horse here.
 * 
 * @author William Lin
 * @version 03/04/2024
 */
public class Horse
{
    //Fields of class Horse
    private String name;
    private char symbol;
    private double confidence;
    private int distanceTravelled;
    private boolean hasFallen;
    
      
    //Constructor of class Horse
    /**
     * Constructor for objects of class Horse
     */
    public Horse(char horseSymbol, String horseName, double horseConfidence)
    {
        symbol = horseSymbol;
        name = horseName;
        confidence = horseConfidence;
        distanceTravelled = 0;
        hasFallen = false;
       
    }
    
    
    
    //Other methods of class Horse
    public void fall()
    {
        hasFallen = true;
    }
    
    public double getConfidence()
    {
        return confidence;
    }
    
    public int getDistanceTravelled()
    {
        return distanceTravelled;
    }
    
    public String getName()
    {
        return name;
    }
    
    public char getSymbol()
    {
        return symbol;
    }
    
    public void goBackToStart()
    {
        distanceTravelled = 0;
    }
    
    public boolean hasFallen()
    {
        return hasFallen;
    }

    public void moveForward()
    {
        distanceTravelled += 1;
    }

    public void setConfidence(double newConfidence)
    {
        confidence = newConfidence;
    }
    
    public void setSymbol(char newSymbol)
    {
        symbol = newSymbol;
    }
    
}
