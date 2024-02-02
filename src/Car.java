public class Car extends Vehicle {

    private String bodyType;

    public Car(String bodyType) {
        this.bodyType = bodyType;
    }

    public Car(String color, int capacity, String licensePlate, int year, String model, String make,
            String bodyType) {
        super(color, capacity, licensePlate, year, model, make);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void honk() {
        System.out.println("Tuuu.. Tuuu.. Tuuu..");
    }

}
