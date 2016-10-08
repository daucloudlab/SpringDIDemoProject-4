package kz.kaznitu.lessons.test;


import kz.kaznitu.lessons.test.helper.OutputHelper;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml") ;

        OutputHelper output = (OutputHelper)ctx.getBean("outputHelper") ;

        output.generateOutput();
    }
}
