package org.gtk.glib;

@FunctionalInterface
public interface HFunc {

    /**
     * Specifies the type of the function passed to g_hash_table_foreach().
     * It is called with each key/value pair, together with the @user_data
     * parameter which is passed to g_hash_table_foreach().
     */
    public void onHFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value, jdk.incubator.foreign.MemoryAddress userData);
}
