package org.example.springiocexample.depnedency_injection.constructor;

public class AddOperation {
    public class AddOperationService {
        private DigitalService digitalService;

        public AddOperationService(DigitalService digitalService) {
            this.digitalService = digitalService;
        }

    }
}
