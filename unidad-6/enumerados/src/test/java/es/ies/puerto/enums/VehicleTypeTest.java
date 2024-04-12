package es.ies.puerto.enums;

import es.ies.puerto.utilities.TestUtilities;
import org.junit.jupiter.api.Test;

public class VehicleTypeTest extends TestUtilities {
    VehicleType vehicleType;
    @Test
    public void bikeVehicleTest() {
        vehicleType = VehicleType.BIKE;
        System.out.println(vehicleType.getType());
    }
}
