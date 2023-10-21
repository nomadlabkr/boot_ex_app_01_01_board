package kr.nomadlab.boot_ex_app_01_01_board;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BootExApp0101BoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootExApp0101BoardApplication.class, args);
    }

}
