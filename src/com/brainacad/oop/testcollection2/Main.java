package com.brainacad.oop.testcollection2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>(Arrays.asList(new String[10]));
    for (int i = 0; i < 10; i++) {
      Random random = new Random();
      int rand = random.nextInt(10);
      while (list.get(rand)!=null) {
        rand = random.nextInt(10);
      }
      list.set(rand, "num_" + i);
    }
    for (String s : list) {
      System.out.println(s);
    }
  }
}
