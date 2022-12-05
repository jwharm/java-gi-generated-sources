package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanFormatInfo extends Struct {
    
    static {
        GstVulkan.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFormatInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.vulkan.Format.getMemoryLayout().withName("format"),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.C_INT.withName("scaling"),
        Interop.valueLayout.C_INT.withName("flags"),
        Interop.valueLayout.C_INT.withName("bits"),
        Interop.valueLayout.C_INT.withName("n_components"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("shift"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("depth"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("pixel_stride"),
        Interop.valueLayout.C_INT.withName("n_planes"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("plane"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("poffset"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("w_sub"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("h_sub")
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
     * Allocate a new {@link VulkanFormatInfo}
     * @return A new, uninitialized @{link VulkanFormatInfo}
     */
    public static VulkanFormatInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VulkanFormatInfo newInstance = new VulkanFormatInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code format}
     * @return The value of the field {@code format}
     */
    public org.vulkan.Format format$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("format"));
        return new org.vulkan.Format(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Get the value of the field {@code scaling}
     * @return The value of the field {@code scaling}
     */
    public org.gstreamer.vulkan.VulkanFormatScaling scaling$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scaling"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanFormatScaling.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code scaling}
     * @param scaling The new value of the field {@code scaling}
     */
    public void scaling$set(org.gstreamer.vulkan.VulkanFormatScaling scaling) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scaling"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scaling.getValue());
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.vulkan.VulkanFormatFlags flags$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanFormatFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void flags$set(org.gstreamer.vulkan.VulkanFormatFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags.getValue());
    }
    
    /**
     * Get the value of the field {@code bits}
     * @return The value of the field {@code bits}
     */
    public int bits$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bits}
     * @param bits The new value of the field {@code bits}
     */
    public void bits$set(int bits) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
    }
    
    /**
     * Get the value of the field {@code n_components}
     * @return The value of the field {@code n_components}
     */
    public int nComponents$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_components}
     * @param nComponents The new value of the field {@code n_components}
     */
    public void nComponents$set(int nComponents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
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
     * Create a VulkanFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VulkanFormatInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VulkanFormatInfo struct;
        
         /**
         * A {@link VulkanFormatInfo.Build} object constructs a {@link VulkanFormatInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VulkanFormatInfo.allocate();
        }
        
         /**
         * Finish building the {@link VulkanFormatInfo} struct.
         * @return A new instance of {@code VulkanFormatInfo} with the fields 
         *         that were set in the Build object.
         */
        public VulkanFormatInfo construct() {
            return struct;
        }
        
        /**
         * the Vulkan format being described
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFormat(org.vulkan.Format format) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.handle()));
            return this;
        }
        
        /**
         * name of this format
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * how raw data is interpreted and scaled
         * @param scaling The value for the {@code scaling} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScaling(org.gstreamer.vulkan.VulkanFormatScaling scaling) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scaling"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (scaling == null ? MemoryAddress.NULL : scaling.getValue()));
            return this;
        }
        
        /**
         * flags that apply to this format
         * @param flags The value for the {@code flags} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gstreamer.vulkan.VulkanFormatFlags flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
            return this;
        }
        
        /**
         * The number of bits used to pack data items. This can be less than
         *        8 when multiple pixels are stored in a byte. for values &gt; 8 multiple
         *        bytes should be read according to the endianness flag before
         *        applying the shift and mask.
         * {@code n_components}; number of components in this format
         * @param bits The value for the {@code bits} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBits(int bits) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
            return this;
        }
        
        public Build setNComponents(int nComponents) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
            return this;
        }
        
        /**
         * the number of bits to shift away to get the component data
         * @param shift The value for the {@code shift} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShift(byte[] shift) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shift"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false)));
            return this;
        }
        
        /**
         * the depth in bits for each component
         * @param depth The value for the {@code depth} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDepth(byte[] depth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false)));
            return this;
        }
        
        public Build setPixelStride(byte[] pixelStride) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false)));
            return this;
        }
        
        /**
         * the number of planes for this format. The number of planes can
         *            be less than the amount of components when multiple components
         *            are packed into one plane.
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
         * the plane number where a component can be found
         * @param plane The value for the {@code plane} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPlane(byte[] plane) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("plane"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false)));
            return this;
        }
        
        /**
         * the offset in the plane where the first pixel of the components
         *           can be found.
         * @param poffset The value for the {@code poffset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPoffset(byte[] poffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false)));
            return this;
        }
        
        /**
         * subsampling factor of the width for the component.
         *         Use GST_VIDEO_SUB_SCALE to scale a width.
         * @param wSub The value for the {@code wSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWSub(byte[] wSub) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false)));
            return this;
        }
        
        /**
         * subsampling factor of the height for the component.
         *         Use GST_VIDEO_SUB_SCALE to scale a height.
         * @param hSub The value for the {@code hSub} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHSub(byte[] hSub) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false)));
            return this;
        }
    }
}
