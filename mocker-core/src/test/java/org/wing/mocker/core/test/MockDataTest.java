package org.wing.mocker.core.test;

import org.junit.Test;
import org.wing.mocker.core.MockData;

import java.util.Objects;

public class MockDataTest {
    MockData mockDate=new MockData();
    @Test
    public void test1(){
        Dog dog=mockDate.mock(Dog.class);
        System.out.printf(Objects.toString(dog));
    }
}


