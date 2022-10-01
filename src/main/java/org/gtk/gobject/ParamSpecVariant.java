package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link org.gtk.glib.Variant} properties.
 * <p>
 * When comparing values with g_param_values_cmp(), scalar values with the same
 * type will be compared with g_variant_compare(). Other non-{@code null} variants will
 * be checked for equality with g_variant_equal(), and their sort order is
 * otherwise undefined. {@code null} is ordered before non-{@code null} variants. Two {@code null}
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
