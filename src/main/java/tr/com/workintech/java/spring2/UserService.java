package tr.com.workintech.java.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserService {

//    @Qualifier("postgresUserStore") // ozellikle birini secebiliriz
    @Autowired
    private UserStore userStore;
//
//    public UserService(UserStore userStore) {
//        this.userStore = userStore;
//    }
}
