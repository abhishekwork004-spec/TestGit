package com.certinext.demo;

/** Submits certificate orders. Demo only. */
public class OrderService {

    // How long we wait for the CA to answer.
    private static final int TIMEOUT_SECONDS = 30;

    public String submitOrder(String commonName) {
        if (commonName == null || commonName.isEmpty()) {
            return "EMS-901";
        }
        return "submitted:" + commonName;
    }
}
