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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.C_INT.withName("from_position"),
        Interop.valueLayout.C_INT.withName("to_position"),
        Interop.valueLayout.C_INT.withName("from_channels"),
        Interop.valueLayout.C_INT.withName("to_channels"),
        Interop.valueLayout.ADDRESS.withName("matrix")
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
    public org.gstreamer.gst.Meta meta$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return new org.gstreamer.gst.Meta(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code from_position}
     * @return The value of the field {@code from_position}
     */
    public org.gstreamer.audio.AudioChannelPosition fromPosition$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioChannelPosition.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code from_position}
     * @param fromPosition The new value of the field {@code from_position}
     */
    public void fromPosition$set(org.gstreamer.audio.AudioChannelPosition fromPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), new PointerInteger(fromPosition.getValue()).handle());
    }
    
    /**
     * Get the value of the field {@code to_position}
     * @return The value of the field {@code to_position}
     */
    public org.gstreamer.audio.AudioChannelPosition toPosition$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.audio.AudioChannelPosition.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code to_position}
     * @param toPosition The new value of the field {@code to_position}
     */
    public void toPosition$set(org.gstreamer.audio.AudioChannelPosition toPosition) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), new PointerInteger(toPosition.getValue()).handle());
    }
    
    /**
     * Get the value of the field {@code from_channels}
     * @return The value of the field {@code from_channels}
     */
    public int fromChannels$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code from_channels}
     * @param fromChannels The new value of the field {@code from_channels}
     */
    public void fromChannels$set(int fromChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("from_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fromChannels);
    }
    
    /**
     * Get the value of the field {@code to_channels}
     * @return The value of the field {@code to_channels}
     */
    public int toChannels$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_channels"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code to_channels}
     * @param toChannels The new value of the field {@code to_channels}
     */
    public void toChannels$set(int toChannels) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("to_channels"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), toChannels);
    }
    
    /**
     * Get the value of the field {@code matrix}
     * @return The value of the field {@code matrix}
     */
    public PointerFloat matrix$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerFloat(RESULT);
    }
    
    /**
     * Change the value of the field {@code matrix}
     * @param matrix The new value of the field {@code matrix}
     */
    public void matrix$set(PointerFloat matrix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), matrix.handle());
    }
    
    /**
     * Create a AudioDownmixMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioDownmixMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_downmix_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_downmix_meta_get_info = Interop.downcallHandle(
            "gst_audio_downmix_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioDownmixMeta struct;
        
         /**
         * A {@link AudioDownmixMeta.Build} object constructs a {@link AudioDownmixMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioDownmixMeta.allocate();
        }
        
         /**
         * Finish building the {@link AudioDownmixMeta} struct.
         * @return A new instance of {@code AudioDownmixMeta} with the fields 
         *         that were set in the Build object.
         */
        public AudioDownmixMeta construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMeta(org.gstreamer.gst.Meta meta) {
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
        public Build setFromPosition(org.gstreamer.audio.AudioChannelPosition fromPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromPosition == null ? MemoryAddress.NULL : new PointerInteger(fromPosition.getValue()).handle()));
            return this;
        }
        
        /**
         * the channel positions of the destination
         * @param toPosition The value for the {@code toPosition} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setToPosition(org.gstreamer.audio.AudioChannelPosition toPosition) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_position"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toPosition == null ? MemoryAddress.NULL : new PointerInteger(toPosition.getValue()).handle()));
            return this;
        }
        
        /**
         * the number of channels of the source
         * @param fromChannels The value for the {@code fromChannels} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFromChannels(int fromChannels) {
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
        public Build setToChannels(int toChannels) {
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
        public Build setMatrix(PointerFloat matrix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : matrix.handle()));
            return this;
        }
    }
}
