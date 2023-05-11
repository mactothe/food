package food.domain;

import food.AlertApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Alert_table")
@Data
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String status;

    public static AlertRepository repository() {
        AlertRepository alertRepository = AlertApplication.applicationContext.getBean(
            AlertRepository.class
        );
        return alertRepository;
    }

    public static void statusAlert(Paid paid) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(OrderAccepted orderAccepted) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(OrderRejected orderRejected) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(CookStarted cookStarted) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(CookEnded cookEnded) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookEnded.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(DeliveryStarted deliveryStarted) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }

    public static void statusAlert(DeliveryCompleted deliveryCompleted) {
        /** Example 1:  new item 
        Alert alert = new Alert();
        repository().save(alert);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(alert->{
            
            alert // do something
            repository().save(alert);


         });
        */

    }
}
