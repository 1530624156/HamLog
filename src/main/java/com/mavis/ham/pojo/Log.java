package com.mavis.ham.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Log {

  private long id;
  private String toRadio;
  private String frequency;
  private String mode;
  private String myRst;
  private String toRst;
  private String myPower;
  private String toPower;
  private String qth;
  private String rig;
  private String ant;
  private String myRadio;
  private String time;

}
