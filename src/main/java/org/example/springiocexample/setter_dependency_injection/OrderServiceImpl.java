package org.example.springiocexample.setter_dependency_injection;

public class OrderServiceImpl {
    private DigitalService digitalService;

    public void setDigitalService(DigitalService digitalService) {
        this.digitalService = digitalService;
    }
}
