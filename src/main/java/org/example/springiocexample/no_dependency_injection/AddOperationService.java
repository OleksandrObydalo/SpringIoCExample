package org.example.springiocexample.no_dependency_injection;

public class AddOperationService {
    private DigitalServiceImpl digitalService;

    public AddOperationService() {
        this.digitalService = new DigitalServiceImpl();
    }

    public String operation(String arg0, String arg1) {
        return String.valueOf(digitalService.toInt(arg0) + digitalService.toInt(arg1));
    }
}
