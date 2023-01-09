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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoColorPrimariesInfo}
     * @return A new, uninitialized @{link VideoColorPrimariesInfo}
     */
    public static VideoColorPrimariesInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoColorPrimariesInfo newInstance = new VideoColorPrimariesInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code primaries}
     * @return The value of the field {@code primaries}
     */
    public org.gstreamer.video.VideoColorPrimaries getPrimaries() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.video.VideoColorPrimaries.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code primaries}
     * @param primaries The new value of the field {@code primaries}
     */
    public void setPrimaries(org.gstreamer.video.VideoColorPrimaries primaries) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (primaries == null ? MemoryAddress.NULL : primaries.getValue()));
        }
    }
    
    /**
     * Get the value of the field {@code Wx}
     * @return The value of the field {@code Wx}
     */
    public double getWx() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Wx}
     * @param Wx The new value of the field {@code Wx}
     */
    public void setWx(double Wx) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Wx);
        }
    }
    
    /**
     * Get the value of the field {@code Wy}
     * @return The value of the field {@code Wy}
     */
    public double getWy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Wy}
     * @param Wy The new value of the field {@code Wy}
     */
    public void setWy(double Wy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Wy);
        }
    }
    
    /**
     * Get the value of the field {@code Rx}
     * @return The value of the field {@code Rx}
     */
    public double getRx() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Rx}
     * @param Rx The new value of the field {@code Rx}
     */
    public void setRx(double Rx) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Rx);
        }
    }
    
    /**
     * Get the value of the field {@code Ry}
     * @return The value of the field {@code Ry}
     */
    public double getRy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Ry}
     * @param Ry The new value of the field {@code Ry}
     */
    public void setRy(double Ry) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Ry);
        }
    }
    
    /**
     * Get the value of the field {@code Gx}
     * @return The value of the field {@code Gx}
     */
    public double getGx() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Gx}
     * @param Gx The new value of the field {@code Gx}
     */
    public void setGx(double Gx) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Gx);
        }
    }
    
    /**
     * Get the value of the field {@code Gy}
     * @return The value of the field {@code Gy}
     */
    public double getGy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Gy}
     * @param Gy The new value of the field {@code Gy}
     */
    public void setGy(double Gy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Gy);
        }
    }
    
    /**
     * Get the value of the field {@code Bx}
     * @return The value of the field {@code Bx}
     */
    public double getBx() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code Bx}
     * @param Bx The new value of the field {@code Bx}
     */
    public void setBx(double Bx) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Bx);
        }
    }
    
    /**
     * Get the value of the field {@code By}
     * @return The value of the field {@code By}
     */
    public double getBy() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (double) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("By"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code By}
     * @param By The new value of the field {@code By}
     */
    public void setBy(double By) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("By"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), By);
        }
    }
    
    /**
     * Create a VideoColorPrimariesInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoColorPrimariesInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoColorPrimariesInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoColorPrimariesInfo(input);
    
    /**
     * A {@link VideoColorPrimariesInfo.Builder} object constructs a {@link VideoColorPrimariesInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoColorPrimariesInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoColorPrimariesInfo struct;
        
        private Builder() {
            struct = VideoColorPrimariesInfo.allocate();
        }
        
        /**
         * Finish building the {@link VideoColorPrimariesInfo} struct.
         * @return A new instance of {@code VideoColorPrimariesInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VideoColorPrimariesInfo build() {
            return struct;
        }
        
        /**
         * a {@link VideoColorPrimaries}
         * @param primaries The value for the {@code primaries} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPrimaries(org.gstreamer.video.VideoColorPrimaries primaries) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("primaries"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (primaries == null ? MemoryAddress.NULL : primaries.getValue()));
                return this;
            }
        }
        
        /**
         * reference white x coordinate
         * @param Wx The value for the {@code Wx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWx(double Wx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Wx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Wx);
                return this;
            }
        }
        
        /**
         * reference white y coordinate
         * @param Wy The value for the {@code Wy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWy(double Wy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Wy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Wy);
                return this;
            }
        }
        
        /**
         * red x coordinate
         * @param Rx The value for the {@code Rx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRx(double Rx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Rx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Rx);
                return this;
            }
        }
        
        /**
         * red y coordinate
         * @param Ry The value for the {@code Ry} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRy(double Ry) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Ry"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Ry);
                return this;
            }
        }
        
        /**
         * green x coordinate
         * @param Gx The value for the {@code Gx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGx(double Gx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Gx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Gx);
                return this;
            }
        }
        
        /**
         * green y coordinate
         * @param Gy The value for the {@code Gy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGy(double Gy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Gy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Gy);
                return this;
            }
        }
        
        /**
         * blue x coordinate
         * @param Bx The value for the {@code Bx} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBx(double Bx) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("Bx"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Bx);
                return this;
            }
        }
        
        /**
         * blue y coordinate
         * @param By The value for the {@code By} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBy(double By) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("By"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), By);
                return this;
            }
        }
    }
}
