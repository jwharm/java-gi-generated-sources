package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkExpander` allows the user to reveal its child by clicking
 * on an expander triangle.
 * 
 * ![An example GtkExpander](expander.png)
 * 
 * This is similar to the triangles used in a `GtkTreeView`.
 * 
 * Normally you use an expander as you would use a frame; you create
 * the child widget and use [method@Gtk.Expander.set_child] to add it
 * to the expander. When the expander is toggled, it will take care of
 * showing and hiding the child automatically.
 * 
 * # Special Usage
 * 
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a `GtkExpander`
 * but do not add a child to it. The expander widget has an
 * [property@Gtk.Expander:expanded[ property which can be used to
 * monitor its expansion state. You should watch this property with
 * a signal connection as follows:
 * 
 * ```c
 * static void
 * expander_callback (GObject    *object,
 *                    GParamSpec *param_spec,
 *                    gpointer    user_data)
 * {
 *   GtkExpander *expander;
 * 
 *   expander = GTK_EXPANDER (object);
 * 
 *   if (gtk_expander_get_expanded (expander))
 *     {
 *       // Show or create widgets
 *     }
 *   else
 *     {
 *       // Hide or destroy widgets
 *     }
 * }
 * 
 * static void
 * create_expander (void)
 * {
 *   GtkWidget *expander = gtk_expander_new_with_mnemonic ("_More Options");
 *   g_signal_connect (expander, "notify::expanded",
 *                     G_CALLBACK (expander_callback), NULL);
 * 
 *   // ...
 * }
 * ```
 * 
 * # GtkExpander as GtkBuildable
 * 
 * The `GtkExpander` implementation of the `GtkBuildable` interface supports
 * placing a child in the label position by specifying “label” as the
 * “type” attribute of a <child> element. A normal content child can be
 * specified without specifying a <child> type attribute.
 * 
 * An example of a UI definition fragment with GtkExpander:
 * 
 * ```xml
 * <object class="GtkExpander">
 *   <child type="label">
 *     <object class="GtkLabel" id="expander-label"/>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="expander-content"/>
 *   </child>
 * </object>
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * expander
 * ╰── box
 *     ├── title
 *     │   ├── arrow
 *     │   ╰── <label widget>
 *     ╰── <child>
 * ```
 * 
 * `GtkExpander` has three CSS nodes, the main node with the name expander,
 * a subnode with name title and node below it with name arrow. The arrow of an
 * expander that is showing its child gets the :checked pseudoclass added to it.
 * 
 * # Accessibility
 * 
 * `GtkExpander` uses the %GTK_ACCESSIBLE_ROLE_BUTTON role.
 */
public class Expander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Expander(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Expander */
    public static Expander castFrom(org.gtk.gobject.Object gobject) {
        return new Expander(gobject.getReference());
    }
    
    /**
     * Creates a new expander using @label as the text of the label.
     */
    public Expander(java.lang.String label) {
        super(References.get(gtk_h.gtk_expander_new(Interop.allocateNativeString(label).handle()), false));
    }
    
    /**
     * Creates a new expander using @label as the text of the label.
     * 
     * If characters in @label are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use “__” (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * 
     * Pressing Alt and that key activates the button.
     */
    public static Expander newWithMnemonic(java.lang.String label) {
        return new Expander(References.get(gtk_h.gtk_expander_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false));
    }
    
    /**
     * Gets the child widget of @expander.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_expander_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Queries a `GtkExpander` and returns its current state.
     * 
     * Returns %TRUE if the child widget is revealed.
     */
    public boolean getExpanded() {
        var RESULT = gtk_h.gtk_expander_get_expanded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Fetches the text from a label widget.
     * 
     * This is including any embedded underlines indicating mnemonics and
     * Pango markup, as set by [method@Gtk.Expander.set_label]. If the label
     * text has not been set the return value will be %NULL. This will be the
     * case if you create an empty button with gtk_button_new() to use as a
     * container.
     */
    public java.lang.String getLabel() {
        var RESULT = gtk_h.gtk_expander_get_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the label widget for the frame.
     */
    public Widget getLabelWidget() {
        var RESULT = gtk_h.gtk_expander_get_label_widget(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     */
    public boolean getResizeToplevel() {
        var RESULT = gtk_h.gtk_expander_get_resize_toplevel(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the label’s text is interpreted as Pango markup.
     */
    public boolean getUseMarkup() {
        var RESULT = gtk_h.gtk_expander_get_use_markup(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether an underline in the text indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        var RESULT = gtk_h.gtk_expander_get_use_underline(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the child widget of @expander.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_expander_set_child(handle(), child.handle());
    }
    
    /**
     * Sets the state of the expander.
     * 
     * Set to %TRUE, if you want the child widget to be revealed,
     * and %FALSE if you want the child widget to be hidden.
     */
    public void setExpanded(boolean expanded) {
        gtk_h.gtk_expander_set_expanded(handle(), expanded ? 1 : 0);
    }
    
    /**
     * Sets the text of the label of the expander to @label.
     * 
     * This will also clear any previously set labels.
     */
    public void setLabel(java.lang.String label) {
        gtk_h.gtk_expander_set_label(handle(), Interop.allocateNativeString(label).handle());
    }
    
    /**
     * Set the label widget for the expander.
     * 
     * This is the widget that will appear embedded alongside
     * the expander arrow.
     */
    public void setLabelWidget(Widget labelWidget) {
        gtk_h.gtk_expander_set_label_widget(handle(), labelWidget.handle());
    }
    
    /**
     * Sets whether the expander will resize the toplevel widget
     * containing the expander upon resizing and collpasing.
     */
    public void setResizeToplevel(boolean resizeToplevel) {
        gtk_h.gtk_expander_set_resize_toplevel(handle(), resizeToplevel ? 1 : 0);
    }
    
    /**
     * Sets whether the text of the label contains Pango markup.
     */
    public void setUseMarkup(boolean useMarkup) {
        gtk_h.gtk_expander_set_use_markup(handle(), useMarkup ? 1 : 0);
    }
    
    /**
     * If true, an underline in the text indicates a mnemonic.
     */
    public void setUseUnderline(boolean useUnderline) {
        gtk_h.gtk_expander_set_use_underline(handle(), useUnderline ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Expander source);
    }
    
    /**
     * Activates the `GtkExpander`.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalExpanderActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
