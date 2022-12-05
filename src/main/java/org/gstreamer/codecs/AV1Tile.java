package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AV1Tile extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAV1Tile";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("tile_group"),
        Interop.valueLayout.ADDRESS.withName("obu")
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
     * Allocate a new {@link AV1Tile}
     * @return A new, uninitialized @{link AV1Tile}
     */
    public static AV1Tile allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AV1Tile newInstance = new AV1Tile(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code tile_group}
     * @return The value of the field {@code tile_group}
     */
    public java.lang.foreign.MemoryAddress tileGroup$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_group}
     * @param tileGroup The new value of the field {@code tile_group}
     */
    public void tileGroup$set(java.lang.foreign.MemoryAddress tileGroup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) tileGroup);
    }
    
    /**
     * Get the value of the field {@code obu}
     * @return The value of the field {@code obu}
     */
    public java.lang.foreign.MemoryAddress obu$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("obu"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code obu}
     * @param obu The new value of the field {@code obu}
     */
    public void obu$set(java.lang.foreign.MemoryAddress obu) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("obu"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) obu);
    }
    
    /**
     * Create a AV1Tile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AV1Tile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AV1Tile struct;
        
         /**
         * A {@link AV1Tile.Build} object constructs a {@link AV1Tile} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AV1Tile.allocate();
        }
        
         /**
         * Finish building the {@link AV1Tile} struct.
         * @return A new instance of {@code AV1Tile} with the fields 
         *         that were set in the Build object.
         */
        public AV1Tile construct() {
            return struct;
        }
        
        public Build setTileGroup(java.lang.foreign.MemoryAddress tileGroup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tileGroup == null ? MemoryAddress.NULL : (Addressable) tileGroup));
            return this;
        }
        
        public Build setObu(java.lang.foreign.MemoryAddress obu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("obu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (obu == null ? MemoryAddress.NULL : (Addressable) obu));
            return this;
        }
    }
}
