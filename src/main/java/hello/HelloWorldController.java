package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HelloWorldController.
 */
@Controller
public class HelloWorldController {
    /**
     *
     * @return String.
     */
    @RequestMapping("/hello")
    @ResponseBody
    public final String home() {
        return "Hello from HelloWorldController!";
    }

}
