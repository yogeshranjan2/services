package iot.services.bank;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class BeanCountBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory container) throws BeansException {
		int count = container.getBeanDefinitionCount();
		System.out.printf("Total number of beans deployed - %s%n", count);
		String[] names = container.getBeanDefinitionNames();
		System.out.println("Bean Names are given as below :");
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
