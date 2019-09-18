public class Sparrow extends Bird implements Flyable{
    public Sparrow(int Age, String Gender, int WeightInPounds){
        super(Age, Gender, WeightInPounds);
    }

    public void fly(){
        System.out.println("Im flying w w w");
    }

}