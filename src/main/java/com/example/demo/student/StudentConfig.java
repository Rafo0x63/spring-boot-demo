package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student antonio = new Student(
                    "Antonio",
                    "antonio.rafajec@gmail.com",
                    LocalDate.of(1999, Month.SEPTEMBER, 17)
            );
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 3)
            );

            repository.saveAll(List.of(antonio, alex));

        };
    }
}
