package org.pango;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Type of a function filtering a list of attributes.
 */
@FunctionalInterface
public interface AttrFilterFunc {
        boolean onAttrFilterFunc(@NotNull Attribute attribute);
}
