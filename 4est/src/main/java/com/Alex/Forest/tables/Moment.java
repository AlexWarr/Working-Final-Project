package com.Alex.Forest.tables;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
public class Moment {
  
  @Id
  private LocalDateTime Date;
  
  @Column(value= "Season")
  private String Season;

  @Column(value= "Plant_Growth_Phase")
  private String Growth_Phase;
  @Column(value= "Weather")
  private String Weather;
}
