package com.sowrov.micorRest1;

public class SingletonTest {
    private SingletonTest(){
        this.v=-1;
        System.out.println("Construct");
    }
    private int v;

    private static class BillSingletonTest {
        private static final SingletonTest instance = new SingletonTest();
    }

    public static SingletonTest getInstance() {
        return BillSingletonTest.instance;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
