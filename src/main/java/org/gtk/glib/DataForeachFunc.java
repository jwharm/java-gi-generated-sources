package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_dataset_foreach(). It is
 * called with each {@link Quark} id and associated data element, together
 * with the {@code user_data} parameter supplied to g_dataset_foreach().
 */
@FunctionalInterface
public interface DataForeachFunc {
        void onDataForeachFunc(@NotNull org.gtk.glib.Quark keyId);
}
