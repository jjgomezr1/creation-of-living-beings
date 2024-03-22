package beingscreation;

import earthbeings.Human;
import earthbeings.LivingBeing;
import earthbeings.Tiger;
import skybeings.Angel;

public class LivingBeingCreator implements Creator {
    @Override
    public LivingBeing createLivingBeings(String name, int age, String race) {
        if (race.equals("Human")) {
            return new Human(name, age, race);
        } else if (race.equals("Tiger")) {
            return new Tiger(name, age, race);
        } else {
            return new Angel(name, age, race);
        }
    }

    public static void main(String[] args) {
        LivingBeingCreator creator = new LivingBeingCreator();

        Human human = (Human) creator.createLivingBeings("Emilio", 18, "Human");
        Tiger tiger = (Tiger) creator.createLivingBeings("Emiliano", 7, "Tiger");
        Angel angel = (Angel) creator.createLivingBeings("Maximiliano", 2005, "Angel");
        // Acciones del humano
        human.born();
        human.grow();
        human.die();
        human.respawn();
        human.fly();
        human.changeDimension();
        human.createCloud();
        // Acciones del tigre
        tiger.born();
        tiger.grow();
        tiger.die();
        tiger.respawn();
        // Acciones del angel
        angel.born();
        angel.grow();
        angel.die();
        angel.respawn();
        angel.fly();
        angel.changeDimension();
        angel.createCloud();
    }
}
