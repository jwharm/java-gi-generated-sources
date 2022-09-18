package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.MemoryMonitor} will monitor system memory and suggest to the application
 * when to free memory so as to leave more room for other applications.
 * It is implemented on Linux using the {@link [Low Memory Monitor]}(https://gitlab.freedesktop.org/hadess/low-memory-monitor/)
 * ({@link [API documentation]}(https://hadess.pages.freedesktop.org/low-memory-monitor/)).
 * <p>
 * There is also an implementation for use inside Flatpak sandboxes.
 * <p>
 * Possible actions to take when the signal is received are:
 * <p>
 *  - Free caches
 *  - Save files that haven&<code>#39</code> t been looked at in a while to disk, ready to be reopened when needed
 *  - Run a garbage collection cycle
 *  - Try and compress fragmented allocations
 *  - Exit on idle if the process has no reason to stay around
 *  - Call {@link [<code>malloc_trim(3)</code>]}(man:malloc_trim) to return cached heap pages to
 *    the kernel (if supported by your libc)
 * <p>
 * Note that some actions may not always improve system performance, and so
 * should be profiled for your application. <code>malloc_trim()</code>, for example, may
 * make future heap allocations slower (due to releasing cached heap pages back
 * to the kernel).
 * 
 * See {@link org.gtk.gio.MemoryMonitorWarningLevel} for details on the various warning levels.
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 * static void
 * warning_cb (GMemoryMonitor *m, GMemoryMonitorWarningLevel level)
 * {
 *   g_debug (&<code>#34</code> Warning level: <code>d</code> <code>#34</code> , level);
 *   if (warning_level &<code>#62</code>  G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *     drop_caches ();
 * }
 * 
 * static GMemoryMonitor *
 * monitor_low_memory (void)
 * {
 *   GMemoryMonitor *m;
 *   m = g_memory_monitor_dup_default ();
 *   g_signal_connect (G_OBJECT (m), &<code>#34</code> low-memory-warning&<code>#34</code> ,
 *                     G_CALLBACK (warning_cb), NULL);
 *   return m;
 * }
 * ]}|
 * 
 * Don&<code>#39</code> t forget to disconnect the {@link org.gtk.gio.MemoryMonitor} :low-memory-warning
 * signal, and unref the {@link org.gtk.gio.MemoryMonitor} itself when exiting.
 */
public interface MemoryMonitor extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Gets a reference to the default {@link org.gtk.gio.MemoryMonitor} for the system.
     */
    public static MemoryMonitor dupDefault() {
        var RESULT = gtk_h.g_memory_monitor_dup_default();
        return new MemoryMonitor.MemoryMonitorImpl(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface LowMemoryWarningHandler {
        void signalReceived(MemoryMonitor source, MemoryMonitorWarningLevel level);
    }
    
    /**
     * Emitted when the system is running low on free memory. The signal
     * handler should then take the appropriate action depending on the
     * warning level. See the {@link org.gtk.gio.MemoryMonitorWarningLevel} documentation for
     * details.
     */
    public default SignalHandle onLowMemoryWarning(LowMemoryWarningHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalMemoryMonitorLowMemoryWarning", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("low-memory-warning").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class MemoryMonitorImpl extends org.gtk.gobject.Object implements MemoryMonitor {
        public MemoryMonitorImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
