package com.csn.messageservice.functions;

import com.csn.messageservice.dto.PostMessageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
@Slf4j
public class MessageFunctions {

    @Bean
    public Function<PostMessageDto,PostMessageDto> email(){
        return postMessageDto -> {
          log.info("Sending email with the details: " + postMessageDto.toString());
          // Email business logic will be implemented later.
          return postMessageDto;
        };
    }

    @Bean
    public Function<PostMessageDto,String> sms(){
        return postMessageDto -> {
          log.info("Sending message with the details: " + postMessageDto.toString());
          // Message business logic will be implemented later.
          return postMessageDto.title();
        };
    }

}
