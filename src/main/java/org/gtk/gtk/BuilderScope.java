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
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BuilderScope} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBuilderScope", a ClassCastException will be thrown.
     */
    public static BuilderScope castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), BuilderScope.getType())) {
            return new BuilderScopeImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBuilderScope");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_builder_scope_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_builder_scope_get_type = Interop.downcallHandle(
            "gtk_builder_scope_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
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
