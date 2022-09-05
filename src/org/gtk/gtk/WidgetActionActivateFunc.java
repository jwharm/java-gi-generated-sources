package org.gtk.gtk;

@FunctionalInterface
public interface WidgetActionActivateFunc {

    /**
     * The type of the callback functions used for activating
     * actions installed with gtk_widget_class_install_action().
     * 
     * The @parameter must match the @parameter_type of the action.
     */
    public void onWidgetActionActivateFunc(Widget widget, java.lang.String actionName, org.gtk.glib.Variant parameter);
}
