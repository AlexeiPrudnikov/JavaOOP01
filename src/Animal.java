public class Animal {
    private String name;

    public void say() {
        System.out.println("Khhhhhh");
    }

    @Override
    public String toString() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
