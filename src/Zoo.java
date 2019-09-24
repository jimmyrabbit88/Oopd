public class Zoo {
    public static void main(String[] args) {
        //Animal tiger = new Animal(3, "male", 120);
        //tiger.eat();
        //tiger.sleep();

        Bird robin = new Bird(3, "male", 20);
        //robin.fly();
        //robin.sleep();

        Fish trout = new Fish(3, "male", 20);
        //trout.swim();
        //trout.eat();

        Chicken red = new Chicken(3, "male", 40);
        //red.fly();

        Sparrow spa = new Sparrow(3,"male", 10);
        spa.fly();
        spa.move();

        Animal spa2 = new Sparrow(3,"female", 12);
        spa2.move();
        //spa2.fly(); no available because sparrow is of type animal and not bird for some reason}
    }
}
