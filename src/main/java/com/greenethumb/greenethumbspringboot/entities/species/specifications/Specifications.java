package com.greenethumb.greenethumbspringboot.entities.species.specifications;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Specifications {
  private String ligneous_type;
  private String growth_form;
  private String growth_habit;
  private String growth_rate;
  private AvgHeight average_height;
  private MaxHeight maximum_height;
  private String nitrogen_fixation;
  private String shape_and_orientation;
  private String toxicity;
  
  public Specifications() {}
  
  public String getLigneous_type() {
    return ligneous_type;
  }
  
  public void setLigneous_type(String ligneous_type) {
    this.ligneous_type = ligneous_type;
  }
  
  public String getGrowth_form() {
    return growth_form;
  }
  
  public void setGrowth_form(String growth_form) {
    this.growth_form = growth_form;
  }
  
  public String getGrowth_habit() {
    return growth_habit;
  }
  
  public void setGrowth_habit(String growth_habit) {
    this.growth_habit = growth_habit;
  }
  
  public String getGrowth_rate() {
    return growth_rate;
  }
  
  public void setGrowth_rate(String growth_rate) {
    this.growth_rate = growth_rate;
  }
  
  public AvgHeight getAverage_height() {
    return average_height;
  }
  
  public void setAverage_height(AvgHeight average_height) {
    this.average_height = average_height;
  }
  
  public MaxHeight getMaximum_height() {
    return maximum_height;
  }
  
  public void setMaximum_height(MaxHeight maximum_height) {
    this.maximum_height = maximum_height;
  }
  
  public String getNitrogen_fixation() {
    return nitrogen_fixation;
  }
  
  public void setNitrogen_fixation(String nitrogen_fixation) {
    this.nitrogen_fixation = nitrogen_fixation;
  }
  
  public String getShape_and_orientation() {
    return shape_and_orientation;
  }
  
  public void setShape_and_orientation(String shape_and_orientation) {
    this.shape_and_orientation = shape_and_orientation;
  }
  
  public String getToxicity() {
    return toxicity;
  }
  
  public void setToxicity(String toxicity) {
    this.toxicity = toxicity;
  }
}
