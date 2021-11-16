package com.hellu.basiccleanarch.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}