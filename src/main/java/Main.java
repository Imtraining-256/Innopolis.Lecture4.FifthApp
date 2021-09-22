import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engines.Engine;
import engines.Engine12V;
import engines.FSDEngine;

public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        Beeper magic = new MagicSparks();
        Beeper music = new FancyMusic();

        Engine12V engine12V = new Engine12V();
        FSDEngine fsdEngine = new FSDEngine();

        Lambo lambo = new Lambo(magic, engine12V);
        Tesla tesla = new Tesla(music, fsdEngine);

        tesla.scoopFuel();
        tesla.landToPlanet();

        System.out.println(tesla.checkBeep());
        System.out.println(tesla.checkSpeed());

        System.out.println(lambo.checkBeep());
        System.out.println(lambo.checkSpeed());
    }
}
