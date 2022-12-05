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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), StringObject.getType())) {
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_string_object_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link StringObject.Build} object constructs a {@link StringObject} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link StringObject} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StringObject} using {@link StringObject#castFrom}.
         * @return A new instance of {@code StringObject} with the properties 
         *         that were set in the Build object.
         */
        public StringObject construct() {
            return StringObject.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    StringObject.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The string.
         * @param string The value for the {@code string} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setString(java.lang.String string) {
            names.add("string");
            values.add(org.gtk.gobject.Value.create(string));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_string_object_new = Interop.downcallHandle(
            "gtk_string_object_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_object_get_string = Interop.downcallHandle(
            "gtk_string_object_get_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_string_object_get_type = Interop.downcallHandle(
            "gtk_string_object_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
