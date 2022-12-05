package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides a base class for RTP depayloaders
 */
public class RTPBaseDepayload extends org.gstreamer.gst.Element {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseDepayload";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("sinkpad"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        Interop.valueLayout.C_INT.withName("clock_rate"),
        MemoryLayout.paddingLayout(32),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        Interop.valueLayout.C_INT.withName("need_newsegment"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a RTPBaseDepayload proxy instance for the provided memory address.
     * <p>
     * Because RTPBaseDepayload is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RTPBaseDepayload(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to RTPBaseDepayload if its GType is a (or inherits from) "GstRTPBaseDepayload".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code RTPBaseDepayload} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstRTPBaseDepayload", a ClassCastException will be thrown.
     */
    public static RTPBaseDepayload castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), RTPBaseDepayload.getType())) {
            return new RTPBaseDepayload(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstRTPBaseDepayload");
        }
    }
    
    /**
     * Queries whether {@link RTPSourceMeta} will be added to depayloaded buffers.
     * @return {@code true} if source-info is enabled.
     */
    public boolean isSourceInfoEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_depayload_is_source_info_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Push {@code out_buf} to the peer of {@code filter}. This function takes ownership of
     * {@code out_buf}.
     * <p>
     * This function will by default apply the last incoming timestamp on
     * the outgoing buffer when it didn't have a timestamp already.
     * @param outBuf a {@link org.gstreamer.gst.Buffer}
     * @return a {@link org.gstreamer.gst.FlowReturn}.
     */
    public @NotNull org.gstreamer.gst.FlowReturn push(@NotNull org.gstreamer.gst.Buffer outBuf) {
        java.util.Objects.requireNonNull(outBuf, "Parameter 'outBuf' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_depayload_push.invokeExact(
                    handle(),
                    outBuf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Push {@code out_list} to the peer of {@code filter}. This function takes ownership of
     * {@code out_list}.
     * @param outList a {@link org.gstreamer.gst.BufferList}
     * @return a {@link org.gstreamer.gst.FlowReturn}.
     */
    public @NotNull org.gstreamer.gst.FlowReturn pushList(@NotNull org.gstreamer.gst.BufferList outList) {
        java.util.Objects.requireNonNull(outList, "Parameter 'outList' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_depayload_push_list.invokeExact(
                    handle(),
                    outList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Enable or disable adding {@link RTPSourceMeta} to depayloaded buffers.
     * @param enable whether to add meta about RTP sources to buffer
     */
    public void setSourceInfoEnabled(boolean enable) {
        try {
            DowncallHandles.gst_rtp_base_depayload_set_source_info_enabled.invokeExact(
                    handle(),
                    enable ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gst_rtp_base_depayload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AddExtension {
        void signalReceived(RTPBaseDepayload sourceRTPBaseDepayload, @NotNull org.gstreamer.rtp.RTPHeaderExtension ext);
    }
    
    /**
     * Add {@code ext} as an extension for reading part of an RTP header extension from
     * incoming RTP packets.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.AddExtension> onAddExtension(RTPBaseDepayload.AddExtension handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("add-extension"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RTPBaseDepayload.Callbacks.class, "signalRTPBaseDepayloadAddExtension",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<RTPBaseDepayload.AddExtension>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ClearExtensions {
        void signalReceived(RTPBaseDepayload sourceRTPBaseDepayload);
    }
    
    /**
     * Clear all RTP header extensions used by this depayloader.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.ClearExtensions> onClearExtensions(RTPBaseDepayload.ClearExtensions handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("clear-extensions"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RTPBaseDepayload.Callbacks.class, "signalRTPBaseDepayloadClearExtensions",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<RTPBaseDepayload.ClearExtensions>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RequestExtension {
        void signalReceived(RTPBaseDepayload sourceRTPBaseDepayload, int extId, @Nullable java.lang.String extUri);
    }
    
    /**
     * The returned {@code ext} must be configured with the correct {@code ext_id} and with the
     * necessary attributes as required by the extension implementation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.RequestExtension> onRequestExtension(RTPBaseDepayload.RequestExtension handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("request-extension"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RTPBaseDepayload.Callbacks.class, "signalRTPBaseDepayloadRequestExtension",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<RTPBaseDepayload.RequestExtension>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link RTPBaseDepayload.Build} object constructs a {@link RTPBaseDepayload} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link RTPBaseDepayload} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPBaseDepayload} using {@link RTPBaseDepayload#castFrom}.
         * @return A new instance of {@code RTPBaseDepayload} with the properties 
         *         that were set in the Build object.
         */
        public RTPBaseDepayload construct() {
            return RTPBaseDepayload.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    RTPBaseDepayload.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If enabled, the depayloader will automatically try to enable all the
         * RTP header extensions provided in the sink caps, saving the application
         * the need to handle these extensions manually using the
         * GstRTPBaseDepayload::request-extension: signal.
         * @param autoHeaderExtension The value for the {@code auto-header-extension} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutoHeaderExtension(boolean autoHeaderExtension) {
            names.add("auto-header-extension");
            values.add(org.gtk.gobject.Value.create(autoHeaderExtension));
            return this;
        }
        
        /**
         * Max seqnum reorder before the sender is assumed to have restarted.
         * <p>
         * When max-reorder is set to 0 all reordered/duplicate packets are
         * considered coming from a restarted sender.
         * @param maxReorder The value for the {@code max-reorder} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxReorder(int maxReorder) {
            names.add("max-reorder");
            values.add(org.gtk.gobject.Value.create(maxReorder));
            return this;
        }
        
        /**
         * Add RTP source information found in RTP header as meta to output buffer.
         * @param sourceInfo The value for the {@code source-info} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSourceInfo(boolean sourceInfo) {
            names.add("source-info");
            values.add(org.gtk.gobject.Value.create(sourceInfo));
            return this;
        }
        
        /**
         * Various depayloader statistics retrieved atomically (and are therefore
         * synchroized with each other). This property return a GstStructure named
         * application/x-rtp-depayload-stats containing the following fields relating to
         * the last processed buffer and current state of the stream being depayloaded:
         * <p>
         *   * {@code clock-rate}: {@code G_TYPE_UINT}, clock-rate of the stream
         *   * {@code npt-start}: {@code G_TYPE_UINT64}, time of playback start
         *   * {@code npt-stop}: {@code G_TYPE_UINT64}, time of playback stop
         *   * {@code play-speed}: {@code G_TYPE_DOUBLE}, the playback speed
         *   * {@code play-scale}: {@code G_TYPE_DOUBLE}, the playback scale
         *   * {@code running-time-dts}: {@code G_TYPE_UINT64}, the last running-time of the
         *      last DTS
         *   * {@code running-time-pts}: {@code G_TYPE_UINT64}, the last running-time of the
         *      last PTS
         *   * {@code seqnum}: {@code G_TYPE_UINT}, the last seen seqnum
         *   * {@code timestamp}: {@code G_TYPE_UINT}, the last seen RTP timestamp
         * @param stats The value for the {@code stats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStats(org.gstreamer.gst.Structure stats) {
            names.add("stats");
            values.add(org.gtk.gobject.Value.create(stats));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtp_base_depayload_is_source_info_enabled = Interop.downcallHandle(
            "gst_rtp_base_depayload_is_source_info_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_depayload_push = Interop.downcallHandle(
            "gst_rtp_base_depayload_push",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_depayload_push_list = Interop.downcallHandle(
            "gst_rtp_base_depayload_push_list",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtp_base_depayload_set_source_info_enabled = Interop.downcallHandle(
            "gst_rtp_base_depayload_set_source_info_enabled",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_rtp_base_depayload_get_type = Interop.downcallHandle(
            "gst_rtp_base_depayload_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalRTPBaseDepayloadAddExtension(MemoryAddress sourceRTPBaseDepayload, MemoryAddress ext, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (RTPBaseDepayload.AddExtension) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new RTPBaseDepayload(sourceRTPBaseDepayload, Ownership.NONE), new org.gstreamer.rtp.RTPHeaderExtension(ext, Ownership.FULL));
        }
        
        public static void signalRTPBaseDepayloadClearExtensions(MemoryAddress sourceRTPBaseDepayload, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (RTPBaseDepayload.ClearExtensions) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new RTPBaseDepayload(sourceRTPBaseDepayload, Ownership.NONE));
        }
        
        public static void signalRTPBaseDepayloadRequestExtension(MemoryAddress sourceRTPBaseDepayload, int extId, MemoryAddress extUri, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (RTPBaseDepayload.RequestExtension) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new RTPBaseDepayload(sourceRTPBaseDepayload, Ownership.NONE), extId, Interop.getStringFrom(extUri));
        }
    }
}
