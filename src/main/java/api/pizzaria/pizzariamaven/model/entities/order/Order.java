package api.pizzaria.pizzariamaven.model.entities.order;

import api.pizzaria.pizzariamaven.model.entities.user.Address;
import api.pizzaria.pizzariamaven.model.entities.user.Attendant;
import api.pizzaria.pizzariamaven.model.entities.user.Client;
import api.pizzaria.pizzariamaven.model.entities.user.Deliveryman;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Client client;
    private List<OrderProduct> products;
    private Attendant attendant;
    private Deliveryman deliveryman;
    private Address address;
    private boolean delivered;
    private boolean discount;
    private double valueDelivery;
    private Double valueTotal;
    private int formPayment;
    private double change;
    private Date date;
    private Date hours;
    private int status;
}
