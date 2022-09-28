package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkStackSwitcher} shows a row of buttons to switch between {@code GtkStack}
 * pages.
 * <p>
 * <img src="./doc-files/stackswitcher.png" alt="An example GtkStackSwitcher">
 * <p>
 * It acts as a controller for the associated {@code GtkStack}.
 * <p>
 * All the content for the buttons comes from the properties of the stacks
 * {@link StackPage} objects; the button visibility in a {@code GtkStackSwitcher}
 * widget is controlled by the visibility of the child in the {@code GtkStack}.
 * <p>
 * It is possible to associate multiple {@code GtkStackSwitcher} widgets
 * with the same {@code GtkStack} widget.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkStackSwitcher} has a single CSS node named stackswitcher and
 * style class .stack-switcher.
 * <p>
 * When circumstances require it, {@code GtkStackSwitcher} adds the
 * .needs-attention style class to the widgets representing the
 * stack pages.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkStackSwitcher} uses the {@link AccessibleRole#TAB_LIST} role
 * and uses the {@link AccessibleRole#TAB} for its buttons.
 * <p>
 * <h1>Orientable</h1>
 * <p>
 * Since GTK 4.4, {@code GtkStackSwitcher} implements {@code GtkOrientable} allowing
 * the stack switcher to be made vertical with
 * {@code gtk_orientable_set_orientation()}.
 */
public class StackSwitcher extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public StackSwitcher(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to StackSwitcher */
    public static StackSwitcher castFrom(org.gtk.gobject.Object gobject) {
        return new StackSwitcher(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_stack_switcher_new(), false);
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkStackSwitcher}.
     */
    public StackSwitcher() {
        super(constructNew());
    }
    
    /**
     * Retrieves the stack.
     */
    public Stack getStack() {
        var RESULT = gtk_h.gtk_stack_switcher_get_stack(handle());
        return new Stack(References.get(RESULT, false));
    }
    
    /**
     * Sets the stack to control.
     */
    public void setStack(Stack stack) {
        gtk_h.gtk_stack_switcher_set_stack(handle(), stack.handle());
    }
    
}
