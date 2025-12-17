import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверяем, ссылается ли obj на тот же объект (рефлексивность)
        if (this == obj) {
            return true;
        }

        // Проверяем, является ли obj экземпляром класса Person
        if (!(obj instanceof Person)) {
            return false;
        }

        // Приводим obj к типу Person
        Person other = (Person) obj;

        // Сравниваем поля name и age
        return Objects.equals(name, other.name) && age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}