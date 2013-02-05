package net.acme.instrumentation;


import java.lang.instrument.Instrumentation;

import net.acme.instrumentation.tx.SimpleTransformer;

public class MyTransformingAgent
{

   /**
    * Used when static linking of agent is required.
    */
   public static void premain(final String agentArgs, final Instrumentation inst)
   {
	   inst.addTransformer(new SimpleTransformer());
   }

}
