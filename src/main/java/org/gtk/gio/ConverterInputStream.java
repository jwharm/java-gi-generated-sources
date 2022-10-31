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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.FilterInputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.FilterInputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.FilterInputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ConverterInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ConverterInputStream if its GType is a (or inherits from) "GConverterInputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ConverterInputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GConverterInputStream", a ClassCastException will be thrown.
     */
    public static ConverterInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GConverterInputStream"))) {
            return new ConverterInputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GConverterInputStream");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.InputStream baseStream, @NotNull org.gtk.gio.Converter converter) {
        java.util.Objects.requireNonNull(baseStream, "Parameter 'baseStream' must not be null");
        java.util.Objects.requireNonNull(converter, "Parameter 'converter' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_converter_input_stream_new.invokeExact(
                    baseStream.handle(),
                    converter.handle()), true);
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
        super(constructNew(baseStream, converter));
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
        return new org.gtk.gio.Converter.ConverterImpl(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_converter_input_stream_new = Interop.downcallHandle(
            "g_converter_input_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_converter_input_stream_get_converter = Interop.downcallHandle(
            "g_converter_input_stream_get_converter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
