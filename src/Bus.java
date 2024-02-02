
public class Bus extends Vehicle {

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
        this.frontDoorOpen = false;
        this.backDoorOpen = false;
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

    // public void setFrontDoorOpen(Boolean frontDoorOpen) {
    //     this.frontDoorOpen = frontDoorOpen;
    // }

    public Boolean getBackDoorOpen() {
        return backDoorOpen;
    }

    // public void setBackDoorOpen(Boolean backDoorOpen) {
    //     this.backDoorOpen = backDoorOpen;
    // }

     // door: front, back
     public void setDoorStatus(String door) {

        if (door.toLowerCase().equals("front")) {
            if (frontDoor) {
                // either open or close the door
                this.frontDoorOpen = !this.frontDoorOpen;
            } else {
                System.err.println("There is no " + door + " door.");
            }
        }

        if (door.toLowerCase().equals("back")) {
            if (backDoor) {
                // either open or close the door
                this.backDoorOpen = !this.backDoorOpen;
            } else {
                System.err.println("There is no " + door + " door.");
            }
        }
    }

    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpen=" + frontDoorOpen
                + ", backDoorOpen=" + backDoorOpen + ",  model= " + this.getModel() + "]";
    }

    @Override
    public void honk() {
        System.out.println("Boo.. Boo..");
    }

    public void getDoorStatus() {
        System.out.println("Front Door: " + frontDoor + ", Opened: " + frontDoorOpen);
        System.out.println("Back Door: " + backDoor + ", Opened: " + backDoorOpen);
    }

    @Override
    public void forward() {
        System.out.println("Bus is moving forward.");
    }

    @Override
    public void backward() {
        System.out.println("Bus is moving backward.");
    }

    @Override
    public void left() {
        System.out.println("Bus is moving left.");
    }

    @Override
    public void right() {
        System.out.println("BusF is moving right.");
    }

}
