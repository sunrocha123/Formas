package Atividade_8;
import java.math.*;

public class Circunferencia extends Forma {
    protected float raio;

    public Circunferencia(float r){
        this.raio = r;
    };

    public void setCircunferencia(float r){
        this.raio = r;
    }

    public float getCircunferencia(){
        return this.raio;
    }

    public double area(){
        return Math.PI * (Math.pow(raio, 2));
    }

    public double perimetro(){
        return 2 * Math.PI * raio;
    }

    public void mostra(){
        System.out.println("Raio: " + raio + "\nÁrea: " + area() + "\nPerímetro: " + perimetro());
    }
}
