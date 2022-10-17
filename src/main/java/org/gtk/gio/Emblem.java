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
public class Emblem extends org.gtk.gobject.Object implements Icon {

    public Emblem(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Emblem */
    public static Emblem castFrom(org.gtk.gobject.Object gobject) {
        return new Emblem(gobject.refcounted());
    }
    
    private static final MethodHandle g_emblem_new = Interop.downcallHandle(
        "g_emblem_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull Icon icon) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_emblem_new.invokeExact(icon.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     */
    public Emblem(@NotNull Icon icon) {
        super(constructNew(icon));
    }
    
    private static final MethodHandle g_emblem_new_with_origin = Interop.downcallHandle(
        "g_emblem_new_with_origin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewWithOrigin(@NotNull Icon icon, @NotNull EmblemOrigin origin) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_emblem_new_with_origin.invokeExact(icon.handle(), origin.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new emblem for {@code icon}.
     */
    public static Emblem newWithOrigin(@NotNull Icon icon, @NotNull EmblemOrigin origin) {
        return new Emblem(constructNewWithOrigin(icon, origin));
    }
    
    private static final MethodHandle g_emblem_get_icon = Interop.downcallHandle(
        "g_emblem_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gives back the icon from {@code emblem}.
     */
    public @NotNull Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_emblem_get_icon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Icon.IconImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_emblem_get_origin = Interop.downcallHandle(
        "g_emblem_get_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the origin of the emblem.
     */
    public @NotNull EmblemOrigin getOrigin() {
        int RESULT;
        try {
            RESULT = (int) g_emblem_get_origin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new EmblemOrigin(RESULT);
    }
    
}
