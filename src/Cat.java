public class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("Мяу");
    }

    public Cat(String name) {
        super(name);
    }
}
