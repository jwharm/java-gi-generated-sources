package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkStackSidebar} uses a sidebar to switch between {@code GtkStack} pages.
 * <p>
 * In order to use a {@code GtkStackSidebar}, you simply use a {@code GtkStack} to
 * organize your UI flow, and add the sidebar to your sidebar area. You
 * can use {@link StackSidebar#setStack} to connect the {@code GtkStackSidebar}
 * to the {@code GtkStack}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkStackSidebar} has a single CSS node with name stacksidebar and
 * style class .sidebar.
 * <p>
 * When circumstances require it, {@code GtkStackSidebar} adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 */
public class StackSidebar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStackSidebar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public StackSidebar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to StackSidebar if its GType is a (or inherits from) "GtkStackSidebar".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "StackSidebar" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStackSidebar", a ClassCastException will be thrown.
     */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStackSidebar"))) {
            return new StackSidebar(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStackSidebar");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_stack_sidebar_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkStackSidebar}.
     */
    public StackSidebar() {
        super(constructNew());
    }
    
    /**
     * Retrieves the stack.
     * @return the associated {@code GtkStack} or
     *   {@code null} if none has been set explicitly
     */
    public @Nullable org.gtk.gtk.Stack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_sidebar_get_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Stack(Refcounted.get(RESULT, false));
    }
    
    /**
     * Set the {@code GtkStack} associated with this {@code GtkStackSidebar}.
     * <p>
     * The sidebar widget will automatically update according to
     * the order and items within the given {@code GtkStack}.
     * @param stack a {@code GtkStack}
     */
    public void setStack(@NotNull org.gtk.gtk.Stack stack) {
        java.util.Objects.requireNonNull(stack, "Parameter 'stack' must not be null");
        try {
            DowncallHandles.gtk_stack_sidebar_set_stack.invokeExact(
                    handle(),
                    stack.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_stack_sidebar_new = Interop.downcallHandle(
            "gtk_stack_sidebar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_stack_sidebar_get_stack = Interop.downcallHandle(
            "gtk_stack_sidebar_get_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_stack_sidebar_set_stack = Interop.downcallHandle(
            "gtk_stack_sidebar_set_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
