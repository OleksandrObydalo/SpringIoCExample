package org.example.springiocexample.constructor_dependency_injection;

public class AddOperation {
    public class AddOperationService {
        private DigitalService digitalService;

        public AddOperationService(DigitalService digitalService) {
            this.digitalService = digitalService;
        }

    }
}
