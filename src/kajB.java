public class kajB {
    private boolean isOccupied;
    private vehicle typOfVehicle;
    private char kaj = 'B';


    public void addToKaj(vehicle typOfVehicle) {
        if (!isOccupied) {
            this.typOfVehicle = typOfVehicle;
            isOccupied = true;
            System.out.println("Vehicle was added to kaj: B");
        } else {
            System.out.println("full in this kaj");
        }
    }

    public vehicle getTypOfVehicle() {
        return typOfVehicle;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }
    public char getKaj() {
        return kaj;
    }
}
