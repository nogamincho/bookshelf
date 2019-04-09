package nogamincho.bookshelf.user;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;


@ExtendWith(SpringExtension.class)
public class UserServiceTest {

	private static final Logger LOG = LoggerFactory.getLogger(UserServiceTest.class.getName());

	@Mock
	UserRepository userRepository;

	@InjectMocks
	UserService userService = new UserService();

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