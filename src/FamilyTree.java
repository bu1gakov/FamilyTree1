public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Иван", "01/01/2001");
        Person person2 = new Person("Марья", "02/02/2002");
        Person person3 = new Person("Илья", "03/03/2003");
        Person person4 = new Person("Юлия", "04/04/2004");
        Person person5 = new Person("Людмила", "05/05/2005");

        person1.addFather(person2);
        person1.addMother(person3);
        person1.addChild(person4);
        person1.addChild(person5);

        person1.printPerson();
    }
}
