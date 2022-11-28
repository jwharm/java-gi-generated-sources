package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure used by the collect_pads.
 */
public class CollectData extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCollectData";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("collect"),
        Interop.valueLayout.ADDRESS.withName("pad"),
        Interop.valueLayout.ADDRESS.withName("buffer"),
        Interop.valueLayout.C_INT.withName("pos"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        Interop.valueLayout.C_INT.withName("state"),
        MemoryLayout.paddingLayout(32),
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
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CollectData}
     * @return A new, uninitialized @{link CollectData}
     */
    public static CollectData allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CollectData newInstance = new CollectData(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code collect}
     * @return The value of the field {@code collect}
     */
    public org.gstreamer.base.CollectPads collect$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.base.CollectPads(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code collect}
     * @param collect The new value of the field {@code collect}
     */
    public void collect$set(org.gstreamer.base.CollectPads collect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), collect.handle());
    }
    
    /**
     * Get the value of the field {@code pad}
     * @return The value of the field {@code pad}
     */
    public org.gstreamer.gst.Pad pad$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Pad(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pad}
     * @param pad The new value of the field {@code pad}
     */
    public void pad$set(org.gstreamer.gst.Pad pad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pad.handle());
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer buffer$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void buffer$set(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), buffer.handle());
    }
    
    /**
     * Get the value of the field {@code pos}
     * @return The value of the field {@code pos}
     */
    public int pos$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pos"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pos}
     * @param pos The new value of the field {@code pos}
     */
    public void pos$set(int pos) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pos"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pos);
    }
    
    /**
     * Get the value of the field {@code segment}
     * @return The value of the field {@code segment}
     */
    public org.gstreamer.gst.Segment segment$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("segment"));
        return new org.gstreamer.gst.Segment(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a CollectData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CollectData(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CollectData struct;
        
         /**
         * A {@link CollectData.Build} object constructs a {@link CollectData} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CollectData.allocate();
        }
        
         /**
         * Finish building the {@link CollectData} struct.
         * @return A new instance of {@code CollectData} with the fields 
         *         that were set in the Build object.
         */
        public CollectData construct() {
            return struct;
        }
        
        /**
         * owner {@link CollectPads}
         * @param collect The value for the {@code collect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCollect(org.gstreamer.base.CollectPads collect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("collect"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collect == null ? MemoryAddress.NULL : collect.handle()));
            return this;
        }
        
        /**
         * {@link org.gstreamer.gst.Pad} managed by this data
         * @param pad The value for the {@code pad} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPad(org.gstreamer.gst.Pad pad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pad == null ? MemoryAddress.NULL : pad.handle()));
            return this;
        }
        
        /**
         * currently queued buffer.
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        /**
         * position in the buffer
         * @param pos The value for the {@code pos} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPos(int pos) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pos"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), pos);
            return this;
        }
        
        /**
         * last segment received.
         * @param segment The value for the {@code segment} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSegment(org.gstreamer.gst.Segment segment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segment == null ? MemoryAddress.NULL : segment.handle()));
            return this;
        }
        
        public Build setState(org.gstreamer.base.CollectPadsStateFlags state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (state == null ? MemoryAddress.NULL : state.getValue()));
            return this;
        }
        
        public Build setPriv(org.gstreamer.base.CollectDataPrivate priv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
            return this;
        }
    }
}
