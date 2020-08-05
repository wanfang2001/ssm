import com.zking.model.Users;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;

public class UsersTest {

    public String userLogin(Users users, Model model) {
        //拿到shiro的主体对象
        Subject subject = SecurityUtils.getSubject();
        //将前端传递过来的用户账号和密码封装到令牌中准备验证
        UsernamePasswordToken token = new UsernamePasswordToken(
                users.gettUsersName(),
                users.gettUsersPassword()
        );
        subject.login(token);
        return "login";
    }
}
