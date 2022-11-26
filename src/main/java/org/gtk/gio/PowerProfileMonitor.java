package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link PowerProfileMonitor} makes it possible for applications as well as OS components
 * to monitor system power profiles and act upon them. It currently only exports
 * whether the system is in “Power Saver” mode (known as “Low Power” mode on
 * some systems).
 * <p>
 * When in “Low Power” mode, it is recommended that applications:
 * <ul>
 * <li>disable automatic downloads;
 * <li>reduce the rate of refresh from online sources such as calendar or
 *   email synchronisation;
 * <li>reduce the use of expensive visual effects.
 * </ul>
 * <p>
 * It is also likely that OS components providing services to applications will
 * lower their own background activity, for the sake of the system.
 * <p>
 * There are a variety of tools that exist for power consumption analysis, but those
 * usually depend on the OS and hardware used. On Linux, one could use {@code upower} to
 * monitor the battery discharge rate, {@code powertop} to check on the background activity
 * or activity at all), {@code sysprof} to inspect CPU usage, and {@code intel_gpu_time} to
 * profile GPU usage.
 * <p>
 * Don't forget to disconnect the {@link PowerProfileMonitor}::notify::power-saver-enabled
 * signal, and unref the {@link PowerProfileMonitor} itself when exiting.
 * @version 2.70
 */
public interface PowerProfileMonitor extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to PowerProfileMonitor if its GType is a (or inherits from) "GPowerProfileMonitor".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PowerProfileMonitor} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GPowerProfileMonitor", a ClassCastException will be thrown.
     */
    public static PowerProfileMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), PowerProfileMonitor.getType())) {
            return new PowerProfileMonitorImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GPowerProfileMonitor");
        }
    }
    
    /**
     * Gets whether the system is in “Power Saver” mode.
     * <p>
     * You are expected to listen to the
     * {@link PowerProfileMonitor}::notify::power-saver-enabled signal to know when the profile has
     * changed.
     * @return Whether the system is in “Power Saver” mode.
     */
    default boolean getPowerSaverEnabled() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_power_profile_monitor_get_power_saver_enabled.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_power_profile_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a reference to the default {@link PowerProfileMonitor} for the system.
     * @return a new reference to the default {@link PowerProfileMonitor}
     */
    public static @NotNull org.gtk.gio.PowerProfileMonitor dupDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_power_profile_monitor_dup_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.PowerProfileMonitor.PowerProfileMonitorImpl(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_power_profile_monitor_get_power_saver_enabled = Interop.downcallHandle(
            "g_power_profile_monitor_get_power_saver_enabled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_power_profile_monitor_get_type = Interop.downcallHandle(
            "g_power_profile_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_power_profile_monitor_dup_default = Interop.downcallHandle(
            "g_power_profile_monitor_dup_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class PowerProfileMonitorImpl extends org.gtk.gobject.Object implements PowerProfileMonitor {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public PowerProfileMonitorImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
