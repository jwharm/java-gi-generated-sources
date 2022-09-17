package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkConstraintTarget</code> interface is implemented by objects that
 * can be used as source or target in <code>GtkConstraint</code>s.
 * <p>
 * Besides <code>GtkWidget</code>, it is also implemented by <code>GtkConstraintGuide</code>.
 */
public interface ConstraintTarget extends io.github.jwharm.javagi.NativeAddress {

    class ConstraintTargetImpl extends org.gtk.gobject.Object implements ConstraintTarget {
        public ConstraintTargetImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
