package kjpother.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import kjpother.demo.lib.GreetingService;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

@RestController
public class HelloWorldController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/")
    public String home() {
        return greetingService.greet(null);
    }

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(name = "name", required = false) String name) {
        return greetingService.greet(name);
    }

    @GetMapping("/deps")
    public String deps() {
        // Demonstrate Guava and Commons Lang usage directly in the controller
        ImmutableList<String> items = ImmutableList.of("alpha", "beta", "gamma");
        return StringUtils.join(items, ',');
    }
}
