package com.Alex.Forest.tables;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Entry {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int Entry_ID;
  
  @Column(value= "Notes")
  private String Notes;

  //Foreign Keys
  @Column(value= "Location_Location_Name")
  private String Location;
  @Column(value= "Plant_Plant_ID")
  private int Plant;
  @Column(value= "Plant_Plant_Species_Plant_Latin_Name")
  private String Latin_Name;
  @Column(value= "Moment_Date")
  private LocalDateTime Date;
}
