package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to
 * g_hash_table_foreach_remove(). It is called with each key/value
 * pair, together with the {@code user_data} parameter passed to
 * g_hash_table_foreach_remove(). It should return {@code true} if the
 * key/value pair should be removed from the {@link HashTable}.
 */
@FunctionalInterface
public interface HRFunc {
        boolean onHRFunc(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);
}
