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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ShortcutController(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ShortcutController if its GType is a (or inherits from) "GtkShortcutController".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ShortcutController} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkShortcutController", a ClassCastException will be thrown.
     */
    public static ShortcutController castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkShortcutController"))) {
            return new ShortcutController(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkShortcutController");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewForModel(@NotNull org.gtk.gio.ListModel model) {
        java.util.Objects.requireNonNull(model, "Parameter 'model' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_shortcut_controller_new_for_model.invokeExact(
                    model.handle());
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
    public static ShortcutController newForModel(@NotNull org.gtk.gio.ListModel model) {
        return new ShortcutController(constructNewForModel(model), Ownership.FULL);
    }
    
    /**
     * Adds {@code shortcut} to the list of shortcuts handled by {@code self}.
     * <p>
     * If this controller uses an external shortcut list, this
     * function does nothing.
     * @param shortcut a {@code GtkShortcut}
     */
    public void addShortcut(@NotNull org.gtk.gtk.Shortcut shortcut) {
        java.util.Objects.requireNonNull(shortcut, "Parameter 'shortcut' must not be null");
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
    public @NotNull org.gtk.gdk.ModifierType getMnemonicsModifiers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_controller_get_mnemonics_modifiers.invokeExact(
                    handle());
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
    public @NotNull org.gtk.gtk.ShortcutScope getScope() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_shortcut_controller_get_scope.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ShortcutScope(RESULT);
    }
    
    /**
     * Removes {@code shortcut} from the list of shortcuts handled by {@code self}.
     * <p>
     * If {@code shortcut} had not been added to {@code controller} or this controller
     * uses an external shortcut list, this function does nothing.
     * @param shortcut a {@code GtkShortcut}
     */
    public void removeShortcut(@NotNull org.gtk.gtk.Shortcut shortcut) {
        java.util.Objects.requireNonNull(shortcut, "Parameter 'shortcut' must not be null");
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
    public void setMnemonicsModifiers(@NotNull org.gtk.gdk.ModifierType modifiers) {
        java.util.Objects.requireNonNull(modifiers, "Parameter 'modifiers' must not be null");
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
    public void setScope(@NotNull org.gtk.gtk.ShortcutScope scope) {
        java.util.Objects.requireNonNull(scope, "Parameter 'scope' must not be null");
        try {
            DowncallHandles.gtk_shortcut_controller_set_scope.invokeExact(
                    handle(),
                    scope.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_shortcut_controller_new = Interop.downcallHandle(
            "gtk_shortcut_controller_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_new_for_model = Interop.downcallHandle(
            "gtk_shortcut_controller_new_for_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_add_shortcut = Interop.downcallHandle(
            "gtk_shortcut_controller_add_shortcut",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_get_mnemonics_modifiers = Interop.downcallHandle(
            "gtk_shortcut_controller_get_mnemonics_modifiers",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_get_scope = Interop.downcallHandle(
            "gtk_shortcut_controller_get_scope",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_remove_shortcut = Interop.downcallHandle(
            "gtk_shortcut_controller_remove_shortcut",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_set_mnemonics_modifiers = Interop.downcallHandle(
            "gtk_shortcut_controller_set_mnemonics_modifiers",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_shortcut_controller_set_scope = Interop.downcallHandle(
            "gtk_shortcut_controller_set_scope",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
