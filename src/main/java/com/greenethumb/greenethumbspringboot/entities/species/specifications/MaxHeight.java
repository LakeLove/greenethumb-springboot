package com.greenethumb.greenethumbspringboot.entities.species.specifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class MaxHeight {
  private Double cm;
  
  public MaxHeight() {}
  
  public Double getCm() {
    return cm;
  }
  
  public void setCm(Double cm) {
    this.cm = cm;
  }
}