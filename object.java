package day6;

class Student {
    int age = 20;
    String name = "Rahul";
}

public class object {

    public static void main(String[] args) {

        Student s = new Student(); 

        System.out.println(s.age);
        System.out.println(s.name);
    }
}