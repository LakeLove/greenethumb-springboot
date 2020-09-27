package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Spread {
  private Double cm;
  
  public Spread() {}
  
  public Double getCm() {
    return cm;
  }
  
  public void setCm(Double cm) {
    this.cm = cm;
  }
}