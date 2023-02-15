package playtime;

public class Ninja extends Fighter {
    private int numShurikens;


    public Ninja(String name) {
        super(name);
        numShurikens = 1;
    }

    @Override
    public String toString() {
        return "I am a freaking ninja!!!";
    }

    public void jump() {
        System.out.println("The ninja jumps!");
    }

    public void throwShuriken(Fighter poorBastard) {
        if(numShurikens <= 0) {
            System.out.println("The ninja feels dumb (no more shuriken)");
            return;
        }
        numShurikens--;
        int currentHealth = poorBastard.getHealth();
        currentHealth -= (5 + strength);
        poorBastard.setHealth(currentHealth);
    }

    @Override
    public void taunt() {
        super.taunt();
        System.out.println("The ninja glares coldly.");
    }

    // accessors

    public int getNumShurikens() {
        return numShurikens;
    }

    public void setNumShurikens(int numShurikens) {
        this.numShurikens = numShurikens;
    }
}
