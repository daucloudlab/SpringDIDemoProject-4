package kz.kaznitu.lessons.test.helper;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OutputHelper
{
    @Autowired
    IOutputGenerator outputGenerator;
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

    public void start(){
        System.out.println("Бин құрылып жатыр...");
    }

    public void end(){
        System.out.println("Бин жойылып жатыр...");
    }
}