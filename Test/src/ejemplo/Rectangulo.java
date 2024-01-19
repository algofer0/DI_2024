package ejemplo;

public class Rectangulo {

  private int ancho;

    private int largo;

    public Rectangulo(int ancho, int largo)
    {
    this.ancho = ancho;
    this.largo = largo;

    }
    public int perimetro()
    {
        return 2*ancho+2*largo;

    }


}
