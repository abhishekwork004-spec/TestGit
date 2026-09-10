package com.certinext.demo;

/** Checks a domain before an order is accepted. Demo only. */
public class DomainValidator {

    public boolean validate(String domain) {
        return domain != null && domain.contains(".");
    }
}
