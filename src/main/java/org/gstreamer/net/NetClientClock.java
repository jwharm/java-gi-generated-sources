package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link NetClientClock} implements a custom {@link org.gstreamer.gst.Clock} that synchronizes its time
 * to a remote time provider such as {@link NetTimeProvider}. {@link NtpClock}
 * implements a {@link org.gstreamer.gst.Clock} that synchronizes its time to a remote NTPv4 server.
 * <p>
 * A new clock is created with gst_net_client_clock_new() or
 * gst_ntp_clock_new(), which takes the address and port of the remote time
 * provider along with a name and an initial time.
 * <p>
 * This clock will poll the time provider and will update its calibration
 * parameters based on the local and remote observations.
 * <p>
 * The "round-trip" property limits the maximum round trip packets can take.
 * <p>
 * Various parameters of the clock can be configured with the parent {@link org.gstreamer.gst.Clock}
 * "timeout", "window-size" and "window-threshold" object properties.
 * <p>
 * A {@link NetClientClock} and {@link NtpClock} is typically set on a {@link org.gstreamer.gst.Pipeline} with
 * gst_pipeline_use_clock().
 * <p>
 * If you set a {@link org.gstreamer.gst.Bus} on the clock via the "bus" object property, it will
 * send {@code GST_MESSAGE_ELEMENT} messages with an attached {@link org.gstreamer.gst.Structure} containing
 * statistics about clock accuracy and network traffic.
 */
public class NetClientClock extends org.gstreamer.gst.SystemClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNetClientClock";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.SystemClock.getMemoryLayout().withName("clock"),
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
     * Create a NetClientClock proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetClientClock(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to NetClientClock if its GType is a (or inherits from) "GstNetClientClock".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NetClientClock} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstNetClientClock", a ClassCastException will be thrown.
     */
    public static NetClientClock castFrom(org.gtk.gobject.Object gobject) {
            return new NetClientClock(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull java.lang.String remoteAddress, int remotePort, @NotNull org.gstreamer.gst.ClockTime baseTime) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(remoteAddress, "Parameter 'remoteAddress' must not be null");
        java.util.Objects.requireNonNull(baseTime, "Parameter 'baseTime' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_net_client_clock_new.invokeExact(
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(remoteAddress),
                    remotePort,
                    baseTime.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link NetClientClock} that will report the time
     * provided by the {@link NetTimeProvider} on {@code remote_address} and
     * {@code remote_port}.
     * @param name a name for the clock
     * @param remoteAddress the address or hostname of the remote clock provider
     * @param remotePort the port of the remote clock provider
     * @param baseTime initial time of the clock
     */
    public NetClientClock(@NotNull java.lang.String name, @NotNull java.lang.String remoteAddress, int remotePort, @NotNull org.gstreamer.gst.ClockTime baseTime) {
        super(constructNew(name, remoteAddress, remotePort, baseTime), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_net_client_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.SystemClock.Build {
        
         /**
         * A {@link NetClientClock.Build} object constructs a {@link NetClientClock} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link NetClientClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NetClientClock} using {@link NetClientClock#castFrom}.
         * @return A new instance of {@code NetClientClock} with the properties 
         *         that were set in the Build object.
         */
        public NetClientClock construct() {
            return NetClientClock.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    NetClientClock.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAddress(java.lang.String address) {
            names.add("address");
            values.add(org.gtk.gobject.Value.create(address));
            return this;
        }
        
        public Build setBaseTime(long baseTime) {
            names.add("base-time");
            values.add(org.gtk.gobject.Value.create(baseTime));
            return this;
        }
        
        public Build setBus(org.gstreamer.gst.Bus bus) {
            names.add("bus");
            values.add(org.gtk.gobject.Value.create(bus));
            return this;
        }
        
        public Build setInternalClock(org.gstreamer.gst.Clock internalClock) {
            names.add("internal-clock");
            values.add(org.gtk.gobject.Value.create(internalClock));
            return this;
        }
        
        public Build setMinimumUpdateInterval(long minimumUpdateInterval) {
            names.add("minimum-update-interval");
            values.add(org.gtk.gobject.Value.create(minimumUpdateInterval));
            return this;
        }
        
        public Build setPort(int port) {
            names.add("port");
            values.add(org.gtk.gobject.Value.create(port));
            return this;
        }
        
        public Build setQosDscp(int qosDscp) {
            names.add("qos-dscp");
            values.add(org.gtk.gobject.Value.create(qosDscp));
            return this;
        }
        
        public Build setRoundTripLimit(long roundTripLimit) {
            names.add("round-trip-limit");
            values.add(org.gtk.gobject.Value.create(roundTripLimit));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_net_client_clock_new = Interop.downcallHandle(
            "gst_net_client_clock_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_net_client_clock_get_type = Interop.downcallHandle(
            "gst_net_client_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
