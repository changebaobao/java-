import dao.Userdao;
import domin.User;
import org.junit.jupiter.api.Test;

public class UserDaoTest {
    @Test
    public void testlogin(){
        User loginuser =new User();
        loginuser.setUsername("zhang");
        loginuser.setPassword("123");

        Userdao dao=new Userdao();
        User user = dao.login(loginuser);

        System.out.println(user);
    }
}
