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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("hours"),
        Interop.valueLayout.C_INT.withName("minutes"),
        Interop.valueLayout.C_INT.withName("seconds"),
        Interop.valueLayout.C_INT.withName("frames")
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
     * Allocate a new {@link VideoTimeCodeInterval}
     * @return A new, uninitialized @{link VideoTimeCodeInterval}
     */
    public static VideoTimeCodeInterval allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoTimeCodeInterval newInstance = new VideoTimeCodeInterval(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code hours}
     * @return The value of the field {@code hours}
     */
    public int hours$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hours"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code hours}
     * @param hours The new value of the field {@code hours}
     */
    public void hours$set(int hours) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("hours"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), hours);
    }
    
    /**
     * Get the value of the field {@code minutes}
     * @return The value of the field {@code minutes}
     */
    public int minutes$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code minutes}
     * @param minutes The new value of the field {@code minutes}
     */
    public void minutes$set(int minutes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), minutes);
    }
    
    /**
     * Get the value of the field {@code seconds}
     * @return The value of the field {@code seconds}
     */
    public int seconds$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code seconds}
     * @param seconds The new value of the field {@code seconds}
     */
    public void seconds$set(int seconds) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
    }
    
    /**
     * Get the value of the field {@code frames}
     * @return The value of the field {@code frames}
     */
    public int frames$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frames}
     * @param frames The new value of the field {@code frames}
     */
    public void frames$set(int frames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frames"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
    }
    
    /**
     * Create a VideoTimeCodeInterval proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoTimeCodeInterval(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(int hours, int minutes, int seconds, int frames) {
        Addressable RESULT;
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
        super(constructNew(hours, minutes, seconds, frames), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String tcInterStr) {
        java.util.Objects.requireNonNull(tcInterStr, "Parameter 'tcInterStr' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_interval_new_from_string.invokeExact(
                    Interop.allocateNativeString(tcInterStr));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * {@code tc_inter_str} must only have ":" as separators.
     * @param tcInterStr The string that represents the {@link VideoTimeCodeInterval}
     * @return a new {@link VideoTimeCodeInterval} from the given string
     *   or {@code null} if the string could not be passed.
     */
    public static VideoTimeCodeInterval newFromString(@NotNull java.lang.String tcInterStr) {
        return new VideoTimeCodeInterval(constructNewFromString(tcInterStr), Ownership.FULL);
    }
    
    /**
     * Initializes {@code tc} with empty/zero/NULL values.
     */
    public void clear() {
        try {
            DowncallHandles.gst_video_time_code_interval_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public @NotNull org.gstreamer.video.VideoTimeCodeInterval copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_time_code_interval_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.video.VideoTimeCodeInterval(RESULT, Ownership.FULL);
    }
    
    /**
     * Frees {@code tc}.
     */
    public void free() {
        try {
            DowncallHandles.gst_video_time_code_interval_free.invokeExact(
                    handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoTimeCodeInterval struct;
        
         /**
         * A {@link VideoTimeCodeInterval.Build} object constructs a {@link VideoTimeCodeInterval} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoTimeCodeInterval.allocate();
        }
        
         /**
         * Finish building the {@link VideoTimeCodeInterval} struct.
         * @return A new instance of {@code VideoTimeCodeInterval} with the fields 
         *         that were set in the Build object.
         */
        public VideoTimeCodeInterval construct() {
            return struct;
        }
        
        /**
         * the hours field of {@link VideoTimeCodeInterval}
         * @param hours The value for the {@code hours} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHours(int hours) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hours"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), hours);
            return this;
        }
        
        /**
         * the minutes field of {@link VideoTimeCodeInterval}
         * @param minutes The value for the {@code minutes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinutes(int minutes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("minutes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), minutes);
            return this;
        }
        
        /**
         * the seconds field of {@link VideoTimeCodeInterval}
         * @param seconds The value for the {@code seconds} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeconds(int seconds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seconds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), seconds);
            return this;
        }
        
        /**
         * the frames field of {@link VideoTimeCodeInterval}
         * @param frames The value for the {@code frames} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFrames(int frames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frames);
            return this;
        }
    }
}
