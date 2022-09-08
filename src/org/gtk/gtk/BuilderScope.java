package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBuilderScope` is an interface to provide language binding support
 * to `GtkBuilder`.
 * 
 * The goal of `GtkBuilderScope` is to look up programming-language-specific
 * values for strings that are given in a `GtkBuilder` UI file.
 * 
 * The primary intended audience is bindings that want to provide deeper
 * integration of `GtkBuilder` into the language.
 * 
 * A `GtkBuilderScope` instance may be used with multiple `GtkBuilder` objects,
 * even at once.
 * 
 * By default, GTK will use its own implementation of `GtkBuilderScope`
 * for the C language which can be created via [ctor@Gtk.BuilderCScope.new].
 */
public interface BuilderScope extends io.github.jwharm.javagi.interop.NativeAddress {

    class BuilderScopeImpl extends org.gtk.gobject.Object implements BuilderScope {
        public BuilderScopeImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
