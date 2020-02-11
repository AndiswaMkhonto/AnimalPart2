import org.junit.Assert;
import org.junit.Test;

public class AnimalTests {
    @Test
    public void TestDogSound() {
      Dog dog =new Dog();
        Assert.assertEquals(dog.sound(),"Barks");

    }

    @Test
    public void TestDogEats() {
        Dog dog =new Dog();
        Assert.assertEquals(dog.eat(),"Food");

    }

    @Test
    public void TestCatSound() {
        Cat cat = new Cat();
        Assert.assertEquals(cat.sound(),"Meows");

    }

    @Test
    public void TestCatEats() {
        Cat cat = new Cat();
        Assert.assertEquals(cat.eat(), "Food");

    }

    @Test
    public void TestGetName() {
        Cat cat = new Cat();
        cat.setName("Rax");
        Dog dog = new Dog();
        dog.setName("Stormy");
        Assert.assertEquals(cat.getName(),"Rax");
        Assert.assertEquals(dog.getName(),"Stormy");
    }
}
