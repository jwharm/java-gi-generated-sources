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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PowerProfileMonitorImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PowerProfileMonitorImpl(input);
    
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
            RESULT = (int) DowncallHandles.g_power_profile_monitor_get_power_saver_enabled.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    public static org.gtk.gio.PowerProfileMonitor dupDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_power_profile_monitor_dup_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.PowerProfileMonitor) Interop.register(RESULT, org.gtk.gio.PowerProfileMonitor.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    
    /**
     * The PowerProfileMonitorImpl type represents a native instance of the PowerProfileMonitor interface.
     */
    class PowerProfileMonitorImpl extends org.gtk.gobject.GObject implements PowerProfileMonitor {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of PowerProfileMonitor for the provided memory address.
         * @param address the memory address of the instance
         */
        public PowerProfileMonitorImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_power_profile_monitor_get_type != null;
    }
}
