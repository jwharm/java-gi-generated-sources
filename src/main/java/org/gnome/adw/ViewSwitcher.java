package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An adaptive view switcher.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher.png" alt="view-switcher"&gt;
 * &lt;/picture&gt;
 * <p>
 * An adaptive view switcher designed to switch between multiple views
 * contained in a {@link ViewStack} in a similar fashion to
 * {@link org.gtk.gtk.StackSwitcher}.
 * <p>
 * {@code AdwViewSwitcher} buttons always have an icon and a label. They can be
 * displayed side by side, or icon on top of the label. This can be controlled
 * via the {@code ViewSwitcher:policy} property.
 * <p>
 * Most applications should be using {@link ViewSwitcherBar} and
 * {@link ViewSwitcherTitle}.
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwViewSwitcher} has a single CSS node with name {@code viewswitcher}. It can have
 * the style classes {@code .wide} and {@code .narrow}, matching its policy.
 * 
 * <h2>Accessibility</h2>
 * {@code AdwViewSwitcher} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_LIST} role and uses the
 * {@code GTK_ACCESSIBLE_ROLE_TAB} for its buttons.
 */
public class ViewSwitcher extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ViewSwitcher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ViewSwitcher */
    public static ViewSwitcher castFrom(org.gtk.gobject.Object gobject) {
        return new ViewSwitcher(gobject.refcounted());
    }
    
    private static final MethodHandle adw_view_switcher_new = Interop.downcallHandle(
        "adw_view_switcher_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_view_switcher_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwViewSwitcher}.
     */
    public ViewSwitcher() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_view_switcher_get_policy = Interop.downcallHandle(
        "adw_view_switcher_get_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the policy of {@code self}.
     */
    public @NotNull ViewSwitcherPolicy getPolicy() {
        int RESULT;
        try {
            RESULT = (int) adw_view_switcher_get_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ViewSwitcherPolicy(RESULT);
    }
    
    private static final MethodHandle adw_view_switcher_get_stack = Interop.downcallHandle(
        "adw_view_switcher_get_stack",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the stack controlled by {@code self}.
     */
    public @Nullable ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_view_switcher_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ViewStack(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_view_switcher_set_policy = Interop.downcallHandle(
        "adw_view_switcher_set_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the policy of {@code self}.
     */
    public @NotNull void setPolicy(@NotNull ViewSwitcherPolicy policy) {
        try {
            adw_view_switcher_set_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_view_switcher_set_stack = Interop.downcallHandle(
        "adw_view_switcher_set_stack",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the stack controlled by {@code self}.
     */
    public @NotNull void setStack(@Nullable ViewStack stack) {
        try {
            adw_view_switcher_set_stack.invokeExact(handle(), stack.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
