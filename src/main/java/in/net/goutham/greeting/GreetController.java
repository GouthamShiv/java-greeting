/**
 * goutham
 * 16-Jun-2021
 */
package in.net.goutham.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author goutham
 *
 */
@RestController
public class GreetController {
	@GetMapping("/")
	public String greet() {
		return "Hello World!";
	}
}
