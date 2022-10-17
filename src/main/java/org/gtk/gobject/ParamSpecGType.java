package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link org.gtk.glib.Type} properties.
 */
public class ParamSpecGType extends ParamSpec {

    public ParamSpecGType(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecGType */
    public static ParamSpecGType castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecGType(gobject.refcounted());
    }
    
}
