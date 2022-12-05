package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Structure describing the chromaticity coordinates of an RGB system. These
 * values can be used to construct a matrix to transform RGB to and from the
 * XYZ colorspace.
 * @version 1.6
 */
public class VideoColorPrimariesInfo extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoColorPrimariesInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("primaries"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.C_DOUBLE.withName("Wx"),
        Interop.valueLayout.C_DOUBLE.withName("Wy"),
        Interop.valueLayout.C_DOUBLE.withName("Rx"),
        Interop.valueLayout.C_DOUBLE.withName("Ry"),
        Interop.valueLayout.C_DOUBLE.withName("Gx"),
        Interop.valueLayout.C_DOUBLE.withName("Gy"),
        Interop.valueLayout.C_DOUBLE.withName("Bx"),
        Interop.valueLayout.C_DOUBLE.withName("By")
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
     * Allocate a new {@link VideoColorPrimariesInfo}
     * @return A new, uninitialized @{link VideoColorPrimariesInfo}
     */
    public static VideoColorPrimariesInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoColorPrimariesInfo newInstance = new VideoColorPrimariesInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code primaries}
     * @return The value of the field {@code primaries}
     */
    public org.gstreamer.video.VideoColorPrimaries primaries$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.video.VideoColorPrimaries.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code primaries}
     * @param primaries The new value of the field {@code primaries}
     */
    public void primaries$set(org.gstreamer.video.VideoColorPrimaries primaries) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), primaries.getValue());
    }
    
    /**
     * Get the value of the field {@code Wx}
     * @return The value of the field {@code Wx}
     */
    public double Wx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Wx}
     * @param Wx The new value of the field {@code Wx}
     */
    public void Wx$set(double Wx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Wx);
    }
    
    /**
     * Get the value of the field {@code Wy}
     * @return The value of the field {@code Wy}
     */
    public double Wy$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Wy}
     * @param Wy The new value of the field {@code Wy}
     */
    public void Wy$set(double Wy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Wy);
    }
    
    /**
     * Get the value of the field {@code Rx}
     * @return The value of the field {@code Rx}
     */
    public double Rx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Rx}
     * @param Rx The new value of the field {@code Rx}
     */
    public void Rx$set(double Rx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Rx);
    }
    
    /**
     * Get the value of the field {@code Ry}
     * @return The value of the field {@code Ry}
     */
    public double Ry$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Ry}
     * @param Ry The new value of the field {@code Ry}
     */
    public void Ry$set(double Ry) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Ry);
    }
    
    /**
     * Get the value of the field {@code Gx}
     * @return The value of the field {@code Gx}
     */
    public double Gx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Gx}
     * @param Gx The new value of the field {@code Gx}
     */
    public void Gx$set(double Gx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Gx);
    }
    
    /**
     * Get the value of the field {@code Gy}
     * @return The value of the field {@code Gy}
     */
    public double Gy$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Gy}
     * @param Gy The new value of the field {@code Gy}
     */
    public void Gy$set(double Gy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Gy);
    }
    
    /**
     * Get the value of the field {@code Bx}
     * @return The value of the field {@code Bx}
     */
    public double Bx$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code Bx}
     * @param Bx The new value of the field {@code Bx}
     */
    public void Bx$set(double Bx) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Bx);
    }
    
    /**
     * Get the value of the field {@code By}
     * @return The value of the field {@code By}
     */
    public double By$get() {
        var RESULT = (double) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("By"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code By}
     * @param By The new value of the field {@code By}
     */
    public void By$set(double By) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("By"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), By);
    }
    
    /**
     * Create a VideoColorPrimariesInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoColorPrimariesInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoColorPrimariesInfo struct;
        
         /**
         * A {@link VideoColorPrimariesInfo.Build} object constructs a {@link VideoColorPrimariesInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoColorPrimariesInfo.allocate();
        }
        
         /**
         * Finish building the {@link VideoColorPrimariesInfo} struct.
         * @return A new instance of {@code VideoColorPrimariesInfo} with the fields 
         *         that were set in the Build object.
         */
        public VideoColorPrimariesInfo construct() {
            return struct;
        }
        
        /**
         * a {@link VideoColorPrimaries}
         * @param primaries The value for the {@code primaries} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPrimaries(org.gstreamer.video.VideoColorPrimaries primaries) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (primaries == null ? MemoryAddress.NULL : primaries.getValue()));
            return this;
        }
        
        /**
         * reference white x coordinate
         * @param Wx The value for the {@code Wx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWx(double Wx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Wx);
            return this;
        }
        
        /**
         * reference white y coordinate
         * @param Wy The value for the {@code Wy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWy(double Wy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Wy);
            return this;
        }
        
        /**
         * red x coordinate
         * @param Rx The value for the {@code Rx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRx(double Rx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Rx);
            return this;
        }
        
        /**
         * red y coordinate
         * @param Ry The value for the {@code Ry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRy(double Ry) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Ry);
            return this;
        }
        
        /**
         * green x coordinate
         * @param Gx The value for the {@code Gx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGx(double Gx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Gx);
            return this;
        }
        
        /**
         * green y coordinate
         * @param Gy The value for the {@code Gy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGy(double Gy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Gy);
            return this;
        }
        
        /**
         * blue x coordinate
         * @param Bx The value for the {@code Bx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBx(double Bx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Bx);
            return this;
        }
        
        /**
         * blue y coordinate
         * @param By The value for the {@code By} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBy(double By) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("By"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), By);
            return this;
        }
    }
}
