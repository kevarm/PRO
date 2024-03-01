public class Cuadrado {
    private double lonLado;
    private double perimetro;
    public double perimetro(){
        return 4 *this.lonLado;
    }

    public double area(){
        return this.lonLado *this.lonLado;
    }

    public void escalar (double escala){
        if(escala !=0){
            this.lonLado *= escala;
        }else{
            System.out.println("");
        }
    }
    public String toString(){
        return "Cuadrado con longitud de lado "+ this.lonLado;
    }
}
