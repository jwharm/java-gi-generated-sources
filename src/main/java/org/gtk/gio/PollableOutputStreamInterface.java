package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface for pollable output streams.
 * <p>
 * The default implementation of {@code can_poll} always returns {@code true}.
 * <p>
 * The default implementation of {@code write_nonblocking} calls
 * g_pollable_output_stream_is_writable(), and then calls
 * g_output_stream_write() if it returns {@code true}. This means you only
 * need to override it if it is possible that your {@code is_writable}
 * implementation may return {@code true} when the stream is not actually
 * writable.
 * <p>
 * The default implementation of {@code writev_nonblocking} calls
 * g_pollable_output_stream_write_nonblocking() for each vector, and converts
 * its return value and error (if set) to a {@link PollableReturn}. You should
 * override this where possible to avoid having to allocate a {@link org.gtk.glib.Error} to return
 * {@link IOErrorEnum#WOULD_BLOCK}.
 * @version 2.28
 */
public class PollableOutputStreamInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPollableOutputStreamInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("can_poll"),
        Interop.valueLayout.ADDRESS.withName("is_writable"),
        Interop.valueLayout.ADDRESS.withName("create_source"),
        Interop.valueLayout.ADDRESS.withName("write_nonblocking"),
        Interop.valueLayout.ADDRESS.withName("writev_nonblocking")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PollableOutputStreamInterface}
     * @return A new, uninitialized @{link PollableOutputStreamInterface}
     */
    public static PollableOutputStreamInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PollableOutputStreamInterface newInstance = new PollableOutputStreamInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PollableOutputStreamInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PollableOutputStreamInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PollableOutputStreamInterface struct;
        
         /**
         * A {@link PollableOutputStreamInterface.Build} object constructs a {@link PollableOutputStreamInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PollableOutputStreamInterface.allocate();
        }
        
         /**
         * Finish building the {@link PollableOutputStreamInterface} struct.
         * @return A new instance of {@code PollableOutputStreamInterface} with the fields 
         *         that were set in the Build object.
         */
        public PollableOutputStreamInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setCanPoll(java.lang.foreign.MemoryAddress can_poll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_poll"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_poll == null ? MemoryAddress.NULL : can_poll));
            return this;
        }
        
        public Build setIsWritable(java.lang.foreign.MemoryAddress is_writable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_writable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_writable == null ? MemoryAddress.NULL : is_writable));
            return this;
        }
        
        public Build setCreateSource(java.lang.foreign.MemoryAddress create_source) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_source == null ? MemoryAddress.NULL : create_source));
            return this;
        }
        
        public Build setWriteNonblocking(java.lang.foreign.MemoryAddress write_nonblocking) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_nonblocking"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write_nonblocking == null ? MemoryAddress.NULL : write_nonblocking));
            return this;
        }
        
        public Build setWritevNonblocking(java.lang.foreign.MemoryAddress writev_nonblocking) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_nonblocking"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writev_nonblocking == null ? MemoryAddress.NULL : writev_nonblocking));
            return this;
        }
    }
}
