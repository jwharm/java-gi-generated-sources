package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NtpClock extends org.gstreamer.net.NetClientClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNtpClock";
    
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
     * Create a NtpClock proxy instance for the provided memory address.
     * <p>
     * Because NtpClock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NtpClock(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to NtpClock if its GType is a (or inherits from) "GstNtpClock".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code NtpClock} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstNtpClock", a ClassCastException will be thrown.
     */
    public static NtpClock castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), NtpClock.getType())) {
            return new NtpClock(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstNtpClock");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull java.lang.String remoteAddress, int remotePort, @NotNull org.gstreamer.gst.ClockTime baseTime) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(remoteAddress, "Parameter 'remoteAddress' must not be null");
        java.util.Objects.requireNonNull(baseTime, "Parameter 'baseTime' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ntp_clock_new.invokeExact(
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
     * Create a new {@link NtpClock} that will report the time provided by
     * the NTPv4 server on {@code remote_address} and {@code remote_port}.
     * @param name a name for the clock
     * @param remoteAddress the address or hostname of the remote clock provider
     * @param remotePort the port of the remote clock provider
     * @param baseTime initial time of the clock
     */
    public NtpClock(@NotNull java.lang.String name, @NotNull java.lang.String remoteAddress, int remotePort, @NotNull org.gstreamer.gst.ClockTime baseTime) {
        super(constructNew(name, remoteAddress, remotePort, baseTime), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ntp_clock_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.net.NetClientClock.Build {
        
         /**
         * A {@link NtpClock.Build} object constructs a {@link NtpClock} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link NtpClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NtpClock} using {@link NtpClock#castFrom}.
         * @return A new instance of {@code NtpClock} with the properties 
         *         that were set in the Build object.
         */
        public NtpClock construct() {
            return NtpClock.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    NtpClock.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_ntp_clock_new = Interop.downcallHandle(
            "gst_ntp_clock_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_ntp_clock_get_type = Interop.downcallHandle(
            "gst_ntp_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
