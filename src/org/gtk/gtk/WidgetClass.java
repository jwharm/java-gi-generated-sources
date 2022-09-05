package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class WidgetClass extends io.github.jwharm.javagi.interop.ResourceBase {

    public WidgetClass(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Installs a shortcut in @widget_class.
     * 
     * Every instance created for @widget_class or its subclasses will
     * inherit this shortcut and trigger it.
     * 
     * Shortcuts added this way will be triggered in the %GTK_PHASE_BUBBLE
     * phase, which means they may also trigger if child widgets have focus.
     * 
     * This function must only be used in class initialization functions
     * otherwise it is not guaranteed that the shortcut will be installed.
     */
    public void addShortcut(Shortcut shortcut) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_add_shortcut(HANDLE(), shortcut.HANDLE());
    }
    
    /**
     * Automatically assign an object declared in the class template XML to
     * be set to a location on a freshly built instance’s private data, or
     * alternatively accessible via [method@Gtk.Widget.get_template_child].
     * 
     * The struct can point either into the public instance, then you should
     * use `G_STRUCT_OFFSET(WidgetType, member)` for @struct_offset, or in the
     * private struct, then you should use `G_PRIVATE_OFFSET(WidgetType, member)`.
     * 
     * An explicit strong reference will be held automatically for the duration
     * of your instance’s life cycle, it will be released automatically when
     * `GObjectClass.dispose()` runs on your instance and if a @struct_offset
     * that is `!= 0` is specified, then the automatic location in your instance
     * public or private data will be set to %NULL. You can however access an
     * automated child pointer the first time your classes `GObjectClass.dispose()`
     * runs, or alternatively in [signal@Gtk.Widget::destroy].
     * 
     * If @internal_child is specified, [vfunc@Gtk.Buildable.get_internal_child]
     * will be automatically implemented by the `GtkWidget` class so there is no
     * need to implement it manually.
     * 
     * The wrapper macros [func@Gtk.widget_class_bind_template_child],
     * [func@Gtk.widget_class_bind_template_child_internal],
     * [func@Gtk.widget_class_bind_template_child_private] and
     * [func@Gtk.widget_class_bind_template_child_internal_private]
     * might be more convenient to use.
     * 
     * Note that this must be called from a composite widget classes class
     * initializer after calling [method@Gtk.WidgetClass.set_template].
     */
    public void bindTemplateChildFull(java.lang.String name, boolean internalChild, long structOffset) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_bind_template_child_full(HANDLE(), Interop.getAllocator().allocateUtf8String(name), internalChild ? 1 : 0, structOffset);
    }
    
    /**
     * Retrieves the accessible role used by the given `GtkWidget` class.
     * 
     * Different accessible roles have different states, and are rendered
     * differently by assistive technologies.
     * 
     * See also: [method@Gtk.Accessible.get_accessible_role].
     */
    public AccessibleRole getAccessibleRole() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_get_accessible_role(HANDLE());
        return AccessibleRole.fromValue(RESULT);
    }
    
    /**
     * Retrieves the signal id for the activation signal.
     * 
     * the activation signal is set using
     * [method@Gtk.WidgetClass.set_activate_signal].
     */
    public int getActivateSignal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_get_activate_signal(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the name used by this class for matching in CSS code.
     * 
     * See [method@Gtk.WidgetClass.set_css_name] for details.
     */
    public java.lang.String getCssName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_get_css_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the type of the [class@Gtk.LayoutManager]
     * used by widgets of class @widget_class.
     * 
     * See also: [method@Gtk.WidgetClass.set_layout_manager_type].
     */
    public org.gtk.gobject.Type getLayoutManagerType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_get_layout_manager_type(HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Installs an action called @action_name on @widget_class and
     * binds its state to the value of the @property_name property.
     * 
     * This function will perform a few santity checks on the property selected
     * via @property_name. Namely, the property must exist, must be readable,
     * writable and must not be construct-only. There are also restrictions
     * on the type of the given property, it must be boolean, int, unsigned int,
     * double or string. If any of these conditions are not met, a critical
     * warning will be printed and no action will be added.
     * 
     * The state type of the action matches the property type.
     * 
     * If the property is boolean, the action will have no parameter and
     * toggle the property value. Otherwise, the action will have a parameter
     * of the same type as the property.
     */
    public void installPropertyAction(java.lang.String actionName, java.lang.String propertyName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_install_property_action(HANDLE(), Interop.getAllocator().allocateUtf8String(actionName), Interop.getAllocator().allocateUtf8String(propertyName));
    }
    
    /**
     * Sets the accessible role used by the given `GtkWidget` class.
     * 
     * Different accessible roles have different states, and are
     * rendered differently by assistive technologies.
     */
    public void setAccessibleRole(AccessibleRole accessibleRole) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_accessible_role(HANDLE(), accessibleRole.getValue());
    }
    
    /**
     * Sets the `GtkWidgetClass.activate_signal` field with the
     * given @signal_id.
     * 
     * The signal will be emitted when calling [method@Gtk.Widget.activate].
     * 
     * The @signal_id must have been registered with `g_signal_new()`
     * or g_signal_newv() before calling this function.
     */
    public void setActivateSignal(int signalId) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_activate_signal(HANDLE(), signalId);
    }
    
    /**
     * Sets the `GtkWidgetClass.activate_signal` field with the signal id for
     * the given @signal_name.
     * 
     * The signal will be emitted when calling [method@Gtk.Widget.activate].
     * 
     * The @signal_name of @widget_type must have been registered with
     * g_signal_new() or g_signal_newv() before calling this function.
     */
    public void setActivateSignalFromName(java.lang.String signalName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_activate_signal_from_name(HANDLE(), Interop.getAllocator().allocateUtf8String(signalName));
    }
    
    /**
     * Sets the name to be used for CSS matching of widgets.
     * 
     * If this function is not called for a given class, the name
     * set on the parent class is used. By default, `GtkWidget`
     * uses the name "widget".
     */
    public void setCssName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_css_name(HANDLE(), Interop.getAllocator().allocateUtf8String(name));
    }
    
    /**
     * Sets the type to be used for creating layout managers for
     * widgets of @widget_class.
     * 
     * The given @type must be a subtype of [class@Gtk.LayoutManager].
     * 
     * This function should only be called from class init functions
     * of widgets.
     */
    public void setLayoutManagerType(Type type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_layout_manager_type(HANDLE(), type.getValue());
    }
    
    /**
     * This should be called at class initialization time to specify
     * the `GtkBuilder` XML to be used to extend a widget.
     * 
     * For convenience, [method@Gtk.WidgetClass.set_template_from_resource]
     * is also provided.
     * 
     * Note that any class that installs templates must call
     * [method@Gtk.Widget.init_template] in the widget’s instance initializer.
     */
    public void setTemplate(org.gtk.glib.Bytes templateBytes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_template(HANDLE(), templateBytes.HANDLE());
    }
    
    /**
     * A convenience function that calls [method@Gtk.WidgetClass.set_template]
     * with the contents of a `GResource`.
     * 
     * Note that any class that installs templates must call
     * [method@Gtk.Widget.init_template] in the widget’s instance
     * initializer.
     */
    public void setTemplateFromResource(java.lang.String resourceName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_template_from_resource(HANDLE(), Interop.getAllocator().allocateUtf8String(resourceName));
    }
    
    /**
     * For use in language bindings, this will override the default
     * `GtkBuilderScope` to be used when parsing GtkBuilder XML from
     * this class’s template data.
     * 
     * Note that this must be called from a composite widget classes class
     * initializer after calling [method@GtkWidgetClass.set_template].
     */
    public void setTemplateScope(BuilderScope scope) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_widget_class_set_template_scope(HANDLE(), scope.HANDLE());
    }
    
}
