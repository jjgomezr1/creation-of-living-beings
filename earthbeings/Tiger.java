package earthbeings;

public class Tiger extends LivingBeing implements EarthBeing {

    public Tiger(String name, int age, String race) {
        super(name, age, race);
    }
    // Implementacion de los metodos de la clase abstracta "LivingBeings"
    @Override
    public void born() {
        System.out.println("The tiger " +getName()+ " has been born.");
    }

    @Override
    public void grow() {
        System.out.println("The tiger " +getName()+ " has turned older.");
    }

    @Override
    public void die() {
        System.out.println("The tiger " +getName()+ " has passed away.");
    }

    @Override
    public void respawn() {
        System.out.println("The tiger " +getName()+ " has respawned.");
    }
}
