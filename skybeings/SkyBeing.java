package skybeings;

import earthbeings.EarthBeing;

public interface SkyBeing extends EarthBeing {
    // Interfaz para entes vivos que viven en la tierra
    default void fly() {
        System.out.println("The being flies...");
    }

    default void changeDimension() {
        System.out.println("The being changes dimensions...");
    }

    default void createCloud() {
        System.out.println("The being creates a cloud...");
    }
}