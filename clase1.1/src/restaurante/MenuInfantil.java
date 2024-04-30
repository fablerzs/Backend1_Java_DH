package restaurante;

public class MenuInfantil extends Menu {
    private int numeroJuguetes;

    public MenuInfantil(double precioBase, String tipoMenu, int numeroJuguetes) {
        super(precioBase, tipoMenu);
        this.numeroJuguetes = numeroJuguetes;
    }

    public int getNumeroJuguetes() {
        return numeroJuguetes;
    }
}
