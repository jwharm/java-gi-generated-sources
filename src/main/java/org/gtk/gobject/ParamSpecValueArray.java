package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that contains the meta data for {@link ValueArray} properties.
 */
public class ParamSpecValueArray extends ParamSpec {

    public ParamSpecValueArray(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecValueArray */
    public static ParamSpecValueArray castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecValueArray(gobject.refcounted());
    }
    
}
