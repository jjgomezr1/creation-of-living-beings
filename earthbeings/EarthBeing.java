package earthbeings;

public interface EarthBeing {
    // Interfaz para entes vivos que viven en la tierra
    default void born() {
        System.out.println("The being is born...");
    }

    default void grow() {
        System.out.println("The being grows...");
    }

    default void die() {
        System.out.println("The being dies...");
    }

    default void respawn() {
        System.out.println("The being respawns...");
    }
}