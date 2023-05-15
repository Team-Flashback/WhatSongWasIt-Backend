package io.flashback.wswi.user.spi

import io.flashback.wswi.user.model.User
import java.util.UUID

interface QueryUserPort {
    fun existsUserById(id: UUID): Boolean

    fun existsUserByEmail(email: String): Boolean

    fun existsUserByNickname(nickname: String): Boolean

    fun queryUserById(id: UUID): User?

    fun queryUserByEmail(email: String): User?

    fun queryUserByNickname(nickname: String): User?
}