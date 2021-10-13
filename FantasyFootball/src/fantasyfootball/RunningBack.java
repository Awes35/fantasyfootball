package fantasyfootball;
//author: Kollen Gruizenga
// extension class for RB type from FF player

public class RunningBack extends FantasyFootballPlayer{
    
    public RunningBack(double numYards, int numTouchdowns){
        super (numYards, numTouchdowns);
    }
    
    public double getScore(){
        return getNumYards() + getNumTouchdowns()*6;
    }
    
    public String toString(){
        return super.toString() + getScore();
    }
}