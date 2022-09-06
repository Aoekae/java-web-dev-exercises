package exercises.inheritanceAndTesting;

public class Processor {
    private final String name;
    private final double speedInGhz;
    private final int cores;

    public Processor(String name, double speedInGhz, int cores) {
        this.name = name;
        this.speedInGhz = speedInGhz;
        this.cores = cores;
    }

    public String getName() {
        return name;
    }

    public double getSpeedInGhz() {
        return speedInGhz;
    }

    public int getCores() {
        return cores;
    }
    
}
