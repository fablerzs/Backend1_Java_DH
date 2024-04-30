package restaurante;

public class EmpleadoInfantil extends Empleado{
    @Override
    protected String armarMenu(Menu menu) {
        MenuInfantil mi = (MenuInfantil) menu;
        return "El menu infantil consta de pollo, papas y arroz mas " + mi.getNumeroJuguetes() + " juguetes";
    }

    @Override
    protected double calcularCosto(Menu menu) {
        double precio = 0;
        if(menu instanceof MenuInfantil){
            MenuInfantil mi = (MenuInfantil) menu;
            precio = mi.getPrecioBase() + (mi.getNumeroJuguetes())*3;
        }
        System.out.println("El total del menu infantil es de "+ precio + "pesos");
        return precio;
    }
}
