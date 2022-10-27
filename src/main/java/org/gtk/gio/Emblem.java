package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Emblem} is an implementation of {@link Icon} that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a {@link EmblemedIcon}.
 * <p>
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public class Emblem extends org.gtk.gobject.Object implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Emblem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Emblem */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        return new Emblem(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_emblem_new.invokeExact(icon.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     * @param icon a GIcon containing the icon.
     */
    public Emblem(@NotNull org.gtk.gio.Icon icon) {
        super(constructNew(icon));
    }
    
    private static Refcounted constructNewWithOrigin(@NotNull org.gtk.gio.Icon icon, @NotNull org.gtk.gio.EmblemOrigin origin) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        java.util.Objects.requireNonNull(origin, "Parameter 'origin' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_emblem_new_with_origin.invokeExact(icon.handle(), origin.getValue()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     * @param icon a GIcon containing the icon.
     * @param origin a GEmblemOrigin enum defining the emblem's origin
     * @return a new {@link Emblem}.
     */
    public static Emblem newWithOrigin(@NotNull org.gtk.gio.Icon icon, @NotNull org.gtk.gio.EmblemOrigin origin) {
        return new Emblem(constructNewWithOrigin(icon, origin));
    }
    
    /**
     * Gives back the icon from {@code emblem}.
     * @return a {@link Icon}. The returned object belongs to
     *          the emblem and should not be modified or freed.
     */
    public @NotNull org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the origin of the emblem.
     * @return the origin of the emblem
     */
    public @NotNull org.gtk.gio.EmblemOrigin getOrigin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_emblem_get_origin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.EmblemOrigin(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_emblem_new = Interop.downcallHandle(
            "g_emblem_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblem_new_with_origin = Interop.downcallHandle(
            "g_emblem_new_with_origin",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_emblem_get_icon = Interop.downcallHandle(
            "g_emblem_get_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblem_get_origin = Interop.downcallHandle(
            "g_emblem_get_origin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
