package org.gtk.glib;

@FunctionalInterface
public interface DataForeachFunc {

    /**
     * Specifies the type of function passed to g_dataset_foreach(). It is
     * called with each #GQuark id and associated data element, together
     * with the @user_data parameter supplied to g_dataset_foreach().
     */
    public void onDataForeachFunc(Quark keyId, jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress userData);
}
