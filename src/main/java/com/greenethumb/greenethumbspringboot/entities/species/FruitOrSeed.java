package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class FruitOrSeed {
  private Boolean conspicuous;
  private List<String> color;
  private String shape;
  private Boolean seed_persistence;
  
  public FruitOrSeed() {}
  
  public Boolean getConspicuous() {
    return conspicuous;
  }
  
  public void setConspicuous(Boolean conspicuous) {
    this.conspicuous = conspicuous;
  }
  
  public List<String> getColor() {
    return color;
  }
  
  public void setColor(List<String> color) {
    this.color = color;
  }
  
  public String getShape() {
    return shape;
  }
  
  public void setShape(String shape) {
    this.shape = shape;
  }
  
  public Boolean getSeed_persistence() {
    return seed_persistence;
  }
  
  public void setSeed_persistence(Boolean seed_persistence) {
    this.seed_persistence = seed_persistence;
  }
}
