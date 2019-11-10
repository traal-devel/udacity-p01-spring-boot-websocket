package ch.traal.demo.cfg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import ch.traal.demo.model.UserResponse;

@EnableScheduling
@Configuration
public class SchedulerConfig {

  
  /* member variables */
  @Autowired
  SimpMessagingTemplate template;
  
  
  /* constructors */
  
  
  /* methods */
  @Scheduled(fixedDelay = 5000)
  public void sendAdhocMessages() {
    template.convertAndSend("/topic/user", 
              new UserResponse("Scheduler"));
  }
  
}
