package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of a function filtering a list of attributes.
 */
@FunctionalInterface
public interface AttrFilterFunc {
        boolean onAttrFilterFunc(@NotNull org.pango.Attribute attribute);
}
