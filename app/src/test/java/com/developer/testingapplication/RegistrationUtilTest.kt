package com.developer.testingapplication


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "",
            password = "1234",
            confirmedPassword = "1234"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Prem",
            password = "1234",
            confirmedPassword = "1234"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `valid username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Siva",
            password = "1234",
            confirmedPassword = "1234"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Naveen",
            password = "",
            confirmedPassword = ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated incorrectly return false`() {

        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Naveen",
            password = "123456",
            confirmedPassword = "qwerty"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `less than 4 digit password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            userName = "Naveen",
            password = "123d",
            confirmedPassword = "123d"
        )

        assertThat(result).isFalse()
    }

}