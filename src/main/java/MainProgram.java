public class MainProgram {
    public static void main(String args[]){
        Home home = new Home();
        Dog dog = new Dog();
        Dog dog2 = new Dog();
        Cat cat = new Cat();

        cat.setName("Stormy");
        dog.setName("Rax");

        System.out.println(dog.eat());
        //dog.eat();
        System.out.println(dog.sound());
        //dog.sound();
        System.out.println(cat.eat());
        //cat.eat();
        System.out.println(cat.sound());
        //cat.sound();



        System.out.println("...............................................");


        home.makeAllSounds();
        home.adoptPet(dog);
        home.makeAllSounds();

        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();

  }
}

