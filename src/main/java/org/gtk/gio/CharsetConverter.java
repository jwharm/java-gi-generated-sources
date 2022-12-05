package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link CharsetConverter} is an implementation of {@link Converter} based on
 * GIConv.
 */
public class CharsetConverter extends org.gtk.gobject.Object implements org.gtk.gio.Converter, org.gtk.gio.Initable {
    
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
    @ApiStatus.Internal
    public CharsetConverter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CharsetConverter if its GType is a (or inherits from) "GCharsetConverter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CharsetConverter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GCharsetConverter", a ClassCastException will be thrown.
     */
    public static CharsetConverter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CharsetConverter.getType())) {
            return new CharsetConverter(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GCharsetConverter");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
        java.util.Objects.requireNonNull(toCharset, "Parameter 'toCharset' must not be null");
        java.util.Objects.requireNonNull(fromCharset, "Parameter 'fromCharset' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_charset_converter_new.invokeExact(
                    Interop.allocateNativeString(toCharset),
                    Interop.allocateNativeString(fromCharset),
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
    public CharsetConverter(@NotNull java.lang.String toCharset, @NotNull java.lang.String fromCharset) throws GErrorException {
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
        return RESULT != 0;
    }
    
    /**
     * Sets the {@link CharsetConverter}:use-fallback property.
     * @param useFallback {@code true} to use fallbacks
     */
    public void setUseFallback(boolean useFallback) {
        try {
            DowncallHandles.g_charset_converter_set_use_fallback.invokeExact(
                    handle(),
                    useFallback ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_charset_converter_get_type.invokeExact();
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
         * A {@link CharsetConverter.Build} object constructs a {@link CharsetConverter} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CharsetConverter} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CharsetConverter} using {@link CharsetConverter#castFrom}.
         * @return A new instance of {@code CharsetConverter} with the properties 
         *         that were set in the Build object.
         */
        public CharsetConverter construct() {
            return CharsetConverter.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CharsetConverter.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setFromCharset(java.lang.String fromCharset) {
            names.add("from-charset");
            values.add(org.gtk.gobject.Value.create(fromCharset));
            return this;
        }
        
        public Build setToCharset(java.lang.String toCharset) {
            names.add("to-charset");
            values.add(org.gtk.gobject.Value.create(toCharset));
            return this;
        }
        
        public Build setUseFallback(boolean useFallback) {
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
