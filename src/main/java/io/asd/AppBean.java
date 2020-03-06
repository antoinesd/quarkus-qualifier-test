package io.asd;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import io.smallrye.health.HealthGroup;


@ApplicationScoped
public class AppBean {

    @Inject
    @Any
    Instance<SimpleBean> allSimpleBeans;


    public Instance<SimpleBean> getLocalGroup(String groupName) {
        return allSimpleBeans.select(LocalGroup.Literal.of(groupName));
    }


    public Instance<SimpleBean> getHealthGroup(String groupName) {
        return allSimpleBeans.select(HealthGroup.Literal.of(groupName));
    }
}
