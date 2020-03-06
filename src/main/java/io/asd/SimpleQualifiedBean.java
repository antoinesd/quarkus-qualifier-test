package io.asd;


import javax.enterprise.context.Dependent;

@HealthGroup("group1")
@Dependent
public class SimpleQualifiedBean implements SimpleBean {

    @Override
    public String call() {
        return "I'm in group1";
    }

}
