package org.gstreamer.net;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstPtpClock implements a PTP (IEEE1588:2008) ordinary clock in slave-only
 * mode, that allows a GStreamer pipeline to synchronize to a PTP network
 * clock in some specific domain.
 * <p>
 * The PTP subsystem can be initialized with gst_ptp_init(), which then starts
 * a helper process to do the actual communication via the PTP ports. This is
 * required as PTP listens on ports &lt; 1024 and thus requires special
 * privileges. Once this helper process is started, the main process will
 * synchronize to all PTP domains that are detected on the selected
 * interfaces.
 * <p>
 * gst_ptp_clock_new() then allows to create a GstClock that provides the PTP
 * time from a master clock inside a specific PTP domain. This clock will only
 * return valid timestamps once the timestamps in the PTP domain are known. To
 * check this, you can use gst_clock_wait_for_sync(), the GstClock::synced
 * signal and gst_clock_is_synced().
 * <p>
 * To gather statistics about the PTP clock synchronization,
 * gst_ptp_statistics_callback_add() can be used. This gives the application
 * the possibility to collect all kinds of statistics from the clock
 * synchronization.
 * @version 1.6
 */
public class PtpClock extends org.gstreamer.gst.SystemClock {
    
    static {
        GstNet.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPtpClock";
    
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
     * Create a PtpClock proxy instance for the provided memory address.
     * <p>
     * Because PtpClock is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PtpClock(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to PtpClock if its GType is a (or inherits from) "GstPtpClock".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PtpClock} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPtpClock", a ClassCastException will be thrown.
     */
    public static PtpClock castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PtpClock.getType())) {
            return new PtpClock(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPtpClock");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, int domain) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_ptp_clock_new.invokeExact(
                    Interop.allocateNativeString(name),
                    domain);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new PTP clock instance that exports the PTP time of the master
     * clock in {@code domain}. This clock can be slaved to other clocks as needed.
     * <p>
     * If gst_ptp_init() was not called before, this will call gst_ptp_init() with
     * default parameters.
     * <p>
     * This clock only returns valid timestamps after it received the first
     * times from the PTP master clock on the network. Once this happens the
     * GstPtpClock::internal-clock property will become non-NULL. You can
     * check this with gst_clock_wait_for_sync(), the GstClock::synced signal and
     * gst_clock_is_synced().
     * @param name Name of the clock
     * @param domain PTP domain
     */
    public PtpClock(@NotNull java.lang.String name, int domain) {
        super(constructNew(name, domain), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_ptp_clock_get_type.invokeExact();
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
         * A {@link PtpClock.Build} object constructs a {@link PtpClock} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PtpClock} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PtpClock} using {@link PtpClock#castFrom}.
         * @return A new instance of {@code PtpClock} with the properties 
         *         that were set in the Build object.
         */
        public PtpClock construct() {
            return PtpClock.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PtpClock.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setDomain(int domain) {
            names.add("domain");
            values.add(org.gtk.gobject.Value.create(domain));
            return this;
        }
        
        public Build setGrandmasterClockId(long grandmasterClockId) {
            names.add("grandmaster-clock-id");
            values.add(org.gtk.gobject.Value.create(grandmasterClockId));
            return this;
        }
        
        public Build setInternalClock(org.gstreamer.gst.Clock internalClock) {
            names.add("internal-clock");
            values.add(org.gtk.gobject.Value.create(internalClock));
            return this;
        }
        
        public Build setMasterClockId(long masterClockId) {
            names.add("master-clock-id");
            values.add(org.gtk.gobject.Value.create(masterClockId));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_ptp_clock_new = Interop.downcallHandle(
            "gst_ptp_clock_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_ptp_clock_get_type = Interop.downcallHandle(
            "gst_ptp_clock_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
