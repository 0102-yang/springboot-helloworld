package ltd.yangliuqing.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/** @author 16573 */
@SpringBootApplication
@RestController
@CrossOrigin("*")
public class SpringbootHelloworldApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);
    }

    public String helloWorld() {
        return "Hello World!";
    }
}
