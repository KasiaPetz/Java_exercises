package food2door;

import org.junit.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

public class OrderProcessorTest {

    @Test
    public void shouldProdessOrder() {
        //given
        Producer producer = new HealthyShop();
        Order order = new Order(1, LocalDate.of(2019, 10, 25),
                "eggs", 10);

        OrderRequest orderRequest = new OrderRequest(producer, order);
        OrderProcessor orderProcessor = new OrderProcessor();

        //when
        boolean result = orderProcessor.prodessOrder(orderRequest);

        //then
        assertThat(result).isTrue();
    }
}