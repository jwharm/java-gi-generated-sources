package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AtscMultString extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsAtscMultString";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("iso_639_langcode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("segments")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AtscMultString}
     * @return A new, uninitialized @{link AtscMultString}
     */
    public static AtscMultString allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AtscMultString newInstance = new AtscMultString(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iso_639_langcode}
     * @return The value of the field {@code iso_639_langcode}
     */
    public byte[] getIso639Langcode() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iso_639_langcode"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return MemorySegment.ofAddress(RESULT, 4, SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * Change the value of the field {@code iso_639_langcode}
     * @param iso639Langcode The new value of the field {@code iso_639_langcode}
     */
    public void setIso639Langcode(byte[] iso639Langcode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iso_639_langcode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iso639Langcode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(iso639Langcode, false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code segments}
     * @return The value of the field {@code segments}
     */
    public PointerProxy<org.gstreamer.mpegts.AtscStringSegment> getSegments() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segments"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gstreamer.mpegts.AtscStringSegment>(RESULT, org.gstreamer.mpegts.AtscStringSegment.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code segments}
     * @param segments The new value of the field {@code segments}
     */
    public void setSegments(org.gstreamer.mpegts.AtscStringSegment[] segments) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segments"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segments == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segments, org.gstreamer.mpegts.AtscStringSegment.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a AtscMultString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AtscMultString(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AtscMultString> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AtscMultString(input);
    
    /**
     * A {@link AtscMultString.Builder} object constructs a {@link AtscMultString} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AtscMultString.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AtscMultString struct;
        
        private Builder() {
            struct = AtscMultString.allocate();
        }
        
        /**
         * Finish building the {@link AtscMultString} struct.
         * @return A new instance of {@code AtscMultString} with the fields 
         *         that were set in the Builder object.
         */
        public AtscMultString build() {
            return struct;
        }
        
        /**
         * The ISO639 language code
         * @param iso639Langcode The value for the {@code iso639Langcode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIso639Langcode(byte[] iso639Langcode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("iso_639_langcode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (iso639Langcode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(iso639Langcode, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setSegments(org.gstreamer.mpegts.AtscStringSegment[] segments) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("segments"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (segments == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segments, org.gstreamer.mpegts.AtscStringSegment.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
