package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to present actions.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="action-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="action-row.png" alt="action-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwActionRow} widget can have a title, a subtitle and an icon. The row
 * can receive additional widgets at its end, or prefix widgets at its start.
 * <p>
 * It is convenient to present a preference and its related actions.
 * <p>
 * {@code AdwActionRow} is unactivatable by default, giving it an activatable widget
 * will automatically make it activatable, but unsetting it won't change the
 * row's activatability.
 * <p>
 * <h2>AdwActionRow as GtkBuildable</h2>
 * <p>
 * The {@code AdwActionRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwActionRow} has a main CSS node with name {@code row}.
 * <p>
 * It contains the subnode {@code box.header} for its main horizontal box, and
 * {@code box.title} for the vertical box containing the title and subtitle labels.
 * <p>
 * It contains subnodes {@code label.title} and {@code label.subtitle} representing
 * respectively the title label and subtitle label.
 */
public class ActionRow extends PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ActionRow(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ActionRow */
    public static ActionRow castFrom(org.gtk.gobject.Object gobject) {
        return new ActionRow(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_action_row_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwActionRow}.
     */
    public ActionRow() {
        super(constructNew());
    }
    
    /**
     * Activates {@code self}.
     */
    public void activateRow() {
        gtk_h.adw_action_row_activate(handle());
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     */
    public void addPrefix(org.gtk.gtk.Widget widget) {
        gtk_h.adw_action_row_add_prefix(handle(), widget.handle());
    }
    
    /**
     * Adds a suffix widget to {@code self}.
     */
    public void addSuffix(org.gtk.gtk.Widget widget) {
        gtk_h.adw_action_row_add_suffix(handle(), widget.handle());
    }
    
    /**
     * Gets the widget activated when {@code self} is activated.
     */
    public org.gtk.gtk.Widget getActivatableWidget() {
        var RESULT = gtk_h.adw_action_row_get_activatable_widget(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the icon name for {@code self}.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_action_row_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the subtitle for {@code self}.
     */
    public java.lang.String getSubtitle() {
        var RESULT = gtk_h.adw_action_row_get_subtitle(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public int getSubtitleLines() {
        var RESULT = gtk_h.adw_action_row_get_subtitle_lines(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of lines at the end of which the title label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public int getTitleLines() {
        var RESULT = gtk_h.adw_action_row_get_title_lines(handle());
        return RESULT;
    }
    
    /**
     * Removes a child from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget widget) {
        gtk_h.adw_action_row_remove(handle(), widget.handle());
    }
    
    /**
     * Sets the widget to activate when {@code self} is activated.
     */
    public void setActivatableWidget(org.gtk.gtk.Widget widget) {
        gtk_h.adw_action_row_set_activatable_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the icon name for {@code self}.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_action_row_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets the subtitle for {@code self}.
     */
    public void setSubtitle(java.lang.String subtitle) {
        gtk_h.adw_action_row_set_subtitle(handle(), Interop.allocateNativeString(subtitle).handle());
    }
    
    /**
     * Sets the number of lines at the end of which the subtitle label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public void setSubtitleLines(int subtitleLines) {
        gtk_h.adw_action_row_set_subtitle_lines(handle(), subtitleLines);
    }
    
    /**
     * Sets the number of lines at the end of which the title label will be
     * ellipsized.
     * <p>
     * If the value is 0, the number of lines won't be limited.
     */
    public void setTitleLines(int titleLines) {
        gtk_h.adw_action_row_set_title_lines(handle(), titleLines);
    }
    
    @FunctionalInterface
    public interface ActivatedHandler {
        void signalReceived(ActionRow source);
    }
    
    /**
     * This signal is emitted after the row has been activated.
     */
    public SignalHandle onActivated(ActivatedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activated").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ActionRow.Callbacks.class, "signalActionRowActivated",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalActionRowActivated(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (ActionRow.ActivatedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new ActionRow(References.get(source)));
        }
        
    }
}
