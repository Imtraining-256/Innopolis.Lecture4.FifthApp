import beepers.Beeper;
import beepers.FancyMusic;
import beepers.Horn;
import beepers.MagicSparks;
import engines.Engine12V;
import engines.FSDEngine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Beeper horn = new Horn();
        Beeper magic = new MagicSparks();
        Beeper music = new FancyMusic();

        Engine12V engine12V = new Engine12V();
        FSDEngine fsdEngine = new FSDEngine();

        Lambo lambo = new Lambo(magic, engine12V);
        Tesla tesla = new Tesla(music, fsdEngine);

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(tesla);
        carList.add(lambo);

        for (int i = 0; i < carList.size(); i++){
            System.out.println(carList.get(i).checkBeep());
        }
    }
}
