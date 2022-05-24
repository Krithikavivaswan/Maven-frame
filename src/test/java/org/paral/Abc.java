package org.paral;

import org.testng.annotations.Test;

public class Abc {
@Test
private void tc1() {
System.out.println("Test 1:"+ Thread.currentThread().getId());
}

@Test
private void tc2() {
System.out.println("Test 2:"+Thread.currentThread().getId());
}

@Test
private void tc3() {
System.out.println("Test 3:"+Thread.currentThread().getId());
}

}
