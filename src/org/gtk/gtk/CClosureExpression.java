package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A variant of `GtkClosureExpression` using a C closure.
 */
public class CClosureExpression extends Expression {

    public CClosureExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CClosureExpression */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new CClosureExpression(gobject.getReference());
    }
    
}
