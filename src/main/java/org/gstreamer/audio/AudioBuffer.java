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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioBuffer}
     * @return A new, uninitialized @{link AudioBuffer}
     */
    public static AudioBuffer allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioBuffer newInstance = new AudioBuffer(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code info}
     * @return The value of the field {@code info}
     */
    public org.gstreamer.audio.AudioInfo getInfo() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("info"));
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code info}
     * @param info The new value of the field {@code info}
     */
    public void setInfo(org.gstreamer.audio.AudioInfo info) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code n_samples}
     * @return The value of the field {@code n_samples}
     */
    public long getNSamples() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_samples}
     * @param nSamples The new value of the field {@code n_samples}
     */
    public void setNSamples(long nSamples) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nSamples);
        }
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int getNPlanes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void setNPlanes(int nPlanes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), nPlanes);
        }
    }
    
    /**
     * Get the value of the field {@code planes}
     * @return The value of the field {@code planes}
     */
    public java.lang.foreign.MemoryAddress getPlanes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("planes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code planes}
     * @param planes The new value of the field {@code planes}
     */
    public void setPlanes(java.lang.foreign.MemoryAddress planes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("planes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (planes == null ? MemoryAddress.NULL : (Addressable) planes));
        }
    }
    
    /**
     * Get the value of the field {@code buffer}
     * @return The value of the field {@code buffer}
     */
    public org.gstreamer.gst.Buffer getBuffer() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code buffer}
     * @param buffer The new value of the field {@code buffer}
     */
    public void setBuffer(org.gstreamer.gst.Buffer buffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
        }
    }
    
    /**
     * Create a AudioBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioBuffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioBuffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioBuffer(input);
    
    /**
     * Unmaps an audio buffer that was previously mapped with
     * gst_audio_buffer_map().
     */
    public void unmap() {
        try {
            DowncallHandles.gst_audio_buffer_unmap.invokeExact(handle());
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
    public static org.gstreamer.gst.Buffer clip(org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.Segment segment, int rate, int bpf) {
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
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static boolean map(org.gstreamer.audio.AudioBuffer buffer, org.gstreamer.audio.AudioInfo info, org.gstreamer.gst.Buffer gstbuffer, org.gstreamer.gst.MapFlags flags) {
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static boolean reorderChannels(org.gstreamer.gst.Buffer buffer, org.gstreamer.audio.AudioFormat format, int channels, org.gstreamer.audio.AudioChannelPosition[] from, org.gstreamer.audio.AudioChannelPosition[] to) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_audio_buffer_reorder_channels.invokeExact(
                        buffer.handle(),
                        format.getValue(),
                        channels,
                        Interop.allocateNativeArray(Enumeration.getValues(from), false, SCOPE),
                        Interop.allocateNativeArray(Enumeration.getValues(to), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public static org.gstreamer.gst.Buffer truncate(org.gstreamer.gst.Buffer buffer, int bpf, long trim, long samples) {
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
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
     * A {@link AudioBuffer.Builder} object constructs a {@link AudioBuffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioBuffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioBuffer struct;
        
        private Builder() {
            struct = AudioBuffer.allocate();
        }
        
        /**
         * Finish building the {@link AudioBuffer} struct.
         * @return A new instance of {@code AudioBuffer} with the fields 
         *         that were set in the Builder object.
         */
        public AudioBuffer build() {
            return struct;
        }
        
        /**
         * a {@link AudioInfo} describing the audio properties of this buffer
         * @param info The value for the {@code info} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInfo(org.gstreamer.audio.AudioInfo info) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
                return this;
            }
        }
        
        /**
         * the size of the buffer in samples
         * @param nSamples The value for the {@code nSamples} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNSamples(long nSamples) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_samples"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nSamples);
                return this;
            }
        }
        
        /**
         * the number of planes available
         * @param nPlanes The value for the {@code nPlanes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPlanes(int nPlanes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nPlanes);
                return this;
            }
        }
        
        /**
         * an array of {@code n_planes} pointers pointing to the start of each
         *   plane in the mapped buffer
         * @param planes The value for the {@code planes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPlanes(java.lang.foreign.MemoryAddress planes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("planes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (planes == null ? MemoryAddress.NULL : (Addressable) planes));
                return this;
            }
        }
        
        /**
         * the mapped buffer
         * @param buffer The value for the {@code buffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gstreamer.gst.Buffer buffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
                return this;
            }
        }
        
        public Builder setMapInfos(org.gstreamer.gst.MapInfo mapInfos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("map_infos"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mapInfos == null ? MemoryAddress.NULL : mapInfos.handle()));
                return this;
            }
        }
        
        public Builder setPrivPlanesArr(java.lang.foreign.MemoryAddress[] privPlanesArr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv_planes_arr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (privPlanesArr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(privPlanesArr, false, SCOPE)));
                return this;
            }
        }
        
        public Builder setPrivMapInfosArr(org.gstreamer.gst.MapInfo[] privMapInfosArr) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("priv_map_infos_arr"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (privMapInfosArr == null ? MemoryAddress.NULL : Interop.allocateNativeArray(privMapInfosArr, org.gstreamer.gst.MapInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
