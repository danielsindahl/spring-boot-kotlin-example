package dsitest

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, String> {

}
