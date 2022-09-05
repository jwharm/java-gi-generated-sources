package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for pointer properties.
 */
public class ParamSpecPointer extends ParamSpec {

    public ParamSpecPointer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ParamSpecPointer */
    public static ParamSpecPointer castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecPointer(gobject.getProxy());
    }
    
}
