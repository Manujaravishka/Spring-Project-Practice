package lk.ijse;

import lk.ijse.NewBean.NewTestBean;
import lk.ijse.bean.MyConnection;
import lk.ijse.bean.SpringBean;
import lk.ijse.bean.TestBean;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Appinitializer {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

//        SpringBean SpringBean1 = new SpringBean();
//        SpringBean SpringBean2 = new SpringBean();
//
//        System.out.println("POJO : "+SpringBean1);
//        System.out.println("POJO : "+SpringBean2);
//
//        SpringBean springBean3 = context.getBean(SpringBean.class);
//        SpringBean springBean4 = context.getBean(SpringBean.class);
//        System.out.println("Bean : "+springBean3);
//        System.out.println("Bean : "+springBean4);



        //BeanID
        SpringBean springBean =(SpringBean) context.getBean("springBean");//NOT CAPITAL THIS ID NAME
        System.out.println("Bean : " + springBean);
        TestBean testBean = (TestBean) context.getBean("ijseBean");
        System.out.println("Bean : "+testBean);

        testBean.printMessage();
        NewTestBean newTestBean =(NewTestBean) context.getBean("newTestBean");//NOT CAPITAL THIS ID NAME
        System.out.println("Bean : " + newTestBean);

//        MyConnection myConnection =(MyConnection) context.getBean("myConnection");//NOT CAPITAL THIS ID NAME
//        System.out.println("Bean : " + myConnection);
        MyConnection myConnection=(MyConnection) context.getBean("cc");//NOT CAPITAL THIS ID NAME
        System.out.println("Bean : " + myConnection);
       // api kemathi id ekak dila tiyanne been eke warahan athule

        context.registerShutdownHook();

    }
}