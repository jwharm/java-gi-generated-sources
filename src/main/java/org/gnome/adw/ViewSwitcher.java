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
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ViewSwitcher(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ViewSwitcher> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ViewSwitcher(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public org.gnome.adw.ViewSwitcherPolicy getPolicy() {
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
        return (org.gnome.adw.ViewStack) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.ViewStack.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the policy of {@code self}.
     * @param policy the new policy
     */
    public void setPolicy(org.gnome.adw.ViewSwitcherPolicy policy) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_view_switcher_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ViewSwitcher.Builder} object constructs a {@link ViewSwitcher} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ViewSwitcher.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ViewSwitcher} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewSwitcher}.
         * @return A new instance of {@code ViewSwitcher} with the properties 
         *         that were set in the Builder object.
         */
        public ViewSwitcher build() {
            return (ViewSwitcher) org.gtk.gobject.GObject.newWithProperties(
                ViewSwitcher.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The policy to determine which mode to use.
         * @param policy The value for the {@code policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPolicy(org.gnome.adw.ViewSwitcherPolicy policy) {
            names.add("policy");
            values.add(org.gtk.gobject.Value.create(policy));
            return this;
        }
        
        /**
         * The stack the view switcher controls.
         * @param stack The value for the {@code stack} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStack(org.gnome.adw.ViewStack stack) {
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
