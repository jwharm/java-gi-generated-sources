package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure containing the result of an audio buffer map operation,
 * which is executed with gst_audio_buffer_map(). For non-interleaved (planar)
 * buffers, the beginning of each channel in the buffer has its own pointer in
 * the {@code planes} array. For interleaved buffers, the {@code planes} array only contains
 * one item, which is the pointer to the beginning of the buffer, and {@code n_planes}
 * equals 1.
 * <p>
 * The different channels in {@code planes} are always in the GStreamer channel order.
 * @version 1.16
 */
public class AudioBuffer extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBuffer";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("info"),
        Interop.valueLayout.C_LONG.withName("n_samples"),
        Interop.valueLayout.C_INT.withName("n_planes"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("planes"),
        Interop.valueLayout.ADDRESS.withName("buffer"),
        Interop.valueLayout.ADDRESS.withName("map_infos"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("priv_planes_arr"),
        MemoryLayout.sequenceLayout(8, org.gstreamer.gst.MapInfo.getMemoryLayout()).withName("priv_map_infos_arr"),
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
     * Allocate a new {@link AudioBuffer}
     * @return A new, uninitialized @{link AudioBuffer}
     */
    public static AudioBuffer allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioBuffer newInstance = new AudioBuffer(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
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
     * Get the value of the field {@code n_samples}
     * @return The value of the field {@code n_samples}
     */
    public long nSamples$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_samples}
     * @param nSamples The new value of the field {@code n_samples}
     */
    public void nSamples$set(long nSamples) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nSamples);
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int nPlanes$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void nPlanes$set(int nPlanes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
    }
    
    /**
     * Get the value of the field {@code planes}
     * @return The value of the field {@code planes}
     */
    public java.lang.foreign.MemoryAddress planes$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("planes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code planes}
     * @param planes The new value of the field {@code planes}
     */
    public void planes$set(java.lang.foreign.MemoryAddress planes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("planes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) planes);
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
     * Create a AudioBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Unmaps an audio buffer that was previously mapped with
     * gst_audio_buffer_map().
     */
    public void unmap() {
        try {
            DowncallHandles.gst_audio_buffer_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clip the buffer to the given {@code GstSegment}.
     * <p>
     * After calling this function the caller does not own a reference to
     * {@code buffer} anymore.
     * @param buffer The buffer to clip.
     * @param segment Segment in {@link org.gstreamer.gst.Format#TIME} or {@link org.gstreamer.gst.Format#DEFAULT} to which
     *           the buffer should be clipped.
     * @param rate sample rate.
     * @param bpf size of one audio frame in bytes. This is the size of one sample *
     * number of channels.
     * @return {@code null} if the buffer is completely outside the configured segment,
     * otherwise the clipped buffer is returned.
     * <p>
     * If the buffer has no timestamp, it is assumed to be inside the segment and
     * is not clipped
     */
    public static @NotNull org.gstreamer.gst.Buffer clip(@NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gstreamer.gst.Segment segment, int rate, int bpf) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_buffer_clip.invokeExact(
                    buffer.handle(),
                    segment.handle(),
                    rate,
                    bpf);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Maps an audio {@code gstbuffer} so that it can be read or written and stores the
     * result of the map operation in {@code buffer}.
     * <p>
     * This is especially useful when the {@code gstbuffer} is in non-interleaved (planar)
     * layout, in which case this function will use the information in the
     * {@code gstbuffer}'s attached {@link AudioMeta} in order to map each channel in a
     * separate "plane" in {@link AudioBuffer}. If a {@link AudioMeta} is not attached
     * on the {@code gstbuffer}, then it must be in interleaved layout.
     * <p>
     * If a {@link AudioMeta} is attached, then the {@link AudioInfo} on the meta is checked
     * against {@code info}. Normally, they should be equal, but in case they are not,
     * a g_critical will be printed and the {@link AudioInfo} from the meta will be
     * used.
     * <p>
     * In non-interleaved buffers, it is possible to have each channel on a separate
     * {@link org.gstreamer.gst.Memory}. In this case, each memory will be mapped separately to avoid
     * copying their contents in a larger memory area. Do note though that it is
     * not supported to have a single channel spanning over two or more different
     * {@link org.gstreamer.gst.Memory} objects. Although the map operation will likely succeed in this
     * case, it will be highly sub-optimal and it is recommended to merge all the
     * memories in the buffer before calling this function.
     * <p>
     * Note: The actual {@link org.gstreamer.gst.Buffer} is not ref'ed, but it is required to stay valid
     * as long as it's mapped.
     * @param buffer pointer to a {@link AudioBuffer}
     * @param info the audio properties of the buffer
     * @param gstbuffer the {@link org.gstreamer.gst.Buffer} to be mapped
     * @param flags the access mode for the memory
     * @return {@code true} if the map operation succeeded or {@code false} on failure
     */
    public static boolean map(@NotNull org.gstreamer.audio.AudioBuffer buffer, @NotNull org.gstreamer.audio.AudioInfo info, @NotNull org.gstreamer.gst.Buffer gstbuffer, @NotNull org.gstreamer.gst.MapFlags flags) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(gstbuffer, "Parameter 'gstbuffer' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_buffer_map.invokeExact(
                    buffer.handle(),
                    info.handle(),
                    gstbuffer.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Reorders {@code buffer} from the channel positions {@code from} to the channel
     * positions {@code to}. {@code from} and {@code to} must contain the same number of
     * positions and the same positions, only in a different order.
     * {@code buffer} must be writable.
     * @param buffer The buffer to reorder.
     * @param format The {@code GstAudioFormat} of the buffer.
     * @param channels The number of channels.
     * @param from The channel positions in the buffer.
     * @param to The channel positions to convert to.
     * @return {@code true} if the reordering was possible.
     */
    public static boolean reorderChannels(@NotNull org.gstreamer.gst.Buffer buffer, @NotNull org.gstreamer.audio.AudioFormat format, int channels, @NotNull org.gstreamer.audio.AudioChannelPosition[] from, @NotNull org.gstreamer.audio.AudioChannelPosition[] to) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        java.util.Objects.requireNonNull(from, "Parameter 'from' must not be null");
        java.util.Objects.requireNonNull(to, "Parameter 'to' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_buffer_reorder_channels.invokeExact(
                    buffer.handle(),
                    format.getValue(),
                    channels,
                    Interop.allocateNativeArray(Enumeration.getValues(from), false),
                    Interop.allocateNativeArray(Enumeration.getValues(to), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Truncate the buffer to finally have {@code samples} number of samples, removing
     * the necessary amount of samples from the end and {@code trim} number of samples
     * from the beginning.
     * <p>
     * This function does not know the audio rate, therefore the caller is
     * responsible for re-setting the correct timestamp and duration to the
     * buffer. However, timestamp will be preserved if trim == 0, and duration
     * will also be preserved if there is no trimming to be done. Offset and
     * offset end will be preserved / updated.
     * <p>
     * After calling this function the caller does not own a reference to
     * {@code buffer} anymore.
     * @param buffer The buffer to truncate.
     * @param bpf size of one audio frame in bytes. This is the size of one sample *
     * number of channels.
     * @param trim the number of samples to remove from the beginning of the buffer
     * @param samples the final number of samples that should exist in this buffer or -1
     * to use all the remaining samples if you are only removing samples from the
     * beginning.
     * @return the truncated buffer or {@code null} if the arguments
     *   were invalid
     */
    public static @NotNull org.gstreamer.gst.Buffer truncate(@NotNull org.gstreamer.gst.Buffer buffer, int bpf, long trim, long samples) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_buffer_truncate.invokeExact(
                    buffer.handle(),
                    bpf,
                    trim,
                    samples);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_buffer_unmap = Interop.downcallHandle(
            "gst_audio_buffer_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_buffer_clip = Interop.downcallHandle(
            "gst_audio_buffer_clip",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_buffer_map = Interop.downcallHandle(
            "gst_audio_buffer_map",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_buffer_reorder_channels = Interop.downcallHandle(
            "gst_audio_buffer_reorder_channels",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_buffer_truncate = Interop.downcallHandle(
            "gst_audio_buffer_truncate",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AudioBuffer struct;
        
         /**
         * A {@link AudioBuffer.Build} object constructs a {@link AudioBuffer} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AudioBuffer.allocate();
        }
        
         /**
         * Finish building the {@link AudioBuffer} struct.
         * @return A new instance of {@code AudioBuffer} with the fields 
         *         that were set in the Build object.
         */
        public AudioBuffer construct() {
            return struct;
        }
        
        /**
         * a {@link AudioInfo} describing the audio properties of this buffer
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
         * the size of the buffer in samples
         * @param nSamples The value for the {@code nSamples} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNSamples(long nSamples) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nSamples);
            return this;
        }
        
        /**
         * the number of planes available
         * @param nPlanes The value for the {@code nPlanes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNPlanes(int nPlanes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
            return this;
        }
        
        /**
         * an array of {@code n_planes} pointers pointing to the start of each
         *   plane in the mapped buffer
         * @param planes The value for the {@code planes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPlanes(java.lang.foreign.MemoryAddress planes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (planes == null ? MemoryAddress.NULL : (Addressable) planes));
            return this;
        }
        
        /**
         * the mapped buffer
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBuffer(org.gstreamer.gst.Buffer buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
            return this;
        }
        
        public Build setMapInfos(org.gstreamer.gst.MapInfo mapInfos) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map_infos"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mapInfos == null ? MemoryAddress.NULL : mapInfos.handle()));
            return this;
        }
        
        public Build setPrivPlanesArr(java.lang.foreign.MemoryAddress[] privPlanesArr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv_planes_arr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (privPlanesArr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(privPlanesArr, false)));
            return this;
        }
        
        public Build setPrivMapInfosArr(org.gstreamer.gst.MapInfo[] privMapInfosArr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv_map_infos_arr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (privMapInfosArr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(privMapInfosArr, org.gstreamer.gst.MapInfo.getMemoryLayout(), false)));
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
