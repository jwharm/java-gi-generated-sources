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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.FilterInputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ConverterInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ConverterInputStream(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConverterInputStream> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ConverterInputStream(input);
    
    private static MemoryAddress constructNew(org.gtk.gio.InputStream baseStream, org.gtk.gio.Converter converter) {
        MemoryAddress RESULT;
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
    public ConverterInputStream(org.gtk.gio.InputStream baseStream, org.gtk.gio.Converter converter) {
        super(constructNew(baseStream, converter));
        this.takeOwnership();
    }
    
    /**
     * Gets the {@link Converter} that is used by {@code converter_stream}.
     * @return the converter of the converter input stream
     */
    public org.gtk.gio.Converter getConverter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_converter_input_stream_get_converter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Converter) Interop.register(RESULT, org.gtk.gio.Converter.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_converter_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ConverterInputStream.Builder} object constructs a {@link ConverterInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ConverterInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.FilterInputStream.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ConverterInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ConverterInputStream}.
         * @return A new instance of {@code ConverterInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public ConverterInputStream build() {
            return (ConverterInputStream) org.gtk.gobject.GObject.newWithProperties(
                ConverterInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setConverter(org.gtk.gio.Converter converter) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_converter_input_stream_get_type != null;
    }
}
