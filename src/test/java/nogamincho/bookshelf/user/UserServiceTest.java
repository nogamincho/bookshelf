package nogamincho.bookshelf.user;

import static org.junit.jupiter.api.Assertions.*;

import nogamincho.bookshelf.test.TestBookShelfConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { TestBookShelfConfig.class })
@SpringBootTest
public class UserServiceTest {

	private static final Logger LOG = LoggerFactory.getLogger(UserServiceTest.class.getName());

	@MockBean
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@Test
	void findUser() {
		User user = new User(1L, "nogami_1", "nogami_1@example.com");
		when(userRepository.findById(any()))
				.thenReturn(Optional.of(user));

		assertEquals(1L, user.getId());
		assertEquals("nogami_1", user.getName());
		assertEquals("nogami_1@example.com", user.getEmail());

	}

	@Test
	void findUsers() {
	}

	@Test
	void save() {
	}

	@Test
	void delete() {
	}
}