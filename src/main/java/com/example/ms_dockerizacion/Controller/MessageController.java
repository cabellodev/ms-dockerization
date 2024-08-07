package com.example.ms_dockerizacion.Controller;

import com.example.ms_dockerizacion.Dto.DtoMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class MessageController {

    @GetMapping(value="/message")
    public ResponseEntity<DtoMessage>get(){
         DtoMessage message = DtoMessage.builder().message("estamos en onda").autor("Sebastian Cabello").build();
                 return ResponseEntity.ok(message);
    }
}
