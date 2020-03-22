package cn.sunfj.bookmarksweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class BookmarksWebApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(BookmarksWebApplication.class, args);
    }
    
}
