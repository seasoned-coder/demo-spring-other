package kjpother.demo.lib;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    GreetingService greetingService = new GreetingService();

    @Test
    void greetNullReturnsWorld() {
        assertEquals("Hello World", greetingService.greet(null));
    }

    @Test
    void greetNameReturnsName() {
        assertEquals("Hello Alice", greetingService.greet("Alice"));
    }

}
