package com.github.TaeGuNi.juso.model;

import com.google.api.client.util.Key;
import lombok.Data;

@Data
public class Juso {
  @Key("roadAddr")
  private String roadAddr;

  @Key("roadAddrPart1")
  private String roadAddrPart1;

  @Key("roadAddrPart2")
  private String roadAddrPart2;

  @Key("jibunAddr")
  private String jibunAddr;

  @Key("engAddr")
  private String engAddr;

  @Key("zipNo")
  private String zipNo;

  @Key("admCd")
  private String admCd;

  @Key("rnMgtSn")
  private String rnMgtSn;

  @Key("bdMgtSn")
  private String bdMgtSn;

  @Key("detBdNmList")
  private String detBdNmList;

  @Key("bdNm")
  private String bdNm;

  @Key("bdKdcd")
  private String bdKdcd;

  @Key("siNm")
  private String siNm;

  @Key("sggNm")
  private String sggNm;

  @Key("emdNm")
  private String emdNm;

  @Key("liNm")
  private String liNm;

  @Key("rn")
  private String rn;

  @Key("udrtYn")
  private String udrtYn;

  @Key("buldMnnm")
  private String buldMnnm;

  @Key("buldSlno")
  private String buldSlno;

  @Key("mtYn")
  private String mtYn;

  @Key("lnbrMnnm")
  private String lnbrMnnm;

  @Key("lnbrSlno")
  private String lnbrSlno;

  @Key("emdNo")
  private String emdNo;
}
