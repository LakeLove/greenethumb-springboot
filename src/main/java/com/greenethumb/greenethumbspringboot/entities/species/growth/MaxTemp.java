package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class MaxTemp {
  private Double deg_f;
  private Double deg_c;
  
  public MaxTemp() {}
  
  public Double getDeg_f() {
    return deg_f;
  }
  
  public void setDeg_f(Double deg_f) {
    this.deg_f = deg_f;
  }
  
  public Double getDeg_c() {
    return deg_c;
  }
  
  public void setDeg_c(Double deg_c) {
    this.deg_c = deg_c;
  }
}
