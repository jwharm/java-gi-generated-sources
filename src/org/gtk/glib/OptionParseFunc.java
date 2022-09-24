package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * The type of function that can be called before and after parsing.
 */
@FunctionalInterface
public interface OptionParseFunc {
        boolean onOptionParseFunc(OptionContext context, OptionGroup group);
}
