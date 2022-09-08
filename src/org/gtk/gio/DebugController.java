package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GDebugController is an interface to expose control of debugging features and
 * debug output.
 * 
 * It is implemented on Linux using #GDebugControllerDBus, which exposes a D-Bus
 * interface to allow authenticated peers to control debug features in this
 * process.
 * 
 * Whether debug output is enabled is exposed as
 * #GDebugController:debug-enabled. This controls g_log_set_debug_enabled() by
 * default. Application code may connect to the #GObject::notify signal for it
 * to control other parts of its debug infrastructure as necessary.
 * 
 * If your application or service is using the default GLib log writer function,
 * creating one of the built-in implementations of #GDebugController should be
 * all that’s needed to dynamically enable or disable debug output.
 */
public interface DebugController extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Get the value of #GDebugController:debug-enabled.
     */
    public default boolean getDebugEnabled() {
        var RESULT = gtk_h.g_debug_controller_get_debug_enabled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Set the value of #GDebugController:debug-enabled.
     */
    public default void setDebugEnabled(boolean debugEnabled) {
        gtk_h.g_debug_controller_set_debug_enabled(handle(), debugEnabled ? 1 : 0);
    }
    
    class DebugControllerImpl extends org.gtk.gobject.Object implements DebugController {
        public DebugControllerImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
