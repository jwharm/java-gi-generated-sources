package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes that identify various errors that can occur while using
 * {@code GtkBuilder}.
 */
public class BuilderError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * A type-func attribute didn’t name
     *  a function that returns a {@code GType}.
     */
    public static final BuilderError INVALID_TYPE_FUNCTION = new BuilderError(0);
    
    /**
     * The input contained a tag that {@code GtkBuilder}
     *  can’t handle.
     */
    public static final BuilderError UNHANDLED_TAG = new BuilderError(1);
    
    /**
     * An attribute that is required by
     *  {@code GtkBuilder} was missing.
     */
    public static final BuilderError MISSING_ATTRIBUTE = new BuilderError(2);
    
    /**
     * {@code GtkBuilder} found an attribute that
     *  it doesn’t understand.
     */
    public static final BuilderError INVALID_ATTRIBUTE = new BuilderError(3);
    
    /**
     * {@code GtkBuilder} found a tag that
     *  it doesn’t understand.
     */
    public static final BuilderError INVALID_TAG = new BuilderError(4);
    
    /**
     * A required property value was
     *  missing.
     */
    public static final BuilderError MISSING_PROPERTY_VALUE = new BuilderError(5);
    
    /**
     * {@code GtkBuilder} couldn’t parse
     *  some attribute value.
     */
    public static final BuilderError INVALID_VALUE = new BuilderError(6);
    
    /**
     * The input file requires a newer version
     *  of GTK.
     */
    public static final BuilderError VERSION_MISMATCH = new BuilderError(7);
    
    /**
     * An object id occurred twice.
     */
    public static final BuilderError DUPLICATE_ID = new BuilderError(8);
    
    /**
     * A specified object type is of the same type or
     *  derived from the type of the composite class being extended with builder XML.
     */
    public static final BuilderError OBJECT_TYPE_REFUSED = new BuilderError(9);
    
    /**
     * The wrong type was specified in a composite class’s template XML
     */
    public static final BuilderError TEMPLATE_MISMATCH = new BuilderError(10);
    
    /**
     * The specified property is unknown for the object class.
     */
    public static final BuilderError INVALID_PROPERTY = new BuilderError(11);
    
    /**
     * The specified signal is unknown for the object class.
     */
    public static final BuilderError INVALID_SIGNAL = new BuilderError(12);
    
    /**
     * An object id is unknown.
     */
    public static final BuilderError INVALID_ID = new BuilderError(13);
    
    /**
     * A function could not be found. This often happens
     *   when symbols are set to be kept private. Compiling code with -rdynamic or using the
     *   {@code gmodule-export-2.0} pkgconfig module can fix this problem.
     */
    public static final BuilderError INVALID_FUNCTION = new BuilderError(14);
    
    public BuilderError(int value) {
        super(value);
    }
    
    public static @NotNull org.gtk.glib.Quark quark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_builder_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_builder_error_quark = Interop.downcallHandle(
            "gtk_builder_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
