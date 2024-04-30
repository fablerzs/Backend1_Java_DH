package figuras;

import java.util.Objects;

public class cuadrado {
    private String tipoFigura;
    private double radio;
    private double lado;

    public cuadrado(String tipoFigura, int radio, int lado) {
        this.tipoFigura = tipoFigura;
        this.radio = radio;
        this.lado = lado;
    }

    public boolean mayorCero (double valor) {
        return valor > 0;
    }

    public double calcularArea(String tipoFigura, double valor) {
        if(Objects.equals(tipoFigura, "circulo")){
            return valor*valor;
        } else if( )

    }
}
