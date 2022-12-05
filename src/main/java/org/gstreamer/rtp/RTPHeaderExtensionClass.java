package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for RTP Header extensions.
 * @version 1.20
 */
public class RTPHeaderExtensionClass extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPHeaderExtensionClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_supported_flags"),
        Interop.valueLayout.ADDRESS.withName("get_max_size"),
        Interop.valueLayout.ADDRESS.withName("write"),
        Interop.valueLayout.ADDRESS.withName("read"),
        Interop.valueLayout.ADDRESS.withName("set_non_rtp_sink_caps"),
        Interop.valueLayout.ADDRESS.withName("update_non_rtp_src_caps"),
        Interop.valueLayout.ADDRESS.withName("set_attributes"),
        Interop.valueLayout.ADDRESS.withName("set_caps_from_attributes"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Allocate a new {@link RTPHeaderExtensionClass}
     * @return A new, uninitialized @{link RTPHeaderExtensionClass}
     */
    public static RTPHeaderExtensionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPHeaderExtensionClass newInstance = new RTPHeaderExtensionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gstreamer.gst.ElementClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a RTPHeaderExtensionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTPHeaderExtensionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set the URI for this RTP header extension implementation.
     * @param uri the RTP Header extension uri for {@code klass}
     */
    public void setUri(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.gst_rtp_header_extension_class_set_uri.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_header_extension_class_set_uri = Interop.downcallHandle(
            "gst_rtp_header_extension_class_set_uri",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTPHeaderExtensionClass struct;
        
         /**
         * A {@link RTPHeaderExtensionClass.Build} object constructs a {@link RTPHeaderExtensionClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTPHeaderExtensionClass.allocate();
        }
        
         /**
         * Finish building the {@link RTPHeaderExtensionClass} struct.
         * @return A new instance of {@code RTPHeaderExtensionClass} with the fields 
         *         that were set in the Build object.
         */
        public RTPHeaderExtensionClass construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setGetSupportedFlags(java.lang.foreign.MemoryAddress getSupportedFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedFlags == null ? MemoryAddress.NULL : getSupportedFlags));
            return this;
        }
        
        public Build setGetMaxSize(java.lang.foreign.MemoryAddress getMaxSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_max_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMaxSize == null ? MemoryAddress.NULL : getMaxSize));
            return this;
        }
        
        public Build setWrite(java.lang.foreign.MemoryAddress write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write));
            return this;
        }
        
        public Build setRead(java.lang.foreign.MemoryAddress read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read));
            return this;
        }
        
        public Build setSetNonRtpSinkCaps(java.lang.foreign.MemoryAddress setNonRtpSinkCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_non_rtp_sink_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setNonRtpSinkCaps == null ? MemoryAddress.NULL : setNonRtpSinkCaps));
            return this;
        }
        
        public Build setUpdateNonRtpSrcCaps(java.lang.foreign.MemoryAddress updateNonRtpSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_non_rtp_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateNonRtpSrcCaps == null ? MemoryAddress.NULL : updateNonRtpSrcCaps));
            return this;
        }
        
        public Build setSetAttributes(java.lang.foreign.MemoryAddress setAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributes == null ? MemoryAddress.NULL : setAttributes));
            return this;
        }
        
        public Build setSetCapsFromAttributes(java.lang.foreign.MemoryAddress setCapsFromAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps_from_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCapsFromAttributes == null ? MemoryAddress.NULL : setCapsFromAttributes));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
