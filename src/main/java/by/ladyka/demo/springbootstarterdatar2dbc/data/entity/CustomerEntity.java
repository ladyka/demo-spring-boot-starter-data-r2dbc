package by.ladyka.demo.springbootstarterdatar2dbc.data.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(value = "customer")
public class CustomerEntity {

    @Id
    private String guid;

}
