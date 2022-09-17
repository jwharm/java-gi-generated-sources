package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

public class WidgetClass extends io.github.jwharm.javagi.ResourceBase {

    public WidgetClass(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Installs a shortcut in @widget_class.
     * 
     * Every instance created for @widget_class or its subclasses will
     * inherit this shortcut and trigger it.
     * 
     * Shortcuts added this way will be triggered in the <code>GTK_PHASE_BUBBLE
     * phase,</code> which means they may also trigger if child widgets have focus.
     * 
     * This function must only be used in class initialization functions
     * otherwise it is not guaranteed that the shortcut will be installed.
     */
    public void addShortcut(Shortcut shortcut) {
        gtk_h.gtk_widget_class_add_shortcut(handle(), shortcut.handle());
    }
    
    /**
     * Automatically assign an object declared in the class template XML to
     * be set to a location on a freshly built instance&#8217;s private data, or
     * alternatively accessible via {@link org.gtk.gtk.Widget#getTemplateChild}.
     * <p>
     * The struct can point either into the public instance, then you should
     * use <code>G_STRUCT_OFFSET(WidgetType, member)</code> for @struct_offset, or in the
     * private struct, then you should use <code>G_PRIVATE_OFFSET(WidgetType, member)</code>.
     * <p>
     * An explicit strong reference will be held automatically for the duration
     * of your instance&#8217;s life cycle, it will be released automatically when<code>GObjectClass.dispose()</code> runs on your instance and if a @struct_offset
     * that is <code>!= 0</code> is specified, then the automatic location in your instance
     * public or private data will be set to <code>NULL.</code> You can however access an
     * automated child pointer the first time your classes <code>GObjectClass.dispose()</code>
     * runs, or alternatively in {@link [signal@Gtk.Widget::destroy] (ref=signal)}.
     * <p>
     * If @internal_child is specified, {@link org.gtk.gtk.Buildable#getInternalChild}
     * will be automatically implemented by the <code>GtkWidget</code> class so there is no
     * need to implement it manually.
     * 
     * The wrapper macros {@link Gtk#widgetClassBindTemplateChild},
     * {@link Gtk#widgetClassBindTemplateChildInternal},
     * {@link Gtk#widgetClassBindTemplateChildPrivate} and
     * {@link Gtk#widgetClassBindTemplateChildInternalPrivate}
     * might be more convenient to use.
     * 
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link org.gtk.gtk.WidgetClass#setTemplate}.
     */
    public void bindTemplateChildFull(java.lang.String name, boolean internalChild, long structOffset) {
        gtk_h.gtk_widget_class_bind_template_child_full(handle(), Interop.allocateNativeString(name).handle(), internalChild ? 1 : 0, structOffset);
    }
    
    /**
     * Retrieves the accessible role used by the given <code>GtkWidget</code> class.
     * 
     * Different accessible roles have different states, and are rendered
     * differently by assistive technologies.
     * 
     * See also: {@link org.gtk.gtk.Accessible#getAccessibleRole}.
     */
    public AccessibleRole getAccessibleRole() {
        var RESULT = gtk_h.gtk_widget_class_get_accessible_role(handle());
        return AccessibleRole.fromValue(RESULT);
    }
    
    /**
     * Retrieves the signal id for the activation signal.
     * 
     * the activation signal is set using
     * {@link org.gtk.gtk.WidgetClass#setActivateSignal}.
     */
    public int getActivateSignal() {
        var RESULT = gtk_h.gtk_widget_class_get_activate_signal(handle());
        return RESULT;
    }
    
    /**
     * Gets the name used by this class for matching in CSS code.
     * 
     * See {@link org.gtk.gtk.WidgetClass#setCssName} for details.
     */
    public java.lang.String getCssName() {
        var RESULT = gtk_h.gtk_widget_class_get_css_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the type of the {@link org.gtk.gtk.LayoutManager}
     * used by widgets of class @widget_class.
     * 
     * See also: {@link org.gtk.gtk.WidgetClass#setLayoutManagerType}.
     */
    public org.gtk.gobject.Type getLayoutManagerType() {
        var RESULT = gtk_h.gtk_widget_class_get_layout_manager_type(handle());
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
        gtk_h.gtk_widget_class_install_property_action(handle(), Interop.allocateNativeString(actionName).handle(), Interop.allocateNativeString(propertyName).handle());
    }
    
    /**
     * Sets the accessible role used by the given <code>GtkWidget</code> class.
     * 
     * Different accessible roles have different states, and are
     * rendered differently by assistive technologies.
     */
    public void setAccessibleRole(AccessibleRole accessibleRole) {
        gtk_h.gtk_widget_class_set_accessible_role(handle(), accessibleRole.getValue());
    }
    
    /**
     * Sets the <code>GtkWidgetClass.activate_signal</code> field with the
     * given @signal_id.
     * <p>
     * The signal will be emitted when calling {@link org.gtk.gtk.Widget#activate}.
     * <p>
     * The @signal_id must have been registered with <code>g_signal_new()</code>
     * or g_signal_newv() before calling this function.
     */
    public void setActivateSignal(int signalId) {
        gtk_h.gtk_widget_class_set_activate_signal(handle(), signalId);
    }
    
    /**
     * Sets the <code>GtkWidgetClass.activate_signal</code> field with the signal id for
     * the given @signal_name.
     * 
     * The signal will be emitted when calling {@link org.gtk.gtk.Widget#activate}.
     * 
     * The @signal_name of @widget_type must have been registered with
     * g_signal_new() or g_signal_newv() before calling this function.
     */
    public void setActivateSignalFromName(java.lang.String signalName) {
        gtk_h.gtk_widget_class_set_activate_signal_from_name(handle(), Interop.allocateNativeString(signalName).handle());
    }
    
    /**
     * Sets the name to be used for CSS matching of widgets.
     * <p>
     * If this function is not called for a given class, the name
     * set on the parent class is used. By default, <code>GtkWidget</code>
     * uses the name &#34;widget&#34;.
     */
    public void setCssName(java.lang.String name) {
        gtk_h.gtk_widget_class_set_css_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the type to be used for creating layout managers for
     * widgets of @widget_class.
     * 
     * The given @type must be a subtype of {@link org.gtk.gtk.LayoutManager}.
     * 
     * This function should only be called from class init functions
     * of widgets.
     */
    public void setLayoutManagerType(Type type) {
        gtk_h.gtk_widget_class_set_layout_manager_type(handle(), type.getValue());
    }
    
    /**
     * This should be called at class initialization time to specify
     * the <code>GtkBuilder</code> XML to be used to extend a widget.
     * 
     * For convenience, {@link org.gtk.gtk.WidgetClass#setTemplateFromResource}
     * is also provided.
     * 
     * Note that any class that installs templates must call
     * {@link org.gtk.gtk.Widget#initTemplate} in the widget&#8217;s instance initializer.
     */
    public void setTemplate(org.gtk.glib.Bytes templateBytes) {
        gtk_h.gtk_widget_class_set_template(handle(), templateBytes.handle());
    }
    
    /**
     * A convenience function that calls {@link org.gtk.gtk.WidgetClass#setTemplate}
     * with the contents of a <code>GResource</code>.
     * 
     * Note that any class that installs templates must call
     * {@link org.gtk.gtk.Widget#initTemplate} in the widget&#8217;s instance
     * initializer.
     */
    public void setTemplateFromResource(java.lang.String resourceName) {
        gtk_h.gtk_widget_class_set_template_from_resource(handle(), Interop.allocateNativeString(resourceName).handle());
    }
    
    /**
     * For use in language bindings, this will override the default<code>GtkBuilderScope</code> to be used when parsing GtkBuilder XML from
     * this class&#8217;s template data.
     * 
     * Note that this must be called from a composite widget classes class
     * initializer after calling {@link [method@GtkWidgetClass.set_template]}.
     */
    public void setTemplateScope(BuilderScope scope) {
        gtk_h.gtk_widget_class_set_template_scope(handle(), scope.handle());
    }
    
}
