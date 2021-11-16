package com.hellu.basiccleanarch.di

import com.hellu.basiccleanarch.data.MessageDataSource
import com.hellu.basiccleanarch.data.MessageRepository
import com.hellu.basiccleanarch.domain.GetMessageUseCase

object Injection {
    fun provideUseCase(): GetMessageUseCase {
        val messageRepository = provideRepository()
        return GetMessageUseCase(messageRepository)
    }

    private fun provideRepository(): MessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): MessageDataSource {
        return MessageDataSource()
    }
}
