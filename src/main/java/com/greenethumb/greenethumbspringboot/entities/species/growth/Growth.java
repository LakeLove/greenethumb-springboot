package com.greenethumb.greenethumbspringboot.entities.species.growth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Growth {
  private Double days_to_harvest;
  private String description;
  private String sowing;
  private Double ph_maximum;
  private Double ph_minimum;
  private Integer light;
  private Integer atmospheric_humidity;
  private List<String> growth_months;
  private List<String> bloom_months;
  private List<String> fruit_months;
  private RowSpacing row_spacing;
  private Spread spread;
  private MinPrecip minimum_precipitation;
  private MaxPrecip maximum_precipitation;
  private MinRootDepth minimum_root_depth;
  private MinTemp minimum_temperature;
  private MaxTemp maximum_temperature;
  private Integer soil_nutriments;
  private Integer soil_salinity;
  private Integer soil_texture;
  private Integer soil_humidity;
  
  public Growth() {}
  
  public Double getDays_to_harvest() {
    return days_to_harvest;
  }
  
  public void setDays_to_harvest(Double days_to_harvest) {
    this.days_to_harvest = days_to_harvest;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getSowing() {
    return sowing;
  }
  
  public void setSowing(String sowing) {
    this.sowing = sowing;
  }
  
  public Double getPh_maximum() {
    return ph_maximum;
  }
  
  public void setPh_maximum(Double ph_maximum) {
    this.ph_maximum = ph_maximum;
  }
  
  public Double getPh_minimum() {
    return ph_minimum;
  }
  
  public void setPh_minimum(Double ph_minimum) {
    this.ph_minimum = ph_minimum;
  }
  
  public Integer getLight() {
    return light;
  }
  
  public void setLight(Integer light) {
    this.light = light;
  }
  
  public Integer getAtmospheric_humidity() {
    return atmospheric_humidity;
  }
  
  public void setAtmospheric_humidity(Integer atmospheric_humidity) {
    this.atmospheric_humidity = atmospheric_humidity;
  }
  
  public List<String> getGrowth_months() {
    return growth_months;
  }
  
  public void setGrowth_months(List<String> growth_months) {
    this.growth_months = growth_months;
  }
  
  public List<String> getBloom_months() {
    return bloom_months;
  }
  
  public void setBloom_months(List<String> bloom_months) {
    this.bloom_months = bloom_months;
  }
  
  public List<String> getFruit_months() {
    return fruit_months;
  }
  
  public void setFruit_months(List<String> fruit_months) {
    this.fruit_months = fruit_months;
  }
  
  public RowSpacing getRow_spacing() {
    return row_spacing;
  }
  
  public void setRow_spacing(RowSpacing row_spacing) {
    this.row_spacing = row_spacing;
  }
  
  public Spread getSpread() {
    return spread;
  }
  
  public void setSpread(Spread spread) {
    this.spread = spread;
  }
  
  public MinPrecip getMinimum_precipitation() {
    return minimum_precipitation;
  }
  
  public void setMinimum_precipitation(MinPrecip minimum_precipitation) {
    this.minimum_precipitation = minimum_precipitation;
  }
  
  public MaxPrecip getMaximum_precipitation() {
    return maximum_precipitation;
  }
  
  public void setMaximum_precipitation(MaxPrecip maximum_precipitation) {
    this.maximum_precipitation = maximum_precipitation;
  }
  
  public MinRootDepth getMinimum_root_depth() {
    return minimum_root_depth;
  }
  
  public void setMinimum_root_depth(MinRootDepth minimum_root_depth) {
    this.minimum_root_depth = minimum_root_depth;
  }
  
  public MinTemp getMinimum_temperature() {
    return minimum_temperature;
  }
  
  public void setMinimum_temperature(MinTemp minimum_temperature) {
    this.minimum_temperature = minimum_temperature;
  }
  
  public MaxTemp getMaximum_temperature() {
    return maximum_temperature;
  }
  
  public void setMaximum_temperature(MaxTemp maximum_temperature) {
    this.maximum_temperature = maximum_temperature;
  }
  
  public Integer getSoil_nutriments() {
    return soil_nutriments;
  }
  
  public void setSoil_nutriments(Integer soil_nutriments) {
    this.soil_nutriments = soil_nutriments;
  }
  
  public Integer getSoil_salinity() {
    return soil_salinity;
  }
  
  public void setSoil_salinity(Integer soil_salinity) {
    this.soil_salinity = soil_salinity;
  }
  
  public Integer getSoil_texture() {
    return soil_texture;
  }
  
  public void setSoil_texture(Integer soil_texture) {
    this.soil_texture = soil_texture;
  }
  
  public Integer getSoil_humidity() {
    return soil_humidity;
  }
  
  public void setSoil_humidity(Integer soil_humidity) {
    this.soil_humidity = soil_humidity;
  }
}
