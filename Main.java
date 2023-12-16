//вариант 4

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> peopleInShop = new ArrayList<>();
        peopleInShop.add(new Employee("Иванов Иван", "Менеджер"));
        peopleInShop.add(new Customer("Петров Петр", 30));

        for (Person person : peopleInShop) {
            person.printDetails();
        }
    }
}
