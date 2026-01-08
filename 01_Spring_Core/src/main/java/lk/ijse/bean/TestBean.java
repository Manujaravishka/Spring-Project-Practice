package lk.ijse.bean;

import org.springframework.stereotype.Component;


@Component("ijseBean")// methana nama noda idiyoth testBean kiyala nomal wetenne eemath puluwan Appinitializer eka balanna(ijseBean)


public class TestBean {
    public TestBean() {
        System.out.println("TestBean is created");

    }
    public void printMessage(){
        System.out.println("PrintMessage method called");
    }
}
