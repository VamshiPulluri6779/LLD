package DesignPatterns.InterpreterDesign;

import java.util.*;

public class Context {

    Map<String, Integer> context;

    Context(){
        context = new HashMap<>();
    }

    public void put(String key, int val){
        context.put(key, val);
    }

    public int get(String key){
        return this.context.get(key);
    }
}
