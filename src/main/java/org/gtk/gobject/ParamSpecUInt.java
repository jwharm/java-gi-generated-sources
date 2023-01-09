package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for unsigned integer properties.
 */
public class ParamSpecUInt extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecUInt";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_INT.withName("minimum"),
            Interop.valueLayout.C_INT.withName("maximum"),
            Interop.valueLayout.C_INT.withName("default_value")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecUInt proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecUInt(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecUInt> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecUInt(input);
    
    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
    
    public static boolean isAvailable() {
        return true;
    }
}
