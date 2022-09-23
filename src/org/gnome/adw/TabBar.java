package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A tab bar for {@link TabView}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="tab-bar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="tab-bar.png" alt="tab-bar"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwTabBar} widget is a tab bar that can be used with conjunction with
 * {@code AdwTabView}.
 * <p>
 * {@code AdwTabBar} can autohide and can optionally contain action widgets on both
 * sides of the tabs.
 * <p>
 * When there's not enough space to show all the tabs, {@code AdwTabBar} will scroll
 * them. Pinned tabs always stay visible and aren't a part of the scrollable
 * area.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwTabBar} has a single CSS node with name {@code tabbar}.
 */
public class TabBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public TabBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TabBar */
    public static TabBar castFrom(org.gtk.gobject.Object gobject) {
        return new TabBar(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_tab_bar_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwTabBar}.
     */
    public TabBar() {
        super(constructNew());
    }
    
    /**
     * Gets whether the tabs automatically hide.
     */
    public boolean getAutohide() {
        var RESULT = gtk_h.adw_tab_bar_get_autohide(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the widget shown after the tabs.
     */
    public org.gtk.gtk.Widget getEndActionWidget() {
        var RESULT = gtk_h.adw_tab_bar_get_end_action_widget(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether tabs expand to full width.
     */
    public boolean getExpandTabs() {
        var RESULT = gtk_h.adw_tab_bar_get_expand_tabs(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether tabs use inverted layout.
     */
    public boolean getInverted() {
        var RESULT = gtk_h.adw_tab_bar_get_inverted(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether {@code self} is overflowing.
     */
    public boolean getIsOverflowing() {
        var RESULT = gtk_h.adw_tab_bar_get_is_overflowing(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the widget shown before the tabs.
     */
    public org.gtk.gtk.Widget getStartActionWidget() {
        var RESULT = gtk_h.adw_tab_bar_get_start_action_widget(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the tabs are currently revealed.
     */
    public boolean getTabsRevealed() {
        var RESULT = gtk_h.adw_tab_bar_get_tabs_revealed(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the tab view {@code self} controls.
     */
    public TabView getView() {
        var RESULT = gtk_h.adw_tab_bar_get_view(handle());
        return new TabView(References.get(RESULT, false));
    }
    
    /**
     * Sets whether the tabs automatically hide.
     */
    public void setAutohide(boolean autohide) {
        gtk_h.adw_tab_bar_set_autohide(handle(), autohide ? 1 : 0);
    }
    
    /**
     * Sets the widget to show after the tabs.
     */
    public void setEndActionWidget(org.gtk.gtk.Widget widget) {
        gtk_h.adw_tab_bar_set_end_action_widget(handle(), widget.handle());
    }
    
    /**
     * Sets whether tabs expand to full width.
     */
    public void setExpandTabs(boolean expandTabs) {
        gtk_h.adw_tab_bar_set_expand_tabs(handle(), expandTabs ? 1 : 0);
    }
    
    /**
     * Sets whether tabs tabs use inverted layout.
     */
    public void setInverted(boolean inverted) {
        gtk_h.adw_tab_bar_set_inverted(handle(), inverted ? 1 : 0);
    }
    
    /**
     * Sets the widget to show before the tabs.
     */
    public void setStartActionWidget(org.gtk.gtk.Widget widget) {
        gtk_h.adw_tab_bar_set_start_action_widget(handle(), widget.handle());
    }
    
    /**
     * Sets the tab view {@code self} controls.
     */
    public void setView(TabView view) {
        gtk_h.adw_tab_bar_set_view(handle(), view.handle());
    }
    
    /**
     * Sets the supported types for this drop target.
     * <p>
     * Sets up an extra drop target on tabs.
     * <p>
     * This allows to drag arbitrary content onto tabs, for example URLs in a web
     * browser.
     * <p>
     * If a tab is hovered for a certain period of time while dragging the content,
     * it will be automatically selected.
     * <p>
     * The {@code TabBar::extra-drag-drop} signal can be used to handle the drop.
     */
    public void setupExtraDropTarget(int actions, org.gtk.gobject.Type[] types, long nTypes) {
        gtk_h.adw_tab_bar_setup_extra_drop_target(handle(), actions, Interop.allocateNativeArray(types).handle(), nTypes);
    }
    
    @FunctionalInterface
    public interface ExtraDragDropHandler {
        boolean signalReceived(TabBar source, TabPage page, org.gtk.gobject.Value value);
    }
    
    /**
     * This signal is emitted when content is dropped onto a tab.
     * <p>
     * The content must be of one of the types set up via
     * {@link tabbar.setup_extra_drop_target#null}.
     * <p>
     * See {@code Gtk.DropTarget::drop}.
     */
    public SignalHandle onExtraDragDrop(ExtraDragDropHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTabBarExtraDragDrop", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            MemorySegment nativeSymbol = Linker.nativeLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("extra-drag-drop").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
