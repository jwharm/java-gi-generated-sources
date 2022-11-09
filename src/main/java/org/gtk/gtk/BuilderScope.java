package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public interface BuilderScope extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to BuilderScope if its GType is a (or inherits from) "GtkBuilderScope".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BuilderScope" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilderScope", a ClassCastException will be thrown.
     */
    public static BuilderScope castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBuilderScope"))) {
            return new BuilderScopeImpl(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilderScope");
        }
    }
    
    class BuilderScopeImpl extends org.gtk.gobject.Object implements BuilderScope {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public BuilderScopeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
