public class FileOperations {
    public static main (String[] args){

        fileRead r = new fileRead();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
