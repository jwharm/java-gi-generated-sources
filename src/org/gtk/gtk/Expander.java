package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkExpander</code> allows the user to reveal its child by clicking
 * on an expander triangle.
 * <p>
 * !{@link [An example GtkExpander]}(expander.png)
 * <p>
 * This is similar to the triangles used in a <code>GtkTreeView</code>.
 * <p>
 * Normally you use an expander as you would use a frame; you create
 * the child widget and use {@link org.gtk.gtk.Expander#setChild} to add it
 * to the expander. When the expander is toggled, it will take care of
 * showing and hiding the child automatically.
 * <p>
 * <h1>pecial Usage</h1>
 * <p>
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a <code>GtkExpander</code>
 * but do not add a child to it. The expander widget has an
 *  to add it
 * to the expander. When the expander is toggled, it will take care of
 * showing and hiding the child automatically.
 * <p>
 * <h1>pecial Usage</h1>
 * <p>
 * There are situations in which you may prefer to show and hide the
 * expanded widget yourself, such as when you want to actually create
 * the widget at expansion time. In this case, create a <code>GtkExpander</code>
 * but do not add a child to it. The expander widget has an
 * [property@Gtk.Expander:expanded[ property which can be used to
 * monitor its expansion state. You should watch this property with
 * a signal connection as follows:
 * <p><pre>c
 * static void
 * expander_callback (GObject    *object,
 *                    GParamSpec *param_spec,
 *                    gpointer    user_data)
 * {
 *   GtkExpander *expander;
 * <p>
 *   expander = GTK_EXPANDER (object);
 * <p>
 *   if (gtk_expander_get_expanded (expander))
 *     {
 *       // Show or create widgets
 *     }
 *   else
 *     {
 *       // Hide or destroy widgets
 *     }
 * }
 * <p>
 * static void
 * create_expander (void)
 * {
 *   GtkWidget *expander = gtk_expander_new_with_mnemonic (&#34;_More Options&#34;);
 *   g_signal_connect (expander, &#34;notify::expanded&#34;,
 *                     G_CALLBACK (expander_callback), NULL);
 * <p>
 *   // ...
 * }
 * </pre>
 * <p>
 * <h1>tkExpander as GtkBuildable</h1>
 * <p>
 * The <code>GtkExpander</code> implementation of the <code>GtkBuildable</code> interface supports
 * placing a child in the label position by specifying &#8220;label&#8221; as the
 * &#8220;type&#8221; attribute of a &#60;child&#62; element. A normal content child can be
 * specified without specifying a &#60;child&#62; type attribute.
 * <p>
 * An example of a UI definition fragment with GtkExpander:
 * <p><pre>xml
 * &#60;object class=&#34;GtkExpander&#34;&#62;
 *   &#60;child type=&#34;label&#34;&#62;
 *     &#60;object class=&#34;GtkLabel&#34; id=&#34;expander-label&#34;/&#62;
 *   &#60;/child&#62;
 *   &#60;child&#62;
 *     &#60;object class=&#34;GtkEntry&#34; id=&#34;expander-content&#34;/&#62;
 *   &#60;/child&#62;
 * &#60;/object&#62;
 * </pre>
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * expander
 * &#9584;&#9472;&#9472; box
 *     &#9500;&#9472;&#9472; title
 *     &#9474;   &#9500;&#9472;&#9472; arrow
 *     &#9474;   &#9584;&#9472;&#9472; &#60;label widget&#62;
 *     &#9584;&#9472;&#9472; &#60;child&#62;
 * </pre>
 * <p><code>GtkExpander</code> has three CSS nodes, the main node with the name expander,
 * a subnode with name title and node below it with name arrow. The arrow of an
 * expander that is showing its child gets the :checked pseudoclass added to it.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkExpander</code> uses the {@link org.gtk.gtk.AccessibleRole#BUTTON} role.
 */
public class Expander extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Expander(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Expander */
    public static Expander castFrom(org.gtk.gobject.Object gobject) {
        return new Expander(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_expander_new(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new expander using @label as the text of the label.
     */
    public Expander(java.lang.String label) {
        super(constructNew(label));
    }
    
    private static Reference constructNewWithMnemonic(java.lang.String label) {
        Reference RESULT = References.get(gtk_h.gtk_expander_new_with_mnemonic(Interop.allocateNativeString(label).handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new expander using @label as the text of the label.
     * 
     * If characters in @label are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use &#8220;__&#8221; (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * 
     * Pressing Alt and that key activates the button.
     */
    public static Expander newWithMnemonic(java.lang.String label) {
        return new Expander(constructNewWithMnemonic(label));
    }
    
    /**
     * Gets the child widget of @expander.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_expander_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Queries a <code>GtkExpander</code> and returns its current state.
     * 
     * Returns <code>true</code> if the child widget is revealed.
     */
    public boolean getExpanded() {
        var RESULT = gtk_h.gtk_expander_get_expanded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Fetches the text from a label widget.
     * 
     * This is including any embedded underlines indicating mnemonics and
     * Pango markup, as set by {@link org.gtk.gtk.Expander#setLabel}. If the label
     * text has not been set the return value will be <code>NULL.</code> This will be the
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
     * Returns whether the label&#8217;s text is interpreted as Pango markup.
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
     * Set to <code>TRUE,</code> if you want the child widget to be revealed,
     * and <code>false</code> if you want the child widget to be hidden.
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
     * Activates the <code>GtkExpander</code>.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalExpanderActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
