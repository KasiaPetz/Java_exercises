package carRental;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void test1() {
        Vehicle car = new Car(123,12, "red",10000.00,
                20.00, 10,10.00, new DiselEngine(), 5 );

        //when
        car.drive(1000.00);

        //then
        assertThat(1010.00).isEqualTo(car.getTotalKm());
    }

    @Test
    public void test2() {
        Vehicle car = new Car(123,12, "red",10000.00,
                20.00, 100,10.00, new DiselEngine(), 5 );

        //when
        car.refuel(100.00);

        //then
        assertThat(200.00).isEqualTo(car.getAmountOfFuelInLiters());
    }

    @Test
    public void test3() {
        Vehicle car = new Car(123,12, "red",10000.00,
                20.00, 100,10.00, new DiselEngine(), 5 );

        //when
        car.drive(300.00);

        //then
        assertThat(310.00).isEqualTo(car.getTotalKm());
        assertThat(40.00).isEqualTo(car.getAmountOfFuelInLiters());
    }

}