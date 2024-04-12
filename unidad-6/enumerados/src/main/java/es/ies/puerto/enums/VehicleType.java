package es.ies.puerto.enums;

public enum VehicleType {
    CAR(1),
    TRUCK(2),
    BIKE(3);
    private int type;

    VehicleType() {}
    VehicleType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
