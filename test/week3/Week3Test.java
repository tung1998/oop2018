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
    }
    @Test
    public void testMax2(){
        assertEquals(1,Week3.max(-5,1));
    }
    @Test
    public void testMax3(){
        assertEquals(-3,Week3.max(-9,-3));
    }
    @Test
    public void testMax4(){
        assertEquals(3,Week3.max(3,3));
    }
    @Test
    public void testMax5(){
        assertEquals(50,Week3.max(22,50));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] arr = {120,256,100,103,104,50};
        assertEquals(50,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray2(){
        int[] arr = {130,200,100,10,10,50};
        assertEquals(10,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray3(){
        int[] arr = {10,2,100,10,10,50};
        assertEquals(2,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray4(){
        int[] arr = {0,2,100,10,10,50};
        assertEquals(0,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray5(){
        int[] arr = {0,2,100,-17,10,50};
        assertEquals(-17,Week3.minOfArray(arr));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMI(){
        assertEquals("Thiếu cân",Week3.calculateBMI(47,1.7));

    }
    @Test
    public void testCaculateBMI2(){
        assertEquals("Thừa cân",Week3.calculateBMI(55,1.5));

    }
    @Test
    public void testCaculateBMI3(){
        assertEquals("Bình thường",Week3.calculateBMI(50,1.5));

    }
    @Test
    public void testCaculateBMI4(){
        assertEquals("Béo phì",Week3.calculateBMI(150,1.6));

    }
    @Test
    public void testCaculateBMI5(){
        assertEquals("Béo phì",Week3.calculateBMI(160,1.7));

    }

}