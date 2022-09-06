package exercises.inheritanceAndTesting;

public class Computer {
    private final String model;
    private final Processor processor;
    private User user;
    private String operatingSystem;
    private int hardDriveCapacity;

    public Computer(String model, Processor processor, User user, String operatingSystem, int hardDriveCapacity) {
        this.model = model;
        this.processor = processor;
        this.user = user;
        this.operatingSystem = operatingSystem;
        this.hardDriveCapacity = hardDriveCapacity;
    }

    public String getModel() {
        return model;
    }

    public Processor getProcessor() {
        return processor;
    }

    public User getUser() {
        return user;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getHardDriveCapacity() {
        return hardDriveCapacity;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

}
