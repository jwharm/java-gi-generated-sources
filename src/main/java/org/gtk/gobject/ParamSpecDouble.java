package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for double properties.
 */
public class ParamSpecDouble extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecDouble";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_DOUBLE.withName("minimum"),
            Interop.valueLayout.C_DOUBLE.withName("maximum"),
            Interop.valueLayout.C_DOUBLE.withName("default_value"),
            Interop.valueLayout.C_DOUBLE.withName("epsilon")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecDouble proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpecDouble(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecDouble> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecDouble(input, ownership);

    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
}
