import beepers.Beeper;
import engines.Engine;

public class Tesla extends Car{
    public Tesla(Beeper beeper, Engine engine) {
        super(beeper, engine);
    }

    public void scoopFuel() {
        System.out.println("Fuel scooped");
    }

    public void landToPlanet() {
        System.out.println("Vehicle landed");
    }
}
