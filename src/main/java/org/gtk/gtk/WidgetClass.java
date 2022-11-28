package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WidgetClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkWidgetClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("show"),
        Interop.valueLayout.ADDRESS.withName("hide"),
        Interop.valueLayout.ADDRESS.withName("map"),
        Interop.valueLayout.ADDRESS.withName("unmap"),
        Interop.valueLayout.ADDRESS.withName("realize"),
        Interop.valueLayout.ADDRESS.withName("unrealize"),
        Interop.valueLayout.ADDRESS.withName("root"),
        Interop.valueLayout.ADDRESS.withName("unroot"),
        Interop.valueLayout.ADDRESS.withName("size_allocate"),
        Interop.valueLayout.ADDRESS.withName("state_flags_changed"),
        Interop.valueLayout.ADDRESS.withName("direction_changed"),
        Interop.valueLayout.ADDRESS.withName("get_request_mode"),
        Interop.valueLayout.ADDRESS.withName("measure"),
        Interop.valueLayout.ADDRESS.withName("mnemonic_activate"),
        Interop.valueLayout.ADDRESS.withName("grab_focus"),
        Interop.valueLayout.ADDRESS.withName("focus"),
        Interop.valueLayout.ADDRESS.withName("set_focus_child"),
        Interop.valueLayout.ADDRESS.withName("move_focus"),
        Interop.valueLayout.ADDRESS.withName("keynav_failed"),
        Interop.valueLayout.ADDRESS.withName("query_tooltip"),
        Interop.valueLayout.ADDRESS.withName("compute_expand"),
        Interop.valueLayout.ADDRESS.withName("css_changed"),
        Interop.valueLayout.ADDRESS.withName("system_setting_changed"),
        Interop.valueLayout.ADDRESS.withName("snapshot"),
        Interop.valueLayout.ADDRESS.withName("contains"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link WidgetClass}
     * @return A new, uninitialized @{link WidgetClass}
     */
    public static WidgetClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        WidgetClass newInstance = new WidgetClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.InitiallyUnownedClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a WidgetClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public WidgetClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Creates a new shortcut for {@code widget_class} that calls the given {@code callback}
     * with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization. It does not provide for user_data, if you need that,
     * you will have to use {@code GtkWidgetClass#addShortcut} with a custom
     * shortcut.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param callback the callback to call upon activation
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBinding(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull org.gtk.gtk.ShortcutFunc callback, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new shortcut for {@code widget_class} that activates the given
     * {@code action_name} with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param actionName the action to activate
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBindingAction(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull java.lang.String actionName, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(mods, "Parameter 'mods' must not be null");
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        try {
            DowncallHandles.gtk_widget_class_add_binding_action.invokeExact(
                    handle(),
                    keyval,
                    mods.getValue(),
                    Interop.allocateNativeString(actionName),
                    (Addressable) (formatString == null ? MemoryAddress.NULL : Interop.allocateNativeString(formatString)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new shortcut for {@code widget_class} that emits the given action
     * {@code signal} with arguments read according to {@code format_string}.
     * <p>
     * The arguments and format string must be provided in the same way as
     * with g_variant_new().
     * <p>
     * This function is a convenience wrapper around
     * {@link WidgetClass#addShortcut} and must be called during class
     * initialization.
     * @param keyval key value of binding to install
     * @param mods key modifier of binding to install
     * @param signal the signal to execute
     * @param formatString GVariant format string for arguments
     *   or {@code null} for no arguments
     * @param varargs arguments, as given by format string
     */
    public void addBindingSignal(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull java.lang.String signal, @Nullable java.lang.String formatString, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(mods, "Parameter 'mods' must not be null");
        java.util.Objects.requireNonNull(signal, "Parameter 'signal' must not be null");
        try {
            DowncallHandles.gtk_widget_class_add_binding_signal.invokeExact(
                    handle(),
                    keyval,
                    mods.getValue(),
                    Interop.allocateNativeString(signal),
                    (Addressable) (formatString == null ? MemoryAddress.NULL : Interop.allocateNativeString(formatString)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Installs a shortcut in {@code widget_class}.
     * <p>
     * Every instance created for {@code widget_class} or its subclasses will
     * inherit this shortcut and trigger it.
     * <p>
     * Shortcuts added this way will be triggered in the {@link PropagationPhase#BUBBLE}
     * phase, which means they may also trigger if child widgets have focus.
     * <p>
     * This function must only be used in class initialization functions
     * otherwise it is not guaranteed that the shortcut will be installed.
     * @param shortcut the {@code GtkShortcut} to add
     */
    public void addShortcut(@NotNull org.gtk.gtk.Shortcut shortcut) {
        java.util.Objects.requireNonNull(shortcut, "Parameter 'shortcut' must not be null");
        try {
            DowncallHandles.gtk_widget_class_add_shortcut.invokeExact(
                    handle(),
                    shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Declares a {@code callback_symbol} to handle {@code callback_name} from
     * the template XML defined for {@code widget_type}.
     * <p>
     * This function is not supported after {@link WidgetClass#setTemplateScope}
     * has been used on {@code widget_class}. See {@link BuilderCScope#addCallbackSymbol}.
     * <p>
     * Note that this must be called from a composite widget classes
     * class initializer after calling {@link WidgetClass#setTemplate}.
     * @param callbackName The name of the callback as expected in the template XML
     * @param callbackSymbol The callback symbol
     */
    public void bindTemplateCallbackFull(@NotNull java.lang.String callbackName, @NotNull org.gtk.gobject.Callback callbackSymbol) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Automatically assign an object declared in the class template XML to
     * be set to a location on a freshly built instance’s private data, or
     * alternatively accessible via {@link Widget#getTemplateChild}.
     * <p>
     * The struct can point either into the public instance, then you should
     * use {@code G_STRUCT_OFFSET(WidgetType, member)} for {@code struct_offset}, or in the
     * private struct, then you should use {@code G_PRIVATE_OFFSET(WidgetType, member)}.
     * <p>
     * An explicit strong reference will be held automatically for the duration
     * of your instance’s life cycle, it will be released automatically when
     * {@code GObjectClass.dispose()} runs on your instance and if a {@code struct_offset}
     * that is {@code != 0} is specified, then the automatic location in your instance
     * public or private data will be set to {@code null}. You can however access an
     * automated child pointer the first time your classes {@code GObjectClass.dispose()}
     * runs, or alternatively in {@code Gtk.Widget::destroy}.
     * <p>
     * If {@code internal_child} is specified, {@code Buildable#getInternalChild}
     * will be automatically implemented by the {@code GtkWidget} class so there is no
     * need to implement it manually.
     * <p>
     * The wrapper macros {@code Gtk#widgetClassBindTemplateChild},
     * {@code Gtk#widgetClassBindTemplateChildInternal},
     * {@code Gtk#widgetClassBindTemplateChildPrivate} and
     * {@code Gtk#widgetClassBindTemplateChildInternalPrivate}
     * might be more convenient to use.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link WidgetClass#setTemplate}.
     * @param name The “id” of the child defined in the template XML
     * @param internalChild Whether the child should be accessible as an “internal-child”
     *   when this class is used in GtkBuilder XML
     * @param structOffset The structure offset into the composite widget’s instance
     *   public or private structure where the automated child pointer should be set,
     *   or 0 to not assign the pointer.
     */
    public void bindTemplateChildFull(@NotNull java.lang.String name, boolean internalChild, long structOffset) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_widget_class_bind_template_child_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    internalChild ? 1 : 0,
                    structOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are rendered
     * differently by assistive technologies.
     * <p>
     * See also: {@link Accessible#getAccessibleRole}.
     * @return the accessible role for the widget class
     */
    public @NotNull org.gtk.gtk.AccessibleRole getAccessibleRole() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_get_accessible_role.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.AccessibleRole(RESULT);
    }
    
    /**
     * Retrieves the signal id for the activation signal.
     * <p>
     * the activation signal is set using
     * {@link WidgetClass#setActivateSignal}.
     * @return a signal id, or 0 if the widget class does not
     *   specify an activation signal
     */
    public int getActivateSignal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_get_activate_signal.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the name used by this class for matching in CSS code.
     * <p>
     * See {@link WidgetClass#setCssName} for details.
     * @return the CSS name of the given class
     */
    public @NotNull java.lang.String getCssName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_class_get_css_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the type of the {@link LayoutManager}
     * used by widgets of class {@code widget_class}.
     * <p>
     * See also: {@link WidgetClass#setLayoutManagerType}.
     * @return type of a {@code GtkLayoutManager} subclass, or {@code G_TYPE_INVALID}
     */
    public @NotNull org.gtk.glib.Type getLayoutManagerType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_widget_class_get_layout_manager_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * This should be called at class initialization time to specify
     * actions to be added for all instances of this class.
     * <p>
     * Actions installed by this function are stateless. The only state
     * they have is whether they are enabled or not.
     * @param actionName a prefixed action name, such as "clipboard.paste"
     * @param parameterType the parameter type
     * @param activate callback to use when the action is activated
     */
    public void installAction(@NotNull java.lang.String actionName, @Nullable java.lang.String parameterType, @NotNull org.gtk.gtk.WidgetActionActivateFunc activate) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Installs an action called {@code action_name} on {@code widget_class} and
     * binds its state to the value of the {@code property_name} property.
     * <p>
     * This function will perform a few santity checks on the property selected
     * via {@code property_name}. Namely, the property must exist, must be readable,
     * writable and must not be construct-only. There are also restrictions
     * on the type of the given property, it must be boolean, int, unsigned int,
     * double or string. If any of these conditions are not met, a critical
     * warning will be printed and no action will be added.
     * <p>
     * The state type of the action matches the property type.
     * <p>
     * If the property is boolean, the action will have no parameter and
     * toggle the property value. Otherwise, the action will have a parameter
     * of the same type as the property.
     * @param actionName name of the action
     * @param propertyName name of the property in instances of {@code widget_class}
     *   or any parent class.
     */
    public void installPropertyAction(@NotNull java.lang.String actionName, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        try {
            DowncallHandles.gtk_widget_class_install_property_action.invokeExact(
                    handle(),
                    Interop.allocateNativeString(actionName),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns details about the {@code index_}-th action that has been
     * installed for {@code widget_class} during class initialization.
     * <p>
     * See {@link WidgetClass#installAction} for details on
     * how to install actions.
     * <p>
     * Note that this function will also return actions defined
     * by parent classes. You can identify those by looking
     * at {@code owner}.
     * @param index position of the action to query
     * @param owner return location for the type where the action was defined
     * @param actionName return location for the action name
     * @param parameterType return location for the parameter type
     * @param propertyName return location for the property name
     * @return {@code true} if the action was found, {@code false} if {@code index_}
     *   is out of range
     */
    public boolean queryAction(int index, @NotNull Out<org.gtk.glib.Type> owner, @NotNull Out<java.lang.String> actionName, @Nullable Out<org.gtk.glib.VariantType> parameterType, @Nullable Out<java.lang.String> propertyName) {
        java.util.Objects.requireNonNull(owner, "Parameter 'owner' must not be null");
        MemorySegment ownerPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        MemorySegment actionNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment parameterTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment propertyNamePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_query_action.invokeExact(
                    handle(),
                    index,
                    (Addressable) ownerPOINTER.address(),
                    (Addressable) actionNamePOINTER.address(),
                    (Addressable) (parameterType == null ? MemoryAddress.NULL : (Addressable) parameterTypePOINTER.address()),
                    (Addressable) (propertyName == null ? MemoryAddress.NULL : (Addressable) propertyNamePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        owner.set(new org.gtk.glib.Type(ownerPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        actionName.set(Interop.getStringFrom(actionNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        if (parameterType != null) parameterType.set(new org.gtk.glib.VariantType(parameterTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        if (propertyName != null) propertyName.set(Interop.getStringFrom(propertyNamePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Sets the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are
     * rendered differently by assistive technologies.
     * @param accessibleRole the {@code GtkAccessibleRole} used by the {@code widget_class}
     */
    public void setAccessibleRole(@NotNull org.gtk.gtk.AccessibleRole accessibleRole) {
        java.util.Objects.requireNonNull(accessibleRole, "Parameter 'accessibleRole' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_accessible_role.invokeExact(
                    handle(),
                    accessibleRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the
     * given {@code signal_id}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_id} must have been registered with {@code g_signal_new()}
     * or g_signal_newv() before calling this function.
     * @param signalId the id for the activate signal
     */
    public void setActivateSignal(int signalId) {
        try {
            DowncallHandles.gtk_widget_class_set_activate_signal.invokeExact(
                    handle(),
                    signalId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the signal id for
     * the given {@code signal_name}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_name} of {@code widget_type} must have been registered with
     * g_signal_new() or g_signal_newv() before calling this function.
     * @param signalName the name of the activate signal of {@code widget_type}
     */
    public void setActivateSignalFromName(@NotNull java.lang.String signalName) {
        java.util.Objects.requireNonNull(signalName, "Parameter 'signalName' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_activate_signal_from_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(signalName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name to be used for CSS matching of widgets.
     * <p>
     * If this function is not called for a given class, the name
     * set on the parent class is used. By default, {@code GtkWidget}
     * uses the name "widget".
     * @param name name to use
     */
    public void setCssName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_css_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type to be used for creating layout managers for
     * widgets of {@code widget_class}.
     * <p>
     * The given {@code type} must be a subtype of {@link LayoutManager}.
     * <p>
     * This function should only be called from class init functions
     * of widgets.
     * @param type The object type that implements the {@code GtkLayoutManager}
     *   for {@code widget_class}
     */
    public void setLayoutManagerType(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_layout_manager_type.invokeExact(
                    handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This should be called at class initialization time to specify
     * the {@code GtkBuilder} XML to be used to extend a widget.
     * <p>
     * For convenience, {@link WidgetClass#setTemplateFromResource}
     * is also provided.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance initializer.
     * @param templateBytes A {@code GBytes} holding the {@code GtkBuilder} XML
     */
    public void setTemplate(@NotNull org.gtk.glib.Bytes templateBytes) {
        java.util.Objects.requireNonNull(templateBytes, "Parameter 'templateBytes' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_template.invokeExact(
                    handle(),
                    templateBytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience function that calls {@link WidgetClass#setTemplate}
     * with the contents of a {@code GResource}.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance
     * initializer.
     * @param resourceName The name of the resource to load the template from
     */
    public void setTemplateFromResource(@NotNull java.lang.String resourceName) {
        java.util.Objects.requireNonNull(resourceName, "Parameter 'resourceName' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_template_from_resource.invokeExact(
                    handle(),
                    Interop.allocateNativeString(resourceName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * For use in language bindings, this will override the default
     * {@code GtkBuilderScope} to be used when parsing GtkBuilder XML from
     * this class’s template data.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@code GtkWidgetClass#setTemplate}.
     * @param scope The {@code GtkBuilderScope} to use when loading
     *   the class template
     */
    public void setTemplateScope(@NotNull org.gtk.gtk.BuilderScope scope) {
        java.util.Objects.requireNonNull(scope, "Parameter 'scope' must not be null");
        try {
            DowncallHandles.gtk_widget_class_set_template_scope.invokeExact(
                    handle(),
                    scope.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_class_add_binding = Interop.downcallHandle(
            "gtk_widget_class_add_binding",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_action = Interop.downcallHandle(
            "gtk_widget_class_add_binding_action",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_signal = Interop.downcallHandle(
            "gtk_widget_class_add_binding_signal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_widget_class_add_shortcut = Interop.downcallHandle(
            "gtk_widget_class_add_shortcut",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_callback_full = Interop.downcallHandle(
            "gtk_widget_class_bind_template_callback_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_child_full = Interop.downcallHandle(
            "gtk_widget_class_bind_template_child_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_widget_class_get_accessible_role = Interop.downcallHandle(
            "gtk_widget_class_get_accessible_role",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_get_activate_signal = Interop.downcallHandle(
            "gtk_widget_class_get_activate_signal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_get_css_name = Interop.downcallHandle(
            "gtk_widget_class_get_css_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_get_layout_manager_type = Interop.downcallHandle(
            "gtk_widget_class_get_layout_manager_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_install_action = Interop.downcallHandle(
            "gtk_widget_class_install_action",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_install_property_action = Interop.downcallHandle(
            "gtk_widget_class_install_property_action",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_query_action = Interop.downcallHandle(
            "gtk_widget_class_query_action",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_accessible_role = Interop.downcallHandle(
            "gtk_widget_class_set_accessible_role",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal = Interop.downcallHandle(
            "gtk_widget_class_set_activate_signal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal_from_name = Interop.downcallHandle(
            "gtk_widget_class_set_activate_signal_from_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_css_name = Interop.downcallHandle(
            "gtk_widget_class_set_css_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_layout_manager_type = Interop.downcallHandle(
            "gtk_widget_class_set_layout_manager_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_template = Interop.downcallHandle(
            "gtk_widget_class_set_template",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_template_from_resource = Interop.downcallHandle(
            "gtk_widget_class_set_template_from_resource",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_widget_class_set_template_scope = Interop.downcallHandle(
            "gtk_widget_class_set_template_scope",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private WidgetClass struct;
        
         /**
         * A {@link WidgetClass.Build} object constructs a {@link WidgetClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = WidgetClass.allocate();
        }
        
         /**
         * Finish building the {@link WidgetClass} struct.
         * @return A new instance of {@code WidgetClass} with the fields 
         *         that were set in the Build object.
         */
        public WidgetClass construct() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first
         *   element in the widget class structure in order for the class mechanism
         *   to work correctly. This allows a GtkWidgetClass pointer to be cast to
         *   a GObjectClass pointer.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setShow(java.lang.foreign.MemoryAddress show) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (show == null ? MemoryAddress.NULL : show));
            return this;
        }
        
        public Build setHide(java.lang.foreign.MemoryAddress hide) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hide"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hide == null ? MemoryAddress.NULL : hide));
            return this;
        }
        
        public Build setMap(java.lang.foreign.MemoryAddress map) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("map"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (map == null ? MemoryAddress.NULL : map));
            return this;
        }
        
        public Build setUnmap(java.lang.foreign.MemoryAddress unmap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmap == null ? MemoryAddress.NULL : unmap));
            return this;
        }
        
        public Build setRealize(java.lang.foreign.MemoryAddress realize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (realize == null ? MemoryAddress.NULL : realize));
            return this;
        }
        
        public Build setUnrealize(java.lang.foreign.MemoryAddress unrealize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize));
            return this;
        }
        
        public Build setRoot(java.lang.foreign.MemoryAddress root) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (root == null ? MemoryAddress.NULL : root));
            return this;
        }
        
        public Build setUnroot(java.lang.foreign.MemoryAddress unroot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unroot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unroot == null ? MemoryAddress.NULL : unroot));
            return this;
        }
        
        public Build setSizeAllocate(java.lang.foreign.MemoryAddress sizeAllocate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size_allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sizeAllocate == null ? MemoryAddress.NULL : sizeAllocate));
            return this;
        }
        
        public Build setStateFlagsChanged(java.lang.foreign.MemoryAddress stateFlagsChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("state_flags_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stateFlagsChanged == null ? MemoryAddress.NULL : stateFlagsChanged));
            return this;
        }
        
        public Build setDirectionChanged(java.lang.foreign.MemoryAddress directionChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("direction_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (directionChanged == null ? MemoryAddress.NULL : directionChanged));
            return this;
        }
        
        public Build setGetRequestMode(java.lang.foreign.MemoryAddress getRequestMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode));
            return this;
        }
        
        public Build setMeasure(java.lang.foreign.MemoryAddress measure) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measure == null ? MemoryAddress.NULL : measure));
            return this;
        }
        
        public Build setMnemonicActivate(java.lang.foreign.MemoryAddress mnemonicActivate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mnemonic_activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mnemonicActivate == null ? MemoryAddress.NULL : mnemonicActivate));
            return this;
        }
        
        public Build setGrabFocus(java.lang.foreign.MemoryAddress grabFocus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("grab_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (grabFocus == null ? MemoryAddress.NULL : grabFocus));
            return this;
        }
        
        public Build setFocus(java.lang.foreign.MemoryAddress focus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus == null ? MemoryAddress.NULL : focus));
            return this;
        }
        
        public Build setSetFocusChild(java.lang.foreign.MemoryAddress setFocusChild) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_focus_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFocusChild == null ? MemoryAddress.NULL : setFocusChild));
            return this;
        }
        
        public Build setMoveFocus(java.lang.foreign.MemoryAddress moveFocus) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_focus"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveFocus == null ? MemoryAddress.NULL : moveFocus));
            return this;
        }
        
        public Build setKeynavFailed(java.lang.foreign.MemoryAddress keynavFailed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("keynav_failed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (keynavFailed == null ? MemoryAddress.NULL : keynavFailed));
            return this;
        }
        
        public Build setQueryTooltip(java.lang.foreign.MemoryAddress queryTooltip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_tooltip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryTooltip == null ? MemoryAddress.NULL : queryTooltip));
            return this;
        }
        
        public Build setComputeExpand(java.lang.foreign.MemoryAddress computeExpand) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("compute_expand"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (computeExpand == null ? MemoryAddress.NULL : computeExpand));
            return this;
        }
        
        public Build setCssChanged(java.lang.foreign.MemoryAddress cssChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("css_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cssChanged == null ? MemoryAddress.NULL : cssChanged));
            return this;
        }
        
        public Build setSystemSettingChanged(java.lang.foreign.MemoryAddress systemSettingChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_setting_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (systemSettingChanged == null ? MemoryAddress.NULL : systemSettingChanged));
            return this;
        }
        
        public Build setSnapshot(java.lang.foreign.MemoryAddress snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot));
            return this;
        }
        
        public Build setContains(java.lang.foreign.MemoryAddress contains) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("contains"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (contains == null ? MemoryAddress.NULL : contains));
            return this;
        }
        
        public Build setPriv(org.gtk.gtk.WidgetClassPrivate priv) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("priv"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (priv == null ? MemoryAddress.NULL : priv.handle()));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
