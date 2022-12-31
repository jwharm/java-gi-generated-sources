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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.vulkan.Format getFormat() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("format"));
        return org.vulkan.Format.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code format}
     * @param format The new value of the field {@code format}
     */
    public void setFormat(org.vulkan.Format format) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (format == null ? MemoryAddress.NULL : format.handle()));
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
    }
    
    /**
     * Get the value of the field {@code scaling}
     * @return The value of the field {@code scaling}
     */
    public org.gstreamer.vulkan.VulkanFormatScaling getScaling() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scaling"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.vulkan.VulkanFormatScaling.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code scaling}
     * @param scaling The new value of the field {@code scaling}
     */
    public void setScaling(org.gstreamer.vulkan.VulkanFormatScaling scaling) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scaling"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (scaling == null ? MemoryAddress.NULL : scaling.getValue()));
    }
    
    /**
     * Get the value of the field {@code flags}
     * @return The value of the field {@code flags}
     */
    public org.gstreamer.vulkan.VulkanFormatFlags getFlags() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.vulkan.VulkanFormatFlags(RESULT);
    }
    
    /**
     * Change the value of the field {@code flags}
     * @param flags The new value of the field {@code flags}
     */
    public void setFlags(org.gstreamer.vulkan.VulkanFormatFlags flags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flags == null ? MemoryAddress.NULL : flags.getValue()));
    }
    
    /**
     * Get the value of the field {@code bits}
     * @return The value of the field {@code bits}
     */
    public int getBits() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bits}
     * @param bits The new value of the field {@code bits}
     */
    public void setBits(int bits) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bits"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
    }
    
    /**
     * Get the value of the field {@code n_components}
     * @return The value of the field {@code n_components}
     */
    public int getNComponents() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_components}
     * @param nComponents The new value of the field {@code n_components}
     */
    public void setNComponents(int nComponents) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_components"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nComponents);
    }
    
    /**
     * Get the value of the field {@code shift}
     * @return The value of the field {@code shift}
     */
    public byte[] getShift() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shift"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code shift}
     * @param shift The new value of the field {@code shift}
     */
    public void setShift(byte[] shift) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shift"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shift == null ? MemoryAddress.NULL : Interop.allocateNativeArray(shift, false)));
    }
    
    /**
     * Get the value of the field {@code depth}
     * @return The value of the field {@code depth}
     */
    public byte[] getDepth() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code depth}
     * @param depth The new value of the field {@code depth}
     */
    public void setDepth(byte[] depth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("depth"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false)));
    }
    
    /**
     * Get the value of the field {@code pixel_stride}
     * @return The value of the field {@code pixel_stride}
     */
    public byte[] getPixelStride() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code pixel_stride}
     * @param pixelStride The new value of the field {@code pixel_stride}
     */
    public void setPixelStride(byte[] pixelStride) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pixel_stride"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pixelStride == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pixelStride, false)));
    }
    
    /**
     * Get the value of the field {@code n_planes}
     * @return The value of the field {@code n_planes}
     */
    public int getNPlanes() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_planes}
     * @param nPlanes The new value of the field {@code n_planes}
     */
    public void setNPlanes(int nPlanes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_planes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPlanes);
    }
    
    /**
     * Get the value of the field {@code plane}
     * @return The value of the field {@code plane}
     */
    public byte[] getPlane() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code plane}
     * @param plane The new value of the field {@code plane}
     */
    public void setPlane(byte[] plane) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("plane"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (plane == null ? MemoryAddress.NULL : Interop.allocateNativeArray(plane, false)));
    }
    
    /**
     * Get the value of the field {@code poffset}
     * @return The value of the field {@code poffset}
     */
    public byte[] getPoffset() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code poffset}
     * @param poffset The new value of the field {@code poffset}
     */
    public void setPoffset(byte[] poffset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poffset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poffset == null ? MemoryAddress.NULL : Interop.allocateNativeArray(poffset, false)));
    }
    
    /**
     * Get the value of the field {@code w_sub}
     * @return The value of the field {@code w_sub}
     */
    public byte[] getWSub() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code w_sub}
     * @param wSub The new value of the field {@code w_sub}
     */
    public void setWSub(byte[] wSub) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("w_sub"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(wSub, false)));
    }
    
    /**
     * Get the value of the field {@code h_sub}
     * @return The value of the field {@code h_sub}
     */
    public byte[] getHSub() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 4, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Change the value of the field {@code h_sub}
     * @param hSub The new value of the field {@code h_sub}
     */
    public void setHSub(byte[] hSub) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false)));
    }
    
    /**
     * Create a VulkanFormatInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VulkanFormatInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VulkanFormatInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VulkanFormatInfo(input, ownership);
    
    /**
     * A {@link VulkanFormatInfo.Builder} object constructs a {@link VulkanFormatInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VulkanFormatInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VulkanFormatInfo struct;
        
        private Builder() {
            struct = VulkanFormatInfo.allocate();
        }
        
         /**
         * Finish building the {@link VulkanFormatInfo} struct.
         * @return A new instance of {@code VulkanFormatInfo} with the fields 
         *         that were set in the Builder object.
         */
        public VulkanFormatInfo build() {
            return struct;
        }
        
        /**
         * the Vulkan format being described
         * @param format The value for the {@code format} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormat(org.vulkan.Format format) {
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
        public Builder setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
            return this;
        }
        
        /**
         * how raw data is interpreted and scaled
         * @param scaling The value for the {@code scaling} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScaling(org.gstreamer.vulkan.VulkanFormatScaling scaling) {
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
        public Builder setFlags(org.gstreamer.vulkan.VulkanFormatFlags flags) {
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
        public Builder setBits(int bits) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bits"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bits);
            return this;
        }
        
        public Builder setNComponents(int nComponents) {
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
        public Builder setShift(byte[] shift) {
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
        public Builder setDepth(byte[] depth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("depth"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (depth == null ? MemoryAddress.NULL : Interop.allocateNativeArray(depth, false)));
            return this;
        }
        
        public Builder setPixelStride(byte[] pixelStride) {
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
        public Builder setNPlanes(int nPlanes) {
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
        public Builder setPlane(byte[] plane) {
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
        public Builder setPoffset(byte[] poffset) {
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
        public Builder setWSub(byte[] wSub) {
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
        public Builder setHSub(byte[] hSub) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("h_sub"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hSub == null ? MemoryAddress.NULL : Interop.allocateNativeArray(hSub, false)));
            return this;
        }
    }
}
