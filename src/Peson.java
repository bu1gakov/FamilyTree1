import java.time.LocalDate;
import java.util.ArrayList;

// Создаём поля класса Персона
class Person {
    String name;
    LocalDate dateofBirth;
    Person father;
    Person mother;
    ArrayList<Person> children;

        private Person(String name, LocalDate dateofBirth) {
            this.name = name;
            this.dateofBirth;
            this.children = new ArrayList<>();
        }

        public void addFather(Person father) {
            this.father = father;
            father.children.add(this);
        }

        public void addMother(Person mother) {
            this.mother = mother;
            mother.children.add(this);
        }

        public void addChild(Person child) {
            this.children.add(child);
            child.father = this;
            child.mother = this.mother;
        }

        public void printPerson() {
            System.out.println("Имя: " + name);
            System.out.println("День Рождения: " + dateofBirth);

            if (father != null) {
                System.out.println("Отец: " + father.name);
            }

            if (mother != null) {
                System.out.println("Мама: " + mother.name);
            }

            if(!children.isEmpty()) {
                System.out.println("Ребёнок:");
                for (Person child : children) {
                    System.out.println("- " + child.name);
                }
            }
        }
}
