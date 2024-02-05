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

    @Override
    public void forward() {
        System.out.println("Car is moving forward.");
    }

    @Override
    public void backward() {
        System.out.println("Car is moving backward.");
    }

    @Override
    public void left() {
        System.out.println("Car is moving left.");
    }

    @Override
    public void right() {
        System.out.println("Car is moving right.");    
    }

    @Override
    public String toString() {
        return "Car [color=" + this.getColor() + ", capacity=" + this.getCapacity() + ", licensePlateNo=" + this.getLicensePlate() + ", year="
        + this.getYear() + ", model=" + this.getModel() + ", make=" + this.getMake() + ", bodyType=" + bodyType + "]";
    }

    

}
