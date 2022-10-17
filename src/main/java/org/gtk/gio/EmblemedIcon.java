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
public class EmblemedIcon extends org.gtk.gobject.Object implements Icon {

    public EmblemedIcon(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EmblemedIcon */
    public static EmblemedIcon castFrom(org.gtk.gobject.Object gobject) {
        return new EmblemedIcon(gobject.refcounted());
    }
    
    private static final MethodHandle g_emblemed_icon_new = Interop.downcallHandle(
        "g_emblemed_icon_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull Icon icon, @Nullable Emblem emblem) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_emblemed_icon_new.invokeExact(icon.handle(), emblem.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new emblemed icon for {@code icon} with the emblem {@code emblem}.
     */
    public EmblemedIcon(@NotNull Icon icon, @Nullable Emblem emblem) {
        super(constructNew(icon, emblem));
    }
    
    private static final MethodHandle g_emblemed_icon_add_emblem = Interop.downcallHandle(
        "g_emblemed_icon_add_emblem",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code emblem} to the {@link org.gtk.glib.List} of {@code GEmblems}.
     */
    public @NotNull void addEmblem(@NotNull Emblem emblem) {
        try {
            g_emblemed_icon_add_emblem.invokeExact(handle(), emblem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_emblemed_icon_clear_emblems = Interop.downcallHandle(
        "g_emblemed_icon_clear_emblems",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all the emblems from {@code icon}.
     */
    public @NotNull void clearEmblems() {
        try {
            g_emblemed_icon_clear_emblems.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_emblemed_icon_get_emblems = Interop.downcallHandle(
        "g_emblemed_icon_get_emblems",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list of emblems for the {@code icon}.
     */
    public @NotNull org.gtk.glib.List getEmblems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_emblemed_icon_get_emblems.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_emblemed_icon_get_icon = Interop.downcallHandle(
        "g_emblemed_icon_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the main icon for {@code emblemed}.
     */
    public @NotNull Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_emblemed_icon_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
}
