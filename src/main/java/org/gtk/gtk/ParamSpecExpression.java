package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GParamSpec} for properties holding a {@code GtkExpression}.
 */
public class ParamSpecExpression extends org.gtk.gobject.ParamSpec {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkParamSpecExpression";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ParamSpec.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    @ApiStatus.Internal
    public ParamSpecExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ParamSpecExpression if its GType is a (or inherits from) "GtkParamSpecExpression".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ParamSpecExpression" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkParamSpecExpression", a ClassCastException will be thrown.
     */
    public static ParamSpecExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkParamSpecExpression"))) {
            return new ParamSpecExpression(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkParamSpecExpression");
        }
    }
}
