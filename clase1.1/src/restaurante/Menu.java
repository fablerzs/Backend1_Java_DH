package restaurante;

public abstract class Menu {
    private double precioBase;
    private String tipoMenu;

    public Menu(double precioBase, String tipoMenu) {
        this.precioBase = precioBase;
        this.tipoMenu = tipoMenu;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }
}
