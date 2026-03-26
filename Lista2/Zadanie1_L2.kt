data class UserInput(val name: String?, val email: String?, val age: String?)

data class UserProfile(
    var name: String = "",
    var email: String = "",
    var age: Int = 0,
    var isAdult: Boolean = false
)

fun buildProfile(input: UserInput?, logs: MutableList<String>): UserProfile? {
    input ?: run {
        logs.add("Input is null")
        return null
    }

    val validName = input.name?.trim()?.also {
        if (it.length < 3) {
            logs.add("Name too short")
            return null
        }
    } ?: run {
        logs.add("Name is null")
        return null
    }

    val validEmail = input.email?.trim()?.lowercase()?.also {
        if (!it.contains("@")) {
            logs.add("Invalid email")
            return null
        }
    } ?: run {
        logs.add("Email is null")
        return null
    }

    val validAge = input.age?.let {
        it.toIntOrNull() ?: run {
            logs.add("Age is not a number")
            return null
        }
    } ?: run {
        logs.add("Age is null")
        return null
    }

    return UserProfile().apply {
        name = validName
        email = validEmail
        age = validAge
        isAdult = validAge >= 18
    }.also {
        logs.add("Profile created for ${it.email}")
    }
}

fun main() {
    val logs = mutableListOf<String>()

    val badInput = UserInput("Wi", null, "15")
    val goodInput = UserInput("Wiktoria", "wik@mail.com", "22")

    println("Zły profil: ${buildProfile(badInput, logs)}")
    println("Dobry profil: ${buildProfile(goodInput, logs)}")
    println("Logi: $logs")
}