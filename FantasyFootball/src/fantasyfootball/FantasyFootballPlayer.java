package fantasyfootball;
//author: Kollen Gruizenga
//class to define generic Fantasy Football player
// (super to QB and RB classes)
// define toString and generic constructor + parameterized constructor

public abstract class FantasyFootballPlayer {    

    private double numYards;
    private int numTouchdowns;
    
    public FantasyFootballPlayer(){
        this.numYards = 0.0;
        this.numTouchdowns = 0;
    }
        
    public FantasyFootballPlayer(double numYards, int numTouchdowns){
        this.numYards = numYards;
        this.numTouchdowns = numTouchdowns;
    }
    
    public void setNumYards(double yards){
        this.numYards = yards;
    }
    
    public void setNumTouchdowns(int touchdowns){
        this.numTouchdowns = touchdowns;
    }
    
    public double getNumYards(){
        return this.numYards;
    }
    
    public int getNumTouchdowns(){
        return this.numTouchdowns;
    }
    
    public String toString(){
        
        return "Player totalled " + numYards + " yards." +
                            "\nPlayer totalled " + numTouchdowns + " touchdowns." + 
                            "\nThus, the player totalled a score of ";
    }
}