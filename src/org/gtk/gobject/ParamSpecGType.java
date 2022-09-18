package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gobject.ParamSpec} derived structure that contains the meta data for {@link org.gtk.glib.Type} properties.
 */
public class ParamSpecGType extends ParamSpec {

    public ParamSpecGType(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ParamSpecGType */
    public static ParamSpecGType castFrom(org.gtk.gobject.Object gobject) {
        return new ParamSpecGType(gobject.getReference());
    }
    
}
