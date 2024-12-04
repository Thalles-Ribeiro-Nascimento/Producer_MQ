package br.com.senac.producer.controllers;

import br.com.senac.producer.models.Producer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class ProducerController {

    @Autowired
    private RabbitTemplate rbTemplate;

    @PostMapping("/mensagem")
    public void enviarMensagem(@RequestBody Producer producer){
        rbTemplate.convertAndSend("banco","fila-serasa", producer.getUserStatus());
        System.out.println("Mensagem enviada!");
    }


}
