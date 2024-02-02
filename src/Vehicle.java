
public class Vehicle implements Directions {
    private String color;
    private int capacity;
    private String licensePlate;
    private int year;
    private String model;
    private String make;
    private Boolean started;
    private Boolean wiperSwiped;

    public Vehicle() {

    }

    public Vehicle(String color, int capacity, String licensePlate, int year, String model, String make) {
        this.color = color;
        this.capacity = capacity;
        this.licensePlate = licensePlate;
        this.year = year;
        this.model = model;
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Boolean getStarted() {
        return started;
    }

    public Boolean getWiperSwiped() {
        return wiperSwiped;
    }
    

    @Override
    public String toString() {
        return "Vehicle [color=" + color + ", capacity=" + capacity + ", licensePlate=" + licensePlate + ", year="
                + year + ", model=" + model + ", make=" + make + "]";
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public void honk() {
        System.out.println("Beep.. Beep..");
    }

    public void startSwiped() {
        this.wiperSwiped = true;
    }

    public void stopSwiped() {
        this.wiperSwiped = false;
    }

    @Override
    public void forward() {
        System.out.println("Vehicle is moving forward.");
    }

    @Override
    public void backward() {
        System.out.println("Vehicle is moving backward.");
    }

    @Override
    public void left() {
        System.out.println("Vehicle is moving left.");
    }

    @Override
    public void right() {
        System.out.println("Vehicle is moving right.");    
    }


}
