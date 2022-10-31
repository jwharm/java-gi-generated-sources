package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NativeVolumeMonitor extends org.gtk.gio.VolumeMonitor {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNativeVolumeMonitor";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.VolumeMonitor.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gio.VolumeMonitor parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gio.VolumeMonitor(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public NativeVolumeMonitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to NativeVolumeMonitor if its GType is a (or inherits from) "GNativeVolumeMonitor".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "NativeVolumeMonitor" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GNativeVolumeMonitor", a ClassCastException will be thrown.
     */
    public static NativeVolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GNativeVolumeMonitor"))) {
            return new NativeVolumeMonitor(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GNativeVolumeMonitor");
        }
    }
}
