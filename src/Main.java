import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        questionManager QM = new questionManager();
        kajHandler handler = new kajHandler();
        boolean repeat = true;
        while (repeat){
            try {
                int userInput = QM.queryInt("– Unloading station dump more – \n" +
                        "1: See parked trucks\n" +
                        "2: Register a new unloading truck\n" +
                        "3: exit\n");
                if(userInput == 1){
                    handler.printKaj();
                } else if (userInput == 2) {
                    try {
                        userInput = QM.queryInt("- Type of truck -\n" +
                                "1: Van\n" +
                                "2: Small truck\n" +
                                "3: Heavy truck\n");
                        if(userInput == 1){
                            int inputWeight = QM.queryInt("adding a van, and how much weight it has (kg): ");
                            handler.addToKaj(new van(inputWeight));
                        } else if(userInput == 2){
                            int inputWeight = QM.queryInt("adding a small truck, and how much weight it has (kg): ");
                            handler.addToKaj(new smallTruck(inputWeight));
                        } else if (userInput == 3) {
                            int inputWeight = QM.queryInt("adding a heavy truck, and how much weight it has (kg): ");
                            handler.addToKaj(new heavyTruck(inputWeight));
                        } else System.out.println("that is not a valid number");
                    } catch (NumberFormatException e){
                        System.out.println("you have to write a number\n" + e + "\n");
                    }

                } else repeat = false;
            } catch (NumberFormatException e){
                System.out.println("you have to write a number\n" + e + "\n");
            }
        }
    }
}