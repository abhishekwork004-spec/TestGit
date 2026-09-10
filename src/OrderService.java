package com.certinext.demo;

/** Submits certificate orders. Demo only. */
public class OrderService {

    // How long we wait for the CA to answer. Raised for large SAN orders.
    private static final int TIMEOUT_SECONDS = 60;

    // Most SAN entries one order may carry.
    private static final int MAX_SAN = 100;

    public String submitOrder(String commonName) {
        if (commonName == null || commonName.isEmpty()) {
            return "EMS-901";
        }
        return "submitted:" + commonName + " t=" + TIMEOUT_SECONDS;
    }
}
