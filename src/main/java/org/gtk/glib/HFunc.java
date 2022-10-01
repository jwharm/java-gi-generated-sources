package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the type of the function passed to g_hash_table_foreach().
 * It is called with each key/value pair, together with the {@code user_data}
 * parameter which is passed to g_hash_table_foreach().
 */
@FunctionalInterface
public interface HFunc {
        void onHFunc(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value);
}
