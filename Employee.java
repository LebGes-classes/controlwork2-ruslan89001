class Employee extends Person {
    String work;

    Employee(String fullName, String work) {
        super(fullName);
        this.work = work;
    }
    void printDetails() {
        System.out.println("Сотрудник: " + fullName + ", Должность: " + work);
    }
}