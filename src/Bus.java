
public class Bus extends Vehicle{

    private Boolean frontDoor;
    private Boolean backDoor;
    private Boolean frontDoorOpen;
    private Boolean backDoorOpen;

    public Bus(Boolean frontDoor, Boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    public Bus(String color, int capacity, String licensePlate, int year, String model, String make,
            Boolean frontDoor, Boolean backDoor) {
        super(color, capacity, licensePlate, year, model, make);
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    public Bus(Boolean frontDoor, Boolean backDoor, Boolean frontDoorOpen, Boolean backDoorOpen) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
        this.frontDoorOpen = frontDoorOpen;
        this.backDoorOpen = backDoorOpen;
    }

    public Boolean getFrontDoor() {
        return frontDoor;
    }

    public void setFrontDoor(Boolean frontDoor) {
        this.frontDoor = frontDoor;
    }

    public Boolean getBackDoor() {
        return backDoor;
    }

    public void setBackDoor(Boolean backDoor) {
        this.backDoor = backDoor;
    }

    public Boolean getFrontDoorOpen() {
        return frontDoorOpen;
    }

    public void setFrontDoorOpen(Boolean frontDoorOpen) {
        this.frontDoorOpen = frontDoorOpen;
    }

    public Boolean getBackfrontDoorOpen() {
        return backDoorOpen;
    }

    public void setBackfrontDoorOpen(Boolean backDoorOpen) {
        this.backDoorOpen = backDoorOpen;
    }

    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpen=" + frontDoorOpen
                + ", backfrontDoorOpen=" + backDoorOpen + "model= " + this.getModel() + "]";
    }

    @Override
    public void honk() {
        System.out.println("Boo.. Boo..");
    }

    public void getDoorStatus() {
        System.out.println("Front Door: " + frontDoor + ", Opened: " + frontDoorOpen);
        System.out.println("Back Door: " + backDoor + ", Opened: " + backDoorOpen);
    }

    

}
