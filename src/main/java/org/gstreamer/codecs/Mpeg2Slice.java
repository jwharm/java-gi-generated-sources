package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Mpeg2Slice extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpeg2Slice";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("quant_matrix"),
            Interop.valueLayout.ADDRESS.withName("pic_hdr"),
            Interop.valueLayout.ADDRESS.withName("pic_ext"),
            Interop.valueLayout.ADDRESS.withName("header"),
            Interop.valueLayout.ADDRESS.withName("packet"),
            Interop.valueLayout.C_INT.withName("sc_offset"),
            Interop.valueLayout.C_INT.withName("size")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Mpeg2Slice}
     * @return A new, uninitialized @{link Mpeg2Slice}
     */
    public static Mpeg2Slice allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Mpeg2Slice newInstance = new Mpeg2Slice(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Mpeg2Slice proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Mpeg2Slice(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Mpeg2Slice> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Mpeg2Slice(input);
    
    /**
     * A {@link Mpeg2Slice.Builder} object constructs a {@link Mpeg2Slice} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Mpeg2Slice.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Mpeg2Slice struct;
        
        private Builder() {
            struct = Mpeg2Slice.allocate();
        }
        
        /**
         * Finish building the {@link Mpeg2Slice} struct.
         * @return A new instance of {@code Mpeg2Slice} with the fields 
         *         that were set in the Builder object.
         */
        public Mpeg2Slice build() {
            return struct;
        }
        
        public Builder setQuantMatrix(java.lang.foreign.MemoryAddress quantMatrix) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("quant_matrix"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (quantMatrix == null ? MemoryAddress.NULL : (Addressable) quantMatrix));
                return this;
            }
        }
        
        public Builder setPicHdr(java.lang.foreign.MemoryAddress picHdr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pic_hdr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (picHdr == null ? MemoryAddress.NULL : (Addressable) picHdr));
                return this;
            }
        }
        
        public Builder setPicExt(java.lang.foreign.MemoryAddress picExt) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pic_ext"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (picExt == null ? MemoryAddress.NULL : (Addressable) picExt));
                return this;
            }
        }
        
        public Builder setHeader(java.lang.foreign.MemoryAddress header) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("header"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (header == null ? MemoryAddress.NULL : (Addressable) header));
                return this;
            }
        }
        
        public Builder setPacket(java.lang.foreign.MemoryAddress packet) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("packet"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packet == null ? MemoryAddress.NULL : (Addressable) packet));
                return this;
            }
        }
        
        public Builder setScOffset(int scOffset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sc_offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), scOffset);
                return this;
            }
        }
        
        public Builder setSize(int size) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("size"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), size);
                return this;
            }
        }
    }
}
