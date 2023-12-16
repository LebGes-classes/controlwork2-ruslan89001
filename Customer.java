class Customer extends Person {
    int age;

    Customer(String fullName, int age) {
        super(fullName);
        this.age = age;
    }

    void printDetails() {
        System.out.println("Посетитель: " + fullName + ", Возраст: " + age);
    }
}