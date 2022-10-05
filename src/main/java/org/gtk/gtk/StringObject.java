package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkStringObject} is the type of items in a {@code GtkStringList}.
 * <p>
 * A {@code GtkStringObject} is a wrapper around a {@code const char*}; it has
 * a {@code Gtk.StringObject:string} property.
 */
public class StringObject extends org.gtk.gobject.Object {

    public StringObject(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StringObject */
    public static StringObject castFrom(org.gtk.gobject.Object gobject) {
        return new StringObject(gobject.refcounted());
    }
    
    static final MethodHandle gtk_string_object_new = Interop.downcallHandle(
        "gtk_string_object_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String string) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_string_object_new.invokeExact(Interop.allocateNativeString(string).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wraps a string in an object for use with {@code GListModel}.
     */
    public StringObject(java.lang.String string) {
        super(constructNew(string));
    }
    
    static final MethodHandle gtk_string_object_get_string = Interop.downcallHandle(
        "gtk_string_object_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the string contained in a {@code GtkStringObject}.
     */
    public java.lang.String getString() {
        try {
            var RESULT = (MemoryAddress) gtk_string_object_get_string.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
