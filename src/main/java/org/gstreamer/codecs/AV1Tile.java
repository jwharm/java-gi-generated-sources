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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("tile_group"),
            Interop.valueLayout.ADDRESS.withName("obu")
        ).withName(C_TYPE_NAME);
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
    public java.lang.foreign.MemoryAddress getTileGroup() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code tile_group}
     * @param tileGroup The new value of the field {@code tile_group}
     */
    public void setTileGroup(java.lang.foreign.MemoryAddress tileGroup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tileGroup == null ? MemoryAddress.NULL : (Addressable) tileGroup));
    }
    
    /**
     * Get the value of the field {@code obu}
     * @return The value of the field {@code obu}
     */
    public java.lang.foreign.MemoryAddress getObu() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("obu"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code obu}
     * @param obu The new value of the field {@code obu}
     */
    public void setObu(java.lang.foreign.MemoryAddress obu) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("obu"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (obu == null ? MemoryAddress.NULL : (Addressable) obu));
    }
    
    /**
     * Create a AV1Tile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AV1Tile(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AV1Tile> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AV1Tile(input, ownership);
    
    /**
     * A {@link AV1Tile.Builder} object constructs a {@link AV1Tile} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AV1Tile.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AV1Tile struct;
        
        private Builder() {
            struct = AV1Tile.allocate();
        }
        
         /**
         * Finish building the {@link AV1Tile} struct.
         * @return A new instance of {@code AV1Tile} with the fields 
         *         that were set in the Builder object.
         */
        public AV1Tile build() {
            return struct;
        }
        
        public Builder setTileGroup(java.lang.foreign.MemoryAddress tileGroup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tile_group"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tileGroup == null ? MemoryAddress.NULL : (Addressable) tileGroup));
            return this;
        }
        
        public Builder setObu(java.lang.foreign.MemoryAddress obu) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("obu"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (obu == null ? MemoryAddress.NULL : (Addressable) obu));
            return this;
        }
    }
}
