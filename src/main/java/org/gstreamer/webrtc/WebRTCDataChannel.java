package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WebRTCDataChannel extends org.gtk.gobject.Object {
    
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
    @ApiStatus.Internal
    public WebRTCDataChannel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to WebRTCDataChannel if its GType is a (or inherits from) "GstWebRTCDataChannel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code WebRTCDataChannel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstWebRTCDataChannel", a ClassCastException will be thrown.
     */
    public static WebRTCDataChannel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), WebRTCDataChannel.getType())) {
            return new WebRTCDataChannel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstWebRTCDataChannel");
        }
    }
    
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
                    (Addressable) (str == null ? MemoryAddress.NULL : Interop.allocateNativeString(str)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel);
    }
    
    /**
     * Close the data channel
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<WebRTCDataChannel.Close> onClose(WebRTCDataChannel.Close handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.Close>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnBufferedAmountLow {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel);
    }
    
    public Signal<WebRTCDataChannel.OnBufferedAmountLow> onOnBufferedAmountLow(WebRTCDataChannel.OnBufferedAmountLow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-buffered-amount-low"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnBufferedAmountLow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnBufferedAmountLow>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnClose {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel);
    }
    
    public Signal<WebRTCDataChannel.OnClose> onOnClose(WebRTCDataChannel.OnClose handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-close"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnClose",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnClose>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnError {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel, @NotNull org.gtk.glib.Error error);
    }
    
    public Signal<WebRTCDataChannel.OnError> onOnError(WebRTCDataChannel.OnError handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-error"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnError",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnError>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnMessageData {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel, @Nullable org.gtk.glib.Bytes data);
    }
    
    public Signal<WebRTCDataChannel.OnMessageData> onOnMessageData(WebRTCDataChannel.OnMessageData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-message-data"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnMessageData",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnMessageData>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnMessageString {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel, @Nullable java.lang.String data);
    }
    
    public Signal<WebRTCDataChannel.OnMessageString> onOnMessageString(WebRTCDataChannel.OnMessageString handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-message-string"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnMessageString",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnMessageString>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface OnOpen {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel);
    }
    
    public Signal<WebRTCDataChannel.OnOpen> onOnOpen(WebRTCDataChannel.OnOpen handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("on-open"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelOnOpen",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.OnOpen>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SendData {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel, @Nullable org.gtk.glib.Bytes data);
    }
    
    public Signal<WebRTCDataChannel.SendData> onSendData(WebRTCDataChannel.SendData handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("send-data"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelSendData",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.SendData>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SendString {
        void signalReceived(WebRTCDataChannel sourceWebRTCDataChannel, @Nullable java.lang.String data);
    }
    
    public Signal<WebRTCDataChannel.SendString> onSendString(WebRTCDataChannel.SendString handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("send-string"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(WebRTCDataChannel.Callbacks.class, "signalWebRTCDataChannelSendString",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<WebRTCDataChannel.SendString>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link WebRTCDataChannel.Build} object constructs a {@link WebRTCDataChannel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link WebRTCDataChannel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link WebRTCDataChannel} using {@link WebRTCDataChannel#castFrom}.
         * @return A new instance of {@code WebRTCDataChannel} with the properties 
         *         that were set in the Build object.
         */
        public WebRTCDataChannel construct() {
            return WebRTCDataChannel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    WebRTCDataChannel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBufferedAmount(long bufferedAmount) {
            names.add("buffered-amount");
            values.add(org.gtk.gobject.Value.create(bufferedAmount));
            return this;
        }
        
        public Build setBufferedAmountLowThreshold(long bufferedAmountLowThreshold) {
            names.add("buffered-amount-low-threshold");
            values.add(org.gtk.gobject.Value.create(bufferedAmountLowThreshold));
            return this;
        }
        
        public Build setId(int id) {
            names.add("id");
            values.add(org.gtk.gobject.Value.create(id));
            return this;
        }
        
        public Build setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        public Build setMaxPacketLifetime(int maxPacketLifetime) {
            names.add("max-packet-lifetime");
            values.add(org.gtk.gobject.Value.create(maxPacketLifetime));
            return this;
        }
        
        public Build setMaxRetransmits(int maxRetransmits) {
            names.add("max-retransmits");
            values.add(org.gtk.gobject.Value.create(maxRetransmits));
            return this;
        }
        
        public Build setNegotiated(boolean negotiated) {
            names.add("negotiated");
            values.add(org.gtk.gobject.Value.create(negotiated));
            return this;
        }
        
        public Build setOrdered(boolean ordered) {
            names.add("ordered");
            values.add(org.gtk.gobject.Value.create(ordered));
            return this;
        }
        
        public Build setPriority(org.gstreamer.webrtc.WebRTCPriorityType priority) {
            names.add("priority");
            values.add(org.gtk.gobject.Value.create(priority));
            return this;
        }
        
        public Build setProtocol(java.lang.String protocol) {
            names.add("protocol");
            values.add(org.gtk.gobject.Value.create(protocol));
            return this;
        }
        
        public Build setReadyState(org.gstreamer.webrtc.WebRTCDataChannelState readyState) {
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
    
    private static class Callbacks {
        
        public static void signalWebRTCDataChannelClose(MemoryAddress sourceWebRTCDataChannel, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.Close) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelOnBufferedAmountLow(MemoryAddress sourceWebRTCDataChannel, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnBufferedAmountLow) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelOnClose(MemoryAddress sourceWebRTCDataChannel, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnClose) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelOnError(MemoryAddress sourceWebRTCDataChannel, MemoryAddress error, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnError) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE), new org.gtk.glib.Error(error, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelOnMessageData(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnMessageData) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE), new org.gtk.glib.Bytes(data, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelOnMessageString(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnMessageString) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE), Interop.getStringFrom(data));
        }
        
        public static void signalWebRTCDataChannelOnOpen(MemoryAddress sourceWebRTCDataChannel, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.OnOpen) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelSendData(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.SendData) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE), new org.gtk.glib.Bytes(data, Ownership.NONE));
        }
        
        public static void signalWebRTCDataChannelSendString(MemoryAddress sourceWebRTCDataChannel, MemoryAddress data, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WebRTCDataChannel.SendString) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new WebRTCDataChannel(sourceWebRTCDataChannel, Ownership.NONE), Interop.getStringFrom(data));
        }
    }
}
