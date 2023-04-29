import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GetToy {
    public static void getToy(ArrayList<Toy> toys){
        try(FileWriter writer = new FileWriter("toy.txt", false))
        {
            var toy = toys.get(0);
            writer.write(toy.getId());
            writer.append(toy.getName());
            writer.append((char) toy.getFrequency());
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
