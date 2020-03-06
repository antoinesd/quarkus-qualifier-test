package io.asd;


import javax.enterprise.context.Dependent;

@LocalGroup("group1")
@Dependent
public class LocalGroup1Bean implements SimpleBean {

    @Override
    public String call() {
        return "I'm local bean in group1";
    }

}
