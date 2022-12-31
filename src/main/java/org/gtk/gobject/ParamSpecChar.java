package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for character properties.
 */
public class ParamSpecChar extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecChar";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_BYTE.withName("minimum"),
            Interop.valueLayout.C_BYTE.withName("maximum"),
            Interop.valueLayout.C_BYTE.withName("default_value")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecChar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpecChar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecChar> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecChar(input, ownership);

    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
}
