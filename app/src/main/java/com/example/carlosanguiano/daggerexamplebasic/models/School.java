package com.example.carlosanguiano.daggerexamplebasic.models;

import java.util.List;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */


public class School {
    List<Group> groups;

    public School(List<Group> groups) {
        this.groups = groups;
    }
}
