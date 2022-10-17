package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MemoryMonitor} will monitor system memory and suggest to the application
 * when to free memory so as to leave more room for other applications.
 * It is implemented on Linux using the <a href="https://gitlab.freedesktop.org/hadess/low-memory-monitor/">Low Memory Monitor</a>
 * (<a href="https://hadess.pages.freedesktop.org/low-memory-monitor/)">API documentation</a>.
 * <p>
 * There is also an implementation for use inside Flatpak sandboxes.
 * <p>
 * Possible actions to take when the signal is received are:
 * <p>
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
 * <p>
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
 */
public interface MemoryMonitor extends io.github.jwharm.javagi.Proxy {

    @ApiStatus.Internal static final MethodHandle g_memory_monitor_dup_default = Interop.downcallHandle(
        "g_memory_monitor_dup_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a reference to the default {@link MemoryMonitor} for the system.
     */
    public static @NotNull MemoryMonitor dupDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_memory_monitor_dup_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MemoryMonitor.MemoryMonitorImpl(Refcounted.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface LowMemoryWarningHandler {
        void signalReceived(MemoryMonitor source, @NotNull MemoryMonitorWarningLevel level);
    }
    
    /**
     * Emitted when the system is running low on free memory. The signal
     * handler should then take the appropriate action depending on the
     * warning level. See the {@link MemoryMonitorWarningLevel} documentation for
     * details.
     */
    public default SignalHandle onLowMemoryWarning(LowMemoryWarningHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("low-memory-warning"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(MemoryMonitor.Callbacks.class, "signalMemoryMonitorLowMemoryWarning",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalMemoryMonitorLowMemoryWarning(MemoryAddress source, int level, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (MemoryMonitor.LowMemoryWarningHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new MemoryMonitor.MemoryMonitorImpl(Refcounted.get(source)), new MemoryMonitorWarningLevel(level));
        }
        
    }
    
    class MemoryMonitorImpl extends org.gtk.gobject.Object implements MemoryMonitor {
        public MemoryMonitorImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
