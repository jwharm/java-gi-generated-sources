package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCDataChannel extends org.gtk.gobject.GObject {
    
    static {
        GstWebRTC.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCDataChannel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a WebRTCDataChannel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected WebRTCDataChannel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, WebRTCDataChannel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new WebRTCDataChannel(input, ownership);
    
    /**
     * Close the {@code channel}.
     */
    public void close() {
        try {
            DowncallHandles.gst_webrtc_data_channel_close.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Send {@code data} as a data message over {@code channel}.
     * @param data a {@link org.gtk.glib.Bytes} or {@code null}
     */
    public void sendData(@Nullable org.gtk.glib.Bytes data) {
        try {
            DowncallHandles.gst_webrtc_data_channel_send_data.invokeExact(
                    handle(),
                    (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Send {@code str} as a string message over {@code channel}.
     * @param str a string or {@code null}
     */
    public void sendString(@Nullable java.lang.String str) {
        try {
            DowncallHandles.gst_webrtc_data_channel_send_string.invokeExact(
                    handle(),
                    (Addressable) (str == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(str, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_webrtc_data_channel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Close {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Close.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Close the data channel
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<WebRTCDataChannel.Close> onClose(WebRTCDataChannel.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("close"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnBufferedAmountLow {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnBufferedAmountLow.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnBufferedAmountLow> onOnBufferedAmountLow(WebRTCDataChannel.OnBufferedAmountLow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-buffered-amount-low"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnClose {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnClose.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnClose> onOnClose(WebRTCDataChannel.OnClose handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-close"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnError {
        void run(org.gtk.glib.Error error);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel, MemoryAddress error) {
            run(org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnError.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnError> onOnError(WebRTCDataChannel.OnError handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-error"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnMessageData {
        void run(@Nullable org.gtk.glib.Bytes data);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data) {
            run(org.gtk.glib.Bytes.fromAddress.marshal(data, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnMessageData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnMessageData> onOnMessageData(WebRTCDataChannel.OnMessageData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-message-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnMessageString {
        void run(@Nullable java.lang.String data);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data) {
            run(Marshal.addressToString.marshal(data, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnMessageString.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnMessageString> onOnMessageString(WebRTCDataChannel.OnMessageString handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-message-string"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnOpen {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OnOpen.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.OnOpen> onOnOpen(WebRTCDataChannel.OnOpen handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("on-open"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SendData {
        void run(@Nullable org.gtk.glib.Bytes data);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data) {
            run(org.gtk.glib.Bytes.fromAddress.marshal(data, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendData.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.SendData> onSendData(WebRTCDataChannel.SendData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("send-data"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SendString {
        void run(@Nullable java.lang.String data);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data) {
            run(Marshal.addressToString.marshal(data, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SendString.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<WebRTCDataChannel.SendString> onSendString(WebRTCDataChannel.SendString handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("send-string"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link WebRTCDataChannel.Builder} object constructs a {@link WebRTCDataChannel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link WebRTCDataChannel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link WebRTCDataChannel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCDataChannel}.
         * @return A new instance of {@code WebRTCDataChannel} with the properties 
         *         that were set in the Builder object.
         */
        public WebRTCDataChannel build() {
            return (WebRTCDataChannel) org.gtk.gobject.GObject.newWithProperties(
                WebRTCDataChannel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setBufferedAmount(long bufferedAmount) {
            names.add("buffered-amount");
            values.add(org.gtk.gobject.Value.create(bufferedAmount));
            return this;
        }
        
        public Builder setBufferedAmountLowThreshold(long bufferedAmountLowThreshold) {
            names.add("buffered-amount-low-threshold");
            values.add(org.gtk.gobject.Value.create(bufferedAmountLowThreshold));
            return this;
        }
        
        public Builder setId(int id) {
            names.add("id");
            values.add(org.gtk.gobject.Value.create(id));
            return this;
        }
        
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        public Builder setMaxPacketLifetime(int maxPacketLifetime) {
            names.add("max-packet-lifetime");
            values.add(org.gtk.gobject.Value.create(maxPacketLifetime));
            return this;
        }
        
        public Builder setMaxRetransmits(int maxRetransmits) {
            names.add("max-retransmits");
            values.add(org.gtk.gobject.Value.create(maxRetransmits));
            return this;
        }
        
        public Builder setNegotiated(boolean negotiated) {
            names.add("negotiated");
            values.add(org.gtk.gobject.Value.create(negotiated));
            return this;
        }
        
        public Builder setOrdered(boolean ordered) {
            names.add("ordered");
            values.add(org.gtk.gobject.Value.create(ordered));
            return this;
        }
        
        public Builder setPriority(org.gstreamer.webrtc.WebRTCPriorityType priority) {
            names.add("priority");
            values.add(org.gtk.gobject.Value.create(priority));
            return this;
        }
        
        public Builder setProtocol(java.lang.String protocol) {
            names.add("protocol");
            values.add(org.gtk.gobject.Value.create(protocol));
            return this;
        }
        
        public Builder setReadyState(org.gstreamer.webrtc.WebRTCDataChannelState readyState) {
            names.add("ready-state");
            values.add(org.gtk.gobject.Value.create(readyState));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_webrtc_data_channel_close = Interop.downcallHandle(
            "gst_webrtc_data_channel_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_webrtc_data_channel_send_data = Interop.downcallHandle(
            "gst_webrtc_data_channel_send_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_webrtc_data_channel_send_string = Interop.downcallHandle(
            "gst_webrtc_data_channel_send_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_webrtc_data_channel_get_type = Interop.downcallHandle(
            "gst_webrtc_data_channel_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
