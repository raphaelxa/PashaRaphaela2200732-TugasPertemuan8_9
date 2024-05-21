/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overidingoverloading;

/**
 *
 * @author pasha
 */

import java.util.Date;

public class testPerson {
    public static void main(String[] args) {
        Person person = new Person("Stephen", "Canada", "8256-80098", "yoonstephen@example.com");
        Student student = new Student("Patrick", "Seoul", "6687-98754", "timothy@example.com", Student.mahasiswaBaru);
        Employee employee = new Employee("Haku Shota", "Japan", "8734-09257", "hakushotaa@example.com", "Pshunmin", 80000, new Date());
        Faculty faculty = new Faculty("Theo", "Seoul", "0104-23876", "theochoi@example.com", "fnc Ent", 5000, new Date(), "10am-6pm", "Professor");
        Staff staff = new Staff("Shoyo", "Miyagi", "8746-00923", "hitashoyo@example.com", "haikyu", 35000, new Date(), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}