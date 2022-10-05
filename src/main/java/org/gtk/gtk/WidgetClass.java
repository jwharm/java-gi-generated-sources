package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public class WidgetClass extends io.github.jwharm.javagi.ResourceBase {

    public WidgetClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_widget_class_add_shortcut = Interop.downcallHandle(
        "gtk_widget_class_add_shortcut",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void addShortcut(Shortcut shortcut) {
        try {
            gtk_widget_class_add_shortcut.invokeExact(handle(), shortcut.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_bind_template_child_full = Interop.downcallHandle(
        "gtk_widget_class_bind_template_child_full",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
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
     * If {@code internal_child} is specified, {@link Buildable#getInternalChild}
     * will be automatically implemented by the {@code GtkWidget} class so there is no
     * need to implement it manually.
     * <p>
     * The wrapper macros {@link Gtk#widgetClassBindTemplateChild},
     * {@link Gtk#widgetClassBindTemplateChildInternal},
     * {@link Gtk#widgetClassBindTemplateChildPrivate} and
     * {@link Gtk#widgetClassBindTemplateChildInternalPrivate}
     * might be more convenient to use.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link WidgetClass#setTemplate}.
     */
    public void bindTemplateChildFull(java.lang.String name, boolean internalChild, long structOffset) {
        try {
            gtk_widget_class_bind_template_child_full.invokeExact(handle(), Interop.allocateNativeString(name).handle(), internalChild ? 1 : 0, structOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_get_accessible_role = Interop.downcallHandle(
        "gtk_widget_class_get_accessible_role",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are rendered
     * differently by assistive technologies.
     * <p>
     * See also: {@link Accessible#getAccessibleRole}.
     */
    public AccessibleRole getAccessibleRole() {
        try {
            var RESULT = (int) gtk_widget_class_get_accessible_role.invokeExact(handle());
            return new AccessibleRole(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_get_activate_signal = Interop.downcallHandle(
        "gtk_widget_class_get_activate_signal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the signal id for the activation signal.
     * <p>
     * the activation signal is set using
     * {@link WidgetClass#setActivateSignal}.
     */
    public int getActivateSignal() {
        try {
            var RESULT = (int) gtk_widget_class_get_activate_signal.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_get_css_name = Interop.downcallHandle(
        "gtk_widget_class_get_css_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name used by this class for matching in CSS code.
     * <p>
     * See {@link WidgetClass#setCssName} for details.
     */
    public java.lang.String getCssName() {
        try {
            var RESULT = (MemoryAddress) gtk_widget_class_get_css_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_get_layout_manager_type = Interop.downcallHandle(
        "gtk_widget_class_get_layout_manager_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the type of the {@link LayoutManager}
     * used by widgets of class {@code widget_class}.
     * <p>
     * See also: {@link WidgetClass#setLayoutManagerType}.
     */
    public org.gtk.gobject.Type getLayoutManagerType() {
        try {
            var RESULT = (long) gtk_widget_class_get_layout_manager_type.invokeExact(handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_install_property_action = Interop.downcallHandle(
        "gtk_widget_class_install_property_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void installPropertyAction(java.lang.String actionName, java.lang.String propertyName) {
        try {
            gtk_widget_class_install_property_action.invokeExact(handle(), Interop.allocateNativeString(actionName).handle(), Interop.allocateNativeString(propertyName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_query_action = Interop.downcallHandle(
        "gtk_widget_class_query_action",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public boolean queryAction(int index, org.gtk.gobject.Type owner, java.lang.String[] actionName, org.gtk.glib.VariantType[] parameterType, java.lang.String[] propertyName) {
        PointerLong ownerPOINTER = new PointerLong(owner.getValue());
        try {
            var RESULT = (int) gtk_widget_class_query_action.invokeExact(handle(), index, new PointerLong(owner.getValue()).handle(), Interop.allocateNativeArray(actionName).handle(), Interop.allocateNativeArray(parameterType).handle(), Interop.allocateNativeArray(propertyName).handle());
            owner.setValue(ownerPOINTER.get());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_accessible_role = Interop.downcallHandle(
        "gtk_widget_class_set_accessible_role",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the accessible role used by the given {@code GtkWidget} class.
     * <p>
     * Different accessible roles have different states, and are
     * rendered differently by assistive technologies.
     */
    public void setAccessibleRole(AccessibleRole accessibleRole) {
        try {
            gtk_widget_class_set_accessible_role.invokeExact(handle(), accessibleRole.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_activate_signal = Interop.downcallHandle(
        "gtk_widget_class_set_activate_signal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the
     * given {@code signal_id}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_id} must have been registered with {@code g_signal_new()}
     * or g_signal_newv() before calling this function.
     */
    public void setActivateSignal(int signalId) {
        try {
            gtk_widget_class_set_activate_signal.invokeExact(handle(), signalId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_activate_signal_from_name = Interop.downcallHandle(
        "gtk_widget_class_set_activate_signal_from_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code GtkWidgetClass.activate_signal} field with the signal id for
     * the given {@code signal_name}.
     * <p>
     * The signal will be emitted when calling {@link Widget#activate}.
     * <p>
     * The {@code signal_name} of {@code widget_type} must have been registered with
     * g_signal_new() or g_signal_newv() before calling this function.
     */
    public void setActivateSignalFromName(java.lang.String signalName) {
        try {
            gtk_widget_class_set_activate_signal_from_name.invokeExact(handle(), Interop.allocateNativeString(signalName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_css_name = Interop.downcallHandle(
        "gtk_widget_class_set_css_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name to be used for CSS matching of widgets.
     * <p>
     * If this function is not called for a given class, the name
     * set on the parent class is used. By default, {@code GtkWidget}
     * uses the name "widget".
     */
    public void setCssName(java.lang.String name) {
        try {
            gtk_widget_class_set_css_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_layout_manager_type = Interop.downcallHandle(
        "gtk_widget_class_set_layout_manager_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the type to be used for creating layout managers for
     * widgets of {@code widget_class}.
     * <p>
     * The given {@code type} must be a subtype of {@link LayoutManager}.
     * <p>
     * This function should only be called from class init functions
     * of widgets.
     */
    public void setLayoutManagerType(org.gtk.gobject.Type type) {
        try {
            gtk_widget_class_set_layout_manager_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_template = Interop.downcallHandle(
        "gtk_widget_class_set_template",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This should be called at class initialization time to specify
     * the {@code GtkBuilder} XML to be used to extend a widget.
     * <p>
     * For convenience, {@link WidgetClass#setTemplateFromResource}
     * is also provided.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance initializer.
     */
    public void setTemplate(org.gtk.glib.Bytes templateBytes) {
        try {
            gtk_widget_class_set_template.invokeExact(handle(), templateBytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_template_from_resource = Interop.downcallHandle(
        "gtk_widget_class_set_template_from_resource",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience function that calls {@link WidgetClass#setTemplate}
     * with the contents of a {@code GResource}.
     * <p>
     * Note that any class that installs templates must call
     * {@link Widget#initTemplate} in the widget’s instance
     * initializer.
     */
    public void setTemplateFromResource(java.lang.String resourceName) {
        try {
            gtk_widget_class_set_template_from_resource.invokeExact(handle(), Interop.allocateNativeString(resourceName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_widget_class_set_template_scope = Interop.downcallHandle(
        "gtk_widget_class_set_template_scope",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * For use in language bindings, this will override the default
     * {@code GtkBuilderScope} to be used when parsing GtkBuilder XML from
     * this class’s template data.
     * <p>
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link GtkWidgetClass#setTemplate}.
     */
    public void setTemplateScope(BuilderScope scope) {
        try {
            gtk_widget_class_set_template_scope.invokeExact(handle(), scope.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}