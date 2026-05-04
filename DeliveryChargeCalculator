class DeliveryChargeCalculator {

    final double DISTANCE_RATE = 100.0;
    final double WEIGHT_RATE = 50.0;
    final double EXPRESS_CHARGE = 500.0;

    double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * DISTANCE_RATE);
    }

    double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * DISTANCE_RATE)
                + (weightKg * WEIGHT_RATE);
    }

    double calculateCharge(double baseCharge, boolean expressDelivery) {

        if (expressDelivery) {
            return baseCharge + EXPRESS_CHARGE;
        } else {
            return baseCharge;
        }
    }
}
