import org.junit.*;//imports junit object
import java.io.*;
import static org.junit.Assert.*;//imports Assert object

import java.util.*;

public class JHangmanTest {

	private static final String EOL = System.getProperty("line.separator");
	private ByteArrayOutputStream bytes;
	private PrintStream console;
	private JHangman jHangman;
// before the running the test
	@Before
	public void setUp() {
		bytes = new ByteArrayOutputStream();
		console = System.out;
		System.setOut(new PrintStream(bytes));
		jHangman = new JHangman();
	}

	@After
	public void tearDown() {
		System.setOut(console);
	}
