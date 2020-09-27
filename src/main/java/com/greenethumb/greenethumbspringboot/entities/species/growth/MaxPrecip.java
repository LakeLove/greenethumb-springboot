package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class MaxPrecip {
  private Double mm;
  
  public MaxPrecip() {}
  
  public Double getMm() {
    return mm;
  }
  
  public void setMm(Double mm) {
    this.mm = mm;
  }
}