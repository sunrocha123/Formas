package Atividade_8;

public class Retangulo extends Triangulo {

    public Retangulo(float b, float a){
        super(b, a);
    }

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return (base * altura) /2;
    }

    public void mostra(){
        System.out.println("Base: " + base + "\nAltura: " + altura + "\nÁrea: " + area() + "\nPerímetro: " + perimetro());
    }
}
