package com.example.pruebaclase

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class UserTest {

    @Test
    fun testIsAdult() {
        val user = User("Mariana", 20)
        assertTrue(user.isAdult())
    }

    @Test
    fun testIsNotAdult() {
        val user = User("Mike", 10)
        assertFalse(user.isAdult())
    }

    @Test
    fun testIsTeenager() {
        val user = User("Emiliano", 15)
        assertTrue(user.isTeenager())
    }

    @Test
    fun testIsNotTeenager() {
        val user = User("Sofia", 30)
        assertFalse(user.isTeenager())
    }

    @Test
    fun testIsChild() {
        val user = User("Alejandro", 10)
        assertTrue(user.isChild())
    }

    @Test
    fun testIsNotChild() {
        val user = User("Jaime", 15)
        assertFalse(user.isChild())
    }
}