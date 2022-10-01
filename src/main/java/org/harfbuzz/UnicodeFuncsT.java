package org.harfbuzz;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Data type containing a set of virtual methods used for
 * accessing various Unicode character properties.
 * <p>
 * HarfBuzz provides a default function for each of the
 * methods in {@link unicode_funcs_t}. Client programs can implement
 * their own replacements for the individual Unicode functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class UnicodeFuncsT extends io.github.jwharm.javagi.ResourceBase {

    public UnicodeFuncsT(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
}
