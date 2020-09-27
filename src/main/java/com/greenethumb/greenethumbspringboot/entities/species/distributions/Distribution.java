package com.greenethumb.greenethumbspringboot.entities.species.distributions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distribution {
  private List<String> introduced;
  @JsonProperty ("native")
  private List<String> Native;
  
  public Distribution() {}
  
  public List<String> getIntroduced() {
    return introduced;
  }
  
  public void setIntroduced(List<String> introduced) {
    this.introduced = introduced;
  }
  
  public List<String> getNative() {
    return Native;
  }
  
  public void setNative(List<String> aNative) {
    Native = aNative;
  }
}
