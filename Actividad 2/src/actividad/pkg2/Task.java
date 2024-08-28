/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad.pkg2;

/**
 *
 * @author Alexa
 */

import java.time.LocalDate;

public class Task {
    private String name;
    private LocalDate executionDate;

    public Task(String name, LocalDate executionDate) {
        this.name = name;
        this.executionDate = executionDate;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', executionDate=" + executionDate + '}';
    }
}
