package lesson9.animal;

public class Animal {
    private String name;
    private int age;
    private int rost;

    public Animal() {
    }

    public Animal(String name, int age, int rost) {
        this.name = name;
        this.age = age;
        this.rost = rost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        if (rost != animal.rost) return false;
        return name != null ? name.equals(animal.name) : animal.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 32 * result + age;
        result = 32 * result + rost;
        return result;
    }
}
