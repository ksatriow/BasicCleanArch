package com.hellu.basiccleanarch.data

import com.hellu.basiccleanarch.domain.MessageEntity

class MessageDataSource {
    fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Join to Clean Architecture Club")
}