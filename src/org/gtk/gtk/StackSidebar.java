package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkStackSidebar} uses a sidebar to switch between {@code GtkStack} pages.
 * <p>
 * In order to use a {@code GtkStackSidebar}, you simply use a {@code GtkStack} to
 * organize your UI flow, and add the sidebar to your sidebar area. You
 * can use {@link StackSidebar#setStack} to connect the {@code GtkStackSidebar}
 * to the {@code GtkStack}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkStackSidebar} has a single CSS node with name stacksidebar and
 * style class .sidebar.
 * <p>
 * When circumstances require it, {@code GtkStackSidebar} adds the
 * .needs-attention style class to the widgets representing the stack
 * pages.
 */
public class StackSidebar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public StackSidebar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StackSidebar */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        return new StackSidebar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_stack_sidebar_new(), false);
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
     */
    public Stack getStack() {
        var RESULT = gtk_h.gtk_stack_sidebar_get_stack(handle());
        return new Stack(References.get(RESULT, false));
    }
    
    /**
     * Set the {@code GtkStack} associated with this {@code GtkStackSidebar}.
     * <p>
     * The sidebar widget will automatically update according to
     * the order and items within the given {@code GtkStack}.
     */
    public void setStack(Stack stack) {
        gtk_h.gtk_stack_sidebar_set_stack(handle(), stack.handle());
    }
    
}
