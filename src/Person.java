public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("Richard");

        System.out.println(person1.getName());
        person1.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");

        //output is true
//        System.out.println(person1.getName().equals(person2.getName()));

        //output is false
//        System.out.println(person1 == person2);

        //output is true but I can't explain why: because person 2 is equals another instance
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //output is as expected
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
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
