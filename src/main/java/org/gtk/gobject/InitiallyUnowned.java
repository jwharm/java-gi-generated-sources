package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type for objects that have an initially floating reference.
 * <p>
 * All the fields in the {@code GInitiallyUnowned} structure are private to the
 * implementation and should never be accessed directly.
 */
public class InitiallyUnowned extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnowned";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        ValueLayout.JAVA_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("qdata")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code g_type_instance}
     * @return The value of the field {@code g_type_instance}
     */
    public org.gtk.gobject.TypeInstance g_type_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_instance"));
        return new org.gtk.gobject.TypeInstance(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public InitiallyUnowned(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to InitiallyUnowned if its GType is a (or inherits from) "GInitiallyUnowned".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "InitiallyUnowned" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GInitiallyUnowned", a ClassCastException will be thrown.
     */
    public static InitiallyUnowned castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GInitiallyUnowned"))) {
            return new InitiallyUnowned(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GInitiallyUnowned");
        }
    }
}
