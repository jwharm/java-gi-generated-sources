package org.gtk.glib;

/**
 * Specifies the type of the function passed to
 * g_hash_table_foreach_remove(). It is called with each key/value
 * pair, together with the {@code user_data} parameter passed to
 * g_hash_table_foreach_remove(). It should return <code>true</code> if the
 * key/value pair should be removed from the {@link HashTable}.
 */
@FunctionalInterface
public interface HRFunc {
        boolean onHRFunc(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value);
}
