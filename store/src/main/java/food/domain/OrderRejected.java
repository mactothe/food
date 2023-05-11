package food.domain;

import food.domain.*;
import food.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long menuId;
    private Integer qty;
    private String status;
    private String address;

    public OrderRejected(Store aggregate) {
        super(aggregate);
    }

    public OrderRejected() {
        super();
    }
}