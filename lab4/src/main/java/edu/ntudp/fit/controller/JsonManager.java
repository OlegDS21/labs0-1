package edu.ntudp.fit.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class JsonManager<T> {
    private Gson gson;
    private Class<T> type;
    public JsonManager(Class<T> type) {
        this.type = type;
        this.gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public void writeToFile(T obj, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        this.gson.toJson(obj, writer);
        writer.flush();
        writer.close();
    }

    public T readFromFile(String filePath) throws FileNotFoundException {
        FileReader reader = new FileReader(filePath);
        return this.gson.fromJson(reader, this.type);
    }
}
