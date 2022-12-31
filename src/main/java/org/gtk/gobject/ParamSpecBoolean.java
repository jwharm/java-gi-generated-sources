package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for boolean properties.
 */
public class ParamSpecBoolean extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecBoolean";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_INT.withName("default_value")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecBoolean proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpecBoolean(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecBoolean> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecBoolean(input, ownership);

    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
}
