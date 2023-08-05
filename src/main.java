
public class main {
    public static void main(String[] args) throws InterruptedException {
        Vehiculo vehiculo1 = new Automovil();
        Vehiculo vehiculo2 = new Bicicleta();

        String usuario = "El usuario ";
        String automovilOn = usuario + vehiculo1.avanzar();
        String bicicletaOn = usuario + vehiculo2.avanzar();

        System.out.println(automovilOn);

        System.out.println(bicicletaOn);

        String automovilOff = usuario + vehiculo1.detenerse();
        String bicicletaOff = usuario + vehiculo2.detenerse();

        System.out.println(bicicletaOff);
        System.out.println(automovilOff);

    }
}

