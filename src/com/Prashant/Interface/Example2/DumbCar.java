package com.Prashant.Interface.Example2;

class DumbCar {
    VintageEngine vintageClass=new VintageEngine();
    ModernEngine modernClass=new ModernEngine();

    void vintageStart() {
        vintageClass.start();
    }
    void vintageStop() {
        vintageClass.stop();
    }
    void modernStart() {
        modernClass.start();
    }
    void modernStop() {
        modernClass.stop();
    }
}
