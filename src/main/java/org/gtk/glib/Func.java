package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of functions passed to g_list_foreach() and
 * g_slist_foreach().
 */
@FunctionalInterface
public interface Func {
        void onFunc();
}
