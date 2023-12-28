package tr.com.workintech.java.spring2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class FileUserStore extends UserStore {
}

/**
 * Iki yontemle calistirirken profile belirliyoruz:
 *
 * 1. Ortam degiskeni ile
 * export spring_profiles_active=dev
 *
 * 2. JVM argumani / System property'si
 * -Dspring.profiles.active=dev
 * java .... -Dspring.profiles.active=dev ...
 */