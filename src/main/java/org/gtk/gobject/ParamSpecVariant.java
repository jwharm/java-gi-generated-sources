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
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecVariant";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("type"),
            Interop.valueLayout.ADDRESS.withName("default_value"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecVariant proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecVariant(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecVariant> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecVariant(input);
    
    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
    
    public static boolean isAvailable() {
        return true;
    }
}
