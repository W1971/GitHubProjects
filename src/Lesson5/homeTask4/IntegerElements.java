package Lesson5.homeTask4;

import java.util.stream.Stream;

public class IntegerElements {
  static Integer function(Integer array[][]) {
    Integer summ = 0;

    for (Integer[] anArray : array) {
      summ += Stream
              .of(anArray)
              .mapToInt(s -> s)
              .sum();
    }
    return summ;
  }
}
