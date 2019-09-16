package Experiment_03.animal.mammal;

public class Mammal{
    protected int age = 2;
    protected int weight = 5;
    public Mammal(){
        System.out.println("Mammal constructor");
    }
    int getAge(){return age;}
    void setAge(int a){age = a;}
    int getWeight(){return weight;}
    void setWeight(int w){weight = w;}
    void move(){System.out.println("Mammal move one step");}
    void speak(){System.out.println("Mammal speak!");}
    void sleep(){System.out.println("shhh, I’m sleeping.");}
}