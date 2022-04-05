package quarkussonsumer;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

/**
 * A bean consuming data from the "prices" Kafka topic and applying some conversion.
 * The result is pushed to the "my-data-stream" stream which is an in-memory stream.
 */
@ApplicationScoped
public class PriceConverter {
    static final double CONVERSION_RATE = 0.88;

    // Consume from the `prices` channel and produce to the `my-data-stream` channel
    @Incoming("prices")
    public void process(int priceInUsd) {
    	
        System.out.println("message from topic::: " + priceInUsd );
    }

}