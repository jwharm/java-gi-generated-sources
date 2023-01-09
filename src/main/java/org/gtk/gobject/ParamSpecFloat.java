package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for float properties.
 */
public class ParamSpecFloat extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecFloat";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_FLOAT.withName("minimum"),
            Interop.valueLayout.C_FLOAT.withName("maximum"),
            Interop.valueLayout.C_FLOAT.withName("default_value"),
            Interop.valueLayout.C_FLOAT.withName("epsilon")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecFloat proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecFloat(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecFloat> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecFloat(input);
    
    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
    
    public static boolean isAvailable() {
        return true;
    }
}
