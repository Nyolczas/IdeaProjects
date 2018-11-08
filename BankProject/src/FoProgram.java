public class FoProgram {

    public static void main(String[] args) {
        Bankszamla b = new Bankszamla("8-I", 15000);
        System.out.println("Tulajdonos: "+ b.getTulajdonos());
        System.out.println("Egyenleg: "+ b.getEgyenleg());
    }
}
