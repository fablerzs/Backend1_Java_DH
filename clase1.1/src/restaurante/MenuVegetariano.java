package restaurante;

public class MenuVegetariano extends  Menu {
    private int cantidadEspecias;
    private int cantidadSalsas;

    public MenuVegetariano(double precioBase, String tipoMenu, int cantidadEspecias, int cantidadSalsas) {
        super(precioBase, tipoMenu);
        this.cantidadEspecias = cantidadEspecias;
        this.cantidadSalsas = cantidadSalsas;
    }

    public int getCantidadEspecias() {
        return cantidadEspecias;
    }

    public int getCantidadSalsas() {
        return cantidadSalsas;
    }
}
