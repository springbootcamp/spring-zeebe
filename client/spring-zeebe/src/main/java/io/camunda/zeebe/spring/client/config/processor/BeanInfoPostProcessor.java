package io.camunda.zeebe.spring.client.config.processor;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.spring.client.bean.ClassInfo;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import org.springframework.beans.factory.BeanNameAware;

public abstract class BeanInfoPostProcessor
  implements BeanNameAware, Predicate<ClassInfo>, Function<ClassInfo, Consumer<ZeebeClient>> {

  private String beanName;

  public String getBeanName() {
    return beanName;
  }

  @Override
  public void setBeanName(String beanName) {
    this.beanName = beanName;
  }
}
