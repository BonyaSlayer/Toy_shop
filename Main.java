import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<>();
        ArrayList<Toy> wintoys = new ArrayList<>();
        Toy toy = new Toy("aaa",1,20);
        Toy toy1 = new Toy("bbb",1,30);
        Toy toy2 = new Toy("ccc",1,50);
        toys.add(toy);
        toys.add(toy1);
        toys.add(toy2);
        wintoys.add(Game.playGame(toys));
        System.out.println(wintoys);   


    }
}