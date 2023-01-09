package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A representation of a difference between two {@link VideoTimeCode} instances.
 * Will not necessarily correspond to a real timecode (e.g. 00:00:10;00)
 * @version 1.12
 */
public class VideoTimeCodeInterval extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTimeCodeInterval";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("hours"),
            Interop.valueLayout.C_INT.withName("minutes"),
            Interop.valueLayout.C_INT.withName("seconds"),
            Interop.valueLayout.C_INT.withName("frames")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoTimeCodeInterval}
     * @return A new, uninitialized @{link VideoTimeCodeInterval}
     */
    public static VideoTimeCodeInterval allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoTimeCodeInterval newInstance = new VideoTimeCodeInterval(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code hours}
     * @return The value of the field {@code hours}
     */
    public int getHours() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hours"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code hours}
     * @param hours The new value of the field {@code hours}
     */
    public void setHours(int hours) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hours"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), hours);
        }
    }
    
    /**
     * Get the value of the field {@code minutes}
     * @return The value of the field {@code minutes}
     */
    public int getMinutes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code minutes}
     * @param minutes The new value of the field {@code minutes}
     */
    public void setMinutes(int minutes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), minutes);
        }
    }
    
    /**
     * Get the value of the field {@code seconds}
     * @return The value of the field {@code seconds}
     */
    public int getSeconds() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code seconds}
     * @param seconds The new value of the field {@code seconds}
     */
    public void setSeconds(int seconds) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), seconds);
        }
    }
    
    /**
     * Get the value of the field {@code frames}
     * @return The value of the field {@code frames}
     */
    public int getFrames() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code frames}
     * @param frames The new value of the field {@code frames}
     */
    public void setFrames(int frames) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), frames);
        }
    }
    
    /**
     * Create a VideoTimeCodeInterval proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoTimeCodeInterval(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoTimeCodeInterval> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoTimeCodeInterval(input);
    
    private static MemoryAddress constructNew(int hours, int minutes, int seconds, int frames) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_interval_new.invokeExact(
                    hours,
                    minutes,
                    seconds,
                    frames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public VideoTimeCodeInterval(int hours, int minutes, int seconds, int frames) {
        super(constructNew(hours, minutes, seconds, frames));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewFromString(java.lang.String tcInterStr) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_interval_new_from_string.invokeExact(Marshal.stringToAddress.marshal(tcInterStr, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * {@code tc_inter_str} must only have ":" as separators.
     * @param tcInterStr The string that represents the {@link VideoTimeCodeInterval}
     * @return a new {@link VideoTimeCodeInterval} from the given string
     *   or {@code null} if the string could not be passed.
     */
    public static VideoTimeCodeInterval newFromString(java.lang.String tcInterStr) {
        var RESULT = constructNewFromString(tcInterStr);
        var OBJECT = org.gstreamer.video.VideoTimeCodeInterval.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Initializes {@code tc} with empty/zero/NULL values.
     */
    public void clear() {
        try {
            DowncallHandles.gst_video_time_code_interval_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public org.gstreamer.video.VideoTimeCodeInterval copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_interval_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.video.VideoTimeCodeInterval.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Frees {@code tc}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_time_code_interval_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code tc} with the given values.
     * @param hours the hours field of {@link VideoTimeCodeInterval}
     * @param minutes the minutes field of {@link VideoTimeCodeInterval}
     * @param seconds the seconds field of {@link VideoTimeCodeInterval}
     * @param frames the frames field of {@link VideoTimeCodeInterval}
     */
    public void init(int hours, int minutes, int seconds, int frames) {
        try {
            DowncallHandles.gst_video_time_code_interval_init.invokeExact(
                    handle(),
                    hours,
                    minutes,
                    seconds,
                    frames);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_time_code_interval_new = Interop.downcallHandle(
                "gst_video_time_code_interval_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_video_time_code_interval_new_from_string = Interop.downcallHandle(
                "gst_video_time_code_interval_new_from_string",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_time_code_interval_clear = Interop.downcallHandle(
                "gst_video_time_code_interval_clear",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_time_code_interval_copy = Interop.downcallHandle(
                "gst_video_time_code_interval_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_time_code_interval_free = Interop.downcallHandle(
                "gst_video_time_code_interval_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_time_code_interval_init = Interop.downcallHandle(
                "gst_video_time_code_interval_init",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link VideoTimeCodeInterval.Builder} object constructs a {@link VideoTimeCodeInterval} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoTimeCodeInterval.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoTimeCodeInterval struct;
        
        private Builder() {
            struct = VideoTimeCodeInterval.allocate();
        }
        
        /**
         * Finish building the {@link VideoTimeCodeInterval} struct.
         * @return A new instance of {@code VideoTimeCodeInterval} with the fields 
         *         that were set in the Builder object.
         */
        public VideoTimeCodeInterval build() {
            return struct;
        }
        
        /**
         * the hours field of {@link VideoTimeCodeInterval}
         * @param hours The value for the {@code hours} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHours(int hours) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("hours"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), hours);
                return this;
            }
        }
        
        /**
         * the minutes field of {@link VideoTimeCodeInterval}
         * @param minutes The value for the {@code minutes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinutes(int minutes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), minutes);
                return this;
            }
        }
        
        /**
         * the seconds field of {@link VideoTimeCodeInterval}
         * @param seconds The value for the {@code seconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSeconds(int seconds) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), seconds);
                return this;
            }
        }
        
        /**
         * the frames field of {@link VideoTimeCodeInterval}
         * @param frames The value for the {@code frames} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrames(int frames) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), frames);
                return this;
            }
        }
    }
}
