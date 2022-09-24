package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * The type of function to be used as callback when a parse error occurs.
 */
@FunctionalInterface
public interface OptionErrorFunc {
        void onOptionErrorFunc(OptionContext context, OptionGroup group);
}
