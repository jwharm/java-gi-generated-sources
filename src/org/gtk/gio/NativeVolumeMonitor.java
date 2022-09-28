package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class NativeVolumeMonitor extends VolumeMonitor {

    public NativeVolumeMonitor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NativeVolumeMonitor */
    public static NativeVolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new NativeVolumeMonitor(gobject.getReference());
    }
    
}
