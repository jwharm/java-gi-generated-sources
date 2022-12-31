package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link CharsetConverter} is an implementation of {@link Converter} based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.GObject implements org.gtk.gio.Converter, org.gtk.gio.Initable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCharsetConverter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CharsetConverter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CharsetConverter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CharsetConverter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CharsetConverter(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_charset_converter_new.invokeExact(
                    Marshal.stringToAddress.marshal(toCharset, null),
                    Marshal.stringToAddress.marshal(fromCharset, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link CharsetConverter}.
     * @param toCharset destination charset
     * @param fromCharset source charset
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public CharsetConverter(java.lang.String toCharset, java.lang.String fromCharset) throws GErrorException {
        super(constructNew(toCharset, fromCharset), Ownership.FULL);
    }
    
    /**
     * Gets the number of fallbacks that {@code converter} has applied so far.
     * @return the number of fallbacks that {@code converter} has applied
     */
    public int getNumFallbacks() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_charset_converter_get_num_fallbacks.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@link CharsetConverter}:use-fallback property.
     * @return {@code true} if fallbacks are used by {@code converter}
     */
    public boolean getUseFallback() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_charset_converter_get_use_fallback.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     * @param useFallback {@code true} to use fallbacks
     */
    public void setUseFallback(boolean useFallback) {
        try {
            DowncallHandles.g_charset_converter_set_use_fallback.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(useFallback, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_charset_converter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CharsetConverter.Builder} object constructs a {@link CharsetConverter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CharsetConverter.Builder#build()}. 
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
         * Finish building the {@link CharsetConverter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CharsetConverter}.
         * @return A new instance of {@code CharsetConverter} with the properties 
         *         that were set in the Builder object.
         */
        public CharsetConverter build() {
            return (CharsetConverter) org.gtk.gobject.GObject.newWithProperties(
                CharsetConverter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setFromCharset(java.lang.String fromCharset) {
            names.add("from-charset");
            values.add(org.gtk.gobject.Value.create(fromCharset));
            return this;
        }
        
        public Builder setToCharset(java.lang.String toCharset) {
            names.add("to-charset");
            values.add(org.gtk.gobject.Value.create(toCharset));
            return this;
        }
        
        public Builder setUseFallback(boolean useFallback) {
            names.add("use-fallback");
            values.add(org.gtk.gobject.Value.create(useFallback));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_charset_converter_new = Interop.downcallHandle(
            "g_charset_converter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_charset_converter_get_num_fallbacks = Interop.downcallHandle(
            "g_charset_converter_get_num_fallbacks",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_charset_converter_get_use_fallback = Interop.downcallHandle(
            "g_charset_converter_get_use_fallback",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_charset_converter_set_use_fallback = Interop.downcallHandle(
            "g_charset_converter_set_use_fallback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_charset_converter_get_type = Interop.downcallHandle(
            "g_charset_converter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
