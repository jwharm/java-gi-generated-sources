package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for string
 * properties.
 */
public class ParamSpecString extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecString";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("default_value"),
            Interop.valueLayout.ADDRESS.withName("cset_first"),
            Interop.valueLayout.ADDRESS.withName("cset_nth"),
            Interop.valueLayout.C_BYTE.withName("substitutor"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("null_fold_if_empty"),
            Interop.valueLayout.C_INT.withName("ensure_non_null")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecString proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecString(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecString> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecString(input);
    
    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
    
    public static boolean isAvailable() {
        return true;
    }
}
