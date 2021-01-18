## Spring Bean的加载过程  
[返回首页](../index.md)  

### Spring Bean的注册方式：  
> 自动注册/手动注册  

1. 类上增加`@Compoment @Service @Controller`等注解，由Spring自动帮我们注册成Bean  
2. 配置文件（.xml中增加<bean></bean>）或者在配置类（`@Configuration`）方法，Spring也会自动帮我们注册成Bean  
3. 通过实现`ImportBeanDefinitionRegistar`接口，并且实现registerBeanDefinitions方法，手动注册Bean  

### Bean的创建过程

