package projet.java.fr;
import junit.framework.*;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class ClasseTest extends CLIClassique {
	public Configuration C1; 
	public Configuration C2; 
	
	@Before
	public void setUp() {
		C1 = new Configuration();
		C2 = new Configuration();
	}
	

	  @Test
	  public void ClasseTest() {

		  assertTrue((C1 = new Configuration()) instanceof Configuration);
	  }
}
