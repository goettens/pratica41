


public class Circulo extends Elipse{

    public Circulo(double x) {
        super(x, x);
    }
    
    @Override
    public double getPerimetro(){
        return 2*Math.PI*(this.x/2);
    }
}
