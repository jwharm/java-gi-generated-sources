package org.harfbuzz;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Data type containing a set of virtual methods used for
 * working on {@link font_t} font objects.
 * <p>
 * HarfBuzz provides a lightweight default function for each of
 * the methods in {@link font_funcs_t}. Client programs can implement
 * their own replacements for the individual font functions, as
 * needed, and replace the default by calling the setter for a
 * method.
 */
public class FontFuncsT extends io.github.jwharm.javagi.ResourceBase {

    public FontFuncsT(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
