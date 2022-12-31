package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link VideoCodecFrame} represents a video frame both in raw and
 * encoded form.
 */
public class VideoCodecFrame extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoCodecFrame";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            Interop.valueLayout.C_INT.withName("flags"),
            Interop.valueLayout.C_INT.withName("system_frame_number"),
            Interop.valueLayout.C_INT.withName("decode_frame_number"),
            Interop.valueLayout.C_INT.withName("presentation_frame_number"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.C_LONG.withName("dts"),
            Interop.valueLayout.C_LONG.withName("pts"),
            Interop.valueLayout.C_LONG.withName("duration"),
            Interop.valueLayout.C_INT.withName("distance_from_sync"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("input_buffer"),
            Interop.valueLayout.ADDRESS.withName("output_buffer"),
            Interop.valueLayout.C_LONG.withName("deadline"),
            Interop.valueLayout.ADDRESS.withName("events"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("user_data_destroy_notify")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoCodecFrame}
     * @return A new, uninitialized @{link VideoCodecFrame}
     */
    public static VideoCodecFrame allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoCodecFrame newInstance = new VideoCodecFrame(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code system_frame_number}
     * @return The value of the field {@code system_frame_number}
     */
    public int getSystemFrameNumber() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code system_frame_number}
     * @param systemFrameNumber The new value of the field {@code system_frame_number}
     */
    public void setSystemFrameNumber(int systemFrameNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
    }
    
    /**
     * Get the value of the field {@code dts}
     * @return The value of the field {@code dts}
     */
    public org.gstreamer.gst.ClockTime getDts() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code dts}
     * @param dts The new value of the field {@code dts}
     */
    public void setDts(org.gstreamer.gst.ClockTime dts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dts == null ? MemoryAddress.NULL : dts.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code pts}
     * @return The value of the field {@code pts}
     */
    public org.gstreamer.gst.ClockTime getPts() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code pts}
     * @param pts The new value of the field {@code pts}
     */
    public void setPts(org.gstreamer.gst.ClockTime pts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public org.gstreamer.gst.ClockTime getDuration() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void setDuration(org.gstreamer.gst.ClockTime duration) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("duration"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (duration == null ? MemoryAddress.NULL : duration.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code distance_from_sync}
     * @return The value of the field {@code distance_from_sync}
     */
    public int getDistanceFromSync() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("distance_from_sync"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code distance_from_sync}
     * @param distanceFromSync The new value of the field {@code distance_from_sync}
     */
    public void setDistanceFromSync(int distanceFromSync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("distance_from_sync"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), distanceFromSync);
    }
    
    /**
     * Get the value of the field {@code input_buffer}
     * @return The value of the field {@code input_buffer}
     */
    public org.gstreamer.gst.Buffer getInputBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code input_buffer}
     * @param inputBuffer The new value of the field {@code input_buffer}
     */
    public void setInputBuffer(org.gstreamer.gst.Buffer inputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("input_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (inputBuffer == null ? MemoryAddress.NULL : inputBuffer.handle()));
    }
    
    /**
     * Get the value of the field {@code output_buffer}
     * @return The value of the field {@code output_buffer}
     */
    public org.gstreamer.gst.Buffer getOutputBuffer() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("output_buffer"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code output_buffer}
     * @param outputBuffer The new value of the field {@code output_buffer}
     */
    public void setOutputBuffer(org.gstreamer.gst.Buffer outputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("output_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outputBuffer == null ? MemoryAddress.NULL : outputBuffer.handle()));
    }
    
    /**
     * Get the value of the field {@code deadline}
     * @return The value of the field {@code deadline}
     */
    public org.gstreamer.gst.ClockTime getDeadline() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deadline"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code deadline}
     * @param deadline The new value of the field {@code deadline}
     */
    public void setDeadline(org.gstreamer.gst.ClockTime deadline) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("deadline"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deadline == null ? MemoryAddress.NULL : deadline.getValue().longValue()));
    }
    
    /**
     * Create a VideoCodecFrame proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoCodecFrame(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoCodecFrame> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoCodecFrame(input, ownership);
    
    /**
     * Gets private data set on the frame by the subclass via
     * gst_video_codec_frame_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_codec_frame_get_user_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Increases the refcount of the given frame by one.
     * @return {@code buf}
     */
    public org.gstreamer.video.VideoCodecFrame ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_codec_frame_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets {@code user_data} on the frame and the {@link org.gtk.glib.DestroyNotify} that will be called when
     * the frame is freed. Allows to attach private data by the subclass to frames.
     * <p>
     * If a {@code user_data} was previously set, then the previous set {@code notify} will be called
     * before the {@code user_data} is replaced.
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void setUserData(org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_video_codec_frame_set_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the refcount of the frame. If the refcount reaches 0, the frame
     * will be freed.
     */
    public void unref() {
        try {
            DowncallHandles.gst_video_codec_frame_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_codec_frame_get_user_data = Interop.downcallHandle(
            "gst_video_codec_frame_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_codec_frame_ref = Interop.downcallHandle(
            "gst_video_codec_frame_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_codec_frame_set_user_data = Interop.downcallHandle(
            "gst_video_codec_frame_set_user_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_codec_frame_unref = Interop.downcallHandle(
            "gst_video_codec_frame_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VideoCodecFrame.Builder} object constructs a {@link VideoCodecFrame} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoCodecFrame.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoCodecFrame struct;
        
        private Builder() {
            struct = VideoCodecFrame.allocate();
        }
        
         /**
         * Finish building the {@link VideoCodecFrame} struct.
         * @return A new instance of {@code VideoCodecFrame} with the fields 
         *         that were set in the Builder object.
         */
        public VideoCodecFrame build() {
            return struct;
        }
        
        public Builder setRefCount(int refCount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), refCount);
            return this;
        }
        
        public Builder setFlags(int flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        /**
         * Unique identifier for the frame. Use this if you need
         *       to get hold of the frame later (like when data is being decoded).
         *       Typical usage in decoders is to set this on the opaque value provided
         *       to the library and get back the frame using gst_video_decoder_get_frame()
         * @param systemFrameNumber The value for the {@code systemFrameNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSystemFrameNumber(int systemFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
            return this;
        }
        
        public Builder setDecodeFrameNumber(int decodeFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decode_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), decodeFrameNumber);
            return this;
        }
        
        public Builder setPresentationFrameNumber(int presentationFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("presentation_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), presentationFrameNumber);
            return this;
        }
        
        /**
         * Decoding timestamp
         * @param dts The value for the {@code dts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDts(org.gstreamer.gst.ClockTime dts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dts == null ? MemoryAddress.NULL : dts.getValue().longValue()));
            return this;
        }
        
        /**
         * Presentation timestamp
         * @param pts The value for the {@code pts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPts(org.gstreamer.gst.ClockTime pts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
            return this;
        }
        
        /**
         * Duration of the frame
         * @param duration The value for the {@code duration} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDuration(org.gstreamer.gst.ClockTime duration) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (duration == null ? MemoryAddress.NULL : duration.getValue().longValue()));
            return this;
        }
        
        /**
         * Distance in frames from the last synchronization point.
         * @param distanceFromSync The value for the {@code distanceFromSync} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDistanceFromSync(int distanceFromSync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("distance_from_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), distanceFromSync);
            return this;
        }
        
        /**
         * the input {@link org.gstreamer.gst.Buffer} that created this frame. The buffer is owned
         *           by the frame and references to the frame instead of the buffer should
         *           be kept.
         * @param inputBuffer The value for the {@code inputBuffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputBuffer(org.gstreamer.gst.Buffer inputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("input_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (inputBuffer == null ? MemoryAddress.NULL : inputBuffer.handle()));
            return this;
        }
        
        /**
         * the output {@link org.gstreamer.gst.Buffer}. Implementations should set this either
         *           directly, or by using the
         *           gst_video_decoder_allocate_output_frame() or
         *           gst_video_decoder_allocate_output_buffer() methods. The buffer is
         *           owned by the frame and references to the frame instead of the
         *           buffer should be kept.
         * @param outputBuffer The value for the {@code outputBuffer} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOutputBuffer(org.gstreamer.gst.Buffer outputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (outputBuffer == null ? MemoryAddress.NULL : outputBuffer.handle()));
            return this;
        }
        
        /**
         * Running time when the frame will be used.
         * @param deadline The value for the {@code deadline} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDeadline(org.gstreamer.gst.ClockTime deadline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deadline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deadline == null ? MemoryAddress.NULL : deadline.getValue().longValue()));
            return this;
        }
        
        public Builder setEvents(org.gtk.glib.List events) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("events"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (events == null ? MemoryAddress.NULL : events.handle()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setUserDataDestroyNotify(org.gtk.glib.DestroyNotify userDataDestroyNotify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data_destroy_notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userDataDestroyNotify == null ? MemoryAddress.NULL : (Addressable) userDataDestroyNotify.toCallback()));
            return this;
        }
    }
}
