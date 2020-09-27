package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Flower {
  private List<String> color;
  private Boolean conspicuous;
  
  public Flower() {}
  
  public List<String> getColor() {
    return color;
  }
  
  public void setColor(List<String> color) {
    this.color = color;
  }
  
  public Boolean getConspicuous() {
    return conspicuous;
  }
  
  public void setConspicuous(Boolean conspicuous) {
    this.conspicuous = conspicuous;
  }
}
