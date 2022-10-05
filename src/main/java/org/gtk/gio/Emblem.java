package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    static final MethodHandle g_emblem_new = Interop.downcallHandle(
        "g_emblem_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Icon icon) {
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
    public Emblem(Icon icon) {
        super(constructNew(icon));
    }
    
    static final MethodHandle g_emblem_new_with_origin = Interop.downcallHandle(
        "g_emblem_new_with_origin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewWithOrigin(Icon icon, EmblemOrigin origin) {
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
    public static Emblem newWithOrigin(Icon icon, EmblemOrigin origin) {
        return new Emblem(constructNewWithOrigin(icon, origin));
    }
    
    static final MethodHandle g_emblem_get_icon = Interop.downcallHandle(
        "g_emblem_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gives back the icon from {@code emblem}.
     */
    public Icon getIcon() {
        try {
            var RESULT = (MemoryAddress) g_emblem_get_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_emblem_get_origin = Interop.downcallHandle(
        "g_emblem_get_origin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the origin of the emblem.
     */
    public EmblemOrigin getOrigin() {
        try {
            var RESULT = (int) g_emblem_get_origin.invokeExact(handle());
            return new EmblemOrigin(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
