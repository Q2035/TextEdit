package top.hellooooo.textedit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author Q
 * @Date 18/10/2020 20:57
 * @Description 入口类
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TextEditApplication {
    public static void main(String[] args) {
        SpringApplication.run(TextEditApplication.class, args);
    }
}
