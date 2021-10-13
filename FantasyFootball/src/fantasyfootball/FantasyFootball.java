package fantasyfootball;

import java.util.Scanner;

//author: Kollen Gruizenga
//main program class, runs conditional & instanstiates objects
//handles user input & passing to object instances


public class FantasyFootball {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input = "";
        double yards;
        int touchdowns;
        
        while (!input.equalsIgnoreCase("Q")){
            System.out.println("-------------");
            System.out.print("Enter RB or QB (or Q to quit): ");
            input = reader.nextLine();
            if(input.equalsIgnoreCase("Q")) break;
            
            if (input.equalsIgnoreCase("RB")){
                System.out.print("Enter the number of yards: ");
                    yards = reader.nextDouble();
                    reader.nextLine();
                System.out.print("Enter the number of touchdowns: ");
                    touchdowns = reader.nextInt();
                    reader.nextLine();
                
                FantasyFootballPlayer rb = new RunningBack(yards, touchdowns);
                System.out.println(rb);
                
            }
            else if (input.equalsIgnoreCase("QB")){
                System.out.print("Enter the number of yards: ");
                    yards = reader.nextDouble();
                    reader.nextLine();
                System.out.print("Enter the number of touchdowns: ");
                    touchdowns = reader.nextInt();
                    reader.nextLine();
                
                FantasyFootballPlayer qb = new QuarterBack(yards, touchdowns);
                System.out.println(qb);
            }
            else
                System.out.println("Error > Please enter QB, RB or Q to quit!");
        }
    
    }

}