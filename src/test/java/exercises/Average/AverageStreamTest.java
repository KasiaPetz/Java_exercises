package exercises.Average;


import org.junit.jupiter.api.Test;

public class AverageStreamTest {

    @Test
    public void findAverage() {
        //given
        int[] array = new int[] {1, 2, 3, 4, 5, 6};
        Average avc = new AverageCouter();
        Average avS = new AverageStream();

        //when
        double result = avc.findAverage(array);
        double resultStream = avS.findAverage(array);

        //then

    }
}