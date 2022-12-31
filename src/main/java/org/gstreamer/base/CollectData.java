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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gstreamer.base.CollectPads getCollect() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.base.CollectPads) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.base.CollectPads.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code collect}
     * @param collect The new value of the field {@code collect}
     */
    public void setCollect(org.gstreamer.base.CollectPads collect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("collect"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (collect == null ? MemoryAddress.NULL : collect.handle()));
    }
    
    /**
     * Get the value of the field {@code pad}
     * @return The value of the field {@code pad}
     */
    public org.gstreamer.gst.Pad getPad() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Pad.fromAddress).marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pad}
     * @param pad The new value of the field {@code pad}
     */
    public void setPad(org.gstreamer.gst.Pad pad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pad == null ? MemoryAddress.NULL : pad.handle()));
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
    }
    
    /**
     * Get the value of the field {@code pos}
     * @return The value of the field {@code pos}
     */
    public int getPos() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pos"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code pos}
     * @param pos The new value of the field {@code pos}
     */
    public void setPos(int pos) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pos"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), pos);
    }
    
    /**
     * Get the value of the field {@code segment}
     * @return The value of the field {@code segment}
     */
    public org.gstreamer.gst.Segment getSegment() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("segment"));
        return org.gstreamer.gst.Segment.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code segment}
     * @param segment The new value of the field {@code segment}
     */
    public void setSegment(org.gstreamer.gst.Segment segment) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("segment"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segment == null ? MemoryAddress.NULL : segment.handle()));
    }
    
    /**
     * Create a CollectData proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CollectData(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CollectData> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CollectData(input, ownership);
    
    /**
     * A {@link CollectData.Builder} object constructs a {@link CollectData} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CollectData.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CollectData struct;
        
        private Builder() {
            struct = CollectData.allocate();
        }
        
         /**
         * Finish building the {@link CollectData} struct.
         * @return A new instance of {@code CollectData} with the fields 
         *         that were set in the Builder object.
         */
        public CollectData build() {
            return struct;
        }
        
        /**
         * owner {@link CollectPads}
         * @param collect The value for the {@code collect} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCollect(org.gstreamer.base.CollectPads collect) {
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
        public Builder setPad(org.gstreamer.gst.Pad pad) {
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
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
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
        public Builder setPos(int pos) {
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
        public Builder setSegment(org.gstreamer.gst.Segment segment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("segment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (segment == null ? MemoryAddress.NULL : segment.handle()));
            return this;
        }
        
        public Builder setState(org.gstreamer.base.CollectPadsStateFlags state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (state == null ? MemoryAddress.NULL : state.getValue()));
            return this;
        }
        
        public Builder setPriv(org.gstreamer.base.CollectDataPrivate priv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
            return this;
        }
    }
}
