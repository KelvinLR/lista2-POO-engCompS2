package retanguloLista2;

public class Teste {
    public static void main(String[] args){
        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo(3.0f, 4.0f);
        
        System.out.println("Ret1\nArea: " + ret1.calculaArea() + "\nPerimetro: " + ret1.calculaPerimetro());
        System.out.println("Ret2\nArea: " + ret2.calculaArea() + "\nPerimetro: " + ret2.calculaPerimetro());
    }
}
