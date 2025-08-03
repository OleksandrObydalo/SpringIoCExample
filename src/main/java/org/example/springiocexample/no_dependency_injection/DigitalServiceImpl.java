package org.example.springiocexample.no_dependency_injection;

public class DigitalServiceImpl {
    public int toInt(String arg0) {
        int sum = 0;
        for(char ch: arg0.toCharArray()){
            sum += ch;
        }
        return sum;
    };
}
