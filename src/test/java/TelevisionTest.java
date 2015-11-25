import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TelevisionTest {
  @Test
  public void isOffByDefault() {
    Television tv = new Television();
    assertEquals(false, tv.isOn());
  }

  @Test
  public void canBeTurnedOn() {
    Television tv = new Television();
    tv.turnOn();
    assertEquals(true, tv.isOn());
  }

  @Test
  public void changeSettings() {
    Television tv = new Television();
    tv.set("contrast", 34);
    assertEquals(34, tv.get("contrast"));

    tv.set("lang", "en");
    assertEquals("en", tv.get("lang"));

      tv.set("CC", true);
      assertEquals(true, tv.get("CC"));
  }

}