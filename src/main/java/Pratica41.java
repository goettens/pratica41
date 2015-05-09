
import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;

public class Pratica41 {
    public static void main(String[] args) {
        
        Circulo circ = new Circulo(10);
        Elipse elip = new Elipse(10,10);
        
        System.out.println(circ.getArea());
        System.out.println(elip.getArea());
        System.out.println(circ.getPerimetro());
        System.out.println(elip.getPerimetro());
    }
}
