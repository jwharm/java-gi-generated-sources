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
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwViewSwitcher} has a single CSS node with name {@code viewswitcher}. It can have
 * the style classes {@code .wide} and {@code .narrow}, matching its policy.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwViewSwitcher} uses the {@code GTK_ACCESSIBLE_ROLE_TAB_LIST} role and uses the
 * {@code GTK_ACCESSIBLE_ROLE_TAB} for its buttons.
 * @version 1.0
 */
public class ViewSwitcher extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcher";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ViewSwitcher(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ViewSwitcher if its GType is a (or inherits from) "AdwViewSwitcher".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ViewSwitcher" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewSwitcher", a ClassCastException will be thrown.
     */
    public static ViewSwitcher castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwViewSwitcher"))) {
            return new ViewSwitcher(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewSwitcher");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_view_switcher_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcher}.
     */
    public ViewSwitcher() {
        super(constructNew());
    }
    
    /**
     * Gets the policy of {@code self}.
     * @return the policy of {@code self}
     */
    public @NotNull org.gnome.adw.ViewSwitcherPolicy getPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_get_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewSwitcherPolicy(RESULT);
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     * @return the stack
     */
    public @Nullable org.gnome.adw.ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_get_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.ViewStack(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the policy of {@code self}.
     * @param policy the new policy
     */
    public void setPolicy(@NotNull org.gnome.adw.ViewSwitcherPolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.adw_view_switcher_set_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the stack controlled by {@code self}.
     * @param stack a stack
     */
    public void setStack(@Nullable org.gnome.adw.ViewStack stack) {
        try {
            DowncallHandles.adw_view_switcher_set_stack.invokeExact(
                    handle(),
                    (Addressable) (stack == null ? MemoryAddress.NULL : stack.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_switcher_new = Interop.downcallHandle(
            "adw_view_switcher_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_get_policy = Interop.downcallHandle(
            "adw_view_switcher_get_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_get_stack = Interop.downcallHandle(
            "adw_view_switcher_get_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_view_switcher_set_policy = Interop.downcallHandle(
            "adw_view_switcher_set_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_view_switcher_set_stack = Interop.downcallHandle(
            "adw_view_switcher_set_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
