package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication.
 */
@SpringBootApplication
public class Application {
    /**
     *
     * @param args String[].
     * @throws Exception Exception.
     */
    public static void main(final String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
