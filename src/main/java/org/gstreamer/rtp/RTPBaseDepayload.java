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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    /**
     * Create a RTPBaseDepayload proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBaseDepayload(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseDepayload> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseDepayload(input);
    
    /**
     * Queries whether {@link RTPSourceMeta} will be added to depayloaded buffers.
     * @return {@code true} if source-info is enabled.
     */
    public boolean isSourceInfoEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_rtp_base_depayload_is_source_info_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gstreamer.gst.FlowReturn push(org.gstreamer.gst.Buffer outBuf) {
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
    public org.gstreamer.gst.FlowReturn pushList(org.gstreamer.gst.BufferList outList) {
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
                    Marshal.booleanToInteger.marshal(enable, null).intValue());
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
            RESULT = (long) DowncallHandles.gst_rtp_base_depayload_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AddExtension} callback.
     */
    @FunctionalInterface
    public interface AddExtension {
    
        /**
         * Add {@code ext} as an extension for reading part of an RTP header extension from
         * incoming RTP packets.
         */
        void run(org.gstreamer.rtp.RTPHeaderExtension ext);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRTPBaseDepayload, MemoryAddress ext) {
            run((org.gstreamer.rtp.RTPHeaderExtension) Interop.register(ext, org.gstreamer.rtp.RTPHeaderExtension.fromAddress).marshal(ext, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddExtension.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Add {@code ext} as an extension for reading part of an RTP header extension from
     * incoming RTP packets.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.AddExtension> onAddExtension(RTPBaseDepayload.AddExtension handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("add-extension", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ClearExtensions} callback.
     */
    @FunctionalInterface
    public interface ClearExtensions {
    
        /**
         * Clear all RTP header extensions used by this depayloader.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRTPBaseDepayload) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClearExtensions.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Clear all RTP header extensions used by this depayloader.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.ClearExtensions> onClearExtensions(RTPBaseDepayload.ClearExtensions handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("clear-extensions", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code RequestExtension} callback.
     */
    @FunctionalInterface
    public interface RequestExtension {
    
        /**
         * The returned {@code ext} must be configured with the correct {@code ext_id} and with the
         * necessary attributes as required by the extension implementation.
         */
        org.gstreamer.rtp.RTPHeaderExtension run(int extId, @Nullable java.lang.String extUri);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceRTPBaseDepayload, int extId, MemoryAddress extUri) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(extId, Marshal.addressToString.marshal(extUri, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RequestExtension.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The returned {@code ext} must be configured with the correct {@code ext_id} and with the
     * necessary attributes as required by the extension implementation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RTPBaseDepayload.RequestExtension> onRequestExtension(RTPBaseDepayload.RequestExtension handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("request-extension", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link RTPBaseDepayload.Builder} object constructs a {@link RTPBaseDepayload} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link RTPBaseDepayload.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link RTPBaseDepayload} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RTPBaseDepayload}.
         * @return A new instance of {@code RTPBaseDepayload} with the properties 
         *         that were set in the Builder object.
         */
        public RTPBaseDepayload build() {
            return (RTPBaseDepayload) org.gtk.gobject.GObject.newWithProperties(
                RTPBaseDepayload.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setAutoHeaderExtension(boolean autoHeaderExtension) {
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
        public Builder setMaxReorder(int maxReorder) {
            names.add("max-reorder");
            values.add(org.gtk.gobject.Value.create(maxReorder));
            return this;
        }
        
        /**
         * Add RTP source information found in RTP header as meta to output buffer.
         * @param sourceInfo The value for the {@code source-info} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSourceInfo(boolean sourceInfo) {
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
        public Builder setStats(org.gstreamer.gst.Structure stats) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_rtp_base_depayload_get_type != null;
    }
}
