
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.*;


public class junit_t extends TestCase {

	public Calculations Calculations;
  public frame1 frame1;

  /**
  */
  @Before

  public void testinit() {
  /**
  */


//	   frame1 = new frame1();

// frame1.rdbtnNewRadioButton.setSelected(true);

// frame1.textField.setText("0"); //горячая вода

// frame1.textField_1.setText("0"); //холодная вода

// frame1.textField_2.setText("0"); //газ

// frame1.textField_3.setText("0"); //электричество

// frame1.textField_4.setText("0"); //площадь кв.м.

 // frame1.textField_5.setText("0"); // тыс куб .м.

// frame1.textField_8.setText("0"); //итого





  }

  @Test


  public void test() {
  /**
  */
	  double Flat_Size =  1;
	  double Hot_Water = 1;
	  double Cold_Water = 1;
	  double Gas_Flat = 1;
	  double Electricity = 1;


  /**	  public final static double Tarif_Gas_House = 4994.02

  */
  double summary_expected = 210.36;
  /**
  */
  double summary_actual = Calculations.getPrice_Flat(Flat_Size, Hot_Water, Cold_Water, Gas_Flat, Electricity);

  assertEquals(summary_expected,summary_actual);
  }


  @After

  public void teststop(){
  /**
  */
frame1 = null;
  }
}