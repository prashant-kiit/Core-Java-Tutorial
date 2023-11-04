package com.Prashant.Interface.Example2;

class Car {
    private Engine engine;

    Car(Engine engine1) {
        engine=engine1;
    }

    void start() {
        engine.start();
    }
    void stop() {
        engine.stop();
    }

    void changeEngine(Engine engine1) {
        engine=engine1;
    }

}
