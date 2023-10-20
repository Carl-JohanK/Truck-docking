public class vehicle {
    private String typOfVehicle;
    private int weightOfLoad;

    public vehicle(String typOfVehicle, int weightOfLoad) {
        this.typOfVehicle = typOfVehicle;
        this.weightOfLoad = weightOfLoad;
    }

    public String getTypOfVehicle() {
        return typOfVehicle;
    }

    public int getWeightOfLoad() {
        return weightOfLoad;
    }

    @Override
    public String toString() {
        return "Vehicle typ: " + this.typOfVehicle + " Load: " + this.weightOfLoad + "kg";
    }
}
