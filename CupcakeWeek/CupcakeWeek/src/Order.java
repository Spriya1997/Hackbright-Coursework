import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.*;
import java.util.*;

public class Order {
 
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");
        String placeOrder = input.nextLine();
        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equalsIgnoreCase("Y")){
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu..");
            System.out.println("\nCUPCAKES: ");
            int itemNumber = 0;

            for(int index = 0; index < cupcakeMenu.size(); index++){
                itemNumber++;
                System.out.println("ItemNumber : "+ itemNumber);
                cupcakeMenu.get(index).type();
                System.out.print(" Price: " + cupcakeMenu.get(index).getPrice());
                System.out.println();
            }
            System.out.println("DRINKS : ");
            for(int index = 0; index < drinkMenu.size(); index++){
                itemNumber++;
                System.out.println("itemNumber : "+ itemNumber);
                drinkMenu.get(index).type();
                System.out.println("Price: " + drinkMenu.get(index).getPrice());
                System.out.println();
            }

            boolean ordering = true;
            while (ordering){
                System.out.println("What would you like to order? Please use the number associated with each item to order. ");
                int orderChoice;
                try{
                    orderChoice = input.nextInt();
                    input.nextLine();

                    if (orderChoice == 1){
                        order.add(cupcakeMenu.get(0));
                        System.out.println("Item added to order..");
                    }
                    else if(orderChoice == 2){
                        order.add(cupcakeMenu.get(1));
                        System.out.println("Item added to order..");
                    }
                    else if(orderChoice == 3){
                        order.add(cupcakeMenu.get(2));
                        System.out.println("Item added to order..");
                    }
                    else if(orderChoice == 4){
                        order.add(drinkMenu.get(0));
                        System.out.println("Item added to order..");
                    }
                    else if(orderChoice == 5){
                        order.add(drinkMenu.get(1));
                        System.out.println("Item added to order..");
                    }
                    else if(orderChoice == 6){
                        order.add(drinkMenu.get(2));
                        System.out.println("Item added to order..");
                    }
                    else{
                        System.out.println("Sorry, we don't seem to have that on the menu..");
                    }
                System.out.println("Would you like to continue ordering? (Y/N)");
                String placeAnotherOrder = input.nextLine();

                if(!placeAnotherOrder.equalsIgnoreCase("Y")){
                    ordering = false;
                }
                }
                catch(InputMismatchException ex){
                    System.out.println("Wrong order number..");
                }
            }

            System.out.println(order.get(0));
            System.out.println(order.get(1));
            double subtotal = 0.0;

            for(int index = 2; index < order.size(); index++){
                if(order.get(index).equals(cupcakeMenu.get(0))){
                    cupcakeMenu.get(0).type();
                    double orderPrice = cupcakeMenu.get(0).getPrice(); 
                    System.out.println("Cupcake price : " +orderPrice);
                    subtotal += orderPrice;
                }
                else if(order.get(index).equals(cupcakeMenu.get(1))){
                    cupcakeMenu.get(1).type();
                    double orderPrice = cupcakeMenu.get(1).getPrice(); 
                    System.out.println("Cupcake price : " + orderPrice);
                    subtotal += orderPrice;
                }
                else if(order.get(index).equals(cupcakeMenu.get(2))){
                    cupcakeMenu.get(2).type();
                    double orderPrice = cupcakeMenu.get(2).getPrice(); 
                    System.out.println("Cupcake price : " +orderPrice);
                    subtotal += orderPrice;
                }
                else if(order.get(index).equals(drinkMenu.get(0))){
                    drinkMenu.get(0).type();
                    double orderPrice = drinkMenu.get(0).getPrice(); 
                    System.out.println("Drink price : " + orderPrice);
                    subtotal += orderPrice;
                }
                else if(order.get(index).equals(drinkMenu.get(1))){
                    drinkMenu.get(1).type();
                    double orderPrice = drinkMenu.get(1).getPrice(); 
                    System.out.println("Drink price : " + orderPrice);
                    subtotal += orderPrice;
                }
                else if(order.get(index).equals(drinkMenu.get(2))){
                    drinkMenu.get(2).type();
                    double orderPrice = drinkMenu.get(2).getPrice(); 
                    System.out.println("Drink price : " + orderPrice);
                    subtotal += orderPrice;
                }
            }
            System.out.println("Subtotal : "+ subtotal);
            new CreateFile();
            new WriteToFile(order);
        }
        else{
            System.out.println("Have a nice day then");
        }
        input.close();
    }  
}

class CreateFile{
    public CreateFile(){
        try{
            File salesData = new File("salesData.txt");
            if(salesData.createNewFile()){
                System.out.println("File created : "+ salesData.getName());
            }
            else{
                System.out.println("File already exists...");
            }
        }
        catch(IOException ex){
            System.out.println("Error occurred");
        }
    }
}

class WriteToFile{
    public WriteToFile(ArrayList<Object> order){
        try{
            FileWriter fw = new FileWriter("salesData.txt",true);
            PrintWriter salesWriter = new PrintWriter(fw);

            for(int index = 0; index < order.size(); index++){
                salesWriter.println(order.get(index));
            }
            salesWriter.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException ex){
            System.out.println("An Error occurred");
        }
    }
}
