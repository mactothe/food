package food.domain;

import food.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long menuId;
    private Integer qty;
    private String status;
    private String address;
}
