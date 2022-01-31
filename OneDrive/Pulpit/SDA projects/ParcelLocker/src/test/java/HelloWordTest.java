import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloWordTest {

    @DisplayName("First test which is checking and operation")
    @Test
    void helloWorldTest() {

        //given
        int a = 5;
        int b = 10;

        //when
        int sum = a + b;

        //then
        Assertions.assertEquals(15, sum);
    }


    @Disabled
    @Test
    void disabledTest() {
        //given
        int a = 0;
        int b = 0;

        //when
        float divide = a/b;

        //then
        Assertions.assertEquals(100, divide);
    }
}
