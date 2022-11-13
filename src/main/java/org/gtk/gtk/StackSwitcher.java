package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code GtkStackSwitcher} has a single CSS node named stackswitcher and
 * style class .stack-switcher.
 * <p>
 * When circumstances require it, {@code GtkStackSwitcher} adds the
 * .needs-attention style class to the widgets representing the
 * stack pages.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkStackSwitcher} uses the {@link AccessibleRole#TAB_LIST} role
 * and uses the {@link AccessibleRole#TAB} for its buttons.
 * <p>
 * <strong>Orientable</strong><br/>
 * Since GTK 4.4, {@code GtkStackSwitcher} implements {@code GtkOrientable} allowing
 * the stack switcher to be made vertical with
 * {@code gtk_orientable_set_orientation()}.
 */
public class StackSwitcher extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkStackSwitcher";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StackSwitcher proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StackSwitcher(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to StackSwitcher if its GType is a (or inherits from) "GtkStackSwitcher".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StackSwitcher} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStackSwitcher", a ClassCastException will be thrown.
     */
    public static StackSwitcher castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkStackSwitcher"))) {
            return new StackSwitcher(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStackSwitcher");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_switcher_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkStackSwitcher}.
     */
    public StackSwitcher() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Retrieves the stack.
     * @return the stack
     */
    public @Nullable org.gtk.gtk.Stack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_switcher_get_stack.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Stack(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the stack to control.
     * @param stack a {@code GtkStack}
     */
    public void setStack(@Nullable org.gtk.gtk.Stack stack) {
        try {
            DowncallHandles.gtk_stack_switcher_set_stack.invokeExact(
                    handle(),
                    (Addressable) (stack == null ? MemoryAddress.NULL : stack.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_stack_switcher_new = Interop.downcallHandle(
            "gtk_stack_switcher_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_switcher_get_stack = Interop.downcallHandle(
            "gtk_stack_switcher_get_stack",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_stack_switcher_set_stack = Interop.downcallHandle(
            "gtk_stack_switcher_set_stack",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
