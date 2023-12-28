package tr.com.workintech.java.spring2;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!dev")
//@Primary // Karmasa durumunda tercih edilecek bean'in bu oldugunu soylemis oluyoruz
@Component
public class PostgresUserStore extends UserStore {
}
