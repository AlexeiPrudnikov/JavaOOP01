import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person f1 = new Person("Иван");
        Person m1 = new Person("Мария");
        f1.addChild("Сергей", m1);
        f1.addAnimal(new Dog("Шарик"));
        f1.addAnimal(new Cat("Мурзик"));
        for (Animal a : f1.getAnimals()) {
            a.say();
        }
        Person f2 = new Person("Антон");
        Person m2 = new Person("Ольга");
        f2.addChild("Анна", m2);
        f1.getChildren().get(0).addChild("Петр", f2.getChildren().get(0));
        view(f1);

    }

    public static void view(Person person) {
        System.out.println(person.toString());
        for (Person p : person.getChildren()) {
            view(p);
        }
    }
}