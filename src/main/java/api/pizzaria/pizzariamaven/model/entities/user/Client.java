package api.pizzaria.pizzariamaven.model.entities.user;

import api.pizzaria.pizzariamaven.model.entities.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Client extends User {
    private Long id;
    private List<Order> orders;
}
