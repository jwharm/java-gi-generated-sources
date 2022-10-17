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
 * 
 * <h1>GtkShortcutController as a GtkBuildable</h1>
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
public class ShortcutController extends EventController implements org.gtk.gio.ListModel, Buildable {

    public ShortcutController(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShortcutController */
    public static ShortcutController castFrom(org.gtk.gobject.Object gobject) {
        return new ShortcutController(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_shortcut_controller_new = Interop.downcallHandle(
        "gtk_shortcut_controller_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_controller_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new shortcut controller.
     */
    public ShortcutController() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_shortcut_controller_new_for_model = Interop.downcallHandle(
        "gtk_shortcut_controller_new_for_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForModel(@NotNull org.gtk.gio.ListModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_shortcut_controller_new_for_model.invokeExact(model.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new shortcut controller that takes its shortcuts from
     * the given list model.
     * <p>
     * A controller created by this function does not let you add or
     * remove individual shortcuts using the shortcut controller api,
     * but you can change the contents of the model.
     */
    public static ShortcutController newForModel(@NotNull org.gtk.gio.ListModel model) {
        return new ShortcutController(constructNewForModel(model));
    }
    
    private static final MethodHandle gtk_shortcut_controller_add_shortcut = Interop.downcallHandle(
        "gtk_shortcut_controller_add_shortcut",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code shortcut} to the list of shortcuts handled by {@code self}.
     * <p>
     * If this controller uses an external shortcut list, this
     * function does nothing.
     */
    public @NotNull void addShortcut(@NotNull Shortcut shortcut) {
        try {
            gtk_shortcut_controller_add_shortcut.invokeExact(handle(), shortcut.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_controller_get_mnemonics_modifiers = Interop.downcallHandle(
        "gtk_shortcut_controller_get_mnemonics_modifiers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     */
    public @NotNull org.gtk.gdk.ModifierType getMnemonicsModifiers() {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_controller_get_mnemonics_modifiers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    private static final MethodHandle gtk_shortcut_controller_get_scope = Interop.downcallHandle(
        "gtk_shortcut_controller_get_scope",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scope for when this controller activates its shortcuts.
     * <p>
     * See {@link ShortcutController#setScope} for details.
     */
    public @NotNull ShortcutScope getScope() {
        int RESULT;
        try {
            RESULT = (int) gtk_shortcut_controller_get_scope.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ShortcutScope(RESULT);
    }
    
    private static final MethodHandle gtk_shortcut_controller_remove_shortcut = Interop.downcallHandle(
        "gtk_shortcut_controller_remove_shortcut",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code shortcut} from the list of shortcuts handled by {@code self}.
     * <p>
     * If {@code shortcut} had not been added to {@code controller} or this controller
     * uses an external shortcut list, this function does nothing.
     */
    public @NotNull void removeShortcut(@NotNull Shortcut shortcut) {
        try {
            gtk_shortcut_controller_remove_shortcut.invokeExact(handle(), shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_controller_set_mnemonics_modifiers = Interop.downcallHandle(
        "gtk_shortcut_controller_set_mnemonics_modifiers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setMnemonicsModifiers(@NotNull org.gtk.gdk.ModifierType modifiers) {
        try {
            gtk_shortcut_controller_set_mnemonics_modifiers.invokeExact(handle(), modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_shortcut_controller_set_scope = Interop.downcallHandle(
        "gtk_shortcut_controller_set_scope",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setScope(@NotNull ShortcutScope scope) {
        try {
            gtk_shortcut_controller_set_scope.invokeExact(handle(), scope.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
