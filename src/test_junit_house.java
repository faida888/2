

import junit.framework.TestCase;

/**
* ����������� ��� ������ �� ������ ��� �������� �������� ������,
* �������� ����������� �������
*/

import static org.junit.Assert.*;

/**
 * ����������� ��� ������ �� ������ ���������� ��� ������������
 */

import org.junit.*;

/**
* ������� ����� ��� ������������ �������
* ������������ �����
*/

public class test_junit_house extends TestCase {

	public Calculations Calculations;

	/**
	* �������������� ��������� ������ ��� ������������
	*/

  /**
  * ���������, ����������� �� �����, ������� ����� ����������� ����� ������
  * �������� �����
  */

  @Before

  /**
  * ������� �����, ������� ����� ����������� ����� ������ �������� �����;
  * � ��� ������������� ������� ��������� ��� ������������.
  */
   public void testinit() {
  /**
  */
  }
/**
  * ���������, ����������� �� ��, ��� �� ��� ������� ����������� �����.
  */

  @Test

  /**
  * ��������� �����, ������� ����� �����������, � ������
  * ������ ��������� ������������ �����.
  */

  public void test() {
  /**
   * * ����������� ������� ������ ��������
  */
	  double Cold_Water = 1;
	  double Electricity = 1;
	  double Gas_House =1;


	  /**
	  * ����������� ���������� �������� 5018.97
	  * (������/��������� ��������� ������� ������������ ����� = 5018.97 ���.)
	  */

  double summary_expected = 5018.97;
  /**
* ����������� ���������� �������
* ������� ������������ ��������� � ���� ����������� �����
*/

  double summary_actual = Calculations.getPrice_House(Cold_Water, Gas_House, Electricity);

  /**
  * ���������� �������� ������� (����������) ����������
  * � ������� ������������� ����������;
  * ���� ���������� �����, ���� �������� �������.
  */



  assertEquals(summary_expected,summary_actual);
  }

  /**
   * ���������, ����������� �� �����, ������� ����� ����������� ����� �������
   * ����������� �����.
   */

  @After
  /**
  * ������� �����, ������� ����� ����������� ����� ������� ����������� �����
  */

  public void teststop(){
  /**
  */

	  /**
	  * �������� ���������� ����� ���������� �����
	  */

Calculations = null;
  }
}