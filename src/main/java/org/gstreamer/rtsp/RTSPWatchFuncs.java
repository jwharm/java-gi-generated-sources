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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPWatchFuncs newInstance = new RTSPWatchFuncs(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface MessageReceivedCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPMessage message);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress message, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(message, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MessageReceivedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code message_received}
     * @param messageReceived The new value of the field {@code message_received}
     */
    public void setMessageReceived(MessageReceivedCallback messageReceived) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message_received"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageReceived == null ? MemoryAddress.NULL : messageReceived.toCallback()));
    }
    
    @FunctionalInterface
    public interface MessageSentCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, int id);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, int id, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE), id);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MessageSentCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code message_sent}
     * @param messageSent The new value of the field {@code message_sent}
     */
    public void setMessageSent(MessageSentCallback messageSent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message_sent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageSent == null ? MemoryAddress.NULL : messageSent.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClosedCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClosedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code closed}
     * @param closed The new value of the field {@code closed}
     */
    public void setClosed(ClosedCallback closed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("closed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
    }
    
    @FunctionalInterface
    public interface ErrorCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, int result, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE), org.gstreamer.rtsp.RTSPResult.of(result));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ErrorCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error}
     * @param error The new value of the field {@code error}
     */
    public void setError(ErrorCallback error) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
    }
    
    @FunctionalInterface
    public interface TunnelStartCallback {
        org.gstreamer.rtsp.RTSPStatusCode run(org.gstreamer.rtsp.RTSPWatch watch);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TunnelStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_start}
     * @param tunnelStart The new value of the field {@code tunnel_start}
     */
    public void setTunnelStart(TunnelStartCallback tunnelStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tunnel_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelStart == null ? MemoryAddress.NULL : tunnelStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface TunnelCompleteCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TunnelCompleteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_complete}
     * @param tunnelComplete The new value of the field {@code tunnel_complete}
     */
    public void setTunnelComplete(TunnelCompleteCallback tunnelComplete) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tunnel_complete"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelComplete == null ? MemoryAddress.NULL : tunnelComplete.toCallback()));
    }
    
    @FunctionalInterface
    public interface ErrorFullCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPResult result, org.gstreamer.rtsp.RTSPMessage message, int id);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, int result, MemoryAddress message, int id, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE), org.gstreamer.rtsp.RTSPResult.of(result), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(message, Ownership.NONE), id);
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ErrorFullCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code error_full}
     * @param errorFull The new value of the field {@code error_full}
     */
    public void setErrorFull(ErrorFullCallback errorFull) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("error_full"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (errorFull == null ? MemoryAddress.NULL : errorFull.toCallback()));
    }
    
    @FunctionalInterface
    public interface TunnelLostCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TunnelLostCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_lost}
     * @param tunnelLost The new value of the field {@code tunnel_lost}
     */
    public void setTunnelLost(TunnelLostCallback tunnelLost) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tunnel_lost"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelLost == null ? MemoryAddress.NULL : tunnelLost.toCallback()));
    }
    
    @FunctionalInterface
    public interface TunnelHttpResponseCallback {
        org.gstreamer.rtsp.RTSPResult run(org.gstreamer.rtsp.RTSPWatch watch, org.gstreamer.rtsp.RTSPMessage request, org.gstreamer.rtsp.RTSPMessage response);

        @ApiStatus.Internal default int upcall(MemoryAddress watch, MemoryAddress request, MemoryAddress response, MemoryAddress userData) {
            var RESULT = run(org.gstreamer.rtsp.RTSPWatch.fromAddress.marshal(watch, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(request, Ownership.NONE), org.gstreamer.rtsp.RTSPMessage.fromAddress.marshal(response, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TunnelHttpResponseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code tunnel_http_response}
     * @param tunnelHttpResponse The new value of the field {@code tunnel_http_response}
     */
    public void setTunnelHttpResponse(TunnelHttpResponseCallback tunnelHttpResponse) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("tunnel_http_response"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelHttpResponse == null ? MemoryAddress.NULL : tunnelHttpResponse.toCallback()));
    }
    
    /**
     * Create a RTSPWatchFuncs proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPWatchFuncs(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPWatchFuncs> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPWatchFuncs(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageReceived == null ? MemoryAddress.NULL : messageReceived.toCallback()));
            return this;
        }
        
        public Builder setMessageSent(MessageSentCallback messageSent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message_sent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (messageSent == null ? MemoryAddress.NULL : messageSent.toCallback()));
            return this;
        }
        
        public Builder setClosed(ClosedCallback closed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closed == null ? MemoryAddress.NULL : closed.toCallback()));
            return this;
        }
        
        public Builder setError(ErrorCallback error) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error.toCallback()));
            return this;
        }
        
        public Builder setTunnelStart(TunnelStartCallback tunnelStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelStart == null ? MemoryAddress.NULL : tunnelStart.toCallback()));
            return this;
        }
        
        public Builder setTunnelComplete(TunnelCompleteCallback tunnelComplete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_complete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelComplete == null ? MemoryAddress.NULL : tunnelComplete.toCallback()));
            return this;
        }
        
        public Builder setErrorFull(ErrorFullCallback errorFull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error_full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (errorFull == null ? MemoryAddress.NULL : errorFull.toCallback()));
            return this;
        }
        
        public Builder setTunnelLost(TunnelLostCallback tunnelLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelLost == null ? MemoryAddress.NULL : tunnelLost.toCallback()));
            return this;
        }
        
        public Builder setTunnelHttpResponse(TunnelHttpResponseCallback tunnelHttpResponse) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tunnel_http_response"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (tunnelHttpResponse == null ? MemoryAddress.NULL : tunnelHttpResponse.toCallback()));
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
