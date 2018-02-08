public class FileOperations {
    public static void main (String[] args){

        fileRead r = new fileRead();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}
