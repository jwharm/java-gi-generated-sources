package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link ParamSpec} derived structure that redirects operations to
 * other types of {@link ParamSpec}.
 * <p>
 * All operations other than getting or setting the value are redirected,
 * including accessing the nick and blurb, validating a value, and so
 * forth.
 * <p>
 * See g_param_spec_get_redirect_target() for retrieving the overridden
 * property. {@link ParamSpecOverride} is used in implementing
 * g_object_class_override_property(), and will not be directly useful
 * unless you are implementing a new base type similar to GObject.
 */
public class ParamSpecOverride extends ParamSpec {

    public ParamSpecOverride(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ParamSpecOverride */
    public static ParamSpecOverride castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecOverride(gobject.refcounted());
    }
    
}
