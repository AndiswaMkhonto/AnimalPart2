public class Animal {
    private String name;
    public Animal() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  String sound(){
        System.out.println("Barks");
        System.out.println("Meows");
        return null;
    }
    public  String  eat(){
        return "Food";
    }
}
