package earthbeings;

import skybeings.SkyBeing;

public class Human extends LivingBeing implements SkyBeing {

    public Human(String name, int age, String race) {
        super(name, age, race);
    }
    // Implementacion de los metodos de la clase abstracta "LivingBeings"
    @Override
    public void born() {
        System.out.println("The human " +getName()+ " has been born.");
    }

    @Override
    public void grow() {
        System.out.println("The human " +getName()+ " has turned older.");
    }

    @Override
    public void die() {
        System.out.println("The human " +getName()+ " has passed away.");
    }

    @Override
    public void respawn() {
        System.out.println("The human " +getName()+ "has respawned.");
    }
    // Modificacion de los metodos de la interface "SerCelestial"
    @Override
    public void fly() {
        System.out.println("The human " +getName()+ " flies in a plane.");
    }

    @Override
    public void changeDimension() {
        System.out.println("The human " +getName()+ " uses a dimensional travel machine.");
    }

    @Override
    public void createCloud() {
        System.out.println("The human " +getName()+ " uses a cloud creation machine.");
    }
}
