package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for output stream implementations that perform some
 * kind of filtering operation on a base stream. Typical examples
 * of filtering operations are character set conversion, compression
 * and byte order flipping.
 */
public class FilterOutputStream extends org.gtk.gio.OutputStream {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFilterOutputStream";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.OutputStream.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("base_stream")
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
    public org.gtk.gio.OutputStream parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.OutputStream(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    /**
     * Get the value of the field {@code base_stream}
     * @return The value of the field {@code base_stream}
     */
    public org.gtk.gio.OutputStream base_stream$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_stream"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.gio.OutputStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Change the value of the field {@code base_stream}
     * @param base_stream The new value of the field {@code base_stream}
     */
    public void base_stream$set(org.gtk.gio.OutputStream base_stream) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("base_stream"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), base_stream.handle());
    }
    
    @ApiStatus.Internal
    public FilterOutputStream(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FilterOutputStream if its GType is a (or inherits from) "GFilterOutputStream".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FilterOutputStream" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GFilterOutputStream", a ClassCastException will be thrown.
     */
    public static FilterOutputStream castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GFilterOutputStream"))) {
            return new FilterOutputStream(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GFilterOutputStream");
        }
    }
    
    /**
     * Gets the base stream for the filter stream.
     * @return a {@link OutputStream}.
     */
    public @NotNull org.gtk.gio.OutputStream getBaseStream() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_filter_output_stream_get_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.OutputStream(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the base stream will be closed when {@code stream} is
     * closed.
     * @return {@code true} if the base stream will be closed.
     */
    public boolean getCloseBaseStream() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_filter_output_stream_get_close_base_stream.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets whether the base stream will be closed when {@code stream} is closed.
     * @param closeBase {@code true} to close the base stream.
     */
    public void setCloseBaseStream(boolean closeBase) {
        try {
            DowncallHandles.g_filter_output_stream_set_close_base_stream.invokeExact(
                    handle(),
                    closeBase ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_filter_output_stream_get_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_get_base_stream",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_filter_output_stream_get_close_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_get_close_base_stream",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_filter_output_stream_set_close_base_stream = Interop.downcallHandle(
            "g_filter_output_stream_set_close_base_stream",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
