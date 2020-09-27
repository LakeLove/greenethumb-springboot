package com.greenethumb.greenethumbspringboot.entities.species.distributions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties (ignoreUnknown = true)
public class Distributions {
  private NativeDist nativeDist;
  private IntroducedDist introducedDist;
  private DoubtfulDist  doubtfulDist;
  private AbsentDist  absentDist;
  private ExtinctDist extinctDist;
  
  public Distributions() {}
  
  public NativeDist getNativeDist() {
    return nativeDist;
  }
  
  public void setNativeDist(NativeDist nativeDist) {
    this.nativeDist = nativeDist;
  }
  
  public IntroducedDist getIntroducedDist() {
    return introducedDist;
  }
  
  public void setIntroducedDist(IntroducedDist introducedDist) {
    this.introducedDist = introducedDist;
  }
  
  public DoubtfulDist getDoubtfulDist() {
    return doubtfulDist;
  }
  
  public void setDoubtfulDist(DoubtfulDist doubtfulDist) {
    this.doubtfulDist = doubtfulDist;
  }
  
  public AbsentDist getAbsentDist() {
    return absentDist;
  }
  
  public void setAbsentDist(AbsentDist absentDist) {
    this.absentDist = absentDist;
  }
  
  public ExtinctDist getExtinctDist() {
    return extinctDist;
  }
  
  public void setExtinctDist(ExtinctDist extinctDist) {
    this.extinctDist = extinctDist;
  }
}
