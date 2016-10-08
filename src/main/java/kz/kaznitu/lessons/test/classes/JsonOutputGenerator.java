package kz.kaznitu.lessons.test.classes;

import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("jsonOutput")
@Scope("prototype")
public class JsonOutputGenerator implements IOutputGenerator
{
    public void generateOutput(){
        System.out.println("Json Output Generator");
    }
}