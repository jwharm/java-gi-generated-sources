package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A view switcher action bar.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="view-switcher-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="view-switcher-bar.png" alt="view-switcher-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * An action bar letting you switch between multiple views contained in a
 * {@link ViewStack}. It is designed to be put at
 * the bottom of a window and to be revealed only on really narrow windows, e.g.
 * on mobile phones. It can't be revealed if there are less than two pages.
 * <p>
 * {@code AdwViewSwitcherBar} is intended to be used together with
 * {@link ViewSwitcherTitle}.
 * <p>
 * A common use case is to bind the {@code ViewSwitcherBar:reveal} property
 * to {@code ViewSwitcherTitle:title-visible} to automatically reveal the
 * view switcher bar when the title label is displayed in place of the view
 * switcher, as follows:
 * <pre>{@code xml
 * <object class="GtkWindow">
 *   <property name="titlebar">
 *     <object class="AdwHeaderBar">
 *       <property name="centering-policy">strict</property>
 *       <property name="title-widget">
 *         <object class="AdwViewSwitcherTitle" id="title">
 *           <property name="stack">stack</property>
 *         </object>
 *       </property>
 *     </object>
 *   </property>
 *   <property>
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="AdwViewStack" id="stack"/>
 *       </child>
 *       <child>
 *         <object class="AdwViewSwitcherBar">
 *           <property name="stack">stack</property>
 *           <binding name="reveal">
 *             <lookup name="title-visible">title</lookup>
 *           </binding>
 *         </object>
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwViewSwitcherBar} has a single CSS node with name{@code  viewswitcherbar}.
 * @version 1.0
 */
public class ViewSwitcherBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcherBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ViewSwitcherBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ViewSwitcherBar(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ViewSwitcherBar> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ViewSwitcherBar(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_bar_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwViewSwitcherBar}.
     */
    public ViewSwitcherBar() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets whether {@code self} should be revealed or hidden.
     * @return whether {@code self} is revealed
     */
    public boolean getReveal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_view_switcher_bar_get_reveal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the stack controlled by {@code self}.
     * @return the stack
     */
    public @Nullable org.gnome.adw.ViewStack getStack() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_view_switcher_bar_get_stack.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.ViewStack) Interop.register(RESULT, org.gnome.adw.ViewStack.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Sets whether {@code self} should be revealed or hidden.
     * @param reveal whether to reveal {@code self}
     */
    public void setReveal(boolean reveal) {
        try {
            DowncallHandles.adw_view_switcher_bar_set_reveal.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(reveal, null).intValue());
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
            DowncallHandles.adw_view_switcher_bar_set_stack.invokeExact(
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
            RESULT = (long) DowncallHandles.adw_view_switcher_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ViewSwitcherBar.Builder} object constructs a {@link ViewSwitcherBar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ViewSwitcherBar.Builder#build()}. 
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
         * Finish building the {@link ViewSwitcherBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ViewSwitcherBar}.
         * @return A new instance of {@code ViewSwitcherBar} with the properties 
         *         that were set in the Builder object.
         */
        public ViewSwitcherBar build() {
            return (ViewSwitcherBar) org.gtk.gobject.GObject.newWithProperties(
                ViewSwitcherBar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the bar should be revealed or hidden.
         * @param reveal The value for the {@code reveal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setReveal(boolean reveal) {
            names.add("reveal");
            values.add(org.gtk.gobject.Value.create(reveal));
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
        
        private static final MethodHandle adw_view_switcher_bar_new = Interop.downcallHandle(
                "adw_view_switcher_bar_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_view_switcher_bar_get_reveal = Interop.downcallHandle(
                "adw_view_switcher_bar_get_reveal",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_view_switcher_bar_get_stack = Interop.downcallHandle(
                "adw_view_switcher_bar_get_stack",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_view_switcher_bar_set_reveal = Interop.downcallHandle(
                "adw_view_switcher_bar_set_reveal",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_view_switcher_bar_set_stack = Interop.downcallHandle(
                "adw_view_switcher_bar_set_stack",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_view_switcher_bar_get_type = Interop.downcallHandle(
                "adw_view_switcher_bar_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_view_switcher_bar_get_type != null;
    }
}
