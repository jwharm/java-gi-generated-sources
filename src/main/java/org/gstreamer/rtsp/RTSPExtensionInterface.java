package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface representing RTSP extensions.
 */
public class RTSPExtensionInterface extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPExtensionInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("detect_server"),
            Interop.valueLayout.ADDRESS.withName("before_send"),
            Interop.valueLayout.ADDRESS.withName("after_send"),
            Interop.valueLayout.ADDRESS.withName("parse_sdp"),
            Interop.valueLayout.ADDRESS.withName("setup_media"),
            Interop.valueLayout.ADDRESS.withName("configure_stream"),
            Interop.valueLayout.ADDRESS.withName("get_transports"),
            Interop.valueLayout.ADDRESS.withName("stream_select"),
            Interop.valueLayout.ADDRESS.withName("send"),
            Interop.valueLayout.ADDRESS.withName("receive_request"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPExtensionInterface}
     * @return A new, uninitialized @{link RTSPExtensionInterface}
     */
    public static RTSPExtensionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPExtensionInterface newInstance = new RTSPExtensionInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    @FunctionalInterface
    public interface DetectServerCallback {
        boolean run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage resp);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DetectServerCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code detect_server}
     * @param detectServer The new value of the field {@code detect_server}
     */
    public void setDetectServer(DetectServerCallback detectServer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detect_server"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detectServer == null ? MemoryAddress.NULL : detectServer.toCallback()));
    }
    
    @FunctionalInterface
    public interface BeforeSendCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BeforeSendCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_send}
     * @param beforeSend The new value of the field {@code before_send}
     */
    public void setBeforeSend(BeforeSendCallback beforeSend) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("before_send"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeSend == null ? MemoryAddress.NULL : beforeSend.toCallback()));
    }
    
    @FunctionalInterface
    public interface AfterSendCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AfterSendCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code after_send}
     * @param afterSend The new value of the field {@code after_send}
     */
    public void setAfterSend(AfterSendCallback afterSend) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("after_send"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterSend == null ? MemoryAddress.NULL : afterSend.toCallback()));
    }
    
    @FunctionalInterface
    public interface ParseSdpCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.sdp.SDPMessage sdp, org.gstreamer.gst.Structure s);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress sdp, MemoryAddress s) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.sdp.SDPMessage.fromAddress.marshal(sdp, Ownership.NONE), org.gstreamer.gst.Structure.fromAddress.marshal(s, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParseSdpCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse_sdp}
     * @param parseSdp The new value of the field {@code parse_sdp}
     */
    public void setParseSdp(ParseSdpCallback parseSdp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse_sdp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseSdp == null ? MemoryAddress.NULL : parseSdp.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetupMediaCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.sdp.SDPMedia media);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress media) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.sdp.SDPMedia.fromAddress.marshal(media, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetupMediaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code setup_media}
     * @param setupMedia The new value of the field {@code setup_media}
     */
    public void setSetupMedia(SetupMediaCallback setupMedia) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("setup_media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setupMedia == null ? MemoryAddress.NULL : setupMedia.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConfigureStreamCallback {
        boolean run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConfigureStreamCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code configure_stream}
     * @param configureStream The new value of the field {@code configure_stream}
     */
    public void setConfigureStream(ConfigureStreamCallback configureStream) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("configure_stream"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (configureStream == null ? MemoryAddress.NULL : configureStream.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetTransportsCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPLowerTrans protocols, PointerString transport);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, int protocols, MemoryAddress transport) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), new org.gstreamer.rtsp.RTSPLowerTrans(protocols), new PointerString(transport));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetTransportsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_transports}
     * @param getTransports The new value of the field {@code get_transports}
     */
    public void setGetTransports(GetTransportsCallback getTransports) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_transports"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTransports == null ? MemoryAddress.NULL : getTransports.toCallback()));
    }
    
    @FunctionalInterface
    public interface StreamSelectCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPUrl url);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress url) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(url, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StreamSelectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stream_select}
     * @param streamSelect The new value of the field {@code stream_select}
     */
    public void setStreamSelect(StreamSelectCallback streamSelect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_select"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streamSelect == null ? MemoryAddress.NULL : streamSelect.toCallback()));
    }
    
    @FunctionalInterface
    public interface SendCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send}
     * @param send The new value of the field {@code send}
     */
    public void setSend(SendCallback send) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("send"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (send == null ? MemoryAddress.NULL : send.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReceiveRequestCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req);

        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(ext)), org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReceiveRequestCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code receive_request}
     * @param receiveRequest The new value of the field {@code receive_request}
     */
    public void setReceiveRequest(ReceiveRequestCallback receiveRequest) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("receive_request"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveRequest == null ? MemoryAddress.NULL : receiveRequest.toCallback()));
    }
    
    /**
     * Create a RTSPExtensionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPExtensionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPExtensionInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPExtensionInterface(input, ownership);
    
    /**
     * A {@link RTSPExtensionInterface.Builder} object constructs a {@link RTSPExtensionInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPExtensionInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPExtensionInterface struct;
        
        private Builder() {
            struct = RTSPExtensionInterface.allocate();
        }
        
         /**
         * Finish building the {@link RTSPExtensionInterface} struct.
         * @return A new instance of {@code RTSPExtensionInterface} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPExtensionInterface build() {
            return struct;
        }
        
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setDetectServer(DetectServerCallback detectServer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detect_server"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detectServer == null ? MemoryAddress.NULL : detectServer.toCallback()));
            return this;
        }
        
        public Builder setBeforeSend(BeforeSendCallback beforeSend) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (beforeSend == null ? MemoryAddress.NULL : beforeSend.toCallback()));
            return this;
        }
        
        public Builder setAfterSend(AfterSendCallback afterSend) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (afterSend == null ? MemoryAddress.NULL : afterSend.toCallback()));
            return this;
        }
        
        public Builder setParseSdp(ParseSdpCallback parseSdp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_sdp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseSdp == null ? MemoryAddress.NULL : parseSdp.toCallback()));
            return this;
        }
        
        public Builder setSetupMedia(SetupMediaCallback setupMedia) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setupMedia == null ? MemoryAddress.NULL : setupMedia.toCallback()));
            return this;
        }
        
        public Builder setConfigureStream(ConfigureStreamCallback configureStream) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("configure_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (configureStream == null ? MemoryAddress.NULL : configureStream.toCallback()));
            return this;
        }
        
        public Builder setGetTransports(GetTransportsCallback getTransports) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_transports"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTransports == null ? MemoryAddress.NULL : getTransports.toCallback()));
            return this;
        }
        
        public Builder setStreamSelect(StreamSelectCallback streamSelect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_select"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streamSelect == null ? MemoryAddress.NULL : streamSelect.toCallback()));
            return this;
        }
        
        public Builder setSend(SendCallback send) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (send == null ? MemoryAddress.NULL : send.toCallback()));
            return this;
        }
        
        public Builder setReceiveRequest(ReceiveRequestCallback receiveRequest) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveRequest == null ? MemoryAddress.NULL : receiveRequest.toCallback()));
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
