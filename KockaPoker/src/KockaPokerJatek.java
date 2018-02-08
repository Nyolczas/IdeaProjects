import java.util.*;

public class KockaPokerJatek {
    public static void main(String[] args) {

        int[] dobasok = new int[5];
        int[] szamok = new int[7];
        Random r = new Random();
        for (int i = 0; i < dobasok.length; i++) {
            int dobas = r.nextInt(6)+1;
            dobasok[i]= dobas;
            //System.out.println(dobas);
            szamok[dobas]++;
        }
        //sorbarendezett kiíratás:
        Arrays.sort(dobasok);
        for (int i = 0; i <dobasok.length; i++) {
            System.out.println(dobasok[i]);
        }

        int par=0;
        int terc=0;
        int kvartett=0;
        int poker=0;
        for (int i = 1; i < szamok.length; i++) {
            switch (szamok[i]){
                case 2:
                    par++;
                    break;
                case 3:
                    terc++;
                    break;
                case 4:
                    kvartett++;
                    break;
                case 5:
                    poker++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("A dobás kombináció értéke: ");
        if (poker==1) System.out.println("poker!");
        else if (kvartett==1) System.out.println("kvartett!");
        else if (terc==1 && par==1) System.out.println("full house!");
        else if (terc==1) System.out.println("drill!");
        else if (par==2) System.out.println("két pár!");
        else if (par==1) System.out.println("egy pár!");
        else {
            if (szamok[1]==0) System.out.println("nagy sor!");
            else if (szamok[6]==0) System.out.println("kis sor!");
            else System.out.println("peched van öcsi!");
        }

    }
}
