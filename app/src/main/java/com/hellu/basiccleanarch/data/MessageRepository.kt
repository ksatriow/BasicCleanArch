package com.hellu.basiccleanarch.data

import com.hellu.basiccleanarch.domain.IMessageRepository

class MessageRepository(private val messageDataSource: MessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}