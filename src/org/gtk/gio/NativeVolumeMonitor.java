package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class NativeVolumeMonitor extends VolumeMonitor {

    public NativeVolumeMonitor(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to NativeVolumeMonitor */
    public static NativeVolumeMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new NativeVolumeMonitor(gobject.getProxy());
    }
    
}
