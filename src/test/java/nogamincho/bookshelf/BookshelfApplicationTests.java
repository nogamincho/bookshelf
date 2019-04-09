package nogamincho.bookshelf;


import nogamincho.bookshelf.test.TestBookShelfConfig;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.fail;

@Configuration
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { TestBookShelfConfig.class })
@SpringBootTest
public class BookshelfApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(BookshelfApplicationTests.class.getName());
}
