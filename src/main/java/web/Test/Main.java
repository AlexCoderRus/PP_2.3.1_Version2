package web.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.JavaConfiguration;
import web.dao.UserDao;
import web.model.User;
import web.service.UserServices;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        UserServices ud = context.getBean(UserServices.class);
        ud.saveUser(new User("Ruslan","Abdula", 14,"email12", "password"));
        context.close();
    }
}
