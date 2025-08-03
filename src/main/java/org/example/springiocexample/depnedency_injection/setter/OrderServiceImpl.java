package org.example.springiocexample.depnedency_injection.setter;

public class OrderServiceImpl {
    private DigitalService digitalService;

    public void setDigitalService(DigitalService digitalService) {
        this.digitalService = digitalService;
    }
}
