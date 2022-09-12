package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for #GVariant properties.
 * 
 * When comparing values with g_param_values_cmp(), scalar values with the same
 * type will be compared with g_variant_compare(). Other non-%NULL variants will
 * be checked for equality with g_variant_equal(), and their sort order is
 * otherwise undefined. %NULL is ordered before non-%NULL variants. Two %NULL
 * values compare equal.
 */
public class ParamSpecVariant extends ParamSpec {

    public ParamSpecVariant(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecVariant */
    public static ParamSpecVariant castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecVariant(gobject.getReference());
    }
    
}
