package io.asd;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;


@ApplicationScoped
public class AppBean {

    @Inject
    @Any
    Instance<SimpleBean> allSimpleBeans;


    public Instance<SimpleBean> getGroup(String groupName) {
        return allSimpleBeans.select(HealthGroup.Literal.of(groupName));
    }

}
