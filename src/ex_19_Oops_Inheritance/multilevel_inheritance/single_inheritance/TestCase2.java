package ex_19_Oops_Inheritance.multilevel_inheritance.single_inheritance;

public class TestCase2 extends CommonToAll {

    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
