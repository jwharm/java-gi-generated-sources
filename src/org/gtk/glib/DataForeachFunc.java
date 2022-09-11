package org.gtk.glib;

/**
 * Specifies the type of function passed to g_dataset_foreach(). It is
 * called with each #GQuark id and associated data element, together
 * with the @user_data parameter supplied to g_dataset_foreach().
 */
@FunctionalInterface
public interface DataForeachFunc {
        void onDataForeachFunc(Quark keyId);
}
