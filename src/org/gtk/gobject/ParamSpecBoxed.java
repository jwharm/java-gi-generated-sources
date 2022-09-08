package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for boxed properties.
 */
public class ParamSpecBoxed extends ParamSpec {

    public ParamSpecBoxed(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecBoxed */
    public static ParamSpecBoxed castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecBoxed(gobject.getReference());
    }
    
}
