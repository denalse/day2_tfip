public class App {
    public static void main(String[] args) throws Exception {

        Car audi = new Car("white", 1599, "SND1345P", 1996, "Audi", "A4", "Sedan");

        audi.honk();

        Vehicle honda = new Car("black", 1600, "SBD998L", 1999, "civic", "Honda", "Sedan");

        honda.honk();

        Vehicle schBus = new Bus("Orange", 2000, "VGN9376P", 1998, null, "Mercedes", true, true);
        schBus.honk();

        

    }
}
