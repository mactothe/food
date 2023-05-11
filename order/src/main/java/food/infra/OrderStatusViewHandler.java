package food.infra;

import food.config.kafka.KafkaProcessor;
import food.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusViewHandler {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1(
        @Payload OrderPlaced orderPlaced
    ) {
        try {
            if (!orderPlaced.validate()) return;

            // view 객체 생성
            OrderStatus orderStatus = new OrderStatus();
            // view 객체에 이벤트의 Value 를 set 함
            orderStatus.setUserId(orderPlaced.getUserId());
            orderStatus.setOrderId(orderPlaced.getId());
            orderStatus.setStatus(orderPlaced.getStatus());
            // view 레파지 토리에 save
            orderStatusRepository.save(orderStatus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderCanceled_then_UPDATE_1(
        @Payload OrderCanceled orderCanceled
    ) {
        try {
            if (!orderCanceled.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                orderCanceled.getId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus(orderCanceled.getStatus());
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderAccepted_then_UPDATE_2(
        @Payload OrderAccepted orderAccepted
    ) {
        try {
            if (!orderAccepted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                orderAccepted.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStoreId(orderAccepted.getId());
                orderStatus.setStatus(orderAccepted.getStatus());
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderRejected_then_UPDATE_3(
        @Payload OrderRejected orderRejected
    ) {
        try {
            if (!orderRejected.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                orderRejected.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus(orderRejected.getStatus());
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookStarted_then_UPDATE_4(
        @Payload CookStarted cookStarted
    ) {
        try {
            if (!cookStarted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                cookStarted.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus(cookStarted.getStatus());
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenCookEnded_then_UPDATE_5(@Payload CookEnded cookEnded) {
        try {
            if (!cookEnded.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                cookEnded.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus(cookEnded.getStatus());
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryStarted_then_UPDATE_6(
        @Payload DeliveryStarted deliveryStarted
    ) {
        try {
            if (!deliveryStarted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                deliveryStarted.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setRiderId(deliveryStarted.getRiderId());
                orderStatus.setStatus(
                    String.valueOf(deliveryStarted.getStatus())
                );
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenDeliveryCompleted_then_UPDATE_7(
        @Payload DeliveryCompleted deliveryCompleted
    ) {
        try {
            if (!deliveryCompleted.validate()) return;
            // view 객체 조회

            List<OrderStatus> orderStatusList = orderStatusRepository.findByOrderId(
                deliveryCompleted.getOrderId()
            );
            for (OrderStatus orderStatus : orderStatusList) {
                // view 객체에 이벤트의 eventDirectValue 를 set 함
                orderStatus.setStatus(
                    String.valueOf(deliveryCompleted.getStatus())
                );
                // view 레파지 토리에 save
                orderStatusRepository.save(orderStatus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
