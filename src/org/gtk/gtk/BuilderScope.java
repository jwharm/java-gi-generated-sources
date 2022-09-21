package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBuilderScope} is an interface to provide language binding support
 * to {@code GtkBuilder}.
 * <p>
 * The goal of {@code GtkBuilderScope} is to look up programming-language-specific
 * values for strings that are given in a {@code GtkBuilder} UI file.
 * <p>
 * The primary intended audience is bindings that want to provide deeper
 * integration of {@code GtkBuilder} into the language.
 * <p>
 * A {@code GtkBuilderScope} instance may be used with multiple {@code GtkBuilder} objects,
 * even at once.
 * <p>
 * By default, GTK will use its own implementation of {@code GtkBuilderScope}
 * for the C language which can be created via {@link BuilderCScope#BuilderCScope}.
 */
public interface BuilderScope extends io.github.jwharm.javagi.NativeAddress {

    class BuilderScopeImpl extends org.gtk.gobject.Object implements BuilderScope {
        public BuilderScopeImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
