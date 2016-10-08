package kz.kaznitu.lessons.test.helper;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class OutputHelper
{
    @Autowired
    @Qualifier(value = "jsonOutput")
    IOutputGenerator outputGenerator;

    public OutputHelper(){

    }
//    @Autowired
    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }
//    @Autowired
    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
    @PostConstruct
    public void start(){
        System.out.println("Бин құрылып жатыр...");
    }
    @PreDestroy
    public void end(){
        System.out.println("Бин жойылып жатыр...");
    }
}