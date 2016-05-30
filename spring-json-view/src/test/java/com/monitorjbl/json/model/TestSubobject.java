package com.monitorjbl.json.model;

import java.util.List;

public class TestSubobject {
  private String val;
  private TestSubobject sub;
  private List<TestSubobject> subs;

  public TestSubobject(String val) {
    this.val = val;
  }

  public TestSubobject(String val, TestSubobject sub) {
    this.val = val;
    this.sub = sub;
  }

  public TestSubobject() {
  }

  public String getVal() {
    return val;
  }

  public void setVal(String val) {
    this.val = val;
  }

  public TestSubobject getSub() {
    return sub;
  }

  public void setSub(TestSubobject sub) {
    this.sub = sub;
  }

  public List<TestSubobject> getSubs() {
    return subs;
  }

  public void setSubs(List<TestSubobject> subs) {
    this.subs = subs;
  }
}