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
     * <p>
     * Because StackSidebar is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StackSidebar(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to StackSidebar if its GType is a (or inherits from) "GtkStackSidebar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StackSidebar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkStackSidebar", a ClassCastException will be thrown.
     */
    public static StackSidebar castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), StackSidebar.getType())) {
            return new StackSidebar(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkStackSidebar");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
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
        return new org.gtk.gtk.Stack(RESULT, Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_stack_sidebar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link StackSidebar.Build} object constructs a {@link StackSidebar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link StackSidebar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StackSidebar} using {@link StackSidebar#castFrom}.
         * @return A new instance of {@code StackSidebar} with the properties 
         *         that were set in the Build object.
         */
        public StackSidebar construct() {
            return StackSidebar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    StackSidebar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The stack.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStack(org.gtk.gtk.Stack stack) {
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
}
