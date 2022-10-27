package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class WidgetClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        org.gtk.gtk.WidgetClassPrivate.getMemoryLayout().withName("priv"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName("GtkWidgetClass");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public WidgetClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
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
     */
    public void addBinding(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull org.gtk.gtk.ShortcutFunc callback, @Nullable java.lang.String formatString) {
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
     */
    public void addBindingAction(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull java.lang.String actionName, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
     */
    public void addBindingSignal(int keyval, @NotNull org.gtk.gdk.ModifierType mods, @NotNull java.lang.String signal, @Nullable java.lang.String formatString) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
            DowncallHandles.gtk_widget_class_add_shortcut.invokeExact(handle(), shortcut.handle());
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
            DowncallHandles.gtk_widget_class_bind_template_child_full.invokeExact(handle(), Interop.allocateNativeString(name), internalChild ? 1 : 0, structOffset);
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
            RESULT = (int) DowncallHandles.gtk_widget_class_get_accessible_role.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_widget_class_get_activate_signal.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_widget_class_get_css_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
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
            RESULT = (long) DowncallHandles.gtk_widget_class_get_layout_manager_type.invokeExact(handle());
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
            DowncallHandles.gtk_widget_class_install_property_action.invokeExact(handle(), Interop.allocateNativeString(actionName), Interop.allocateNativeString(propertyName));
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
        java.util.Objects.requireNonNull(actionName, "Parameter 'actionName' must not be null");
        java.util.Objects.requireNonNullElse(parameterType, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(propertyName, MemoryAddress.NULL);
        MemorySegment ownerPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemorySegment actionNamePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment parameterTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment propertyNamePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_widget_class_query_action.invokeExact(handle(), index, (Addressable) ownerPOINTER.address(), (Addressable) actionNamePOINTER.address(), (Addressable) parameterTypePOINTER.address(), (Addressable) propertyNamePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        owner.set(new org.gtk.glib.Type(ownerPOINTER.get(ValueLayout.JAVA_LONG, 0)));
        actionName.set(actionNamePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        parameterType.set(new org.gtk.glib.VariantType(Refcounted.get(parameterTypePOINTER.get(ValueLayout.ADDRESS, 0), false)));
        propertyName.set(propertyNamePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
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
            DowncallHandles.gtk_widget_class_set_accessible_role.invokeExact(handle(), accessibleRole.getValue());
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
            DowncallHandles.gtk_widget_class_set_activate_signal.invokeExact(handle(), signalId);
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
            DowncallHandles.gtk_widget_class_set_activate_signal_from_name.invokeExact(handle(), Interop.allocateNativeString(signalName));
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
            DowncallHandles.gtk_widget_class_set_css_name.invokeExact(handle(), Interop.allocateNativeString(name));
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
            DowncallHandles.gtk_widget_class_set_layout_manager_type.invokeExact(handle(), type.getValue());
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
            DowncallHandles.gtk_widget_class_set_template.invokeExact(handle(), templateBytes.handle());
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
            DowncallHandles.gtk_widget_class_set_template_from_resource.invokeExact(handle(), Interop.allocateNativeString(resourceName));
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
            DowncallHandles.gtk_widget_class_set_template_scope.invokeExact(handle(), scope.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_widget_class_add_binding = Interop.downcallHandle(
            "gtk_widget_class_add_binding",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_action = Interop.downcallHandle(
            "gtk_widget_class_add_binding_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_add_binding_signal = Interop.downcallHandle(
            "gtk_widget_class_add_binding_signal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_add_shortcut = Interop.downcallHandle(
            "gtk_widget_class_add_shortcut",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_callback_full = Interop.downcallHandle(
            "gtk_widget_class_bind_template_callback_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_bind_template_child_full = Interop.downcallHandle(
            "gtk_widget_class_bind_template_child_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gtk_widget_class_get_accessible_role = Interop.downcallHandle(
            "gtk_widget_class_get_accessible_role",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_get_activate_signal = Interop.downcallHandle(
            "gtk_widget_class_get_activate_signal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_get_css_name = Interop.downcallHandle(
            "gtk_widget_class_get_css_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_get_layout_manager_type = Interop.downcallHandle(
            "gtk_widget_class_get_layout_manager_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_install_action = Interop.downcallHandle(
            "gtk_widget_class_install_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_install_property_action = Interop.downcallHandle(
            "gtk_widget_class_install_property_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_query_action = Interop.downcallHandle(
            "gtk_widget_class_query_action",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_set_accessible_role = Interop.downcallHandle(
            "gtk_widget_class_set_accessible_role",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal = Interop.downcallHandle(
            "gtk_widget_class_set_activate_signal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_widget_class_set_activate_signal_from_name = Interop.downcallHandle(
            "gtk_widget_class_set_activate_signal_from_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_set_css_name = Interop.downcallHandle(
            "gtk_widget_class_set_css_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_set_layout_manager_type = Interop.downcallHandle(
            "gtk_widget_class_set_layout_manager_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle gtk_widget_class_set_template = Interop.downcallHandle(
            "gtk_widget_class_set_template",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_set_template_from_resource = Interop.downcallHandle(
            "gtk_widget_class_set_template_from_resource",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_widget_class_set_template_scope = Interop.downcallHandle(
            "gtk_widget_class_set_template_scope",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
