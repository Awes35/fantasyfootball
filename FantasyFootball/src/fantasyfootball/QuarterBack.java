package fantasyfootball;
//author: Kollen Gruizenga
//extension class for QB type from FF player

public class QuarterBack extends FantasyFootballPlayer {
    
    public QuarterBack(double numYards, int numTouchdowns){
        super(numYards, numTouchdowns);
    }
    
    public double getScore(){
        return getNumYards()/25.0 + getNumTouchdowns()*4;
    }
    
    public String toString(){
        return super.toString() + getScore();
    }
}