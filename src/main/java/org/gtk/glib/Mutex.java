package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Mutex} struct is an opaque data structure to represent a mutex
 * (mutual exclusion). It can be used to protect data against shared
 * access.
 * <p>
 * Take for example the following function:
 * <pre>{@code <!-- language="C" -->
 *   int
 *   give_me_next_number (void)
 *   {
 *     static int current_number = 0;
 * 
 *     // now do a very complicated calculation to calculate the new
 *     // number, this might for example be a random number generator
 *     current_number = calc_next_number (current_number);
 * 
 *     return current_number;
 *   }
 * }</pre>
 * It is easy to see that this won't work in a multi-threaded
 * application. There current_number must be protected against shared
 * access. A {@link Mutex} can be used as a solution to this problem:
 * <pre>{@code <!-- language="C" -->
 *   int
 *   give_me_next_number (void)
 *   {
 *     static GMutex mutex;
 *     static int current_number = 0;
 *     int ret_val;
 * 
 *     g_mutex_lock (&mutex);
 *     ret_val = current_number = calc_next_number (current_number);
 *     g_mutex_unlock (&mutex);
 * 
 *     return ret_val;
 *   }
 * }</pre>
 * Notice that the {@link Mutex} is not initialised to any particular value.
 * Its placement in static storage ensures that it will be initialised
 * to all-zeros, which is appropriate.
 * <p>
 * If a {@link Mutex} is placed in other contexts (eg: embedded in a struct)
 * then it must be explicitly initialised using g_mutex_init().
 * <p>
 * A {@link Mutex} should only be accessed via g_mutex_ functions.
 */
public class Mutex extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMutex";
    
    private static final GroupLayout memoryLayout = MemoryLayout.unionLayout(
        Interop.valueLayout.ADDRESS.withName("p"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_INT).withName("i")
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
     * Create a Mutex proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Mutex(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}

