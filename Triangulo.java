package Atividade_8;

public class Triangulo extends Forma {
    protected float base;
    protected float altura;

    public Triangulo(float b, float h){
        this.base = b;
        this.altura = h;
    }

    public void setBase(float b){
        this.base = b;
    }

    public void setAltura(float h){
        this.altura = h;
    }

    public float getBase(){
        return this.base;
    }

    public float getAltura(){
        return this.altura;
    }

    public double area(){
        return (base *altura) / 2;
    }

    public void mostra(){
        System.out.println("Base: " + base + "\nAltura: " + altura + "\nÁrea: " + area());
    }
}
