package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link EmblemedIcon} is an implementation of {@link Icon} that supports
 * adding an emblem to an icon. Adding multiple emblems to an
 * icon is ensured via g_emblemed_icon_add_emblem().
 * <p>
 * Note that {@link EmblemedIcon} allows no control over the position
 * of the emblems. See also {@link Emblem} for more information.
 */
public class EmblemedIcon extends org.gtk.gobject.Object implements org.gtk.gio.Icon {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GEmblemedIcon";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public EmblemedIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to EmblemedIcon if its GType is a (or inherits from) "GEmblemedIcon".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "EmblemedIcon" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GEmblemedIcon", a ClassCastException will be thrown.
     */
    public static EmblemedIcon castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GEmblemedIcon"))) {
            return new EmblemedIcon(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GEmblemedIcon");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        java.util.Objects.requireNonNull(icon, "Parameter 'icon' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_emblemed_icon_new.invokeExact(
                    icon.handle(),
                    (Addressable) (emblem == null ? MemoryAddress.NULL : emblem.handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new emblemed icon for {@code icon} with the emblem {@code emblem}.
     * @param icon a {@link Icon}
     * @param emblem a {@link Emblem}, or {@code null}
     */
    public EmblemedIcon(@NotNull org.gtk.gio.Icon icon, @Nullable org.gtk.gio.Emblem emblem) {
        super(constructNew(icon, emblem));
    }
    
    /**
     * Adds {@code emblem} to the {@link org.gtk.glib.List} of {@code GEmblems}.
     * @param emblem a {@link Emblem}
     */
    public void addEmblem(@NotNull org.gtk.gio.Emblem emblem) {
        java.util.Objects.requireNonNull(emblem, "Parameter 'emblem' must not be null");
        try {
            DowncallHandles.g_emblemed_icon_add_emblem.invokeExact(
                    handle(),
                    emblem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all the emblems from {@code icon}.
     */
    public void clearEmblems() {
        try {
            DowncallHandles.g_emblemed_icon_clear_emblems.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the list of emblems for the {@code icon}.
     * @return a {@link org.gtk.glib.List} of
     *     {@code GEmblems} that is owned by {@code emblemed}
     */
    public @NotNull org.gtk.glib.List getEmblems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_emblems.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the main icon for {@code emblemed}.
     * @return a {@link Icon} that is owned by {@code emblemed}
     */
    public @NotNull org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_emblemed_icon_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_emblemed_icon_new = Interop.downcallHandle(
            "g_emblemed_icon_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblemed_icon_add_emblem = Interop.downcallHandle(
            "g_emblemed_icon_add_emblem",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblemed_icon_clear_emblems = Interop.downcallHandle(
            "g_emblemed_icon_clear_emblems",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblemed_icon_get_emblems = Interop.downcallHandle(
            "g_emblemed_icon_get_emblems",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_emblemed_icon_get_icon = Interop.downcallHandle(
            "g_emblemed_icon_get_icon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
