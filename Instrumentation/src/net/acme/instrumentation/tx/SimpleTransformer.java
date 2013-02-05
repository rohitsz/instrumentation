package net.acme.instrumentation.tx;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

public class SimpleTransformer implements ClassFileTransformer {

	@Override
	public byte[] transform(ClassLoader arg0, String arg1, Class<?> arg2,
			ProtectionDomain arg3, byte[] arg4)
			throws IllegalClassFormatException {
		System.out.println("FQCN... "+arg1);
		return null;
	}

}
