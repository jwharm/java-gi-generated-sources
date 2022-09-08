package org.gtk.glib;

import io.github.jwharm.javagi.interop.NativeAddress;
import jdk.incubator.foreign.MemoryAddress;

/**
 * The #GMutex struct is an opaque data structure to represent a mutex
 * (mutual exclusion). It can be used to protect data against shared
 * access.
 * 
 * Take for example the following function:
 * |[<!-- language="C" -->
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
 * ]|
 * It is easy to see that this won't work in a multi-threaded
 * application. There current_number must be protected against shared
 * access. A #GMutex can be used as a solution to this problem:
 * |[<!-- language="C" -->
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
 * ]|
 * Notice that the #GMutex is not initialised to any particular value.
 * Its placement in static storage ensures that it will be initialised
 * to all-zeros, which is appropriate.
 * 
 * If a #GMutex is placed in other contexts (eg: embedded in a struct)
 * then it must be explicitly initialised using g_mutex_init().
 * 
 * A #GMutex should only be accessed via g_mutex_ functions.
 */
public class Mutex extends io.github.jwharm.javagi.interop.ResourceBase {
    
    public Mutex(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
}

