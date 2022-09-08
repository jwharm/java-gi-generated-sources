package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GParamSpec derived structure that redirects operations to
 * other types of #GParamSpec.
 * 
 * All operations other than getting or setting the value are redirected,
 * including accessing the nick and blurb, validating a value, and so
 * forth.
 * 
 * See g_param_spec_get_redirect_target() for retrieving the overridden
 * property. #GParamSpecOverride is used in implementing
 * g_object_class_override_property(), and will not be directly useful
 * unless you are implementing a new base type similar to GObject.
 */
public class ParamSpecOverride extends ParamSpec {

    public ParamSpecOverride(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecOverride */
    public static ParamSpecOverride castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecOverride(gobject.getReference());
    }
    
}
