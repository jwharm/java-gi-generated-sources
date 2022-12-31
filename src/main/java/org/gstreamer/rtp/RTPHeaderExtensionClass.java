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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetSupportedFlagsCallback {
        org.gstreamer.rtp.RTPHeaderExtensionFlags run(org.gstreamer.rtp.RTPHeaderExtension ext);

        @ApiStatus.Internal default int upcall(MemoryAddress ext) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSupportedFlagsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_supported_flags}
     * @param getSupportedFlags The new value of the field {@code get_supported_flags}
     */
    public void setGetSupportedFlags(GetSupportedFlagsCallback getSupportedFlags) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_supported_flags"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedFlags == null ? MemoryAddress.NULL : getSupportedFlags.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetMaxSizeCallback {
        long run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.gst.Buffer inputMeta);

        @ApiStatus.Internal default long upcall(MemoryAddress ext, MemoryAddress inputMeta) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inputMeta, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetMaxSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_max_size}
     * @param getMaxSize The new value of the field {@code get_max_size}
     */
    public void setGetMaxSize(GetMaxSizeCallback getMaxSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_max_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMaxSize == null ? MemoryAddress.NULL : getMaxSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface WriteCallback {
        long run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.gst.Buffer inputMeta, org.gstreamer.rtp.RTPHeaderExtensionFlags writeFlags, org.gstreamer.gst.Buffer output, byte[] data, long size);

        @ApiStatus.Internal default long upcall(MemoryAddress ext, MemoryAddress inputMeta, int writeFlags, MemoryAddress output, MemoryAddress data, long size) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inputMeta, Ownership.NONE), new org.gstreamer.rtp.RTPHeaderExtensionFlags(writeFlags), org.gstreamer.gst.Buffer.fromAddress.marshal(output, Ownership.NONE), MemorySegment.ofAddress(data, size, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), size);
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WriteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code write}
     * @param write The new value of the field {@code write}
     */
    public void setWrite(WriteCallback write) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("write"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReadCallback {
        boolean run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.rtp.RTPHeaderExtensionFlags readFlags, byte[] data, long size, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, int readFlags, MemoryAddress data, long size, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), new org.gstreamer.rtp.RTPHeaderExtensionFlags(readFlags), MemorySegment.ofAddress(data, size, Interop.getScope()).toArray(Interop.valueLayout.C_BYTE), size, org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code read}
     * @param read The new value of the field {@code read}
     */
    public void setRead(ReadCallback read) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("read"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetNonRtpSinkCapsCallback {
        boolean run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetNonRtpSinkCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_non_rtp_sink_caps}
     * @param setNonRtpSinkCaps The new value of the field {@code set_non_rtp_sink_caps}
     */
    public void setSetNonRtpSinkCaps(SetNonRtpSinkCapsCallback setNonRtpSinkCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_non_rtp_sink_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setNonRtpSinkCaps == null ? MemoryAddress.NULL : setNonRtpSinkCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface UpdateNonRtpSrcCapsCallback {
        boolean run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpdateNonRtpSrcCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_non_rtp_src_caps}
     * @param updateNonRtpSrcCaps The new value of the field {@code update_non_rtp_src_caps}
     */
    public void setUpdateNonRtpSrcCaps(UpdateNonRtpSrcCapsCallback updateNonRtpSrcCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("update_non_rtp_src_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateNonRtpSrcCaps == null ? MemoryAddress.NULL : updateNonRtpSrcCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAttributesCallback {
        boolean run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.rtp.RTPHeaderExtensionDirection direction, java.lang.String attributes);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, int direction, MemoryAddress attributes) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), new org.gstreamer.rtp.RTPHeaderExtensionDirection(direction), Marshal.addressToString.marshal(attributes, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_attributes}
     * @param setAttributes The new value of the field {@code set_attributes}
     */
    public void setSetAttributes(SetAttributesCallback setAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributes == null ? MemoryAddress.NULL : setAttributes.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCapsFromAttributesCallback {
        boolean run(org.gstreamer.rtp.RTPHeaderExtension ext, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPHeaderExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCapsFromAttributesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps_from_attributes}
     * @param setCapsFromAttributes The new value of the field {@code set_caps_from_attributes}
     */
    public void setSetCapsFromAttributes(SetCapsFromAttributesCallback setCapsFromAttributes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_caps_from_attributes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCapsFromAttributes == null ? MemoryAddress.NULL : setCapsFromAttributes.toCallback()));
    }
    
    /**
     * Create a RTPHeaderExtensionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPHeaderExtensionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPHeaderExtensionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPHeaderExtensionClass(input, ownership);
    
    /**
     * Set the URI for this RTP header extension implementation.
     * @param uri the RTP Header extension uri for {@code klass}
     */
    public void setUri(java.lang.String uri) {
        try {
            DowncallHandles.gst_rtp_header_extension_class_set_uri.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(uri, null));
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
     * A {@link RTPHeaderExtensionClass.Builder} object constructs a {@link RTPHeaderExtensionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPHeaderExtensionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPHeaderExtensionClass struct;
        
        private Builder() {
            struct = RTPHeaderExtensionClass.allocate();
        }
        
         /**
         * Finish building the {@link RTPHeaderExtensionClass} struct.
         * @return A new instance of {@code RTPHeaderExtensionClass} with the fields 
         *         that were set in the Builder object.
         */
        public RTPHeaderExtensionClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetSupportedFlags(GetSupportedFlagsCallback getSupportedFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedFlags == null ? MemoryAddress.NULL : getSupportedFlags.toCallback()));
            return this;
        }
        
        public Builder setGetMaxSize(GetMaxSizeCallback getMaxSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_max_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMaxSize == null ? MemoryAddress.NULL : getMaxSize.toCallback()));
            return this;
        }
        
        public Builder setWrite(WriteCallback write) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (write == null ? MemoryAddress.NULL : write.toCallback()));
            return this;
        }
        
        public Builder setRead(ReadCallback read) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read == null ? MemoryAddress.NULL : read.toCallback()));
            return this;
        }
        
        public Builder setSetNonRtpSinkCaps(SetNonRtpSinkCapsCallback setNonRtpSinkCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_non_rtp_sink_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setNonRtpSinkCaps == null ? MemoryAddress.NULL : setNonRtpSinkCaps.toCallback()));
            return this;
        }
        
        public Builder setUpdateNonRtpSrcCaps(UpdateNonRtpSrcCapsCallback updateNonRtpSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_non_rtp_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateNonRtpSrcCaps == null ? MemoryAddress.NULL : updateNonRtpSrcCaps.toCallback()));
            return this;
        }
        
        public Builder setSetAttributes(SetAttributesCallback setAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributes == null ? MemoryAddress.NULL : setAttributes.toCallback()));
            return this;
        }
        
        public Builder setSetCapsFromAttributes(SetCapsFromAttributesCallback setCapsFromAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps_from_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCapsFromAttributes == null ? MemoryAddress.NULL : setCapsFromAttributes.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
