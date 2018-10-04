package week3;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runner.notification.*;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(9,Week3.max(2,9));
        assertEquals(1,Week3.max(-5,1));
        assertEquals(-3,Week3.max(-9,-3));
        assertEquals(3,Week3.max(3,3));
        assertEquals(50,Week3.max(22,50));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] arr = {0,2,4,10,10,50};
        assertEquals(0,Week3.minOfArray(arr));
        arr[1] = -10;
        assertEquals(-10,Week3.minOfArray(arr));
        arr[4] = -9;
        assertEquals(-10,Week3.minOfArray(arr));
        arr[4] = -17;
        assertEquals(-17,Week3.minOfArray(arr));
        arr[4] = -9;
        assertEquals(-17,Week3.minOfArray(arr));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMI(){
        assertEquals("Thiếu cân",Week3.calculateBMI(47,1.65));
        assertEquals("Thừa cân",Week3.calculateBMI(55,1.5));
        assertEquals("Bình thường",Week3.calculateBMI(50,1.5));
        assertEquals("Béo phì",Week3.calculateBMI(100,1.4));
        assertEquals("Béo phì",Week3.calculateBMI(90,1.3));

    }

}