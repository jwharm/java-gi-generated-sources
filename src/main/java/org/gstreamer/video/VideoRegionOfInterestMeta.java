package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata describing an image region of interest
 */
public class VideoRegionOfInterestMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoRegionOfInterestMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_INT.withName("roi_type"),
            Interop.valueLayout.C_INT.withName("id"),
            Interop.valueLayout.C_INT.withName("parent_id"),
            Interop.valueLayout.C_INT.withName("x"),
            Interop.valueLayout.C_INT.withName("y"),
            Interop.valueLayout.C_INT.withName("w"),
            Interop.valueLayout.C_INT.withName("h"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("params")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoRegionOfInterestMeta}
     * @return A new, uninitialized @{link VideoRegionOfInterestMeta}
     */
    public static VideoRegionOfInterestMeta allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoRegionOfInterestMeta newInstance = new VideoRegionOfInterestMeta(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code roi_type}
     * @return The value of the field {@code roi_type}
     */
    public org.gtk.glib.Quark getRoiType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Quark(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code roi_type}
     * @param roiType The new value of the field {@code roi_type}
     */
    public void setRoiType(org.gtk.glib.Quark roiType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (roiType == null ? MemoryAddress.NULL : roiType.getValue().intValue()));
        }
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int getId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void setId(int id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), id);
        }
    }
    
    /**
     * Get the value of the field {@code parent_id}
     * @return The value of the field {@code parent_id}
     */
    public int getParentId() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code parent_id}
     * @param parentId The new value of the field {@code parent_id}
     */
    public void setParentId(int parentId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), parentId);
        }
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public int getX() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void setX(int x) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), x);
        }
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public int getY() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void setY(int y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), y);
        }
    }
    
    /**
     * Get the value of the field {@code w}
     * @return The value of the field {@code w}
     */
    public int getW() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code w}
     * @param w The new value of the field {@code w}
     */
    public void setW(int w) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), w);
        }
    }
    
    /**
     * Get the value of the field {@code h}
     * @return The value of the field {@code h}
     */
    public int getH() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code h}
     * @param h The new value of the field {@code h}
     */
    public void setH(int h) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), h);
        }
    }
    
    /**
     * Get the value of the field {@code params}
     * @return The value of the field {@code params}
     */
    public org.gtk.glib.List getParams() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("params"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code params}
     * @param params The new value of the field {@code params}
     */
    public void setParams(org.gtk.glib.List params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("params"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        }
    }
    
    /**
     * Create a VideoRegionOfInterestMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoRegionOfInterestMeta(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoRegionOfInterestMeta> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoRegionOfInterestMeta(input);
    
    /**
     * Attach element-specific parameters to {@code meta} meant to be used by downstream
     * elements which may handle this ROI.
     * The name of {@code s} is used to identify the element these parameters are meant for.
     * <p>
     * This is typically used to tell encoders how they should encode this specific region.
     * For example, a structure named "roi/x264enc" could be used to give the
     * QP offsets this encoder should use when encoding the region described in {@code meta}.
     * Multiple parameters can be defined for the same meta so different encoders
     * can be supported by cross platform applications).
     * @param s a {@link org.gstreamer.gst.Structure}
     */
    public void addParam(org.gstreamer.gst.Structure s) {
        try {
            DowncallHandles.gst_video_region_of_interest_meta_add_param.invokeExact(
                    handle(),
                    s.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        s.yieldOwnership();
    }
    
    /**
     * Retrieve the parameter for {@code meta} having {@code name} as structure name,
     * or {@code null} if there is none.
     * @param name a name.
     * @return a {@link org.gstreamer.gst.Structure}
     */
    public @Nullable org.gstreamer.gst.Structure getParam(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_video_region_of_interest_meta_get_param.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
        }
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_region_of_interest_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_region_of_interest_meta_add_param = Interop.downcallHandle(
                "gst_video_region_of_interest_meta_add_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_region_of_interest_meta_get_param = Interop.downcallHandle(
                "gst_video_region_of_interest_meta_get_param",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_video_region_of_interest_meta_get_info = Interop.downcallHandle(
                "gst_video_region_of_interest_meta_get_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VideoRegionOfInterestMeta.Builder} object constructs a {@link VideoRegionOfInterestMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoRegionOfInterestMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoRegionOfInterestMeta struct;
        
        private Builder() {
            struct = VideoRegionOfInterestMeta.allocate();
        }
        
        /**
         * Finish building the {@link VideoRegionOfInterestMeta} struct.
         * @return A new instance of {@code VideoRegionOfInterestMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoRegionOfInterestMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
                return this;
            }
        }
        
        /**
         * GQuark describing the semantic of the Roi (f.i. a face, a pedestrian)
         * @param roiType The value for the {@code roiType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRoiType(org.gtk.glib.Quark roiType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (roiType == null ? MemoryAddress.NULL : roiType.getValue().intValue()));
                return this;
            }
        }
        
        /**
         * identifier of this particular ROI
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setId(int id) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), id);
                return this;
            }
        }
        
        /**
         * identifier of its parent ROI, used f.i. for ROI hierarchisation.
         * @param parentId The value for the {@code parentId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentId(int parentId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), parentId);
                return this;
            }
        }
        
        /**
         * x component of upper-left corner
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setX(int x) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("x"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), x);
                return this;
            }
        }
        
        /**
         * y component of upper-left corner
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setY(int y) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("y"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), y);
                return this;
            }
        }
        
        /**
         * bounding box width
         * @param w The value for the {@code w} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setW(int w) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("w"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), w);
                return this;
            }
        }
        
        /**
         * bounding box height
         * @param h The value for the {@code h} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setH(int h) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("h"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), h);
                return this;
            }
        }
        
        /**
         * list of {@link org.gstreamer.gst.Structure} containing element-specific params for downstream,
         *          see gst_video_region_of_interest_meta_add_param(). (Since: 1.14)
         * @param params The value for the {@code params} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParams(org.gtk.glib.List params) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("params"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
                return this;
            }
        }
    }
}
