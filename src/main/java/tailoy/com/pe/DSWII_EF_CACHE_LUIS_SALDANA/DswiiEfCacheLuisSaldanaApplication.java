package tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DswiiEfCacheLuisSaldanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheLuisSaldanaApplication.class, args);
	}

}
