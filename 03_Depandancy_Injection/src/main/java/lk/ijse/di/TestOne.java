package lk.ijse.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestOne implements DIInterface {

    DI di;

    // public void setter(DI di){
    //      this.di=di;
//   }
//    public void chatWithTestTwo(){
//        System.out.println("hee");
//        di.chat();
//    }
    @Autowired
    @Override
    public void inject(DI di) {
        this.di = di;
    }

    public void chatWithTestTwo() {
//
        di.chat();
//
    }
}