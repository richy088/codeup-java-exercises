public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("Richard");

        System.out.println(person1.getName());
        person1.sayHello();
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
    }

    public Person(String user) {
        name = user;
    }
}
