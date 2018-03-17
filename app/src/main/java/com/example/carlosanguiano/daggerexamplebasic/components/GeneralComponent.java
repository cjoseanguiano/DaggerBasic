package com.example.carlosanguiano.daggerexamplebasic.components;

import com.example.carlosanguiano.daggerexamplebasic.MainActivity;
import com.example.carlosanguiano.daggerexamplebasic.modules.MathGroupModule;

import dagger.Component;

/**
 * Created by Carlos Anguiano on 17/03/18.
 * For more info contact: c.joseanguiano@gmail.com
 */

@Component(modules = {MathGroupModule.class})
public interface GeneralComponent {
    void inject(MainActivity mainActivity);
}
