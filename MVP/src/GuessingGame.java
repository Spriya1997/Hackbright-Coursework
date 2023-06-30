import java.util.*;

public class GuessingGame {

    GuessingGame(){
        Scanner sc = new Scanner(System.in);

        int high = 100, low = 1, tries = 0;
        int randomNum = (int)(Math.random() * high)+low;
        
        System.out.println("Howdy, what's your name? ");
        System.out.print("(type in your name) ");
        
        String name = sc.nextLine();
        
        System.out.println(name +", I'm thinking of a number between 1 and 100.");
        System.out.println("Try to guess my number");
        
        while(true){
            System.out.print("Your guess? ");
            int guess;
            try{
                guess = sc.nextInt();
            }
            catch(InputMismatchException ex){
                String input = sc.next();
                System.out.println(input+ " this is not an integer, try again");
                continue;
            }
            if(guess > 100 || guess < 1){
                System.out.println(guess+" is not in a range between 1 to 100, try again");
                continue;
            } 
            tries++;
            if(guess == randomNum){
                System.out.println("Well done, "+name+ "! You found my number in "+tries+" tries!");
                break;
            }
            else if(guess < randomNum){
                System.out.println("Your guess is too low, try again");
            }
            else{
                 System.out.println("Your guess is too high, try again");
            }
        }
        sc.close();
    }
    
    public static void main(String abs[]) {
        new GuessingGame();
    }
}
