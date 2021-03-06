package com.spiderman.landlordcommunicationapp.service;

import com.spiderman.landlordcommunicationapp.models.Accommodation;
import com.spiderman.landlordcommunicationapp.models.Message;

import java.util.List;

public interface MessageService {

    List<Message> getMessagesByAccommodationIdAndIsDeletedFalse(int accommodationId);

    Message saveMessage(Message message);

    Message deleteMessage(Message message);

    List<Message> getAllMessages();

    void markAllMessagesOlderThan3MonthsAsDeleted();
}
