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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a StackSidebar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected StackSidebar(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StackSidebar> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StackSidebar(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_sidebar_new.invokeExact();
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
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Retrieves the stack.
     * @return the associated {@code GtkStack} or
     *   {@code null} if none has been set explicitly
     */
    public @Nullable org.gtk.gtk.Stack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_stack_sidebar_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Stack) Interop.register(RESULT, org.gtk.gtk.Stack.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Set the {@code GtkStack} associated with this {@code GtkStackSidebar}.
     * <p>
     * The sidebar widget will automatically update according to
     * the order and items within the given {@code GtkStack}.
     * @param stack a {@code GtkStack}
     */
    public void setStack(org.gtk.gtk.Stack stack) {
        try {
            DowncallHandles.gtk_stack_sidebar_set_stack.invokeExact(
                    handle(),
                    stack.handle());
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
            RESULT = (long) DowncallHandles.gtk_stack_sidebar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link StackSidebar.Builder} object constructs a {@link StackSidebar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StackSidebar.Builder#build()}. 
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
         * Finish building the {@link StackSidebar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StackSidebar}.
         * @return A new instance of {@code StackSidebar} with the properties 
         *         that were set in the Builder object.
         */
        public StackSidebar build() {
            return (StackSidebar) org.gtk.gobject.GObject.newWithProperties(
                StackSidebar.getType(),
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
        
        private static final MethodHandle gtk_stack_sidebar_new = Interop.downcallHandle(
                "gtk_stack_sidebar_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_sidebar_get_stack = Interop.downcallHandle(
                "gtk_stack_sidebar_get_stack",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_sidebar_set_stack = Interop.downcallHandle(
                "gtk_stack_sidebar_set_stack",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_stack_sidebar_get_type = Interop.downcallHandle(
                "gtk_stack_sidebar_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_stack_sidebar_get_type != null;
    }
}
