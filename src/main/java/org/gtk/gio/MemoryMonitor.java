package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MemoryMonitor} will monitor system memory and suggest to the application
 * when to free memory so as to leave more room for other applications.
 * It is implemented on Linux using the <a href="https://gitlab.freedesktop.org/hadess/low-memory-monitor/">Low Memory Monitor</a>
 * (<a href="https://hadess.pages.freedesktop.org/low-memory-monitor/">API documentation</a>).
 * <p>
 * There is also an implementation for use inside Flatpak sandboxes.
 * <p>
 * Possible actions to take when the signal is received are:
 * <ul>
 * <li>Free caches
 * <li>Save files that haven't been looked at in a while to disk, ready to be reopened when needed
 * <li>Run a garbage collection cycle
 * <li>Try and compress fragmented allocations
 * <li>Exit on idle if the process has no reason to stay around
 * <li>Call <a href="man:malloc_trim">`malloc_trim(3)`</a> to return cached heap pages to
 *    the kernel (if supported by your libc)
 * </ul>
 * <p>
 * Note that some actions may not always improve system performance, and so
 * should be profiled for your application. {@code malloc_trim()}, for example, may
 * make future heap allocations slower (due to releasing cached heap pages back
 * to the kernel).
 * <p>
 * See {@link MemoryMonitorWarningLevel} for details on the various warning levels.
 * <pre>{@code <!-- language="C" -->
 * static void
 * warning_cb (GMemoryMonitor *m, GMemoryMonitorWarningLevel level)
 * {
 *   g_debug ("Warning level: %d", level);
 *   if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *     drop_caches ();
 * }
 * 
 * static GMemoryMonitor *
 * monitor_low_memory (void)
 * {
 *   GMemoryMonitor *m;
 *   m = g_memory_monitor_dup_default ();
 *   g_signal_connect (G_OBJECT (m), "low-memory-warning",
 *                     G_CALLBACK (warning_cb), NULL);
 *   return m;
 * }
 * }</pre>
 * <p>
 * Don't forget to disconnect the {@link MemoryMonitor}::low-memory-warning
 * signal, and unref the {@link MemoryMonitor} itself when exiting.
 * @version 2.64
 */
public interface MemoryMonitor extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MemoryMonitorImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MemoryMonitorImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_memory_monitor_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a reference to the default {@link MemoryMonitor} for the system.
     * @return a new reference to the default {@link MemoryMonitor}
     */
    public static org.gtk.gio.MemoryMonitor dupDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_memory_monitor_dup_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MemoryMonitor) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MemoryMonitor.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface LowMemoryWarning {
        void run(org.gtk.gio.MemoryMonitorWarningLevel level);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceMemoryMonitor, int level) {
            run(org.gtk.gio.MemoryMonitorWarningLevel.of(level));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LowMemoryWarning.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the system is running low on free memory. The signal
     * handler should then take the appropriate action depending on the
     * warning level. See the {@link MemoryMonitorWarningLevel} documentation for
     * details.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<MemoryMonitor.LowMemoryWarning> onLowMemoryWarning(MemoryMonitor.LowMemoryWarning handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("low-memory-warning"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_memory_monitor_get_type = Interop.downcallHandle(
            "g_memory_monitor_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_memory_monitor_dup_default = Interop.downcallHandle(
            "g_memory_monitor_dup_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class MemoryMonitorImpl extends org.gtk.gobject.GObject implements MemoryMonitor {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public MemoryMonitorImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
