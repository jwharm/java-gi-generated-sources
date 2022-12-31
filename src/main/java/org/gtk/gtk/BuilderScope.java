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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuilderScopeImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BuilderScopeImpl(input, ownership);
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
    
    class BuilderScopeImpl extends org.gtk.gobject.GObject implements BuilderScope {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public BuilderScopeImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
