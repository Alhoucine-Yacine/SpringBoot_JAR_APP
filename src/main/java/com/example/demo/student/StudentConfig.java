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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student yacine =new Student(
                            "Yacine",
                            "mitchell.yacine@gmail.com",
                            LocalDate.of(1996, Month.JANUARY, 27)

                    ) ;

            Student rain = new Student(
                    "rain",
                    "rain.yacine@gmail.com",
                    LocalDate.of(1996, Month.JANUARY, 27)
            ) ;

            repository.saveAll(List.of(yacine, rain));

         };
    }

}
