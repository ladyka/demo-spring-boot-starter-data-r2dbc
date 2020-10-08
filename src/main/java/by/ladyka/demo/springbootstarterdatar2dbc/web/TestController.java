package by.ladyka.demo.springbootstarterdatar2dbc.web;

import by.ladyka.demo.springbootstarterdatar2dbc.data.entity.CustomerEntity;
import by.ladyka.demo.springbootstarterdatar2dbc.data.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class TestController {

    final CustomerRepository customerRepository;

    @GetMapping
    public Flux<CustomerEntity> clients() {
        return customerRepository.findAll();
    }
}
