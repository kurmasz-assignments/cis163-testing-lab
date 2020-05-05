import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Add tests to find the errors in the various BrokenDate classes.
 */
public class BrokenDateTest {

  /////////////////////////////////////////////////////////
  //
  // Broken 1a
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken1a
   */
  @Test
  public void compareToInBroken1a() {
    BrokenDate1a d1 = new BrokenDate1a(3, 4, 2005);
    BrokenDate1a d2 = new BrokenDate1a(3, 5, 2005);

    assertTrue(d1.compareTo(d2) < 0);
  }

  // TODO: Write tests against BrokenDate1a until one fails.
  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 1b
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken1b
   */
  @Test
  public void compareToInBroken1b() {
    BrokenDate1b d1 = new BrokenDate1b(1, 31, 2005);
    BrokenDate1b d2 = new BrokenDate1b(2, 1, 2005);

    assertTrue(d1.compareTo(d2) < 0);
  }

  // TODO: Write tests against BrokenDate1b until one fails.
  // Do not use the same test (or same type of bug) as 1a.

  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 1c
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken1c
   */
  @Test
  public void compareToInBroken1c() {
    BrokenDate1c d1 = new BrokenDate1c(3, 4, 2005);
    BrokenDate1c d2 = new BrokenDate1c(3, 5, 2005);

    assertTrue(d1.compareTo(d2) < 0);
  }

  // TODO: Write tests against BrokenDate1c until one fails.
  // Do not use the same test (or same type of bug) as 1a.

  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 1d
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken1d
   */
  @Test
  public void compareToInBroken1d() {
    BrokenDate1d d1 = new BrokenDate1d(3, 4, 2005);
    BrokenDate1d d2 = new BrokenDate1d(3, 5, 2005);

    assertTrue(d1.compareTo(d2) < 0);
  }
  // TODO: Write tests against BrokenDate1d until one fails.
  // Hint: This broken code incorrectly assumes that every year contains 365 days.

  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 2a
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken2a
   */
  @Test
  public void daysSinceInBroken2a() {
    BrokenDate2a d1 = new BrokenDate2a(3, 4, 2005);
    BrokenDate2a d2 = new BrokenDate2a(3, 5, 2005);

    assertEquals(1, d2.daysSince(d1));
  }
  // TODO: Write tests against daysSince in BrokenDate2a until one fails.

  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 2b
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken2b
   */
  @Test
  public void daysSinceInBroken2b() {
    BrokenDate2b d1 = new BrokenDate2b(12, 31, 2004);
    BrokenDate2b d2 = new BrokenDate2b(1, 1, 2005);

    assertEquals(1, d2.daysSince(d1));
  }
  // TODO: Write tests against daysSince in BrokenDate2b until one fails.

  // 

  /////////////////////////////////////////////////////////
  //
  // Broken 2c
  //
  /////////////////////////////////////////////////////////

  /**
   * Sample test for Broken2c
   */
  @Test
  public void daysSinceInBroken2c() {
    BrokenDate2c d1 = new BrokenDate2c(12, 31, 2004);
    BrokenDate2c d2 = new BrokenDate2c(1, 1, 2005);

    assertEquals(1, d2.daysSince(d1));
  }
  // TODO: Write tests against daysSince in BrokenDate2c until one fails.

  // 

}