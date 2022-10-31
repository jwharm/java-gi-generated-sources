package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MemoryInputStream} is a class for using arbitrary
 * memory chunks as input for GIO streaming input operations.
 * <p>
 * As of GLib 2.34, {@link MemoryInputStream} implements
 * {@link PollableInputStream}.
 */
public class MemoryInputStream extends org.gtk.gio.InputStream implements org.gtk.gio.PollableInputStream, org.gtk.gio.Seekable {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMemoryInputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gio.InputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.InputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public MemoryInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to MemoryInputStream if its GType is a (or inherits from) "GMemoryInputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "MemoryInputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GMemoryInputStream", a ClassCastException will be thrown.
     */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GMemoryInputStream"))) {
            return new MemoryInputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GMemoryInputStream");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_memory_input_stream_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link MemoryInputStream}.
     */
    public MemoryInputStream() {
        super(constructNew());
    }
    
    private static Refcounted constructNewFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_memory_input_stream_new_from_bytes.invokeExact(
                    bytes.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data from the given {@code bytes}.
     * @param bytes a {@link org.gtk.glib.Bytes}
     * @return new {@link InputStream} read from {@code bytes}
     */
    public static MemoryInputStream newFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        return new MemoryInputStream(constructNewFromBytes(bytes));
    }
    
    private static Refcounted constructNewFromData(byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data in memory of a given size.
     * @param data input data
     * @param len length of the data, may be -1 if {@code data} is a nul-terminated string
     * @param destroy function that is called to free {@code data}, or {@code null}
     * @return new {@link InputStream} read from {@code data} of {@code len} bytes.
     */
    public static MemoryInputStream newFromData(byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Appends {@code bytes} to data that can be read from the input stream.
     * @param bytes input data
     */
    public void addBytes(@NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        try {
            DowncallHandles.g_memory_input_stream_add_bytes.invokeExact(
                    handle(),
                    bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code data} to data that can be read from the input stream
     * @param data input data
     * @param len length of the data, may be -1 if {@code data} is a nul-terminated string
     * @param destroy function that is called to free {@code data}, or {@code null}
     */
    public void addData(byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_memory_input_stream_new = Interop.downcallHandle(
            "g_memory_input_stream_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_memory_input_stream_new_from_bytes = Interop.downcallHandle(
            "g_memory_input_stream_new_from_bytes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_memory_input_stream_new_from_data = Interop.downcallHandle(
            "g_memory_input_stream_new_from_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_memory_input_stream_add_bytes = Interop.downcallHandle(
            "g_memory_input_stream_add_bytes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_memory_input_stream_add_data = Interop.downcallHandle(
            "g_memory_input_stream_add_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
    }
}
