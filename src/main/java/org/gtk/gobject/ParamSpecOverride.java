package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that redirects operations to
 * other types of {@link ParamSpec}.
 * <p>
 * All operations other than getting or setting the value are redirected,
 * including accessing the nick and blurb, validating a value, and so
 * forth.
 * <p>
 * See g_param_spec_get_redirect_target() for retrieving the overridden
 * property. {@link ParamSpecOverride} is used in implementing
 * g_object_class_override_property(), and will not be directly useful
 * unless you are implementing a new base type similar to GObject.
 * @version 2.4
 */
public class ParamSpecOverride extends org.gtk.gobject.ParamSpec {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecOverride";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("overridden")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a ParamSpecOverride proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecOverride(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecOverride> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecOverride(input);
    
    public static org.gtk.glib.Type getType() {
        return org.gtk.glib.Type.G_TYPE_PARAM;
    }
    
    public static boolean isAvailable() {
        return true;
    }
}
