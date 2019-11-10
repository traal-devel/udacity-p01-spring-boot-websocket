package ch.traal.demo.model;

public class UserResponse {

  
  /* member variables */
  private String content = null;
  
  
  /* constructors */
  public UserResponse() {
    super();
  }
  
  public UserResponse(String content) {
    this.content = content;
  }

  /* methods */
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
  
  
}
