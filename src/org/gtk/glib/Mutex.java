package org.gtk.glib;

import io.github.jwharm.javagi.NativeAddress;
import jdk.incubator.foreign.MemoryAddress;

/**
 * The {@link org.gtk.glib.Mutex} struct is an opaque data structure to represent a mutex
 * (mutual exclusion). It can be used to protect data against shared
 * access.
 * 
 * Take for example the following function:
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
 * ]}|
 * It is easy to see that this won&<code>#39</code> t work in a multi-threaded
 * application. There current_number must be protected against shared
 * access. A {@link org.gtk.glib.Mutex} can be used as a solution to this problem:
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 *   int
 *   give_me_next_number (void)
 *   {
 *     static GMutex mutex;
 *     static int current_number = 0;
 *     int ret_val;
 * 
 *     g_mutex_lock (&<code>#38</code> mutex);
 *     ret_val = current_number = calc_next_number (current_number);
 *     g_mutex_unlock (&<code>#38</code> mutex);
 * 
 *     return ret_val;
 *   }
 * ]}|
 * Notice that the {@link org.gtk.glib.Mutex} is not initialised to any particular value.
 * Its placement in static storage ensures that it will be initialised
 * to all-zeros, which is appropriate.
 * 
 * If a {@link org.gtk.glib.Mutex} is placed in other contexts (eg: embedded in a struct)
 * then it must be explicitly initialised using g_mutex_init().
 * 
 * A {@link org.gtk.glib.Mutex} should only be accessed via g_mutex_ functions.
 */
public class Mutex extends io.github.jwharm.javagi.ResourceBase {
    
    public Mutex(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}

