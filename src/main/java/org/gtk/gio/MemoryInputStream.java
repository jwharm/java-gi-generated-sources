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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.InputStream.getMemoryLayout().withName("parent_instance"),
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
     * Create a MemoryInputStream proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MemoryInputStream(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to MemoryInputStream if its GType is a (or inherits from) "GMemoryInputStream".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code MemoryInputStream} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GMemoryInputStream", a ClassCastException will be thrown.
     */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), MemoryInputStream.getType())) {
            return new MemoryInputStream(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GMemoryInputStream");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    
    private static Addressable constructNewFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        java.util.Objects.requireNonNull(bytes, "Parameter 'bytes' must not be null");
        Addressable RESULT;
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
    public static MemoryInputStream newFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        return new MemoryInputStream(constructNewFromBytes(bytes), Ownership.FULL);
    }
    
    private static Addressable constructNewFromData(@NotNull byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data in memory of a given size.
     * @param data input data
     * @param len length of the data, may be -1 if {@code data} is a nul-terminated string
     * @param destroy function that is called to free {@code data}, or {@code null}
     * @return new {@link InputStream} read from {@code data} of {@code len} bytes.
     */
    public static MemoryInputStream newFromData(@NotNull byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
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
    public void addData(@NotNull byte[] data, long len, @Nullable org.gtk.glib.DestroyNotify destroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_memory_input_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gio.InputStream.Build {
        
         /**
         * A {@link MemoryInputStream.Build} object constructs a {@link MemoryInputStream} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link MemoryInputStream} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MemoryInputStream} using {@link MemoryInputStream#castFrom}.
         * @return A new instance of {@code MemoryInputStream} with the properties 
         *         that were set in the Build object.
         */
        public MemoryInputStream construct() {
            return MemoryInputStream.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    MemoryInputStream.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
