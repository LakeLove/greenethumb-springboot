package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class RowSpacing {
  private Double cm;
  
  public RowSpacing() {}
  
  public Double getCm() {
    return cm;
  }
  
  public void setCm(Double cm) {
    this.cm = cm;
  }
}