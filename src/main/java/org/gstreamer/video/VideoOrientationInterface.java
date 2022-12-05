package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link VideoOrientationInterface} interface.
 */
public class VideoOrientationInterface extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoOrientationInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("iface"),
        Interop.valueLayout.ADDRESS.withName("get_hflip"),
        Interop.valueLayout.ADDRESS.withName("get_vflip"),
        Interop.valueLayout.ADDRESS.withName("get_hcenter"),
        Interop.valueLayout.ADDRESS.withName("get_vcenter"),
        Interop.valueLayout.ADDRESS.withName("set_hflip"),
        Interop.valueLayout.ADDRESS.withName("set_vflip"),
        Interop.valueLayout.ADDRESS.withName("set_hcenter"),
        Interop.valueLayout.ADDRESS.withName("set_vcenter")
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
     * Allocate a new {@link VideoOrientationInterface}
     * @return A new, uninitialized @{link VideoOrientationInterface}
     */
    public static VideoOrientationInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoOrientationInterface newInstance = new VideoOrientationInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code iface}
     * @return The value of the field {@code iface}
     */
    public org.gtk.gobject.TypeInterface iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VideoOrientationInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoOrientationInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoOrientationInterface struct;
        
         /**
         * A {@link VideoOrientationInterface.Build} object constructs a {@link VideoOrientationInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoOrientationInterface.allocate();
        }
        
         /**
         * Finish building the {@link VideoOrientationInterface} struct.
         * @return A new instance of {@code VideoOrientationInterface} with the fields 
         *         that were set in the Build object.
         */
        public VideoOrientationInterface construct() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param iface The value for the {@code iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIface(org.gtk.gobject.TypeInterface iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iface == null ? MemoryAddress.NULL : iface.handle()));
            return this;
        }
        
        public Build setGetHflip(java.lang.foreign.MemoryAddress getHflip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_hflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getHflip == null ? MemoryAddress.NULL : getHflip));
            return this;
        }
        
        public Build setGetVflip(java.lang.foreign.MemoryAddress getVflip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVflip == null ? MemoryAddress.NULL : getVflip));
            return this;
        }
        
        public Build setGetHcenter(java.lang.foreign.MemoryAddress getHcenter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_hcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getHcenter == null ? MemoryAddress.NULL : getHcenter));
            return this;
        }
        
        public Build setGetVcenter(java.lang.foreign.MemoryAddress getVcenter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_vcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVcenter == null ? MemoryAddress.NULL : getVcenter));
            return this;
        }
        
        public Build setSetHflip(java.lang.foreign.MemoryAddress setHflip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_hflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setHflip == null ? MemoryAddress.NULL : setHflip));
            return this;
        }
        
        public Build setSetVflip(java.lang.foreign.MemoryAddress setVflip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_vflip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setVflip == null ? MemoryAddress.NULL : setVflip));
            return this;
        }
        
        public Build setSetHcenter(java.lang.foreign.MemoryAddress setHcenter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_hcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setHcenter == null ? MemoryAddress.NULL : setHcenter));
            return this;
        }
        
        public Build setSetVcenter(java.lang.foreign.MemoryAddress setVcenter) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_vcenter"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setVcenter == null ? MemoryAddress.NULL : setVcenter));
            return this;
        }
    }
}
