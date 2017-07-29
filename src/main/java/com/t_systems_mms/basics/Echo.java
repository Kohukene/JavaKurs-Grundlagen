package com.t_systems_mms.basics;

public abstract class Echo implements Greeting {
    
  private String recipient = "World";

  public abstract String getMessage();

  public String getRecipient() {
    return recipient;
  } 

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }
}
