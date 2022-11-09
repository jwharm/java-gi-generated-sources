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
    
    private static final java.lang.String C_TYPE_NAME = "GEmblem";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Emblem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Emblem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Emblem if its GType is a (or inherits from) "GEmblem".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Emblem" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GEmblem", a ClassCastException will be thrown.
     */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GEmblem"))) {
            return new Emblem(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GEmblem");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gio.Icon icon) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_new.invokeExact(
                    icon.handle());
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
        super(constructNew(icon), Ownership.FULL);
    }
    
    private static Addressable constructNewWithOrigin(@NotNull org.gtk.gio.Icon icon, @NotNull org.gtk.gio.EmblemOrigin origin) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        java.util.Objects.requireNonNull(origin, "Parameter 'origin' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_new_with_origin.invokeExact(
                    icon.handle(),
                    origin.getValue());
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
        return new Emblem(constructNewWithOrigin(icon, origin), Ownership.FULL);
    }
    
    /**
     * Gives back the icon from {@code emblem}.
     * @return a {@link Icon}. The returned object belongs to
     *          the emblem and should not be modified or freed.
     */
    public @NotNull org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblem_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the origin of the emblem.
     * @return the origin of the emblem
     */
    public @NotNull org.gtk.gio.EmblemOrigin getOrigin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_emblem_get_origin.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.EmblemOrigin(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_emblem_new = Interop.downcallHandle(
            "g_emblem_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblem_new_with_origin = Interop.downcallHandle(
            "g_emblem_new_with_origin",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_emblem_get_icon = Interop.downcallHandle(
            "g_emblem_get_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_emblem_get_origin = Interop.downcallHandle(
            "g_emblem_get_origin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
