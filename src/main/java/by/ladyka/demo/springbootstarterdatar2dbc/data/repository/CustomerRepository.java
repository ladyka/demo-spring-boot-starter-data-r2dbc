package by.ladyka.demo.springbootstarterdatar2dbc.data.repository;

import by.ladyka.demo.springbootstarterdatar2dbc.data.entity.CustomerEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends R2dbcRepository<CustomerEntity, String> {
}
