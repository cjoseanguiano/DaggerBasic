package com.example.carlosanguiano.daggerexamplebasic.modules;

import com.example.carlosanguiano.daggerexamplebasic.models.Student;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */



@Module
public class StudentsModule {

    @Provides
    List<Student> providesMathStudents() {
        List<Student> mathStudents = new ArrayList<>();
        Student s1 = new Student("SName 1", "SLastname 1");
        Student s3 = new Student("SName 3", "SLastname 3");
        Student s5 = new Student("SName 5", "SLastname 5");
        mathStudents.add(s1);
        mathStudents.add(s3);
        mathStudents.add(s5);
        return mathStudents;
    }
}