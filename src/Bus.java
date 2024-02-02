
public class Bus extends Vehicle{

    private Boolean frontDoor;
    private Boolean backDoor;
    private Boolean frontDoorOpen;
    private Boolean backfrontDoorOpen;

    public Bus(Boolean frontDoor, Boolean backDoor) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
    }

    public Bus(Boolean frontDoor, Boolean backDoor, Boolean frontDoorOpen, Boolean backfrontDoorOpen) {
        this.frontDoor = frontDoor;
        this.backDoor = backDoor;
        this.frontDoorOpen = frontDoorOpen;
        this.backfrontDoorOpen = backfrontDoorOpen;
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
        return backfrontDoorOpen;
    }

    public void setBackfrontDoorOpen(Boolean backfrontDoorOpen) {
        this.backfrontDoorOpen = backfrontDoorOpen;
    }

    @Override
    public String toString() {
        return "Bus [frontDoor=" + frontDoor + ", backDoor=" + backDoor + ", frontDoorOpen=" + frontDoorOpen
                + ", backfrontDoorOpen=" + backfrontDoorOpen + "model= " + this.getModel() + "]";
    }

    

}
