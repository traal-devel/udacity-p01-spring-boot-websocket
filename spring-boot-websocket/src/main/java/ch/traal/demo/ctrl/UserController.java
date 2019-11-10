package ch.traal.demo.ctrl;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import ch.traal.demo.model.User;
import ch.traal.demo.model.UserResponse;


@Controller
public class UserController {

  /* methods */
  @MessageMapping("/user") // this message to user
  @SendTo("/topic/user")  // to this broker
  public UserResponse getUser(User user) {
    return new UserResponse("Hello, " + user.getName());
  }
}
