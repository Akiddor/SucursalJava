public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private String ciudad;


    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }


    public void mostrarDatosSucursal() {
        System.out.println("Numero de Sucursal: " + numeroSucursal);
        System.out.println("Direccion: " + direccion);
        System.out.println("Ciudad: " + ciudad);

    }




}
