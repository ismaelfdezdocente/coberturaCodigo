package coberturaCodigo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ReservaHotelTest {

    @Test
    public void testCalculoPrecioClienteHabitual() {
        double precio = ReservaHotel.calcularPrecio("doble", true, 3);
        assertEquals(216.0, precio); // 80 * 3 * 0.9
    }

    @Test
    public void testCalculoPrecioClienteNoHabitual() {
        double precio = ReservaHotel.calcularPrecio("simple", false, 2);
        assertEquals(100.0, precio); // 50 * 2
    }
    
    @Test
    public void testCalculoPrecioClienteMatrimonial() {
        double precio = ReservaHotel.calcularPrecio("matrimonial", false, 2);
        assertEquals(200.0, precio); // 100 * 2
    }

    @Test
    public void testTipoHabitacionInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            ReservaHotel.calcularPrecio("lujo", true, 1);
        });
    }
    
}
