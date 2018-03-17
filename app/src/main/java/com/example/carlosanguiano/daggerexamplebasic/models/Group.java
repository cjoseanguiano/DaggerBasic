package com.example.carlosanguiano.daggerexamplebasic.models;

import java.util.List;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class Group {
    Teacher teacher;
    List<Student> student;

    public Group(Teacher teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
    }
}
