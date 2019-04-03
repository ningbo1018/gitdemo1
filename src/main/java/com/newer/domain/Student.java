package com.newer.domain;

import java.io.Serializable;

/**
 * @Author：ningbo
 * @Date:2019/4/2
 * @Description:com.newer.domain
 * @Version:1.0
 */
public class Student implements Serializable {
  private Integer stuid;
  private String stuname;
  private String stusex;

  public Integer getStuid() {
    return stuid;
  }

  public void setStuid(Integer stuid) {
    this.stuid = stuid;
  }

  public String getStuname() {
    return stuname;
  }

  public void setStuname(String stuname) {
    this.stuname = stuname;
  }
}
