package com.greenethumb.greenethumbspringboot.entities.species.specifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class AvgHeight {
  private Double cm;
  
  public AvgHeight() {}
  
  public Double getCm() {
    return cm;
  }
  
  public void setCm(Double cm) {
    this.cm = cm;
  }
}