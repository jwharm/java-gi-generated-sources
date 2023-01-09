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
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BuilderScopeImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BuilderScopeImpl(input);
    
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
    
    /**
     * The BuilderScopeImpl type represents a native instance of the BuilderScope interface.
     */
    class BuilderScopeImpl extends org.gtk.gobject.GObject implements BuilderScope {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of BuilderScope for the provided memory address.
         * @param address the memory address of the instance
         */
        public BuilderScopeImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_builder_scope_get_type != null;
    }
}
