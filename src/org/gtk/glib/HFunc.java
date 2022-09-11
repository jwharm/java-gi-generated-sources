package org.gtk.glib;

/**
 * Specifies the type of the function passed to g_hash_table_foreach().
 * It is called with each key/value pair, together with the @user_data
 * parameter which is passed to g_hash_table_foreach().
 */
@FunctionalInterface
public interface HFunc {
        void onHFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value);
}
