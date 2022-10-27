package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link org.gtk.glib.Variant} properties.
 * <p>
 * When comparing values with g_param_values_cmp(), scalar values with the same
 * type will be compared with g_variant_compare(). Other non-{@code null} variants will
 * be checked for equality with g_variant_equal(), and their sort order is
 * otherwise undefined. {@code null} is ordered before non-{@code null} variants. Two {@code null}
 * values compare equal.
 * @version 2.26
 */
public class ParamSpecVariant extends org.gtk.gobject.ParamSpec {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
        org.gtk.glib.VariantType.getMemoryLayout().withName("type"),
        org.gtk.glib.Variant.getMemoryLayout().withName("default_value"),
        MemoryLayout.sequenceLayout(4, ValueLayout.ADDRESS).withName("padding")
    ).withName("GParamSpecVariant");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public ParamSpecVariant(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecVariant */
    public static ParamSpecVariant castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecVariant(gobject.refcounted());
    }
}
