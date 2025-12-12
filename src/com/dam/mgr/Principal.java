package com.dam.mgr;

public class Principal {
    public static void main(String[] args) {
        Buffet buffet = new Buffet(20);

        Cocinero cocinero = new Cocinero(buffet);
        cocinero.start();

        for (int i = 0; i < 5; i++) {
            new Comensal(buffet).start();
        }
    }
}