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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("iso_639_langcode"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("segments")
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
     * Allocate a new {@link AtscMultString}
     * @return A new, uninitialized @{link AtscMultString}
     */
    public static AtscMultString allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AtscMultString newInstance = new AtscMultString(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a AtscMultString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AtscMultString(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AtscMultString struct;
        
         /**
         * A {@link AtscMultString.Build} object constructs a {@link AtscMultString} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AtscMultString.allocate();
        }
        
         /**
         * Finish building the {@link AtscMultString} struct.
         * @return A new instance of {@code AtscMultString} with the fields 
         *         that were set in the Build object.
         */
        public AtscMultString construct() {
            return struct;
        }
        
        /**
         * The ISO639 language code
         * @param iso639Langcode The value for the {@code iso639Langcode} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIso639Langcode(byte[] iso639Langcode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iso_639_langcode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iso639Langcode == null ? MemoryAddress.NULL : Interop.allocateNativeArray(iso639Langcode, false)));
            return this;
        }
        
        public Build setSegments(org.gstreamer.mpegts.AtscStringSegment[] segments) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segments"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segments == null ? MemoryAddress.NULL : Interop.allocateNativeArray(segments, org.gstreamer.mpegts.AtscStringSegment.getMemoryLayout(), false)));
            return this;
        }
    }
}
