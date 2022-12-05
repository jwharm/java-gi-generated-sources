package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes that identify various errors that can occur while using
 * {@code GtkBuilder}.
 */
public enum BuilderError implements io.github.jwharm.javagi.Enumeration {
    /**
     * A type-func attribute didn’t name
     *  a function that returns a {@code GType}.
     */
    INVALID_TYPE_FUNCTION(0),
    /**
     * The input contained a tag that {@code GtkBuilder}
     *  can’t handle.
     */
    UNHANDLED_TAG(1),
    /**
     * An attribute that is required by
     *  {@code GtkBuilder} was missing.
     */
    MISSING_ATTRIBUTE(2),
    /**
     * {@code GtkBuilder} found an attribute that
     *  it doesn’t understand.
     */
    INVALID_ATTRIBUTE(3),
    /**
     * {@code GtkBuilder} found a tag that
     *  it doesn’t understand.
     */
    INVALID_TAG(4),
    /**
     * A required property value was
     *  missing.
     */
    MISSING_PROPERTY_VALUE(5),
    /**
     * {@code GtkBuilder} couldn’t parse
     *  some attribute value.
     */
    INVALID_VALUE(6),
    /**
     * The input file requires a newer version
     *  of GTK.
     */
    VERSION_MISMATCH(7),
    /**
     * An object id occurred twice.
     */
    DUPLICATE_ID(8),
    /**
     * A specified object type is of the same type or
     *  derived from the type of the composite class being extended with builder XML.
     */
    OBJECT_TYPE_REFUSED(9),
    /**
     * The wrong type was specified in a composite class’s template XML
     */
    TEMPLATE_MISMATCH(10),
    /**
     * The specified property is unknown for the object class.
     */
    INVALID_PROPERTY(11),
    /**
     * The specified signal is unknown for the object class.
     */
    INVALID_SIGNAL(12),
    /**
     * An object id is unknown.
     */
    INVALID_ID(13),
    /**
     * A function could not be found. This often happens
     *   when symbols are set to be kept private. Compiling code with -rdynamic or using the
     *   {@code gmodule-export-2.0} pkgconfig module can fix this problem.
     */
    INVALID_FUNCTION(14);
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderError";
    
    private final int value;
    BuilderError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BuilderError of(int value) {
        return switch (value) {
            case 0 -> INVALID_TYPE_FUNCTION;
            case 1 -> UNHANDLED_TAG;
            case 2 -> MISSING_ATTRIBUTE;
            case 3 -> INVALID_ATTRIBUTE;
            case 4 -> INVALID_TAG;
            case 5 -> MISSING_PROPERTY_VALUE;
            case 6 -> INVALID_VALUE;
            case 7 -> VERSION_MISMATCH;
            case 8 -> DUPLICATE_ID;
            case 9 -> OBJECT_TYPE_REFUSED;
            case 10 -> TEMPLATE_MISMATCH;
            case 11 -> INVALID_PROPERTY;
            case 12 -> INVALID_SIGNAL;
            case 13 -> INVALID_ID;
            case 14 -> INVALID_FUNCTION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
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
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
    }
}
