package com.camargo.orghub.bills;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@ExtendWith(MockitoExtension.class)
public class ExampleUnitTest {

    @Mock DependencyUnderTest dependencyUnderTest;
    @InjectMocks ClassUnderTest classUnderTest;

    @Test
    public void setupCorrect() {
        given(dependencyUnderTest.doubleAmount(10)).willReturn(20);
        var result = classUnderTest.stringify(10);
        assertEquals("20", result);
    }
}