package wdsr.exercise1.logic;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by Marek on 14.02.2016.
 */
public class Calculator {
  public int min(int... values) {
    return NumberUtils.min(values);
  }

  public int max(int... values) {
    if (values == null || values.length == 0) {
      throw new IllegalArgumentException("Null or empty argument: " + values);
    } ;
    int result = 0;
    if (values.length == 1)
      result = values[0];
    else
      for (int value : values) {
        if (value > result) {
          result = value;
        }
      }
    return result;
  }
}
