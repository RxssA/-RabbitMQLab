package ie.atu.week8.projectexercise;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "consumer.enabled", havingValue = "true")
public class ProductMessageConsumer {
    @RabbitListener(queues = "productQueue")
    public void processProductMessage(String message){
        System.out.println("Received message: " + message);
    }
}
