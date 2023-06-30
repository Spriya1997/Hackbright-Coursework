import java.util.*;

public class MarsExpedition {
    MarsExpedition() throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        // Expedition Bootup
        //--------------------

        System.out.println("Mars Expedition is about to start...");
        System.out.println("Please wait, since this may take a while...");
        Thread.sleep(1000);
        System.out.println("Till that can you solve this problem ? 1 = 3, 2 = 3, 5 = 4, 7 = ?");
        Thread.sleep(3000);
        System.out.println("Thanks for the patience. By the way the answer for 7(seven) is 5(letter count of seven = 5) ");
        System.out.println("booting up..");
        System.out.println(".....");
        Thread.sleep(500);
        System.out.println("...");
        System.out.println("...");
        System.out.println("Expedition Booted..");
        
        // Team Setup
        //--------------------

        System.out.print("Hello, Please enter your name .. ");
        String name = sc.nextLine();
        System.out.print("Hi, " +name+ " , Welcome to the Mars Expedition prep program. Are you ready to head out into the new world ? Type Y or N  - ");
        String choice = sc.nextLine();

        if(choice.equalsIgnoreCase("Y")){
            System.out.println("Fabulous !! You are team leader for a reason.");
        }
        else{
            System.out.println("Too bad you have to give a try!!!");
        }

        System.out.print("\nHow many people do you want on your expedition team ? ");
        int teamSize;
        try{
            teamSize = Integer.parseInt(sc.nextLine());
            if(teamSize > 2){
                System.out.println("Too many people. We can send only 2 more teammates with you.");
            }
            else if(teamSize < 2){
                System.out.println("Not enough people. We can send only 2 more teammates with you.");   
            }
            else if(teamSize == 2){
                System.out.println("Prefect team size. Amazing "+ name + " !!!");
            }
        }
        catch(NumberFormatException ex){
            System.out.println("Invalid team size and setting a default team size - 2");
        }
        
        teamSize = 2;

        // Snack choice..
        //--------------------

        System.out.print("\nYou are allowed to bring one snack with you. What do you bring ?");
        String snack = sc.nextLine();

        System.out.println("Nice choice, you will be bringing a " + snack + " with you");
        
        // Choose a Vehicle
        //--------------------
        System.out.println("\nChoose a vehicle to ride in Mars. Select any one option 1 or 2 or 3" + "\n1. Audi"+ "\n2. Wagon R"+ "\n3. Rolls royce");
        String vehicleChoice = sc.nextLine();

        if(vehicleChoice.equals("1")){
            vehicleChoice = "Audi";
        }
        else if(vehicleChoice.equals("2")){
            vehicleChoice = "Wagon R";
        }
        else if(vehicleChoice.equals("3")){
            vehicleChoice = "Rolls royce";
        }
        else{
            System.out.println("Invalid vehicle choice...");
        }

        // The final message
        //--------------------
        System.out.println("\nMars Expeditions team is ready!!!" +"\nTeam Leader "+name+ " with "+ teamSize+ " teammates are going to explore the Mars using " + vehicleChoice + " and with a wonderful snack "+snack);
        sc.close();
    }

    public static void main(String[] args) throws InterruptedException {
       //Function call
       //--------------------
        new MarsExpedition();
    }
}
