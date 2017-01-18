package dsitest

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinIntegrationTest constructor () {

    @Autowired
    lateinit var userRepository : UserRepository;

    @Test
    fun persistenceTest() {
        val user : User = User(userName = "Mary")
        val savedUser = userRepository.save(user)

        // The following line fails with error message:
        // org.springframework.data.mapping.model.MappingException:
        // No property null found on entity class User to bind constructor parameter to
        val loadedUser = userRepository.findOne(savedUser.id)

        println("loadedUser = ${loadedUser}")
    }
}
