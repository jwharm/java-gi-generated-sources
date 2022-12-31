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
public class StringObject extends org.gtk.gobject.GObject {
    
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
    protected StringObject(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StringObject> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StringObject(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String string) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_object_new.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Wraps a string in an object for use with {@code GListModel}.
     * @param string The string to wrap
     */
    public StringObject(java.lang.String string) {
        super(constructNew(string), Ownership.FULL);
    }
    
    /**
     * Returns the string contained in a {@code GtkStringObject}.
     * @return the string of {@code self}
     */
    public java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_string_object_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_string_object_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link StringObject.Builder} object constructs a {@link StringObject} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StringObject.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link StringObject} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StringObject}.
         * @return A new instance of {@code StringObject} with the properties 
         *         that were set in the Builder object.
         */
        public StringObject build() {
            return (StringObject) org.gtk.gobject.GObject.newWithProperties(
                StringObject.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The string.
         * @param string The value for the {@code string} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setString(java.lang.String string) {
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
