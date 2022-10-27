package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of a function that can duplicate user data for an attribute.
 */
@FunctionalInterface
public interface AttrDataCopyFunc {
        java.lang.foreign.MemoryAddress onAttrDataCopyFunc();
}
