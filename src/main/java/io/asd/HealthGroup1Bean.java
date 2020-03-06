package io.asd;


import javax.enterprise.context.Dependent;

import io.smallrye.health.HealthGroup;

@HealthGroup("group1")
@Dependent
public class HealthGroup1Bean implements SimpleBean {

    @Override
    public String call() {
        return "I'm health bean in group1";
    }

}
