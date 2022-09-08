package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class NativeVolumeMonitor extends VolumeMonitor {

    public NativeVolumeMonitor(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to NativeVolumeMonitor */
    public static NativeVolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new NativeVolumeMonitor(gobject.getReference());
    }
    
}
