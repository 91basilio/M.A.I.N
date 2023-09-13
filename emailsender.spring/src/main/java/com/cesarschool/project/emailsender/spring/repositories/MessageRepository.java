package com.cesarschool.project.emailsender.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesarschool.project.emailsender.spring.entities.Message;

public interface MessageRepository extends JpaRepository<Message, String>{

}
