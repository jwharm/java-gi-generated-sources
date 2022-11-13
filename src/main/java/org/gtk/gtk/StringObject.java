package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkStringObject} is the type of items in a {@code GtkStringList}.
 * <p>
 * A {@code GtkStringObject} is a wrapper around a {@code const char*}; it has
 * a {@code Gtk.StringObject:string} property.
 */
public class StringObject extends org.gtk.gobject.Object {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStringObject";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StringObject proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StringObject(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to StringObject if its GType is a (or inherits from) "GtkStringObject".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StringObject} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStringObject", a ClassCastException will be thrown.
     */
    public static StringObject castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStringObject"))) {
            return new StringObject(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStringObject");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String string) {
        java.util.Objects.requireNonNull(string, "Parameter 'string' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_object_new.invokeExact(
                    Interop.allocateNativeString(string));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Wraps a string in an object for use with {@code GListModel}.
     * @param string The string to wrap
     */
    public StringObject(@NotNull java.lang.String string) {
        super(constructNew(string), Ownership.FULL);
    }
    
    /**
     * Returns the string contained in a {@code GtkStringObject}.
     * @return the string of {@code self}
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_object_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_object_new = Interop.downcallHandle(
            "gtk_string_object_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_object_get_string = Interop.downcallHandle(
            "gtk_string_object_get_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
