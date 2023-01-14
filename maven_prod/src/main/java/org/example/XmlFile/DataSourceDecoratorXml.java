package org.example.XmlFile;

import java.io.IOException;

public class DataSourceDecoratorXml implements DataSourceXml {
    private DataSourceXml wrappee;

    DataSourceDecoratorXml(DataSourceXml source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data){
        wrappee.writeData(data);
    }

    @Override
    public String readData() throws IOException {
        return wrappee.readData();
    }
    @Override
    public String processedByTeg(String dataFile, String teg){
        return wrappee.processedByTeg(dataFile,teg);
    }
}

