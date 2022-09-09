package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GOnce struct controls a one-time initialization function. Any
 * one-time initialization function must have its own unique #GOnce
 * struct.
 */
public class Once extends io.github.jwharm.javagi.interop.ResourceBase {

    public Once(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Function to be called when starting a critical initialization
     * section. The argument @location must point to a static
     * 0-initialized variable that will be set to a value other than 0 at
     * the end of the initialization section. In combination with
     * g_once_init_leave() and the unique address @value_location, it can
     * be ensured that an initialization section will be executed only once
     * during a program's life time, and that concurrent threads are
     * blocked until initialization completed. To be used in constructs
     * like this:
     * 
     * |[<!-- language="C" -->
     *   static gsize initialization_value = 0;
     * 
     *   if (g_once_init_enter (&initialization_value))
     *     {
     *       gsize setup_value = 42; // initialization code here
     * 
     *       g_once_init_leave (&initialization_value, setup_value);
     *     }
     * 
     *   // use initialization_value here
     * ]|
     * 
     * While @location has a `volatile` qualifier, this is a historical artifact and
     * the pointer passed to it should not be `volatile`.
     */
    public static boolean initEnter(jdk.incubator.foreign.MemoryAddress location) {
        var RESULT = gtk_h.g_once_init_enter(location);
        return (RESULT != 0);
    }
    
    /**
     * Counterpart to g_once_init_enter(). Expects a location of a static
     * 0-initialized initialization variable, and an initialization value
     * other than 0. Sets the variable to the initialization value, and
     * releases concurrent threads blocking in g_once_init_enter() on this
     * initialization variable.
     * 
     * While @location has a `volatile` qualifier, this is a historical artifact and
     * the pointer passed to it should not be `volatile`.
     */
    public static void initLeave(jdk.incubator.foreign.MemoryAddress location, long result) {
        gtk_h.g_once_init_leave(location, result);
    }
    
}
