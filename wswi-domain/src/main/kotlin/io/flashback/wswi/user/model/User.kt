package io.flashback.wswi.user.model

import java.util.UUID

data class User(
    val id: UUID,
    val name: String,
    val nickname: String,
    val email: String,
    val password: String // encrypted-password
)
