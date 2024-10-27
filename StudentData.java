public class StudentData {
    public class Student {
        String name;
        int age;
        public Student() {
            System.out.println("This is a default constructor");
        }
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public void display() {
            System.out.println("The Student name is : " + this.name + ", age : " + this.age);
        }
    }
    public static void main(String[] args) {
        StudentData data = new StudentData();
        StudentData.Student s1 = data.new Student("SuperStar", 25);
        s1.display();
    }
}
