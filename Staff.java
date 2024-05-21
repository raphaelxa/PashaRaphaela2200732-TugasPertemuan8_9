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

class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{super=" + super.toString() + ", title='" + title + "'}";
    }
}