package dsitest

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User @PersistenceConstructor constructor(
        @Id val id: String? = null,
        val userName: String? = null
) {

}
