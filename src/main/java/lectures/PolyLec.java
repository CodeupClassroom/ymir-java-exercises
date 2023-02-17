package lectures;

import docrob.ServerNameGenerator;
import playtime.Fighter;
import playtime.Ninja;

public class PolyLec {
    public static void main(String[] args) {

//        String [] stringArray = ServerNameGenerator.nouns;
//        String fighterName = ServerNameGenerator.getRandomString();
//        Fighter f1 = new Fighter(fighterName);
//        System.out.println(f1);

        // first add a taunt method to fighter
        Fighter bob = new Fighter("Bob");
        bob.taunt();

        Ninja sue = new Ninja("Sue");
        sue.setNumShurikens(50);
        Ninja tom = new Ninja("Tom");
        tom.setNumShurikens(0);
        sue.taunt();
        sue.hit(bob);
        System.out.println(bob);
        System.out.println(sue);
        sue.jump();



        // explain inheritance and why it is awesome
        // make a subclass/subtype of Fighter (ninja)

        // explain superclass/supertype

        // show how a ninja can hit like a fighter

        // add a ninja-cool attack
        sue.throwShuriken(bob);
        System.out.println(bob);
        System.out.println(sue);


        System.out.println("----------------------------");
        Fighter weirdo = new Ninja("Weirdo");
        Fighter [] combatants = new Fighter[5];
        combatants[0] = weirdo;
        combatants[1] = bob;
        for (Fighter combatant : combatants) {
            if(combatant != null) {
//                if(combatant instanceof Ninja) {
//                    System.out.println("oooooo this is a Ninja");
//                    ((Ninja) combatant).throwShuriken(combatants[1]);
//                } else {
//                    System.out.println("bah just a fighter");
//                }
                System.out.println(combatant);

            }
        }

        // define a ninja-specific properties
        //  that affect the ninja-cool attack
        //  and add a getter/setter

        // what if the ninja-cool attack needs to use strength? (protected not private)
            // show that

        // override taunt()

        // point at toString() and how it overrides

        // what if the ninja wants to do both kinds of taunts?
            // show super

        // how can ninja use the fighter's constructor to init itself?

        // polymorphism
            // go beyond the lesson's definition
            // point to solid principles reference
                // https://en.wikipedia.org/wiki/SOLID


        // now let's use abstract references to store fighters and ninjas together!

        // final
            // class (cannot extend)
            // property (assign only once)
            // method (cannot override)
    }
}
