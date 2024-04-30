package restaurante;

public class EmpleadoClasico extends Empleado{

    @Override
    protected String armarMenu(Menu menu) {
        return "Menu clasico sin adicionales";
    }

    @Override
    protected double calcularCosto(Menu menu) {
        double precio = 0;
        if(menu instanceof MenuClasico){
            MenuClasico mc = (MenuClasico) menu;
            precio = mc.getPrecioBase();
        }
        return precio;
    }
}
