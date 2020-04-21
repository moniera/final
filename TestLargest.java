import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class TestLargest {
    @Test
    public void test() {
        testPositive();
        testNegative();
    }

    public TestLargest() {

    }
    private Largest temp1;
    public void testPositive(){
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;


        temp1 = new Largest();
        int maxValue = temp1.largest(arr);


        assertTrue(maxValue == 11);
        assertTrue(maxValue > 0);
        assertTrue(arr[0] > 0);
        assertTrue(arr[1] > 0);
        assertTrue(arr[2] > 0);
        assertTrue(arr[3] > 0);

        assertFalse(maxValue == 10);
        assertFalse(maxValue == 9);
        assertFalse(maxValue == 7);

        assertSame(maxValue, arr[3]);

        assertNotSame(maxValue, arr[1]);
        assertNotSame(maxValue, arr[2]);
        assertNotSame(maxValue, arr[0]);

    }

    public void testNegative(){

        int[] arr = new int[5];
        arr[0] = -5;
        arr[1] = -6;
        arr[2] = -7;
        arr[3] = -3;
        arr[4] = -1;

        Largest temp1 = new Largest();
        int maxValue = temp1.largest(arr);

        assertTrue(maxValue == -1);
        assertTrue(maxValue < 0);


        assertFalse(maxValue == -7);
        assertFalse(maxValue == -5);
        assertFalse(maxValue == -3);

        assertSame(maxValue, arr[4]);

        assertNotSame(maxValue, arr[1]);
        assertNotSame(maxValue, arr[2]);
        assertNotSame(maxValue, arr[0]);



    }



}