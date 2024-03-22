package beingscreation;

import earthbeings.LivingBeing;

public interface Creator {
    LivingBeing createLivingBeings(String name, int age, String race);
}