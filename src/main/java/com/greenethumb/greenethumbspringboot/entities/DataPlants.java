package com.greenethumb.greenethumbspringboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataPlants {
  @JsonProperty ("data")
  private List<Plant> plants;
  
  public DataPlants() {}
  
  public List<Plant> getPlants() {
    return plants;
  }
  
  public void setPlants(List<Plant> plants) {
    this.plants = plants;
  }
  
  @Override
  public String toString() {
    StringBuilder plantsList = new StringBuilder();
    if (getPlants()!=null) {
      getPlants().forEach(p -> {
        if (p!=null) plantsList.append(p.toString()+"\n");
      });
    }
    return "Data { " + plantsList.toString() + " }";
  }
}
