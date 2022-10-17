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
public class MemoryInputStream extends InputStream implements PollableInputStream, Seekable {

    public MemoryInputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MemoryInputStream */
    public static MemoryInputStream castFrom(org.gtk.gobject.Object gobject) {
        return new MemoryInputStream(gobject.refcounted());
    }
    
    private static final MethodHandle g_memory_input_stream_new = Interop.downcallHandle(
        "g_memory_input_stream_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_memory_input_stream_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@link MemoryInputStream}.
     */
    public MemoryInputStream() {
        super(constructNew());
    }
    
    private static final MethodHandle g_memory_input_stream_new_from_bytes = Interop.downcallHandle(
        "g_memory_input_stream_new_from_bytes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_memory_input_stream_new_from_bytes.invokeExact(bytes.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link MemoryInputStream} with data from the given {@code bytes}.
     */
    public static MemoryInputStream newFromBytes(@NotNull org.gtk.glib.Bytes bytes) {
        return new MemoryInputStream(constructNewFromBytes(bytes));
    }
    
    private static final MethodHandle g_memory_input_stream_add_bytes = Interop.downcallHandle(
        "g_memory_input_stream_add_bytes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code bytes} to data that can be read from the input stream.
     */
    public @NotNull void addBytes(@NotNull org.gtk.glib.Bytes bytes) {
        try {
            g_memory_input_stream_add_bytes.invokeExact(handle(), bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
