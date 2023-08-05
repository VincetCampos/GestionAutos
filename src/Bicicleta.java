public class Bicicleta implements Vehiculo{

    @Override
    public String avanzar() {
        return "esta pedaliando una bicicleta";
    }

    @Override
    public String detenerse() {
        return "detuvo una bicicleta";
    }
}
