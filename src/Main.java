import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  /*      int r;
        double pi= 3.14 , alan, cevre;
        Scanner inp = new Scanner(System.in);

        r= inp.nextInt();
        alan= (r*r)*pi;
        cevre= 2*(pi*r);
        System.out.println("Dairenin alanı= "+alan);
        System.out.println("Dairenin çevresi = "+cevre);

   */
        int r, alpha;
        double pi= 3.14  ,daireAlan;
   //     (𝜋 * (r*r) * 𝛼) / 360
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen daire yarıçapını giriniz.");
        r = inp.nextInt();
        System.out.println("Lütfen açıyı giriniz.");
        alpha = inp.nextInt();
        daireAlan = (pi*r*r*alpha)/360;
        System.out.println("Daire diliminin alanı= "+ daireAlan);
    }
}