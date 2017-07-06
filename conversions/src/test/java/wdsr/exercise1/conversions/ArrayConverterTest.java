package wdsr.exercise1.conversions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest {
  private ArrayConverter arrayConverter;

  @Before
  public void setup() {
    arrayConverter = new ArrayConverter();
  }

  @Test
  public void testConvertToInts_shouldReturnTheOnlyValue() {
    // given
    String[] values = {"234"};

    // when
    int[] convertedValues = arrayConverter.convertToInts(values);

    // then
    assertThat(234, is(convertedValues[0]));
  }

  @Test
  public void testConvertToInts_shouldReturnTableOfIntegers() {
    // given
    String[] values = {"234", "1", "0", "-988776655", "02321"};
    int[] expectedTab = {234, 1, 0, -988776655, 2321};

    // when
    int[] convertedValues = arrayConverter.convertToInts(values);

    // then
    assertThat(expectedTab, is(convertedValues));
  }

  @Test(expected = NullPointerException.class)
  public void testConvertToInts_shouldRaiseAnExceptionForNullArgument() {
    // given
    String[] values = null;

    // when
    arrayConverter.convertToInts(values);

    // then
    // empty
  }

  @Test(expected = NumberFormatException.class)
  public void testConvertToInts_shouldRaiseAnExceptionForNotNumberArgument() {
    // given
    String[] values = {"a", "cvfd"};

    // when
    arrayConverter.convertToInts(values);

    // then
    // empty
  }
}
