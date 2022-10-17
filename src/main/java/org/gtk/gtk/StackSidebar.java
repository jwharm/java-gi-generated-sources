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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkStackSidebar} has a single CSS node with name stacksidebar and
 * style class .sidebar.
 * <p>
 * When circumstances require it, {@code GtkStackSidebar} adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 */
public class StackSidebar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public StackSidebar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to StackSidebar */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        return new StackSidebar(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_stack_sidebar_new = Interop.downcallHandle(
        "gtk_stack_sidebar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_stack_sidebar_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkStackSidebar}.
     */
    public StackSidebar() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_stack_sidebar_get_stack = Interop.downcallHandle(
        "gtk_stack_sidebar_get_stack",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the stack.
     */
    public @Nullable Stack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_stack_sidebar_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Stack(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_stack_sidebar_set_stack = Interop.downcallHandle(
        "gtk_stack_sidebar_set_stack",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the {@code GtkStack} associated with this {@code GtkStackSidebar}.
     * <p>
     * The sidebar widget will automatically update according to
     * the order and items within the given {@code GtkStack}.
     */
    public @NotNull void setStack(@NotNull Stack stack) {
        try {
            gtk_stack_sidebar_set_stack.invokeExact(handle(), stack.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
