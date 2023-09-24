package ua.mevhen.config.properties

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class SubscriptionServiceProperties {

    @Value('${subscription.worker.timeout}')
    private Integer timeout

    @Value('${subscription.worker.key-name}')
    private String keyName

    Integer getTimeout() {
        return timeout
    }

    String getKeyName() {
        return keyName
    }

}
