import java.util.ArrayList;
import java.util.Random;

public class Game {
    public static Toy playGame(ArrayList<Toy> data){
        Random rand = new Random();
        var id = rand.nextInt(data.size());
        data.get(id).ChangeCount(data.get(id).getCount()-1);
        return (data.get(id));
    }
}
