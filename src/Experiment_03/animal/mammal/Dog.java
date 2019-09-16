package Experiment_03.animal.mammal;

public class Dog extends Mammal {
    protected String varieties;
    String getVarieties(){return varieties;}
    void setVarieties(String a){varieties = a;}
    void speak(){System.out.println("Woof!");}
    void wagTail(){System.out.println("Tail wagging…");}
    void begFood(){System.out.println("begging for food…");}
}
