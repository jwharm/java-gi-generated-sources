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
     */
    protected StackSwitcher(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StackSwitcher> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StackSwitcher(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Retrieves the stack.
     * @return the stack
     */
    public @Nullable org.gtk.gtk.Stack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_switcher_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Stack) Interop.register(RESULT, org.gtk.gtk.Stack.fromAddress).marshal(RESULT, null);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_stack_switcher_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link StackSwitcher.Builder} object constructs a {@link StackSwitcher} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StackSwitcher.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link StackSwitcher} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StackSwitcher}.
         * @return A new instance of {@code StackSwitcher} with the properties 
         *         that were set in the Builder object.
         */
        public StackSwitcher build() {
            return (StackSwitcher) org.gtk.gobject.GObject.newWithProperties(
                StackSwitcher.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The stack.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStack(org.gtk.gtk.Stack stack) {
            names.add("stack");
            values.add(org.gtk.gobject.Value.create(stack));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_stack_switcher_new = Interop.downcallHandle(
                "gtk_stack_switcher_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_switcher_get_stack = Interop.downcallHandle(
                "gtk_stack_switcher_get_stack",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_switcher_set_stack = Interop.downcallHandle(
                "gtk_stack_switcher_set_stack",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_switcher_get_type = Interop.downcallHandle(
                "gtk_stack_switcher_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_stack_switcher_get_type != null;
    }
}
