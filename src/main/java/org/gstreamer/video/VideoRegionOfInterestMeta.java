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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
     * Allocate a new {@link VideoRegionOfInterestMeta}
     * @return A new, uninitialized @{link VideoRegionOfInterestMeta}
     */
    public static VideoRegionOfInterestMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoRegionOfInterestMeta newInstance = new VideoRegionOfInterestMeta(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code roi_type}
     * @return The value of the field {@code roi_type}
     */
    public org.gtk.glib.Quark roiType$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Change the value of the field {@code roi_type}
     * @param roiType The new value of the field {@code roi_type}
     */
    public void roiType$set(org.gtk.glib.Quark roiType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), roiType.getValue().intValue());
    }
    
    /**
     * Get the value of the field {@code id}
     * @return The value of the field {@code id}
     */
    public int id$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code id}
     * @param id The new value of the field {@code id}
     */
    public void id$set(int id) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
    }
    
    /**
     * Get the value of the field {@code parent_id}
     * @return The value of the field {@code parent_id}
     */
    public int parentId$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code parent_id}
     * @param parentId The new value of the field {@code parent_id}
     */
    public void parentId$set(int parentId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), parentId);
    }
    
    /**
     * Get the value of the field {@code x}
     * @return The value of the field {@code x}
     */
    public int x$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code x}
     * @param x The new value of the field {@code x}
     */
    public void x$set(int x) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("x"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
    }
    
    /**
     * Get the value of the field {@code y}
     * @return The value of the field {@code y}
     */
    public int y$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code y}
     * @param y The new value of the field {@code y}
     */
    public void y$set(int y) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("y"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
    }
    
    /**
     * Get the value of the field {@code w}
     * @return The value of the field {@code w}
     */
    public int w$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code w}
     * @param w The new value of the field {@code w}
     */
    public void w$set(int w) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
    }
    
    /**
     * Get the value of the field {@code h}
     * @return The value of the field {@code h}
     */
    public int h$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code h}
     * @param h The new value of the field {@code h}
     */
    public void h$set(int h) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), h);
    }
    
    /**
     * Get the value of the field {@code params}
     * @return The value of the field {@code params}
     */
    public org.gtk.glib.List params$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.List(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code params}
     * @param params The new value of the field {@code params}
     */
    public void params$set(org.gtk.glib.List params) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), params.handle());
    }
    
    /**
     * Create a VideoRegionOfInterestMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoRegionOfInterestMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
    public void addParam(@NotNull org.gstreamer.gst.Structure s) {
        java.util.Objects.requireNonNull(s, "Parameter 's' must not be null");
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
    public @Nullable org.gstreamer.gst.Structure getParam(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_region_of_interest_meta_get_param.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.NONE);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_region_of_interest_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoRegionOfInterestMeta struct;
        
         /**
         * A {@link VideoRegionOfInterestMeta.Build} object constructs a {@link VideoRegionOfInterestMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoRegionOfInterestMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoRegionOfInterestMeta} struct.
         * @return A new instance of {@code VideoRegionOfInterestMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoRegionOfInterestMeta construct() {
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
         * GQuark describing the semantic of the Roi (f.i. a face, a pedestrian)
         * @param roiType The value for the {@code roiType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRoiType(org.gtk.glib.Quark roiType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("roi_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (roiType == null ? MemoryAddress.NULL : roiType.getValue().intValue()));
            return this;
        }
        
        /**
         * identifier of this particular ROI
         * @param id The value for the {@code id} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setId(int id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), id);
            return this;
        }
        
        /**
         * identifier of its parent ROI, used f.i. for ROI hierarchisation.
         * @param parentId The value for the {@code parentId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentId(int parentId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), parentId);
            return this;
        }
        
        /**
         * x component of upper-left corner
         * @param x The value for the {@code x} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setX(int x) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("x"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), x);
            return this;
        }
        
        /**
         * y component of upper-left corner
         * @param y The value for the {@code y} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setY(int y) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("y"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), y);
            return this;
        }
        
        /**
         * bounding box width
         * @param w The value for the {@code w} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setW(int w) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), w);
            return this;
        }
        
        /**
         * bounding box height
         * @param h The value for the {@code h} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setH(int h) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), h);
            return this;
        }
        
        /**
         * list of {@link org.gstreamer.gst.Structure} containing element-specific params for downstream,
         *          see gst_video_region_of_interest_meta_add_param(). (Since: 1.14)
         * @param params The value for the {@code params} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParams(org.gtk.glib.List params) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            return this;
        }
    }
}
