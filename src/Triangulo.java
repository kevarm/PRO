public class Triangulo {
    private double altura;
    private double base;
    private double lado1;
    private double lado2;
    private double lado3;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double perimetro(){
        return this.lado1*this.altura/2;
    }
    public void escalar(){
        if(escala !=0){
            altura*escala;
            this.lado1 *= escala;
            this.lado2 *=escala;
            this.lado *=escala;
        }
    }
    public String toString(){
        return "Triángulo de base "+ this.lado1+" y altura "+ this.altura;
    }
}
