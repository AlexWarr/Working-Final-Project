package com.Alex.Forest.tables;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
public class Location {
  
  @Id
  private String Location_Name;
  
  @Column(value = "Geography")
  private String Geography;
  
  @Column(value = "Vegetative_Zone")
  private String Vegetative_Zone;
  
  @Column(value = "Growing_Zone")
  private String Growing_Zone;
  
  @Column(value = "Elevation")
  private String Elevation;
  
  @Column(value = "Location_Notes")
  private String Location_Notes;
}
