package Lesson5.homeTask4;

import java.util.stream.Stream;

public class DoubleElements {
  static Double function(Double array[][]) {
    Double summ = 0.0;

    for (Double[] anArray : array) {
      summ += Stream
              .of(anArray)
              .mapToDouble(s -> s)
              .sum();
    }
    return summ;
  }

}
