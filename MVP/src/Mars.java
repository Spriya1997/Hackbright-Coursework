public class Mars {

    private static boolean landingCheck(int minutesLeft) throws InterruptedException{

        for(int minute = 0; minute < minutesLeft; minute++){
            if(minute % 2 == 0 && minute % 3 == 0){
                System.out.println("Keep Center");
            }
            else if(minute % 2 == 0){
                System.out.println("Right");
            }
            else if(minute % 3 == 0){
                System.out.println("Left");
            }
            else{
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
    public static void main(String[] args) throws InterruptedException {
            String colonyName = "Mars";
            int shipPopulation = 300;
            double meals = 4000.00;
            boolean landing = true; 
            String landingLocation = "The Ocean"; // or The plain or The Hill

            for(int days = 1; days < 2; days++){
                meals -= shipPopulation * 0.75;
            }
            System.out.println("Meals left after landing is "+meals);
            meals += meals * 0.5;   // food value increased by 50%
            shipPopulation += 5;

            if(landingLocation.equalsIgnoreCase("The Plain")){
                System.out.println("Bbzzz Landing on the Plain");
            }
            else{
                System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
            }
            landing = landingCheck(5);
        }
}
