package seminar_3;
/*
* ООП Концепции:
Создайте класс Person, который имеет атрибуты name, age и метод introduce(), выводящий информацию
* о человеке. Создайте несколько объектов этого класса и вызовите метод introduce() для каждого из них.
* */
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.printf("Person's name is %s, age is %d\n", name, age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Bob", 16);
        Person p2 = new Person("Ann", 20);
        Person p3 = new Person("Ted", 44);
        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}
