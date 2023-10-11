package ra.modal.impl;

import ra.modal.Bird;

public class Chiken extends Bird {
    @Override
    public void fly() {
        System.out.println("Chiken fly");
    }

    @Override
    public void makeNoise() {
        System.out.println("Quac Quac");
    }
}
