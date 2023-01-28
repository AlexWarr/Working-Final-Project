package com.Alex.Forest.tables;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
@Entity
@Table(name="Plant")
public class Plant {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int Plant_ID;
  
  @Column(value= "Body_Trunk_Stem_Description")
  private String Body;
  @Column(value= "Branch_Leaf_Pattern_Description")
  private String Branch;
  @Column(value= "Flower_Fruit_Description")
  private String Flower_Fruit;
  @Column(value= "Plant_Notes")
  private String Plant_Notes;

  //Foreign Keys
  @Column(value= "Plant_Species_Plant_Latin_Name")
  private String Plant_Latin_Name;
  
  @Column(value= "Location_Location_Name")
  private String Location;
  
}
