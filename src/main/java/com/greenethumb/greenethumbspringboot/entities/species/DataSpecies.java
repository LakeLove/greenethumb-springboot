package com.greenethumb.greenethumbspringboot.entities.species;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenethumb.greenethumbspringboot.entities.species.Species;
@JsonIgnoreProperties (ignoreUnknown = true)
public class DataSpecies {
  @JsonProperty ("data")
  private Species species;
  
  public DataSpecies() {}
  
  public Species getSpecies() {
    return species;
  }
  
  public void setSpecies(Species species) {
    this.species = species;
  }
}