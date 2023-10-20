import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kaj {
    kajA kajA = new kajA();
    kajB kajB = new kajB();
    kajC kajC = new kajC();
    kajD kajD = new kajD();
    kajE kajE = new kajE();
    public void addToLightkaj(vehicle vehicle, List<vehicle> vehicleList){
        if (!kajA.getIsOccupied()){
            kajA.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else if (!kajB.getIsOccupied()) {
            kajB.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else {
            System.out.println("can't add to light kaj");
        }
    }
    public void addToMediumkaj(vehicle vehicle, List<vehicle> vehicleList){
        if (!kajB.getIsOccupied() && vehicle.getWeightOfLoad() < 5000){
            kajB.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else if (!kajC.getIsOccupied()) {
            kajC.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else if (!kajD.getIsOccupied()) {
            kajD.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else {
            System.out.println("can't add to light kaj");

        }
    }
    public void addToHeavykaj(vehicle vehicle, List<vehicle> vehicleList) {
        if (!kajD.getIsOccupied() && vehicle.getWeightOfLoad() < 8000){
            kajD.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else if (!kajE.getIsOccupied()) {
            kajE.addToKaj(vehicle);
            vehicleList.add(vehicle);

        } else {
            System.out.println("can't add to heavy kaj");
        }
    }

    @Override
    public String toString() {
        return
                "\nkaj A = " + kajA.getTypOfVehicle() +
                "\nkaj B = " + kajB.getTypOfVehicle() +
                "\nkaj C = " + kajC.getTypOfVehicle() +
                "\nkaj D = " + kajD.getTypOfVehicle() +
                "\nkaj E = " + kajE.getTypOfVehicle();
    }
}
