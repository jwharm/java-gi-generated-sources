package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Supported frame rates: 30000/1001, 60000/1001 (both with and without drop
 * frame), and integer frame rates e.g. 25/1, 30/1, 50/1, 60/1.
 * <p>
 * The configuration of the time code.
 * @version 1.10
 */
public class VideoTimeCodeConfig extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoTimeCodeConfig";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("fps_n"),
        Interop.valueLayout.C_INT.withName("fps_d"),
        Interop.valueLayout.C_INT.withName("flags"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("latest_daily_jam")
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
     * Allocate a new {@link VideoTimeCodeConfig}
     * @return A new, uninitialized @{link VideoTimeCodeConfig}
     */
    public static VideoTimeCodeConfig allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoTimeCodeConfig newInstance = new VideoTimeCodeConfig(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code fps_n}
     * @return The value of the field {@code fps_n}
     */
    public int fpsN$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fps_n}
     * @param fpsN The new value of the field {@code fps_n}
     */
    public void fpsN$set(int fpsN) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsN);
    }
    
    /**
     * Get the value of the field {@code fps_d}
     * @return The value of the field {@code fps_d}
     */
    public int fpsD$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code fps_d}
     * @param fpsD The new value of the field {@code fps_d}
     */
    public void fpsD$set(int fpsD) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsD);
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.video.VideoTimeCodeFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.video.VideoTimeCodeFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.video.VideoTimeCodeFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code latest_daily_jam}
     * @return The value of the field {@code latest_daily_jam}
     */
    public org.gtk.glib.DateTime latestDailyJam$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("latest_daily_jam"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.DateTime(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code latest_daily_jam}
     * @param latestDailyJam The new value of the field {@code latest_daily_jam}
     */
    public void latestDailyJam$set(org.gtk.glib.DateTime latestDailyJam) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("latest_daily_jam"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), latestDailyJam.handle());
    }
    
    /**
     * Create a VideoTimeCodeConfig proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoTimeCodeConfig(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoTimeCodeConfig struct;
        
         /**
         * A {@link VideoTimeCodeConfig.Build} object constructs a {@link VideoTimeCodeConfig} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoTimeCodeConfig.allocate();
        }
        
         /**
         * Finish building the {@link VideoTimeCodeConfig} struct.
         * @return A new instance of {@code VideoTimeCodeConfig} with the fields 
         *         that were set in the Build object.
         */
        public VideoTimeCodeConfig construct() {
            return struct;
        }
        
        /**
         * Numerator of the frame rate
         * @param fpsN The value for the {@code fpsN} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFpsN(int fpsN) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_n"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsN);
            return this;
        }
        
        /**
         * Denominator of the frame rate
         * @param fpsD The value for the {@code fpsD} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFpsD(int fpsD) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fps_d"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), fpsD);
            return this;
        }
        
        /**
         * the corresponding {@link VideoTimeCodeFlags}
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.video.VideoTimeCodeFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * The latest daily jam information, if present, or NULL
         * @param latestDailyJam The value for the {@code latestDailyJam} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLatestDailyJam(org.gtk.glib.DateTime latestDailyJam) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("latest_daily_jam"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (latestDailyJam == null ? MemoryAddress.NULL : latestDailyJam.handle()));
            return this;
        }
    }
}
