package com.mycompany.app;

public class Example {
  private String firstName;
  private String lastName;
  private int age;

  public Example(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public String showData() {
    return String.format("%s %s, %d", this.firstName, this.lastName, this.age);
  }
}
