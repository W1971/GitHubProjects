package Lesson5.homeTask4;

import java.util.stream.Stream;

public class LongElements {
  static Long function(Long array[][]) {
    Long summ = 0L;

    for (Long[] anArray : array) {
      summ += Stream
              .of(anArray)
              .mapToLong(s -> s)
              .sum();
    }
    return summ;
  }
}
