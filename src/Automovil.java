public class Automovil implements Vehiculo{

    @Override
    public String avanzar() {
        return "encendio un automovil";
    }

    @Override
    public String detenerse() {
        return "apago un automovil";
    }
}
