package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Parameters passed to the gst_buffer_pool_acquire_buffer() function to control the
 * allocation of the buffer.
 * <p>
 * The default implementation ignores the {@code start} and {@code stop} members but other
 * implementations can use this extra information to decide what buffer to
 * return.
 */
public class BufferPoolAcquireParams extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBufferPoolAcquireParams";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("format"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("start"),
            Interop.valueLayout.C_LONG.withName("stop"),
            Interop.valueLayout.C_INT.withName("flags"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BufferPoolAcquireParams}
     * @return A new, uninitialized @{link BufferPoolAcquireParams}
     */
    public static BufferPoolAcquireParams allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BufferPoolAcquireParams newInstance = new BufferPoolAcquireParams(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.gstreamer.gst.Format getFormat() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.Format.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void setFormat(org.gstreamer.gst.Format format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code start}
     * @return The value of the field {@code start}
     */
    public long getStart() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(long start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), start);
        }
    }
    
    /**
     * Get the value of the field {@code stop}
     * @return The value of the field {@code stop}
     */
    public long getStop() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(long stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), stop);
        }
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.gst.BufferPoolAcquireFlags getFlags() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.BufferPoolAcquireFlags(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.gst.BufferPoolAcquireFlags flags) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
        }
    }
    
    /**
     * Create a BufferPoolAcquireParams proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BufferPoolAcquireParams(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BufferPoolAcquireParams> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BufferPoolAcquireParams(input);
    
    /**
     * A {@link BufferPoolAcquireParams.Builder} object constructs a {@link BufferPoolAcquireParams} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BufferPoolAcquireParams.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BufferPoolAcquireParams struct;
        
        private Builder() {
            struct = BufferPoolAcquireParams.allocate();
        }
        
        /**
         * Finish building the {@link BufferPoolAcquireParams} struct.
         * @return A new instance of {@code BufferPoolAcquireParams} with the fields 
         *         that were set in the Builder object.
         */
        public BufferPoolAcquireParams build() {
            return struct;
        }
        
        /**
         * the format of {@code start} and {@code stop}
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormat(org.gstreamer.gst.Format format) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
                return this;
            }
        }
        
        /**
         * the start position
         * @param start The value for the {@code start} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStart(long start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), start);
                return this;
            }
        }
        
        /**
         * the stop position
         * @param stop The value for the {@code stop} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStop(long stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), stop);
                return this;
            }
        }
        
        /**
         * additional flags
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gstreamer.gst.BufferPoolAcquireFlags flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
