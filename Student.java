class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // override toString()
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Sam");

        System.out.println(s); // automatically calls toString()
    }
}