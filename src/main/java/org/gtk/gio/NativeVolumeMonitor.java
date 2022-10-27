package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NativeVolumeMonitor extends org.gtk.gio.VolumeMonitor {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.VolumeMonitor.getMemoryLayout().withName("parent_instance")
    ).withName("GNativeVolumeMonitor");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public NativeVolumeMonitor(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NativeVolumeMonitor */
    public static NativeVolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new NativeVolumeMonitor(gobject.refcounted());
    }
}
