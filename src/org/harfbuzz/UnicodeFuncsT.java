package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type containing a set of virtual methods used for
 * accessing various Unicode character properties.
 * 
 * HarfBuzz provides a default function for each of the
 * methods in #hb_unicode_funcs_t. Client programs can implement
 * their own replacements for the individual Unicode functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class UnicodeFuncsT extends io.github.jwharm.javagi.interop.ResourceBase {

    public UnicodeFuncsT(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
}