package org.example.principletestingprototype;
import org.example.principletestingprototype.controller.HelloWorld;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@ExtendWith(MockitoExtension.class)
public class TestHelloWorld {
    @Test
    public void should_test_one_is_one(){
        assertThat(1, is(1));
    }

    @Test
    public void testHelloWorldPass() {
        HelloWorld helloWorld = new HelloWorld();

        String testInput = "Hello World";
        String actualResult = helloWorld.helloWorld();

        assertThat(actualResult, is(testInput));

    }

}
