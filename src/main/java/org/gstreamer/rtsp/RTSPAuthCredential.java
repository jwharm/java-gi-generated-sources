package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * RTSP Authentication credentials
 * @version 1.12
 */
public class RTSPAuthCredential extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPAuthCredential";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("scheme"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("params"),
        Interop.valueLayout.ADDRESS.withName("authorization")
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
     * Allocate a new {@link RTSPAuthCredential}
     * @return A new, uninitialized @{link RTSPAuthCredential}
     */
    public static RTSPAuthCredential allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPAuthCredential newInstance = new RTSPAuthCredential(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code scheme}
     * @return The value of the field {@code scheme}
     */
    public org.gstreamer.rtsp.RTSPAuthMethod scheme$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scheme"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.rtsp.RTSPAuthMethod.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code scheme}
     * @param scheme The new value of the field {@code scheme}
     */
    public void scheme$set(org.gstreamer.rtsp.RTSPAuthMethod scheme) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("scheme"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), scheme.getValue());
    }
    
    /**
     * Get the value of the field {@code params}
     * @return The value of the field {@code params}
     */
    public PointerProxy<org.gstreamer.rtsp.RTSPAuthParam> params$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerProxy<org.gstreamer.rtsp.RTSPAuthParam>(RESULT, org.gstreamer.rtsp.RTSPAuthParam.class);
    }
    
    /**
     * Change the value of the field {@code params}
     * @param params The new value of the field {@code params}
     */
    public void params$set(PointerProxy<org.gstreamer.rtsp.RTSPAuthParam> params) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), params.handle());
    }
    
    /**
     * Get the value of the field {@code authorization}
     * @return The value of the field {@code authorization}
     */
    public java.lang.String authorization$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("authorization"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code authorization}
     * @param authorization The new value of the field {@code authorization}
     */
    public void authorization$set(java.lang.String authorization) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("authorization"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(authorization));
    }
    
    /**
     * Create a RTSPAuthCredential proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTSPAuthCredential(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private RTSPAuthCredential struct;
        
         /**
         * A {@link RTSPAuthCredential.Build} object constructs a {@link RTSPAuthCredential} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = RTSPAuthCredential.allocate();
        }
        
         /**
         * Finish building the {@link RTSPAuthCredential} struct.
         * @return A new instance of {@code RTSPAuthCredential} with the fields 
         *         that were set in the Build object.
         */
        public RTSPAuthCredential construct() {
            return struct;
        }
        
        /**
         * a {@link RTSPAuthMethod}
         * @param scheme The value for the {@code scheme} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScheme(org.gstreamer.rtsp.RTSPAuthMethod scheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (scheme == null ? MemoryAddress.NULL : scheme.getValue()));
            return this;
        }
        
        /**
         * A NULL-terminated array of {@link RTSPAuthParam}
         * @param params The value for the {@code params} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParams(PointerProxy<org.gstreamer.rtsp.RTSPAuthParam> params) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            return this;
        }
        
        /**
         * The authorization for the basic schem
         * @param authorization The value for the {@code authorization} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAuthorization(java.lang.String authorization) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("authorization"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (authorization == null ? MemoryAddress.NULL : Interop.allocateNativeString(authorization)));
            return this;
        }
    }
}
