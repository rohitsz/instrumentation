package net.acme.instrumentation.usage;

import static java.lang.System.out;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import net.acme.instrumentation.MyAgent;

/**
 * Inspired From :: http://marxsoftware.blogspot.in/2011/12/estimating-java-object-sizes-with.html
 *
 */
public class MyAgentUsage {

	   public enum Direction
	   {
	      N,
	      S,
	      E,
	      W
	   }

	   /**
	    * Print basic details including size of provided object to standard output.
	    * 
	    * @param object Object whose value and size are to be printed to standard
	    *   output.
	    */
	   public static void printInstrumentationSize(final Object object)
	   {
	      /*out.println(
	           "Object of type '" + object.getClass() + "' has size of "
	         + MyAgent.getObjectSize(object) + " bytes.");*/
	   }

	   /**
	    * Main executable function.
	    * 
	    * @param arguments Command-line arguments; none expected.
	    */
	   public static void main(final String[] arguments)
	   {
	      final StringBuilder sb = new StringBuilder(999);
	      final boolean falseBoolean = false;
	      final int zeroInt = 0;
	      final double zeroDouble = 0.0;
	      final Long zeroLong = 0L;
	      final long zeroLongP = 0L;
	      final Long maxLong = Long.MAX_VALUE;
	      final Long minLong = Long.MIN_VALUE;
	      final long maxLongP = Long.MAX_VALUE;
	      final long minLongP = Long.MIN_VALUE;
	      final String emptyString = "";
	      final String string = "TheQuickBrownFoxJumpedOverTheLazyDog";
	      final String[] strings = {emptyString, string, "IsNotIs"};
	      final String[] moreStrings = new String[999];
	      final List<String> someStrings = new ArrayList<String>();
	      final EmptyClass empty = new EmptyClass();
	      final BigDecimal bd = new BigDecimal("999999999999999999.99999999");
	      final Calendar calendar = Calendar.getInstance();

	      printInstrumentationSize(sb);
	      printInstrumentationSize(falseBoolean);
	      printInstrumentationSize(zeroInt);
	      printInstrumentationSize(zeroDouble);
	      printInstrumentationSize(zeroLong);
	      printInstrumentationSize(zeroLongP);
	      printInstrumentationSize(maxLong);
	      printInstrumentationSize(maxLongP);
	      printInstrumentationSize(minLong);
	      printInstrumentationSize(minLongP);
	      printInstrumentationSize(maxLong);
	      printInstrumentationSize(maxLongP);
	      printInstrumentationSize(emptyString);
	      printInstrumentationSize(string);
	      printInstrumentationSize(strings);
	      printInstrumentationSize(moreStrings);
	      printInstrumentationSize(someStrings);
	      printInstrumentationSize(empty);
	      printInstrumentationSize(bd);
	      printInstrumentationSize(calendar);
	      printInstrumentationSize(Direction.N);
	   }
	}

class EmptyClass {}
