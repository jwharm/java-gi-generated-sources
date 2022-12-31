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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MemoryInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MemoryInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryInputStream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MemoryInputStream(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_input_stream_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link MemoryInputStream}.
     */
    public MemoryInputStream() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromBytes(org.gtk.glib.Bytes bytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_input_stream_new_from_bytes.invokeExact(
                    bytes.handle());
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
    public static MemoryInputStream newFromBytes(org.gtk.glib.Bytes bytes) {
        var RESULT = constructNewFromBytes(bytes);
        return (org.gtk.gio.MemoryInputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MemoryInputStream.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    private static MemoryAddress constructNewFromData(byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_input_stream_new_from_data.invokeExact(
                    Interop.allocateNativeArray(data, false),
                    len,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data in memory of a given size.
     * @param data input data
     * @param len length of the data, may be -1 if {@code data} is a nul-terminated string
     * @param destroy function that is called to free {@code data}, or {@code null}
     * @return new {@link InputStream} read from {@code data} of {@code len} bytes.
     */
    public static MemoryInputStream newFromData(byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        var RESULT = constructNewFromData(data, len, destroy);
        return (org.gtk.gio.MemoryInputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MemoryInputStream.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Appends {@code bytes} to data that can be read from the input stream.
     * @param bytes input data
     */
    public void addBytes(org.gtk.glib.Bytes bytes) {
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
        try {
            DowncallHandles.g_memory_input_stream_add_data.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    len,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
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
            RESULT = (long) DowncallHandles.g_memory_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MemoryInputStream.Builder} object constructs a {@link MemoryInputStream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MemoryInputStream.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.InputStream.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MemoryInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MemoryInputStream}.
         * @return A new instance of {@code MemoryInputStream} with the properties 
         *         that were set in the Builder object.
         */
        public MemoryInputStream build() {
            return (MemoryInputStream) org.gtk.gobject.GObject.newWithProperties(
                MemoryInputStream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_memory_input_stream_new = Interop.downcallHandle(
            "g_memory_input_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_input_stream_new_from_bytes = Interop.downcallHandle(
            "g_memory_input_stream_new_from_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_input_stream_new_from_data = Interop.downcallHandle(
            "g_memory_input_stream_new_from_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_input_stream_add_bytes = Interop.downcallHandle(
            "g_memory_input_stream_add_bytes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_input_stream_add_data = Interop.downcallHandle(
            "g_memory_input_stream_add_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_memory_input_stream_get_type = Interop.downcallHandle(
            "g_memory_input_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
