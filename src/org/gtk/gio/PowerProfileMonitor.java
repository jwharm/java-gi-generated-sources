package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.PowerProfileMonitor} makes it possible for applications as well as OS components
 * to monitor system power profiles and act upon them. It currently only exports
 * whether the system is in &<code>#8220</code> Power Saver&<code>#8221</code>  mode (known as &<code>#8220</code> Low Power&<code>#8221</code>  mode on
 * some systems).
 * <p>
 * When in &<code>#8220</code> Low Power&<code>#8221</code>  mode, it is recommended that applications:
 * <li>disabling automatic downloads
 * <li>reduce the rate of refresh from online sources such as calendar or
 *   email synchronisation
 * <li>if the application has expensive visual effects, reduce them
 * <p>
 * It is also likely that OS components providing services to applications will
 * lower their own background activity, for the sake of the system.
 * <p>
 * There are a variety of tools that exist for power consumption analysis, but those
 * usually depend on the OS and hardware used. On Linux, one could use <code>upower</code> to
 * monitor the battery discharge rate, <code>powertop</code> to check on the background activity
 * or activity at all), <code>sysprof</code> to inspect CPU usage, and <code>intel_gpu_time</code> to
 * profile GPU usage.
 * 
 * Don&<code>#39</code> t forget to disconnect the {@link org.gtk.gio.PowerProfileMonitor} :notify::power-saver-enabled
 * signal, and unref the {@link org.gtk.gio.PowerProfileMonitor} itself when exiting.
 */
public interface PowerProfileMonitor extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets whether the system is in &<code>#8220</code> Power Saver&<code>#8221</code>  mode.
     * 
     * You are expected to listen to the
     * {@link org.gtk.gio.PowerProfileMonitor} :notify::power-saver-enabled signal to know when the profile has
     * changed.
     */
    public default boolean getPowerSaverEnabled() {
        var RESULT = gtk_h.g_power_profile_monitor_get_power_saver_enabled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets a reference to the default {@link org.gtk.gio.PowerProfileMonitor} for the system.
     */
    public static PowerProfileMonitor dupDefault() {
        var RESULT = gtk_h.g_power_profile_monitor_dup_default();
        return new PowerProfileMonitor.PowerProfileMonitorImpl(References.get(RESULT, true));
    }
    
    class PowerProfileMonitorImpl extends org.gtk.gobject.Object implements PowerProfileMonitor {
        public PowerProfileMonitorImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
