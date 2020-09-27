package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class MinPrecip {
  private Double mm;
  
  public MinPrecip() {}
  
  public Double getMm() {
    return mm;
  }
  
  public void setMm(Double mm) {
    this.mm = mm;
  }
}