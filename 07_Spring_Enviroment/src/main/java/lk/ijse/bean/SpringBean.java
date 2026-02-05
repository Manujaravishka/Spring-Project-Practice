package lk.ijse.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    @Value("${db.name}")
    private  String db;
    private String dbUser;
    private String dbpassword;
    private String dbUrl;
}
