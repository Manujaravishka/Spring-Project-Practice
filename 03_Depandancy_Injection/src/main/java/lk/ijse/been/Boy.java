package lk.ijse.been;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {


    @Qualifier("girlTwo")
    @Autowired
    Agreement agreement;

    public Boy(){
        System.out.println("Boy object created");
    }
    public void chatWithGirl() {
        agreement.chat();
    }

}