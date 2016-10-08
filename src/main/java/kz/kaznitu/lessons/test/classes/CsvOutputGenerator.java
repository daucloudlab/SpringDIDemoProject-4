package kz.kaznitu.lessons.test.classes;

import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.stereotype.Component;

//@Component("csvOutput")
public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        System.out.println("Csv Output Generator");
    }
}