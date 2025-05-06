package coberturaCodigo;

public class ReservaHotel {

    public static double calcularPrecio(String tipoHabitacion, boolean clienteHabitual, int noches) {
        double precioBase;

        switch (tipoHabitacion.toLowerCase()) {
            case "simple":
                precioBase = 50;
                break;
            case "doble":
                precioBase = 80;
                break;
            case "matrimonial":
                precioBase = 100;
                break;
            default:
                throw new IllegalArgumentException("Tipo de habitación no válido");
        }

        double descuento = clienteHabitual ? 0.1 : 0.0; // 10% descuento
        return precioBase * noches * (1 - descuento);
    }
}

