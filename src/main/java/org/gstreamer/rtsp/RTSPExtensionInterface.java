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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTSPExtensionInterface newInstance = new RTSPExtensionInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DetectServerCallback} callback.
     */
    @FunctionalInterface
    public interface DetectServerCallback {
    
        boolean run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage resp);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DetectServerCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code detect_server}
     * @param detectServer The new value of the field {@code detect_server}
     */
    public void setDetectServer(DetectServerCallback detectServer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detect_server"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detectServer == null ? MemoryAddress.NULL : detectServer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeforeSendCallback} callback.
     */
    @FunctionalInterface
    public interface BeforeSendCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeforeSendCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code before_send}
     * @param beforeSend The new value of the field {@code before_send}
     */
    public void setBeforeSend(BeforeSendCallback beforeSend) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("before_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeSend == null ? MemoryAddress.NULL : beforeSend.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AfterSendCallback} callback.
     */
    @FunctionalInterface
    public interface AfterSendCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AfterSendCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code after_send}
     * @param afterSend The new value of the field {@code after_send}
     */
    public void setAfterSend(AfterSendCallback afterSend) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("after_send"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (afterSend == null ? MemoryAddress.NULL : afterSend.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ParseSdpCallback} callback.
     */
    @FunctionalInterface
    public interface ParseSdpCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.sdp.SDPMessage sdp, org.gstreamer.gst.Structure s);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress sdp, MemoryAddress s) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.sdp.SDPMessage.fromAddress.marshal(sdp, null), org.gstreamer.gst.Structure.fromAddress.marshal(s, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ParseSdpCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse_sdp}
     * @param parseSdp The new value of the field {@code parse_sdp}
     */
    public void setParseSdp(ParseSdpCallback parseSdp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_sdp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parseSdp == null ? MemoryAddress.NULL : parseSdp.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetupMediaCallback} callback.
     */
    @FunctionalInterface
    public interface SetupMediaCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.sdp.SDPMedia media);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress media) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.sdp.SDPMedia.fromAddress.marshal(media, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetupMediaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code setup_media}
     * @param setupMedia The new value of the field {@code setup_media}
     */
    public void setSetupMedia(SetupMediaCallback setupMedia) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("setup_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setupMedia == null ? MemoryAddress.NULL : setupMedia.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConfigureStreamCallback} callback.
     */
    @FunctionalInterface
    public interface ConfigureStreamCallback {
    
        boolean run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConfigureStreamCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code configure_stream}
     * @param configureStream The new value of the field {@code configure_stream}
     */
    public void setConfigureStream(ConfigureStreamCallback configureStream) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("configure_stream"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (configureStream == null ? MemoryAddress.NULL : configureStream.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetTransportsCallback} callback.
     */
    @FunctionalInterface
    public interface GetTransportsCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPLowerTrans protocols, PointerString transport);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, int protocols, MemoryAddress transport) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), new org.gstreamer.rtsp.RTSPLowerTrans(protocols), new PointerString(transport));
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetTransportsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_transports}
     * @param getTransports The new value of the field {@code get_transports}
     */
    public void setGetTransports(GetTransportsCallback getTransports) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_transports"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTransports == null ? MemoryAddress.NULL : getTransports.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StreamSelectCallback} callback.
     */
    @FunctionalInterface
    public interface StreamSelectCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPUrl url);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress url) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPUrl.fromAddress.marshal(url, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StreamSelectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stream_select}
     * @param streamSelect The new value of the field {@code stream_select}
     */
    public void setStreamSelect(StreamSelectCallback streamSelect) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_select"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (streamSelect == null ? MemoryAddress.NULL : streamSelect.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SendCallback} callback.
     */
    @FunctionalInterface
    public interface SendCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req, org.gstreamer.rtsp.RTSPMessage resp);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req, MemoryAddress resp) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(resp, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SendCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code send}
     * @param send The new value of the field {@code send}
     */
    public void setSend(SendCallback send) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (send == null ? MemoryAddress.NULL : send.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReceiveRequestCallback} callback.
     */
    @FunctionalInterface
    public interface ReceiveRequestCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPExtension ext, org.gstreamer.rtsp.RTSPMessage req);
        
        @ApiStatus.Internal default int upcall(MemoryAddress ext, MemoryAddress req) {
            var RESULT = run((org.gstreamer.rtsp.RTSPExtension) Interop.register(ext, org.gstreamer.rtsp.RTSPExtension.fromAddress).marshal(ext, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(req, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReceiveRequestCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code receive_request}
     * @param receiveRequest The new value of the field {@code receive_request}
     */
    public void setReceiveRequest(ReceiveRequestCallback receiveRequest) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_request"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (receiveRequest == null ? MemoryAddress.NULL : receiveRequest.toCallback()));
        }
    }
    
    /**
     * Create a RTSPExtensionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTSPExtensionInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPExtensionInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPExtensionInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        public Builder setDetectServer(DetectServerCallback detectServer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("detect_server"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (detectServer == null ? MemoryAddress.NULL : detectServer.toCallback()));
                return this;
            }
        }
        
        public Builder setBeforeSend(BeforeSendCallback beforeSend) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("before_send"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beforeSend == null ? MemoryAddress.NULL : beforeSend.toCallback()));
                return this;
            }
        }
        
        public Builder setAfterSend(AfterSendCallback afterSend) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("after_send"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (afterSend == null ? MemoryAddress.NULL : afterSend.toCallback()));
                return this;
            }
        }
        
        public Builder setParseSdp(ParseSdpCallback parseSdp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parse_sdp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parseSdp == null ? MemoryAddress.NULL : parseSdp.toCallback()));
                return this;
            }
        }
        
        public Builder setSetupMedia(SetupMediaCallback setupMedia) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("setup_media"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setupMedia == null ? MemoryAddress.NULL : setupMedia.toCallback()));
                return this;
            }
        }
        
        public Builder setConfigureStream(ConfigureStreamCallback configureStream) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("configure_stream"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (configureStream == null ? MemoryAddress.NULL : configureStream.toCallback()));
                return this;
            }
        }
        
        public Builder setGetTransports(GetTransportsCallback getTransports) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_transports"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTransports == null ? MemoryAddress.NULL : getTransports.toCallback()));
                return this;
            }
        }
        
        public Builder setStreamSelect(StreamSelectCallback streamSelect) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stream_select"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (streamSelect == null ? MemoryAddress.NULL : streamSelect.toCallback()));
                return this;
            }
        }
        
        public Builder setSend(SendCallback send) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("send"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (send == null ? MemoryAddress.NULL : send.toCallback()));
                return this;
            }
        }
        
        public Builder setReceiveRequest(ReceiveRequestCallback receiveRequest) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("receive_request"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (receiveRequest == null ? MemoryAddress.NULL : receiveRequest.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
