public class Bankszamla {

    private String tulajdonos;
    private double egyenleg;

    public Bankszamla(String Tulaj, double induloEgyenleg) {
        this.tulajdonos=Tulaj;
        this.egyenleg=induloEgyenleg;
    }

    public String getTulajdonos() {
        return this.tulajdonos;
    }

    public double getEgyenleg() {
        return this.egyenleg;
    }
}
