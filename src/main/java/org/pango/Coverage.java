package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoCoverage} structure is a map from Unicode characters
 * to {@code Pango.CoverageLevel} values.
 * <p>
 * It is often necessary in Pango to determine if a particular
 * font can represent a particular character, and also how well
 * it can represent that character. The {@code PangoCoverage} is a data
 * structure that is used to represent that information. It is an
 * opaque structure with no public fields.
 */
public class Coverage extends org.gtk.gobject.Object {

    public Coverage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Coverage */
    public static Coverage castFrom(org.gtk.gobject.Object gobject) {
        return new Coverage(gobject.refcounted());
    }
    
    static final MethodHandle pango_coverage_new = Interop.downcallHandle(
        "pango_coverage_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_coverage_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code PangoCoverage}
     */
    public Coverage() {
        super(constructNew());
    }
    
    static final MethodHandle pango_coverage_copy = Interop.downcallHandle(
        "pango_coverage_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copy an existing {@code PangoCoverage}.
     */
    public Coverage copy() {
        try {
            var RESULT = (MemoryAddress) pango_coverage_copy.invokeExact(handle());
            return new Coverage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_coverage_get = Interop.downcallHandle(
        "pango_coverage_get",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Determine whether a particular index is covered by {@code coverage}.
     */
    public CoverageLevel get(int index) {
        try {
            var RESULT = (int) pango_coverage_get.invokeExact(handle(), index);
            return new CoverageLevel(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_coverage_set = Interop.downcallHandle(
        "pango_coverage_set",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Modify a particular index within {@code coverage}
     */
    public void set(int index, CoverageLevel level) {
        try {
            pango_coverage_set.invokeExact(handle(), index, level.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
