package retanguloLista2;

public class Retangulo {
    private float width;
    private float length;

    public void setWidth(float width){
        if(width < 0.0f || width < 20.0f){
            this.width = width;
        }
    }
    public float getWidth(){
        return this.width;
    }
     public void setLength(float length){
        if(length < 0.0f || length < 20.0f){
            this.length = length;
        }
    }
    public float getLength(){
        return this.length;
    }

    public float calculaPerimetro(){
        float perimetro = this.length + this.width;
        return perimetro;
    }

    public float calculaArea(){
        float area = this.length * this.width;
        return area;
    }

    Retangulo() {
        this.width = 1.0f;
        this.length = 1.0f;
    }

    Retangulo(float width, float length){
        this.width = width;
        this.length = length;
    }
}
