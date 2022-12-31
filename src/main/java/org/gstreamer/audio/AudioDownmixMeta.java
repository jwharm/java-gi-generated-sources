package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata describing audio downmixing matrix. This metadata is
 * attached to audio buffers and contains a matrix to downmix the buffer number
 * of channels to {@code channels}.
 * <p>
 * {@code matrix} is an two-dimensional array of {@code to_channels} times {@code from_channels}
 * coefficients, i.e. the i-th output channels is constructed by multiplicating
 * the input channels with the coefficients in {@code matrix}[i] and taking the sum
 * of the results.
 */
public class AudioDownmixMeta extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioDownmixMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_INT.withName("from_position"),
            Interop.valueLayout.C_INT.withName("to_position"),
            Interop.valueLayout.C_INT.withName("from_channels"),
            Interop.valueLayout.C_INT.withName("to_channels"),
            Interop.valueLayout.ADDRESS.withName("matrix")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioDownmixMeta}
     * @return A new, uninitialized @{link AudioDownmixMeta}
     */
    public static AudioDownmixMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioDownmixMeta newInstance = new AudioDownmixMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Get the value of the field {@code from_position}
     * @return The value of the field {@code from_position}
     */
    public PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> getFromPosition() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerEnumeration<org.gstreamer.audio.AudioChannelPosition>(RESULT, org.gstreamer.audio.AudioChannelPosition::of);
    }
    
    /**
     * Change the value of the field {@code from_position}
     * @param fromPosition The new value of the field {@code from_position}
     */
    public void setFromPosition(PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> fromPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromPosition == null ? MemoryAddress.NULL : fromPosition.handle()));
    }
    
    /**
     * Get the value of the field {@code to_position}
     * @return The value of the field {@code to_position}
     */
    public PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> getToPosition() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerEnumeration<org.gstreamer.audio.AudioChannelPosition>(RESULT, org.gstreamer.audio.AudioChannelPosition::of);
    }
    
    /**
     * Change the value of the field {@code to_position}
     * @param toPosition The new value of the field {@code to_position}
     */
    public void setToPosition(PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> toPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toPosition == null ? MemoryAddress.NULL : toPosition.handle()));
    }
    
    /**
     * Get the value of the field {@code from_channels}
     * @return The value of the field {@code from_channels}
     */
    public int getFromChannels() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code from_channels}
     * @param fromChannels The new value of the field {@code from_channels}
     */
    public void setFromChannels(int fromChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fromChannels);
    }
    
    /**
     * Get the value of the field {@code to_channels}
     * @return The value of the field {@code to_channels}
     */
    public int getToChannels() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code to_channels}
     * @param toChannels The new value of the field {@code to_channels}
     */
    public void setToChannels(int toChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), toChannels);
    }
    
    /**
     * Get the value of the field {@code matrix}
     * @return The value of the field {@code matrix}
     */
    public PointerFloat getMatrix() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerFloat(RESULT);
    }
    
    /**
     * Change the value of the field {@code matrix}
     * @param matrix The new value of the field {@code matrix}
     */
    public void setMatrix(PointerFloat matrix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
    }
    
    /**
     * Create a AudioDownmixMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioDownmixMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioDownmixMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioDownmixMeta(input, ownership);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_downmix_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_downmix_meta_get_info = Interop.downcallHandle(
            "gst_audio_downmix_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link AudioDownmixMeta.Builder} object constructs a {@link AudioDownmixMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioDownmixMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioDownmixMeta struct;
        
        private Builder() {
            struct = AudioDownmixMeta.allocate();
        }
        
         /**
         * Finish building the {@link AudioDownmixMeta} struct.
         * @return A new instance of {@code AudioDownmixMeta} with the fields 
         *         that were set in the Builder object.
         */
        public AudioDownmixMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * the channel positions of the source
         * @param fromPosition The value for the {@code fromPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFromPosition(PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> fromPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromPosition == null ? MemoryAddress.NULL : fromPosition.handle()));
            return this;
        }
        
        /**
         * the channel positions of the destination
         * @param toPosition The value for the {@code toPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setToPosition(PointerEnumeration<org.gstreamer.audio.AudioChannelPosition> toPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toPosition == null ? MemoryAddress.NULL : toPosition.handle()));
            return this;
        }
        
        /**
         * the number of channels of the source
         * @param fromChannels The value for the {@code fromChannels} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFromChannels(int fromChannels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fromChannels);
            return this;
        }
        
        /**
         * the number of channels of the destination
         * @param toChannels The value for the {@code toChannels} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setToChannels(int toChannels) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_channels"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), toChannels);
            return this;
        }
        
        /**
         * the matrix coefficients.
         * @param matrix The value for the {@code matrix} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMatrix(PointerFloat matrix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
            return this;
        }
    }
}
