
package vehiculoMorenoBeginesAlicia2223;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoMorenoBeginesAlicia2223 miVehiculo;
        int stockActual;
        
        miVehiculo = new VehiculoMorenoBeginesAlicia2223("Seat",18000,100);
        operativaVehiculosMorenoBeginesAlicia2223(miVehiculo, 50);
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculo.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculo.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosMorenoBeginesAlicia2223(VehiculoMorenoBeginesAlicia2223 miVehiculo, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculo.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
    }

}
    
