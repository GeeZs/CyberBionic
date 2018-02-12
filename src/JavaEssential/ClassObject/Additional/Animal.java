package JavaEssential.ClassObject.Additional;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    @Override
    public boolean equals(Object obj) {
        boolean res;
        if (obj != null && obj.getClass() == this.getClass()){
            Animal animal = new Animal();
            res = animal.name.equals(this.name);
            res = animal.age == this.age;
            res = animal.tail == this.tail;
            return res;
        }
        return false;
    }

    public Animal() {
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + age;
        result = PRIME * result + (tail ? 1 : 0);
        result = PRIME * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tail=" + (tail ? "Есть!" : "Нету!") +
                '}';
    }

    public Animal(String name, int age, boolean tail) {
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

}
class Main{
    public static void main(String[] args) {
        Animal someAnimal = new Animal("Васька", 45, true);
        System.out.println(someAnimal.toString());
    }
}
