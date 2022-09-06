package exercises.inheritanceAndTesting;

public class Smartphone extends Computer {
    private String phoneNumber;
    private Text message;
    private String recipientNumber;

    public Smartphone(String model, Processor processor, User user, String operatingSystem, int hardDriveCapacity) {
        super(model, processor, user, operatingSystem, hardDriveCapacity);
    }


}
