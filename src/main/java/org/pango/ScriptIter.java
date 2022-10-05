package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoScriptIter} is used to iterate through a string
 * and identify ranges in different scripts.
 */
public class ScriptIter extends io.github.jwharm.javagi.ResourceBase {

    public ScriptIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle pango_script_iter_new = Interop.downcallHandle(
        "pango_script_iter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(java.lang.String text, int length) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_script_iter_new.invokeExact(Interop.allocateNativeString(text).handle(), length), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code PangoScriptIter}, used to break a string of
     * Unicode text into runs by Unicode script.
     * <p>
     * No copy is made of {@code text}, so the caller needs to make
     * sure it remains valid until the iterator is freed with
     * {@link ScriptIter#free}.
     */
    public ScriptIter(java.lang.String text, int length) {
        super(constructNew(text, length));
    }
    
    static final MethodHandle pango_script_iter_free = Interop.downcallHandle(
        "pango_script_iter_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@code PangoScriptIter}.
     */
    public void free() {
        try {
            pango_script_iter_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_script_iter_get_range = Interop.downcallHandle(
        "pango_script_iter_get_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets information about the range to which {@code iter} currently points.
     * <p>
     * The range is the set of locations p where <strong>start <= p < </strong>end.
     * (That is, it doesn't include the character stored at *end)
     * <p>
     * Note that while the type of the {@code script} argument is declared
     * as {@code PangoScript}, as of Pango 1.18, this function simply returns
     * {@code GUnicodeScript} values. Callers must be prepared to handle unknown
     * values.
     */
    public void getRange(java.lang.String[] start, java.lang.String[] end, Script script) {
        try {
            pango_script_iter_get_range.invokeExact(handle(), Interop.allocateNativeArray(start).handle(), Interop.allocateNativeArray(end).handle(), new PointerInteger(script.getValue()).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_script_iter_next = Interop.downcallHandle(
        "pango_script_iter_next",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Advances a {@code PangoScriptIter} to the next range.
     * <p>
     * If {@code iter} is already at the end, it is left unchanged
     * and {@code false} is returned.
     */
    public boolean next() {
        try {
            var RESULT = (int) pango_script_iter_next.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
