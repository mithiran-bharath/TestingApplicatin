package com.developer.testingapplication

object RegistrationUtil {

    private val existingUsers = listOf("Bharath", "Siva")

    /**
     * the input is not valid if...
     * ... the userName / password is empty
     * ... the userName is already taken
     * ... the confirmed password is not same as the real password
     * ... the password contains less than 4 digits
     */
    fun validateRegistrationInput(
        userName: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if (userName.isEmpty() || password.isEmpty()) {
            return false
        }

        if (userName in existingUsers) {
            return false
        }

        if (password != confirmedPassword) {
            return false
        }

        if (password.count { it.isDigit() } < 4) {
            return false
        }

        return true
    }

}