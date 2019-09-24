public class Fish extends Animal {
    public Fish(int Age, String Gender, int WeightInPounds){
        super(Age, Gender, WeightInPounds);
    }

    public void swim(){
        System.out.println("Im swimming ~~~~");
    }

    public void move() {
        System.out.println("I am moving");
    }
}
