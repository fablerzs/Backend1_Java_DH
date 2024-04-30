package restaurante;

public class EmpleadoVeg extends Empleado{
    @Override
    protected String armarMenu(Menu menu) {
        return null;
    }

    @Override
    protected double calcularCosto(Menu menu) {
        double precio = 0;
        if(menu instanceof MenuVegetariano){
            MenuVegetariano mv = (MenuVegetariano) menu;
            precio = mv.getCantidadSalsas()*2;
            precio += mv.getPrecioBase();
            precio += precio*1.1;
        }
        return precio;
    }
}
