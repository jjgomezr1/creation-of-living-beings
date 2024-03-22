package skybeings;

import earthbeings.LivingBeing;

public class Angel extends LivingBeing implements SkyBeing {

    public Angel(String name, int age, String race) {
        super(name, age, race);
    }
    // Implementacion de los metodos de la clase abstracta "LivingBeings"
    @Override
    public void born() {
        System.out.println("The angel " +getName()+ " has been born.");
    }

    @Override
    public void grow() {
        System.out.println("The angel " +getName()+ " has turned older.");
    }

    @Override
    public void die() {
        System.out.println("The angel " +getName()+ " has passed away.");
    }

    @Override
    public void respawn() {
        System.out.println("The angel " +getName()+ " has respawned.");
    }
    // Modificacion de los metodos de la interface "SerCelestial"
    @Override
    public void fly() {
        System.out.println("The angel " +getName()+ " flies with its wings.");
    }

    @Override
    public void changeDimension() {
        System.out.println("The angel " +getName()+ " changes dimension.");
    }

    @Override
    public void createCloud() {
        System.out.println("The angel " +getName()+ " creates a cloud.");
    }
}
