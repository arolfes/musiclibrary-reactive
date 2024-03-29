package com.github.arolfes.music.musiclibraryreactive.entities;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table("albums")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Album {

  @Id
  private Integer id;
  
  @Column
  private String name;

  @Column("release_date")
  private Date releaseDate;
  
  @Column("artist_id")
  private Integer artistId;

  @Transient
  private Artist artist;
}
