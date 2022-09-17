package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkBuilderScope</code> is an interface to provide language binding support
 * to <code>GtkBuilder</code>.
 * <p>
 * The goal of <code>GtkBuilderScope</code> is to look up programming-language-specific
 * values for strings that are given in a <code>GtkBuilder</code> UI file.
 * <p>
 * The primary intended audience is bindings that want to provide deeper
 * integration of <code>GtkBuilder</code> into the language.
 * <p>
 * A <code>GtkBuilderScope</code> instance may be used with multiple <code>GtkBuilder</code> objects,
 * even at once.
 * <p>
 * By default, GTK will use its own implementation of <code>GtkBuilderScope</code>
 * for the C language which can be created via {@link [ctor@Gtk.BuilderCScope.new] (ref=ctor)}.
 */
public interface BuilderScope extends io.github.jwharm.javagi.NativeAddress {

    class BuilderScopeImpl extends org.gtk.gobject.Object implements BuilderScope {
        public BuilderScopeImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
