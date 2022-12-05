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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ViewSwitcher proxy instance for the provided memory address.
     * <p>
     * Because ViewSwitcher is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ViewSwitcher(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to ViewSwitcher if its GType is a (or inherits from) "AdwViewSwitcher".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ViewSwitcher} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwViewSwitcher", a ClassCastException will be thrown.
     */
    public static ViewSwitcher castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ViewSwitcher.getType())) {
            return new ViewSwitcher(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwViewSwitcher");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcher}.
     */
    public ViewSwitcher() {
        super(constructNew(), Ownership.NONE);
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
        return org.gnome.adw.ViewSwitcherPolicy.of(RESULT);
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
        return new org.gnome.adw.ViewStack(RESULT, Ownership.NONE);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_view_switcher_get_type.invokeExact();
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
         * A {@link ViewSwitcher.Build} object constructs a {@link ViewSwitcher} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ViewSwitcher} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewSwitcher} using {@link ViewSwitcher#castFrom}.
         * @return A new instance of {@code ViewSwitcher} with the properties 
         *         that were set in the Build object.
         */
        public ViewSwitcher construct() {
            return ViewSwitcher.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ViewSwitcher.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The policy to determine which mode to use.
         * @param policy The value for the {@code policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPolicy(org.gnome.adw.ViewSwitcherPolicy policy) {
            names.add("policy");
            values.add(org.gtk.gobject.Value.create(policy));
            return this;
        }
        
        /**
         * The stack the view switcher controls.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStack(org.gnome.adw.ViewStack stack) {
            names.add("stack");
            values.add(org.gtk.gobject.Value.create(stack));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_view_switcher_new = Interop.downcallHandle(
            "adw_view_switcher_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_get_policy = Interop.downcallHandle(
            "adw_view_switcher_get_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_get_stack = Interop.downcallHandle(
            "adw_view_switcher_get_stack",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_set_policy = Interop.downcallHandle(
            "adw_view_switcher_set_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_view_switcher_set_stack = Interop.downcallHandle(
            "adw_view_switcher_set_stack",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_view_switcher_get_type = Interop.downcallHandle(
            "adw_view_switcher_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
