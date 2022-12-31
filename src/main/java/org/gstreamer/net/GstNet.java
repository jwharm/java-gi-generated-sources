package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstNet namespace.
 */
public final class GstNet {
    
    static {
        System.loadLibrary("gstnet-1.0");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * The size of the packets sent between network clocks.
     */
    public static final int NET_TIME_PACKET_SIZE = 16;
    
    /**
     * PTP clock identification that can be passed to gst_ptp_init() to
     * automatically select one based on the MAC address of interfaces
     */
    public static final long PTP_CLOCK_ID_NONE = -1L;
    
    public static final java.lang.String PTP_STATISTICS_BEST_MASTER_CLOCK_SELECTED = "GstPtpStatisticsBestMasterClockSelected";
    
    public static final java.lang.String PTP_STATISTICS_NEW_DOMAIN_FOUND = "GstPtpStatisticsNewDomainFound";
    
    public static final java.lang.String PTP_STATISTICS_PATH_DELAY_MEASURED = "GstPtpStatisticsPathDelayMeasured";
    
    public static final java.lang.String PTP_STATISTICS_TIME_UPDATED = "GstPtpStatisticsTimeUpdated";
    
    /**
     * Attaches {@code addr} as metadata in a {@link NetAddressMeta} to {@code buffer}.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @param addr a {@code GSocketAddress} to connect to {@code buffer}
     * @return a {@link NetAddressMeta} connected to {@code buffer}
     */
    public static org.gstreamer.net.NetAddressMeta bufferAddNetAddressMeta(org.gstreamer.gst.Buffer buffer, org.gtk.gio.SocketAddress addr) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_net_address_meta.invokeExact(
                    buffer.handle(),
                    addr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.net.NetAddressMeta.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Attaches {@code message} as metadata in a {@link NetControlMessageMeta} to {@code buffer}.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @param message a {@code GSocketControlMessage} to attach to {@code buffer}
     * @return a {@link NetControlMessageMeta} connected to {@code buffer}
     */
    public static org.gstreamer.net.NetControlMessageMeta bufferAddNetControlMessageMeta(org.gstreamer.gst.Buffer buffer, org.gtk.gio.SocketControlMessage message) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_net_control_message_meta.invokeExact(
                    buffer.handle(),
                    message.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.net.NetControlMessageMeta.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Find the {@link NetAddressMeta} on {@code buffer}.
     * @param buffer a {@link org.gstreamer.gst.Buffer}
     * @return the {@link NetAddressMeta} or {@code null} when there
     * is no such metadata on {@code buffer}.
     */
    public static org.gstreamer.net.NetAddressMeta bufferGetNetAddressMeta(org.gstreamer.gst.Buffer buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_net_address_meta.invokeExact(
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.net.NetAddressMeta.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public static org.gtk.glib.Type netAddressMetaApiGetType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_address_meta_api_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.gst.MetaInfo netAddressMetaGetInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_address_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public static org.gtk.glib.Type netControlMessageMetaApiGetType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_control_message_meta_api_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.gst.MetaInfo netControlMessageMetaGetInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_control_message_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Receives a {@link NetTimePacket} over a socket. Handles interrupted system
     * calls, but otherwise returns NULL on error.
     * @param socket socket to receive the time packet on
     * @param srcAddress address of variable to return sender address
     * @return a new {@link NetTimePacket}, or NULL on error. Free
     *    with gst_net_time_packet_free() when done.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gstreamer.net.NetTimePacket netTimePacketReceive(org.gtk.gio.Socket socket, Out<org.gtk.gio.SocketAddress> srcAddress) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment srcAddressPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_time_packet_receive.invokeExact(
                    socket.handle(),
                    (Addressable) srcAddressPOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        srcAddress.set((org.gtk.gio.SocketAddress) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(srcAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gio.SocketAddress.fromAddress).marshal(srcAddressPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return org.gstreamer.net.NetTimePacket.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Configures IP_TOS value of socket, i.e. sets QoS DSCP.
     * @param socket Socket to configure
     * @param qosDscp QoS DSCP value
     * @return TRUE if successful, FALSE in case an error occurred.
     */
    public static boolean netUtilsSetSocketTos(org.gtk.gio.Socket socket, int qosDscp) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_net_utils_set_socket_tos.invokeExact(
                    socket.handle(),
                    qosDscp);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Deinitialize the GStreamer PTP subsystem and stop the PTP clock. If there
     * are any remaining GstPtpClock instances, they won't be further synchronized
     * to the PTP network clock.
     */
    public static void ptpDeinit() {
        try {
            DowncallHandles.gst_ptp_deinit.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initialize the GStreamer PTP subsystem and create a PTP ordinary clock in
     * slave-only mode for all domains on the given {@code interfaces} with the
     * given {@code clock_id}.
     * <p>
     * If {@code clock_id} is {@code GST_PTP_CLOCK_ID_NONE}, a clock id is automatically
     * generated from the MAC address of the first network interface.
     * <p>
     * This function is automatically called by gst_ptp_clock_new() with default
     * parameters if it wasn't called before.
     * @param clockId PTP clock id of this process' clock or {@code GST_PTP_CLOCK_ID_NONE}
     * @param interfaces network interfaces to run the clock on
     * @return {@code true} if the GStreamer PTP clock subsystem could be initialized.
     */
    public static boolean ptpInit(long clockId, @Nullable java.lang.String[] interfaces) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ptp_init.invokeExact(
                    clockId,
                    (Addressable) (interfaces == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interfaces, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if the GStreamer PTP clock subsystem is initialized.
     * @return {@code true} if the GStreamer PTP clock subsystem is initialized.
     */
    public static boolean ptpIsInitialized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ptp_is_initialized.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if PTP clocks are generally supported on this system, and if previous
     * initializations did not fail.
     * @return {@code true} if PTP clocks are generally supported on this system, and
     * previous initializations did not fail.
     */
    public static boolean ptpIsSupported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_ptp_is_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Installs a new statistics callback for gathering PTP statistics. See
     * GstPtpStatisticsCallback for a list of statistics that are provided.
     * @param callback GstPtpStatisticsCallback to call
     * @param destroyData GDestroyNotify to destroy the data
     * @return Id for the callback that can be passed to
     * gst_ptp_statistics_callback_remove()
     */
    public static long ptpStatisticsCallbackAdd(org.gstreamer.net.PtpStatisticsCallback callback, org.gtk.glib.DestroyNotify destroyData) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ptp_statistics_callback_add.invokeExact(
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a PTP statistics callback that was previously added with
     * gst_ptp_statistics_callback_add().
     * @param id Callback id to remove
     */
    public static void ptpStatisticsCallbackRemove(long id) {
        try {
            DowncallHandles.gst_ptp_statistics_callback_remove.invokeExact(
                    id);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_add_net_address_meta = Interop.downcallHandle(
            "gst_buffer_add_net_address_meta",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_add_net_control_message_meta = Interop.downcallHandle(
            "gst_buffer_add_net_control_message_meta",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_get_net_address_meta = Interop.downcallHandle(
            "gst_buffer_get_net_address_meta",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_address_meta_api_get_type = Interop.downcallHandle(
            "gst_net_address_meta_api_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_net_address_meta_get_info = Interop.downcallHandle(
            "gst_net_address_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_control_message_meta_api_get_type = Interop.downcallHandle(
            "gst_net_control_message_meta_api_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_net_control_message_meta_get_info = Interop.downcallHandle(
            "gst_net_control_message_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_time_packet_receive = Interop.downcallHandle(
            "gst_net_time_packet_receive",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_net_utils_set_socket_tos = Interop.downcallHandle(
            "gst_net_utils_set_socket_tos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ptp_deinit = Interop.downcallHandle(
            "gst_ptp_deinit",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_ptp_init = Interop.downcallHandle(
            "gst_ptp_init",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ptp_is_initialized = Interop.downcallHandle(
            "gst_ptp_is_initialized",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ptp_is_supported = Interop.downcallHandle(
            "gst_ptp_is_supported",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ptp_statistics_callback_add = Interop.downcallHandle(
            "gst_ptp_statistics_callback_add",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_ptp_statistics_callback_remove = Interop.downcallHandle(
            "gst_ptp_statistics_callback_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
