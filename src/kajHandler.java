import java.util.ArrayList;
import java.util.List;

public class kajHandler {
    kaj kaj = new kaj();
    List<vehicle> vehiclesList = new ArrayList<>();
    public void addToKaj(vehicle vehicle){
        if(vehicle.getTypOfVehicle().equals("van")){
            kaj.addToLightkaj(vehicle, vehiclesList);

        } else if (vehicle.getTypOfVehicle().equals("small truck")) {
            kaj.addToMediumkaj(vehicle, vehiclesList);
        }
        else{
            kaj.addToHeavykaj(vehicle, vehiclesList);
        }
    }
    public void printKaj(){
        System.out.println(kaj);

    }
}
