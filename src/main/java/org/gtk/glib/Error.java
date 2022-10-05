package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GError} structure contains information about
 * an error that has occurred.
 */
public class Error extends io.github.jwharm.javagi.ResourceBase {

    public Error(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_error_new_literal = Interop.downcallHandle(
        "g_error_new_literal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewLiteral(Quark domain, int code, java.lang.String message) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_error_new_literal.invokeExact(domain.getValue(), code, Interop.allocateNativeString(message).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Error}; unlike g_error_new(), {@code message} is
     * not a printf()-style format string. Use this function if
     * {@code message} contains text you don't have control over,
     * that could include printf() escape sequences.
     */
    public static Error newLiteral(Quark domain, int code, java.lang.String message) {
        return new Error(constructNewLiteral(domain, code, message));
    }
    
    static final MethodHandle g_error_new_valist = Interop.downcallHandle(
        "g_error_new_valist",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewValist(Quark domain, int code, java.lang.String format, VaList args) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_error_new_valist.invokeExact(domain.getValue(), code, Interop.allocateNativeString(format).handle(), args), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Error} with the given {@code domain} and {@code code},
     * and a message formatted with {@code format}.
     */
    public static Error newValist(Quark domain, int code, java.lang.String format, VaList args) {
        return new Error(constructNewValist(domain, code, format, args));
    }
    
    static final MethodHandle g_error_copy = Interop.downcallHandle(
        "g_error_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes a copy of {@code error}.
     */
    public Error copy() {
        try {
            var RESULT = (MemoryAddress) g_error_copy.invokeExact(handle());
            return new Error(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_error_free = Interop.downcallHandle(
        "g_error_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@link Error} and associated resources.
     */
    public void free() {
        try {
            g_error_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_error_matches = Interop.downcallHandle(
        "g_error_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns {@code true} if {@code error} matches {@code domain} and {@code code}, {@code false}
     * otherwise. In particular, when {@code error} is {@code null}, {@code false} will
     * be returned.
     * <p>
     * If {@code domain} contains a {@code FAILED} (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the {@code FAILED} code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     */
    public boolean matches(Quark domain, int code) {
        try {
            var RESULT = (int) g_error_matches.invokeExact(handle(), domain.getValue(), code);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}