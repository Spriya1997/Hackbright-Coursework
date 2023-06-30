import java.util.*;

public class FindingsLists {
    FindingsLists() throws InterruptedException {
        
        Thread.sleep(500);

        // 2. Storing Samples
        // -------------------
        System.out.println("\nWelcom back to your expedition... ");
        List<String> rockList = new ArrayList<>();
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock"); rockList.add("not rock");

        System.out.println("RockList - "+rockList);
        System.out.println("Found \"not rock\" in the list. Remove the \"not rock\" from the list.");
        rockList.remove("not rock");
        System.out.println("RockList - "+rockList);

        // 3. Fossils
        // -----------

        Thread.sleep(1000);
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> fossil = new HashMap<>();
        fossil.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossil.put("Fish Fossil" , "The fossil is vaguely fish shaped implies there was once water");
        fossil.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("\nDownloaded fossil data.. ");
        System.out.print("Which of the fossils would you like to learn more about? (Bird, fish, or tooth) - ");
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Bird Fossil"));
        } else if (choice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Fish Fossil"));
        } else if (choice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Tooth Fossil"));
        }
        else{
            System.out.println("Invalid data..");
        }

        // 4. Special Supply Lists
        // ----------------------

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet<>();
        System.out.println("\nSupplies before expedition.."+supplies);

        supplies.add("Medicines");
        supplies.add("Tools");
        supplies.add("Food items");
        supplies.remove("Food items");

        System.out.print("Supplies after expedition - ");
        Iterator it = supplies.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        sc.close();
    }
    public static void main(String[] args) throws InterruptedException {
       //Function call
       //--------------------
        new FindingsLists();
    }
}
