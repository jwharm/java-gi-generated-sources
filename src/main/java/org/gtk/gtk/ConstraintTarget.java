package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkConstraintTarget} interface is implemented by objects that
 * can be used as source or target in {@code GtkConstraint}s.
 * <p>
 * Besides {@code GtkWidget}, it is also implemented by {@code GtkConstraintGuide}.
 */
public interface ConstraintTarget extends io.github.jwharm.javagi.Proxy {

    class ConstraintTargetImpl extends org.gtk.gobject.Object implements ConstraintTarget {
        public ConstraintTargetImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
