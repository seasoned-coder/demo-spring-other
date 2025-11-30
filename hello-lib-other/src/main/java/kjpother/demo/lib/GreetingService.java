package kjpother.demo.lib;

import org.springframework.stereotype.Service;
import com.google.common.collect.ImmutableList;
import org.apache.commons.lang3.StringUtils;

@Service
public class GreetingService {
    public String greet(String name) {
        String safe = StringUtils.defaultIfBlank(name, "World");
        // build a simple greeting using Guava's ImmutableList
        return StringUtils.join(ImmutableList.of("Hello", safe), ' ');
    }
}
