import java.util.ArrayList;

public class Person {

    private String fullName;

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    private ArrayList<Animal> animals = new ArrayList<>();

    public String getFullName() {
        return fullName;
    }

    private ArrayList<Person> parents = new ArrayList<>();

    public ArrayList<Person> getChildren() {
        return children;
    }

    private ArrayList<Person> children = new ArrayList<>();

    public Person(String fullName, Person mather, Person father) {
        this(fullName);
        this.parents.add(mather);
        this.parents.add(father);
    }

    private void addChild(Person child, Person otherParent) {
        ArrayList chilgdren = otherParent.getChildren();
        chilgdren.add(child);
    }

    public void addChild(String fullName, Person otherParent) {
        Person child = new Person(fullName, this, otherParent);
        children.add(child);
        addChild(child, otherParent);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
