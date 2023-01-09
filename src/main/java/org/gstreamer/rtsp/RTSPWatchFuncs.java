package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback functions from a {@link RTSPWatch}.
 */
public class RTSPWatchFuncs extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPWatchFuncs";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("message_received"),
            Interop.valueLayout.ADDRESS.withName("message_sent"),
            Interop.valueLayout.ADDRESS.withName("closed"),
            Interop.valueLayout.ADDRESS.withName("error"),
            Interop.valueLayout.ADDRESS.withName("tunnel_start"),
            Interop.valueLayout.ADDRESS.withName("tunnel_complete"),
            Interop.valueLayout.ADDRESS.withName("error_full"),
            Interop.valueLayout.ADDRESS.withName("tunnel_lost"),
            Interop.valueLayout.ADDRESS.withName("tunnel_http_response"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPWatchFuncs}
     * @return A new, uninitialized @{link RTSPWatchFuncs}
     */
    public static RTSPWatchFuncs allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTSPWatchFuncs newInstance = new RTSPWatchFuncs(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code MessageReceivedCallback} callback.
     */
    @FunctionalInterface
    public interface MessageReceivedCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPMessage message);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress message, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(message, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MessageReceivedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code message_received}
     * @param messageReceived The new value of the field {@code message_received}
     */
    public void setMessageReceived(MessageReceivedCallback messageReceived) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (messageReceived == null ? MemoryAddress.NULL : messageReceived.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MessageSentCallback} callback.
     */
    @FunctionalInterface
    public interface MessageSentCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, int id);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, int id, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null), id);
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MessageSentCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code message_sent}
     * @param messageSent The new value of the field {@code message_sent}
     */
    public void setMessageSent(MessageSentCallback messageSent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_sent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (messageSent == null ? MemoryAddress.NULL : messageSent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ClosedCallback} callback.
     */
    @FunctionalInterface
    public interface ClosedCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClosedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code closed}
     * @param closed The new value of the field {@code closed}
     */
    public void setClosed(ClosedCallback closed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ErrorCallback} callback.
     */
    @FunctionalInterface
    public interface ErrorCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, int result, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null), org.gstreamer.rtsp.RTSPResult.of(result));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ErrorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error}
     * @param error The new value of the field {@code error}
     */
    public void setError(ErrorCallback error) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TunnelStartCallback} callback.
     */
    @FunctionalInterface
    public interface TunnelStartCallback {
    
        org.gstreamer.rtsp.RTSPStatusCode run(org.gstreamer.rtsp.RTSPWatch watch);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TunnelStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_start}
     * @param tunnelStart The new value of the field {@code tunnel_start}
     */
    public void setTunnelStart(TunnelStartCallback tunnelStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelStart == null ? MemoryAddress.NULL : tunnelStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TunnelCompleteCallback} callback.
     */
    @FunctionalInterface
    public interface TunnelCompleteCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TunnelCompleteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_complete}
     * @param tunnelComplete The new value of the field {@code tunnel_complete}
     */
    public void setTunnelComplete(TunnelCompleteCallback tunnelComplete) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_complete"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelComplete == null ? MemoryAddress.NULL : tunnelComplete.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ErrorFullCallback} callback.
     */
    @FunctionalInterface
    public interface ErrorFullCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPResult result, org.gstreamer.rtsp.RTSPMessage message, int id);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, int result, MemoryAddress message, int id, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null), org.gstreamer.rtsp.RTSPResult.of(result), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(message, null), id);
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ErrorFullCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error_full}
     * @param errorFull The new value of the field {@code error_full}
     */
    public void setErrorFull(ErrorFullCallback errorFull) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (errorFull == null ? MemoryAddress.NULL : errorFull.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TunnelLostCallback} callback.
     */
    @FunctionalInterface
    public interface TunnelLostCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TunnelLostCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_lost}
     * @param tunnelLost The new value of the field {@code tunnel_lost}
     */
    public void setTunnelLost(TunnelLostCallback tunnelLost) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelLost == null ? MemoryAddress.NULL : tunnelLost.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TunnelHttpResponseCallback} callback.
     */
    @FunctionalInterface
    public interface TunnelHttpResponseCallback {
    
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPMessage request, org.gstreamer.rtsp.RTSPMessage response);
        
        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress request, MemoryAddress response, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(request, null), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(response, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TunnelHttpResponseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_http_response}
     * @param tunnelHttpResponse The new value of the field {@code tunnel_http_response}
     */
    public void setTunnelHttpResponse(TunnelHttpResponseCallback tunnelHttpResponse) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_http_response"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelHttpResponse == null ? MemoryAddress.NULL : tunnelHttpResponse.toCallback()));
        }
    }
    
    /**
     * Create a RTSPWatchFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTSPWatchFuncs(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPWatchFuncs> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTSPWatchFuncs(input);
    
    /**
     * A {@link RTSPWatchFuncs.Builder} object constructs a {@link RTSPWatchFuncs} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPWatchFuncs.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPWatchFuncs struct;
        
        private Builder() {
            struct = RTSPWatchFuncs.allocate();
        }
        
        /**
         * Finish building the {@link RTSPWatchFuncs} struct.
         * @return A new instance of {@code RTSPWatchFuncs} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPWatchFuncs build() {
            return struct;
        }
        
        public Builder setMessageReceived(MessageReceivedCallback messageReceived) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("message_received"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (messageReceived == null ? MemoryAddress.NULL : messageReceived.toCallback()));
                return this;
            }
        }
        
        public Builder setMessageSent(MessageSentCallback messageSent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("message_sent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (messageSent == null ? MemoryAddress.NULL : messageSent.toCallback()));
                return this;
            }
        }
        
        public Builder setClosed(ClosedCallback closed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
                return this;
            }
        }
        
        public Builder setError(ErrorCallback error) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("error"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
                return this;
            }
        }
        
        public Builder setTunnelStart(TunnelStartCallback tunnelStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tunnel_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelStart == null ? MemoryAddress.NULL : tunnelStart.toCallback()));
                return this;
            }
        }
        
        public Builder setTunnelComplete(TunnelCompleteCallback tunnelComplete) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tunnel_complete"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelComplete == null ? MemoryAddress.NULL : tunnelComplete.toCallback()));
                return this;
            }
        }
        
        public Builder setErrorFull(ErrorFullCallback errorFull) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("error_full"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (errorFull == null ? MemoryAddress.NULL : errorFull.toCallback()));
                return this;
            }
        }
        
        public Builder setTunnelLost(TunnelLostCallback tunnelLost) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tunnel_lost"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelLost == null ? MemoryAddress.NULL : tunnelLost.toCallback()));
                return this;
            }
        }
        
        public Builder setTunnelHttpResponse(TunnelHttpResponseCallback tunnelHttpResponse) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tunnel_http_response"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tunnelHttpResponse == null ? MemoryAddress.NULL : tunnelHttpResponse.toCallback()));
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
