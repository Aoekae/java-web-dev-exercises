package exercises.inheritanceAndTesting;

public class Laptop extends Computer{
    private final double weightInOz;
    private final String screenSizeInchesSquared;
    private String currentLocation;

    public Laptop(String model, Processor processor, User user, String operatingSystem, int hardDriveCapacity, double weightInOz, String screenSizeInchesSquared, String currentLocation) {
        super(model, processor, user, operatingSystem, hardDriveCapacity);
        this.weightInOz = weightInOz;
        this.screenSizeInchesSquared = screenSizeInchesSquared;
        this.currentLocation = currentLocation;
    }

    public double getWeightInOz() {
        return weightInOz;
    }

    public String getScreenSizeInchesSquared() {
        return screenSizeInchesSquared;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }
}
