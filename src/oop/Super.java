package oop;

public class Super {
    public static void main(){
    // super = Refers to the parent class (subclass <- superclass)
    //         Used in constructors and method overriding
    //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom","Riddle");
        StudentCls student = new StudentCls("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
}