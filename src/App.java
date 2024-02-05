import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Car audi = new Car("white", 1599, "SND1345P", 1996, "Audi", "A4", "Sedan");

        audi.honk();
        audi.forward();

        Vehicle honda = new Car("black", 1600, "SBD998L", 1999, "civic", "Honda", "Sedan");

        honda.honk();
        honda.right();

        Bus schoolBus = new Bus("Orange", 2000, "VGN9376P", 1998, "love", "Mercedes", true, true);
        schoolBus.startSwiped();
        schoolBus.stop();
        schoolBus.setDoorStatus("front");
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("front");
        schoolBus.getDoorStatus();
        schoolBus.setDoorStatus("back");
        schoolBus.getDoorStatus();
        schoolBus.forward();
        schoolBus.right();

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(audi);
        vehicles.add(honda);
        vehicles.add(schoolBus);
    
        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }

        Container<Vehicle> container = new Container<>();
        container.addItem(schoolBus);
        container.addItem(audi);
        container.addItem(honda);

        List<Vehicle> retrieveVehicles = container.getItems();
        for(Vehicle vehicle: retrieveVehicles) {
            System.out.println(vehicle.toString());
        }
        
    }
}
