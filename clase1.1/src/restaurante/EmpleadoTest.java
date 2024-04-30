package restaurante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

    @Test
    public void calcularMenu(){
        //DADO
        Menu menuNiño = new MenuInfantil(50,"Infantil",4);
        Menu menuAdultoi = new MenuClasico(60, "Clasico");
        Menu menuVeggie = new MenuVegetariano(70, "Vegetariano",3,2);

        Empleado empleadoInfantil = new EmpleadoInfantil();

        //CUANDO
        empleadoInfantil.armarMenu(menuNiño);
        MenuInfantil mi = (MenuInfantil) menuNiño;
        empleadoInfantil.calcularCosto(menuNiño);

        String respEsp = "El menu infantil consta de pollo, papas y arroz mas " + ((MenuInfantil) menuNiño).getNumeroJuguetes()  + " juguetes";

        //ENTONCES

        Assertions.assertEquals(empleadoInfantil.armarMenu(menuNiño),respEsp);

    }
}
