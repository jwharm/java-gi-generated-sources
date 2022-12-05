package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Converter input stream implements {@link InputStream} and allows
 * conversion of data of various types during reading.
 * <p>
 * As of GLib 2.34, {@link ConverterInputStream} implements
 * {@link PollableInputStream}.
 */
public class ConverterInputStream extends org.gtk.gio.FilterInputStream implements org.gtk.gio.PollableInputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GConverterInputStream";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterInputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ConverterInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ConverterInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ConverterInputStream if its GType is a (or inherits from) "GConverterInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ConverterInputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GConverterInputStream", a ClassCastException will be thrown.
     */
    public static ConverterInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ConverterInputStream.getType())) {
            return new ConverterInputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GConverterInputStream");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.InputStream baseStream, @NotNull org.gtk.gio.Converter converter) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        java.util.Objects.requireNonNull(converter, "Parameter 'converter' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_converter_input_stream_new.invokeExact(
                    baseStream.handle(),
                    converter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new converter input stream for the {@code base_stream}.
     * @param baseStream a {@link InputStream}
     * @param converter a {@link Converter}
     */
    public ConverterInputStream(@NotNull org.gtk.gio.InputStream baseStream, @NotNull org.gtk.gio.Converter converter) {
        super(constructNew(baseStream, converter), Ownership.FULL);
    }
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     * @return the converter of the converter input stream
     */
    public @NotNull org.gtk.gio.Converter getConverter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_converter_input_stream_get_converter.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Converter.ConverterImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_converter_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.FilterInputStream.Build {
        
         /**
         * A {@link ConverterInputStream.Build} object constructs a {@link ConverterInputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ConverterInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ConverterInputStream} using {@link ConverterInputStream#castFrom}.
         * @return A new instance of {@code ConverterInputStream} with the properties 
         *         that were set in the Build object.
         */
        public ConverterInputStream construct() {
            return ConverterInputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ConverterInputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setConverter(org.gtk.gio.Converter converter) {
            names.add("converter");
            values.add(org.gtk.gobject.Value.create(converter));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_converter_input_stream_new = Interop.downcallHandle(
            "g_converter_input_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_converter_input_stream_get_converter = Interop.downcallHandle(
            "g_converter_input_stream_get_converter",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_converter_input_stream_get_type = Interop.downcallHandle(
            "g_converter_input_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
