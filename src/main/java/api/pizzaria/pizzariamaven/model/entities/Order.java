package api.pizzaria.pizzariamaven.model.entities;

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
