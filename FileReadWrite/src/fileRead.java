import java.io.*;
import java.nio.file.Path;
import java.util.*;

public class fileRead {
    private Scanner x;

    public void openFile(){
        try{
            File file = new File("/D:/8I/Temp/statementTest.txt");
            x  = new Scanner(file);
        }
        catch(Exception e) {
            System.out.println("nemtalálom a fájlt vazze!");
        }
    }

    public void readFile(){
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }

    public void closeFile(){
        x.close();
    }
}
