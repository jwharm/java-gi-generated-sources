package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkShortcutController} is an event controller that manages shortcuts.
 * <p>
 * Most common shortcuts are using this controller implicitly, e.g. by
 * adding a mnemonic underline to a {@code GtkLabel}, or by installing a key
 * binding using {@link WidgetClass#addBinding}, or by adding accelerators
 * to global actions using {@link Application#setAccelsForAction}.
 * <p>
 * But it is possible to create your own shortcut controller, and add
 * shortcuts to it.
 * <p>
 * {@code GtkShortcutController} implements {@code GListModel} for querying the
 * shortcuts that have been added to it.
 * <p>
 * <strong>GtkShortcutController as a GtkBuildable</strong><br/>
 * {@code GtkShortcutControllers} can be creates in ui files to set up
 * shortcuts in the same place as the widgets.
 * <p>
 * An example of a UI definition fragment with {@code GtkShortcutController}:
 * <pre>{@code xml
 *   <object class='GtkButton'>
 *     <child>
 *       <object class='GtkShortcutController'>
 *         <property name='scope'>managed</property>
 *         <child>
 *           <object class='GtkShortcut'>
 *             <property name='trigger'>&lt;Control&gt;k</property>
 *             <property name='action'>activate</property>
 *           </object>
 *         </child>
 *       </object>
 *     </child>
 *   </object>
 * }</pre>
 * <p>
 * This example creates a {@link ActivateAction} for triggering the
 * {@code activate} signal of the {@code GtkButton}. See {@link ShortcutAction#parseString}
 * for the syntax for other kinds of {@code GtkShortcutAction}. See
 * {@link ShortcutTrigger#parseString} to learn more about the syntax
 * for triggers.
 */
public class ShortcutController extends org.gtk.gtk.EventController implements org.gtk.gio.ListModel, org.gtk.gtk.Buildable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutController";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShortcutController proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShortcutController(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShortcutController> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShortcutController(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_controller_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new shortcut controller.
     */
    public ShortcutController() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewForModel(org.gtk.gio.ListModel model) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_controller_new_for_model.invokeExact(model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new shortcut controller that takes its shortcuts from
     * the given list model.
     * <p>
     * A controller created by this function does not let you add or
     * remove individual shortcuts using the shortcut controller api,
     * but you can change the contents of the model.
     * @param model a {@code GListModel} containing shortcuts
     * @return a newly created shortcut controller
     */
    public static ShortcutController newForModel(org.gtk.gio.ListModel model) {
        var RESULT = constructNewForModel(model);
        var OBJECT = (org.gtk.gtk.ShortcutController) Interop.register(RESULT, org.gtk.gtk.ShortcutController.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds {@code shortcut} to the list of shortcuts handled by {@code self}.
     * <p>
     * If this controller uses an external shortcut list, this
     * function does nothing.
     * @param shortcut a {@code GtkShortcut}
     */
    public void addShortcut(org.gtk.gtk.Shortcut shortcut) {
        try {
            DowncallHandles.gtk_shortcut_controller_add_shortcut.invokeExact(
                    handle(),
                    shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        shortcut.yieldOwnership();
    }
    
    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     * @return the controller's mnemonics modifiers
     */
    public org.gtk.gdk.ModifierType getMnemonicsModifiers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_controller_get_mnemonics_modifiers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Gets the scope for when this controller activates its shortcuts.
     * <p>
     * See {@link ShortcutController#setScope} for details.
     * @return the controller's scope
     */
    public org.gtk.gtk.ShortcutScope getScope() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_controller_get_scope.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ShortcutScope.of(RESULT);
    }
    
    /**
     * Removes {@code shortcut} from the list of shortcuts handled by {@code self}.
     * <p>
     * If {@code shortcut} had not been added to {@code controller} or this controller
     * uses an external shortcut list, this function does nothing.
     * @param shortcut a {@code GtkShortcut}
     */
    public void removeShortcut(org.gtk.gtk.Shortcut shortcut) {
        try {
            DowncallHandles.gtk_shortcut_controller_remove_shortcut.invokeExact(
                    handle(),
                    shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the controller to use the given modifier for mnemonics.
     * <p>
     * The mnemonics modifiers determines which modifiers need to be pressed to allow
     * activation of shortcuts with mnemonics triggers.
     * <p>
     * GTK normally uses the Alt modifier for mnemonics, except in {@code GtkPopoverMenu}s,
     * where mnemonics can be triggered without any modifiers. It should be very
     * rarely necessary to change this, and doing so is likely to interfere with
     * other shortcuts.
     * <p>
     * This value is only relevant for local shortcut controllers. Global and managed
     * shortcut controllers will have their shortcuts activated from other places which
     * have their own modifiers for activating mnemonics.
     * @param modifiers the new mnemonics_modifiers to use
     */
    public void setMnemonicsModifiers(org.gtk.gdk.ModifierType modifiers) {
        try {
            DowncallHandles.gtk_shortcut_controller_set_mnemonics_modifiers.invokeExact(
                    handle(),
                    modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the controller to have the given {@code scope}.
     * <p>
     * The scope allows shortcuts to be activated outside of the normal
     * event propagation. In particular, it allows installing global
     * keyboard shortcuts that can be activated even when a widget does
     * not have focus.
     * <p>
     * With {@link ShortcutScope#LOCAL}, shortcuts will only be activated
     * when the widget has focus.
     * @param scope the new scope to use
     */
    public void setScope(org.gtk.gtk.ShortcutScope scope) {
        try {
            DowncallHandles.gtk_shortcut_controller_set_scope.invokeExact(
                    handle(),
                    scope.getValue());
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
            RESULT = (long) DowncallHandles.gtk_shortcut_controller_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ShortcutController.Builder} object constructs a {@link ShortcutController} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ShortcutController.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ShortcutController} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ShortcutController}.
         * @return A new instance of {@code ShortcutController} with the properties 
         *         that were set in the Builder object.
         */
        public ShortcutController build() {
            return (ShortcutController) org.gtk.gobject.GObject.newWithProperties(
                ShortcutController.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * The modifiers that need to be pressed to allow mnemonics activation.
         * @param mnemonicModifiers The value for the {@code mnemonic-modifiers} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMnemonicModifiers(org.gtk.gdk.ModifierType mnemonicModifiers) {
            names.add("mnemonic-modifiers");
            values.add(org.gtk.gobject.Value.create(mnemonicModifiers));
            return this;
        }
        
        /**
         * A list model to take shortcuts from.
         * @param model The value for the {@code model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModel(org.gtk.gio.ListModel model) {
            names.add("model");
            values.add(org.gtk.gobject.Value.create(model));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
        
        /**
         * What scope the shortcuts will be handled in.
         * @param scope The value for the {@code scope} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScope(org.gtk.gtk.ShortcutScope scope) {
            names.add("scope");
            values.add(org.gtk.gobject.Value.create(scope));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_controller_new = Interop.downcallHandle(
                "gtk_shortcut_controller_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_new_for_model = Interop.downcallHandle(
                "gtk_shortcut_controller_new_for_model",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_add_shortcut = Interop.downcallHandle(
                "gtk_shortcut_controller_add_shortcut",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_get_mnemonics_modifiers = Interop.downcallHandle(
                "gtk_shortcut_controller_get_mnemonics_modifiers",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_get_scope = Interop.downcallHandle(
                "gtk_shortcut_controller_get_scope",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_remove_shortcut = Interop.downcallHandle(
                "gtk_shortcut_controller_remove_shortcut",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_set_mnemonics_modifiers = Interop.downcallHandle(
                "gtk_shortcut_controller_set_mnemonics_modifiers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_set_scope = Interop.downcallHandle(
                "gtk_shortcut_controller_set_scope",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_shortcut_controller_get_type = Interop.downcallHandle(
                "gtk_shortcut_controller_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_shortcut_controller_get_type != null;
    }
}
