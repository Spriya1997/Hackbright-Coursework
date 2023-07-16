import java.util.*;

    class Cupcake {
        double price;
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public void type(){
            System.out.println("A basic, generic cupcake, with vanilla frosting");
        }
    }

    class RedVelvet extends Cupcake {
        public void type(){
            System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        }
    }
    class Chocolate extends Cupcake{
        public void type(){
            System.out.print(" A chocolate based cupcake, with chocolate frosting.");
        }
    }
    class Drink{
        double price;
        public double getPrice(){
            return price;
        }
        public void setPrice(double price){
            this.price = price;
        }
        public void type(){
            System.out.print(" A bottle of purified water");
        }
    }
    class Soda extends Drink{
        public void type(){
            System.out.print(" A bottle of Soda");
        }
    }
    class Milk extends Drink {
        public void type(){
            System.out.print(" A bottle of Milk");
        }
    }

public class Main { 
    public static void main(String[] args) {

        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        Scanner input = new Scanner(System.in);
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<>();
        ArrayList<Drink> drinkMenu = new ArrayList<>();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        double price = Double.valueOf(priceText);
        cupcake.setPrice(price);

        //redVelvet 
        System.out.println("We are deciding on the price for our redVelvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the redVelvet? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.valueOf(priceText);
        redVelvet.setPrice(price);

        //Chocolate

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the chocolate? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.valueOf(priceText);
        chocolate.setPrice(price);

        System.out.println("We are in the middle of creating the drink menu. We currently have three types of drinks on" +
                "\nthe menu but we need to decide on pricing...");
        //water
        System.out.println("We are deciding on the price for our water bottle. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water bottle? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.valueOf(priceText);
        water.setPrice(price);

        //Soda
        System.out.println("We are deciding on the price for our bottle of soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the bottle of soda? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.valueOf(priceText);
        soda.setPrice(price);

        //Milk

        System.out.println("We are deciding on the price for our bottle of milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the bottle of milk? (Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.valueOf(priceText);
        milk.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);
        input.close();
    }
}
