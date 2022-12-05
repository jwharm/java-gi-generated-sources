package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioDownmixMeta} defines an audio downmix matrix to be send along with
 * audio buffers. These functions in this module help to create and attach the
 * meta as well as extracting it.
 * @version 1.16
 */
public class AudioMeta extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.C_LONG.withName("samples"),
        Interop.valueLayout.ADDRESS.withName("offsets"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.C_LONG).withName("priv_offsets_arr"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link AudioMeta}
     * @return A new, uninitialized @{link AudioMeta}
     */
    public static AudioMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioMeta newInstance = new AudioMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.audio.AudioInfo info$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return new org.gstreamer.audio.AudioInfo(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code samples}
     * @return The value of the field {@code samples}
     */
    public long samples$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("samples"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code samples}
     * @param samples The new value of the field {@code samples}
     */
    public void samples$set(long samples) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("samples"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), samples);
    }
    
    /**
     * Get the value of the field {@code offsets}
     * @return The value of the field {@code offsets}
     */
    public PointerLong offsets$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offsets"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerLong(RESULT);
    }
    
    /**
     * Change the value of the field {@code offsets}
     * @param offsets The new value of the field {@code offsets}
     */
    public void offsets$set(PointerLong offsets) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("offsets"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), offsets.handle());
    }
    
    /**
     * Create a AudioMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_meta_get_info = Interop.downcallHandle(
            "gst_audio_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioMeta struct;
        
         /**
         * A {@link AudioMeta.Build} object constructs a {@link AudioMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioMeta.allocate();
        }
        
         /**
         * Finish building the {@link AudioMeta} struct.
         * @return A new instance of {@code AudioMeta} with the fields 
         *         that were set in the Build object.
         */
        public AudioMeta construct() {
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
         * the audio properties of the buffer
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInfo(org.gstreamer.audio.AudioInfo info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
            return this;
        }
        
        /**
         * the number of valid samples in the buffer
         * @param samples The value for the {@code samples} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSamples(long samples) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("samples"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), samples);
            return this;
        }
        
        /**
         * the offsets (in bytes) where each channel plane starts in the
         *   buffer or {@code null} if the buffer has interleaved layout; if not {@code null}, this
         *   is guaranteed to be an array of {@code info}.channels elements
         * @param offsets The value for the {@code offsets} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffsets(PointerLong offsets) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offsets"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (offsets == null ? MemoryAddress.NULL : offsets.handle()));
            return this;
        }
        
        public Build setPrivOffsetsArr(long[] privOffsetsArr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv_offsets_arr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (privOffsetsArr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(privOffsetsArr, false)));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
