public class Animal {
    private int age;
    private String gender;
    private int weightInPounds;

    public Animal(){
        age = 0;
        gender = "";
        weightInPounds = 0;
    }
    public Animal(int Age, String Gender, int WeightInPounds){
        age = Age;
        gender = Gender;
        weightInPounds = WeightInPounds;
    }



    public void eat(){
        System.out.println("Im eating...");
    }

    public void sleep() {
        System.out.println("Im sleeping zzz");
    }
}
