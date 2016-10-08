package kz.kaznitu.lessons.test.helper;

import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class OutputHelper
{
    IOutputGenerator outputGenerator;

    public OutputHelper(){

    }

    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

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