package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkConstraintTarget` interface is implemented by objects that
 * can be used as source or target in `GtkConstraint`s.
 * 
 * Besides `GtkWidget`, it is also implemented by `GtkConstraintGuide`.
 */
public interface ConstraintTarget extends io.github.jwharm.javagi.interop.NativeAddress {

    class ConstraintTargetImpl extends org.gtk.gobject.Object implements ConstraintTarget {
        public ConstraintTargetImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
