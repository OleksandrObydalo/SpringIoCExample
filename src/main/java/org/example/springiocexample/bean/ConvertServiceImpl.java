package org.example.springiocexample.bean;

public class ConvertServiceImpl implements ConvertService {
    private static ConvertServiceImpl convertService;

    public static ConvertService getConvertService() {
        if(convertService == null){
            convertService = new ConvertServiceImpl();
        }
        return convertService;
    }
}
