package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that contains the meta data for unsigned character properties.
 */
public class ParamSpecUChar extends ParamSpec {

    public ParamSpecUChar(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecUChar */
    public static ParamSpecUChar castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecUChar(gobject.getReference());
    }
    
}
