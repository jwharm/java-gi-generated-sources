package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkNotebook` is a container whose children are pages switched
 * between using tabs.
 * 
 * ![An example GtkNotebook](notebook.png)
 * 
 * There are many configuration options for `GtkNotebook`. Among
 * other things, you can choose on which edge the tabs appear
 * (see [method@Gtk.Notebook.set_tab_pos]), whether, if there are
 * too many tabs to fit the notebook should be made bigger or scrolling
 * arrows added (see [method@Gtk.Notebook.set_scrollable]), and whether
 * there will be a popup menu allowing the users to switch pages.
 * (see [method@Gtk.Notebook.popup_enable]).
 * 
 * # GtkNotebook as GtkBuildable
 * 
 * The `GtkNotebook` implementation of the `GtkBuildable` interface
 * supports placing children into tabs by specifying “tab” as the
 * “type” attribute of a <child> element. Note that the content
 * of the tab must be created before the tab can be filled.
 * A tab child can be specified without specifying a <child>
 * type attribute.
 * 
 * To add a child widget in the notebooks action area, specify
 * "action-start" or “action-end” as the “type” attribute of the
 * <child> element.
 * 
 * An example of a UI definition fragment with `GtkNotebook`:
 * 
 * ```xml
 * <object class="GtkNotebook">
 *   <child>
 *     <object class="GtkLabel" id="notebook-content">
 *       <property name="label">Content</property>
 *     </object>
 *   </child>
 *   <child type="tab">
 *     <object class="GtkLabel" id="notebook-tab">
 *       <property name="label">Tab</property>
 *     </object>
 *   </child>
 * </object>
 * ```
 * 
 * # CSS nodes
 * 
 * ```
 * notebook
 * ├── header.top
 * │   ├── [<action widget>]
 * │   ├── tabs
 * │   │   ├── [arrow]
 * │   │   ├── tab
 * │   │   │   ╰── <tab label>
 * ┊   ┊   ┊
 * │   │   ├── tab[.reorderable-page]
 * │   │   │   ╰── <tab label>
 * │   │   ╰── [arrow]
 * │   ╰── [<action widget>]
 * │
 * ╰── stack
 *     ├── <child>
 *     ┊
 *     ╰── <child>
 * ```
 * 
 * `GtkNotebook` has a main CSS node with name `notebook`, a subnode
 * with name `header` and below that a subnode with name `tabs` which
 * contains one subnode per tab with name `tab`.
 * 
 * If action widgets are present, their CSS nodes are placed next
 * to the `tabs` node. If the notebook is scrollable, CSS nodes with
 * name `arrow` are placed as first and last child of the `tabs` node.
 * 
 * The main node gets the `.frame` style class when the notebook
 * has a border (see [method@Gtk.Notebook.set_show_border]).
 * 
 * The header node gets one of the style class `.top`, `.bottom`,
 * `.left` or `.right`, depending on where the tabs are placed. For
 * reorderable pages, the tab node gets the `.reorderable-page` class.
 * 
 * A `tab` node gets the `.dnd` style class while it is moved with drag-and-drop.
 * 
 * The nodes are always arranged from left-to-right, regardless of text direction.
 * 
 * # Accessibility
 * 
 * `GtkNotebook` uses the following roles:
 * 
 *  - %GTK_ACCESSIBLE_ROLE_GROUP for the notebook widget
 *  - %GTK_ACCESSIBLE_ROLE_TAB_LIST for the list of tabs
 *  - %GTK_ACCESSIBLE_ROLE_TAB role for each tab
 *  - %GTK_ACCESSIBLE_ROLE_TAB_PANEL for each page
 */
public class Notebook extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Notebook(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Notebook */
    public static Notebook castFrom(org.gtk.gobject.Object gobject) {
        return new Notebook(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkNotebook` widget with no pages.
     */
    public Notebook() {
        super(References.get(gtk_h.gtk_notebook_new(), false));
    }
    
    /**
     * Appends a page to @notebook.
     */
    public int appendPage(Widget child, Widget tabLabel) {
        var RESULT = gtk_h.gtk_notebook_append_page(handle(), child.handle(), tabLabel.handle());
        return RESULT;
    }
    
    /**
     * Appends a page to @notebook, specifying the widget to use as the
     * label in the popup menu.
     */
    public int appendPageMenu(Widget child, Widget tabLabel, Widget menuLabel) {
        var RESULT = gtk_h.gtk_notebook_append_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        return RESULT;
    }
    
    /**
     * Removes the child from the notebook.
     * 
     * This function is very similar to [method@Gtk.Notebook.remove_page],
     * but additionally informs the notebook that the removal
     * is happening as part of a tab DND operation, which should
     * not be cancelled.
     */
    public void detachTab(Widget child) {
        gtk_h.gtk_notebook_detach_tab(handle(), child.handle());
    }
    
    /**
     * Gets one of the action widgets.
     * 
     * See [method@Gtk.Notebook.set_action_widget].
     */
    public Widget getActionWidget(PackType packType) {
        var RESULT = gtk_h.gtk_notebook_get_action_widget(handle(), packType.getValue());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        var RESULT = gtk_h.gtk_notebook_get_current_page(handle());
        return RESULT;
    }
    
    /**
     * Gets the current group name for @notebook.
     */
    public java.lang.String getGroupName() {
        var RESULT = gtk_h.gtk_notebook_get_group_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the menu label widget of the page containing @child.
     */
    public Widget getMenuLabel(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_menu_label(handle(), child.handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the text of the menu label for the page containing
     * @child.
     */
    public java.lang.String getMenuLabelText(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_menu_label_text(handle(), child.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the number of pages in a notebook.
     */
    public int getNPages() {
        var RESULT = gtk_h.gtk_notebook_get_n_pages(handle());
        return RESULT;
    }
    
    /**
     * Returns the child widget contained in page number @page_num.
     */
    public Widget getNthPage(int pageNum) {
        var RESULT = gtk_h.gtk_notebook_get_nth_page(handle(), pageNum);
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Returns the `GtkNotebookPage` for @child.
     */
    public NotebookPage getPage(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_page(handle(), child.handle());
        return new NotebookPage(References.get(RESULT, false));
    }
    
    /**
     * Returns a `GListModel` that contains the pages of the notebook.
     * 
     * This can be used to keep an up-to-date view. The model also
     * implements [iface@Gtk.SelectionModel] and can be used to track
     * and modify the visible page.
     */
    public org.gtk.gio.ListModel getPages() {
        var RESULT = gtk_h.gtk_notebook_get_pages(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Returns whether the tab label area has arrows for scrolling.
     */
    public boolean getScrollable() {
        var RESULT = gtk_h.gtk_notebook_get_scrollable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether a bevel will be drawn around the notebook pages.
     */
    public boolean getShowBorder() {
        var RESULT = gtk_h.gtk_notebook_get_show_border(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the tabs of the notebook are shown.
     */
    public boolean getShowTabs() {
        var RESULT = gtk_h.gtk_notebook_get_show_tabs(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the tab contents can be detached from @notebook.
     */
    public boolean getTabDetachable(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_detachable(handle(), child.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the tab label widget for the page @child.
     * 
     * %NULL is returned if @child is not in @notebook or
     * if no tab label has specifically been set for @child.
     */
    public Widget getTabLabel(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_label(handle(), child.handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the text of the tab label for the page containing
     * @child.
     */
    public java.lang.String getTabLabelText(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_label_text(handle(), child.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the edge at which the tabs are drawn.
     */
    public PositionType getTabPos() {
        var RESULT = gtk_h.gtk_notebook_get_tab_pos(handle());
        return PositionType.fromValue(RESULT);
    }
    
    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     */
    public boolean getTabReorderable(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_reorderable(handle(), child.handle());
        return (RESULT != 0);
    }
    
    /**
     * Insert a page into @notebook at the given position.
     */
    public int insertPage(Widget child, Widget tabLabel, int position) {
        var RESULT = gtk_h.gtk_notebook_insert_page(handle(), child.handle(), tabLabel.handle(), position);
        return RESULT;
    }
    
    /**
     * Insert a page into @notebook at the given position, specifying
     * the widget to use as the label in the popup menu.
     */
    public int insertPageMenu(Widget child, Widget tabLabel, Widget menuLabel, int position) {
        var RESULT = gtk_h.gtk_notebook_insert_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle(), position);
        return RESULT;
    }
    
    /**
     * Switches to the next page.
     * 
     * Nothing happens if the current page is the last page.
     */
    public void nextPage() {
        gtk_h.gtk_notebook_next_page(handle());
    }
    
    /**
     * Finds the index of the page which contains the given child
     * widget.
     */
    public int pageNum(Widget child) {
        var RESULT = gtk_h.gtk_notebook_page_num(handle(), child.handle());
        return RESULT;
    }
    
    /**
     * Disables the popup menu.
     */
    public void popupDisable() {
        gtk_h.gtk_notebook_popup_disable(handle());
    }
    
    /**
     * Enables the popup menu.
     * 
     * If the user clicks with the right mouse button on the tab labels,
     * a menu with all the pages will be popped up.
     */
    public void popupEnable() {
        gtk_h.gtk_notebook_popup_enable(handle());
    }
    
    /**
     * Prepends a page to @notebook.
     */
    public int prependPage(Widget child, Widget tabLabel) {
        var RESULT = gtk_h.gtk_notebook_prepend_page(handle(), child.handle(), tabLabel.handle());
        return RESULT;
    }
    
    /**
     * Prepends a page to @notebook, specifying the widget to use as the
     * label in the popup menu.
     */
    public int prependPageMenu(Widget child, Widget tabLabel, Widget menuLabel) {
        var RESULT = gtk_h.gtk_notebook_prepend_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        return RESULT;
    }
    
    /**
     * Switches to the previous page.
     * 
     * Nothing happens if the current page is the first page.
     */
    public void prevPage() {
        gtk_h.gtk_notebook_prev_page(handle());
    }
    
    /**
     * Removes a page from the notebook given its index
     * in the notebook.
     */
    public void removePage(int pageNum) {
        gtk_h.gtk_notebook_remove_page(handle(), pageNum);
    }
    
    /**
     * Reorders the page containing @child, so that it appears in position
     * @position.
     * 
     * If @position is greater than or equal to the number of children in
     * the list or negative, @child will be moved to the end of the list.
     */
    public void reorderChild(Widget child, int position) {
        gtk_h.gtk_notebook_reorder_child(handle(), child.handle(), position);
    }
    
    /**
     * Sets @widget as one of the action widgets.
     * 
     * Depending on the pack type the widget will be placed before
     * or after the tabs. You can use a `GtkBox` if you need to pack
     * more than one widget on the same side.
     */
    public void setActionWidget(Widget widget, PackType packType) {
        gtk_h.gtk_notebook_set_action_widget(handle(), widget.handle(), packType.getValue());
    }
    
    /**
     * Switches to the page number @page_num.
     * 
     * Note that due to historical reasons, GtkNotebook refuses
     * to switch to a page unless the child widget is visible.
     * Therefore, it is recommended to show child widgets before
     * adding them to a notebook.
     */
    public void setCurrentPage(int pageNum) {
        gtk_h.gtk_notebook_set_current_page(handle(), pageNum);
    }
    
    /**
     * Sets a group name for @notebook.
     * 
     * Notebooks with the same name will be able to exchange tabs
     * via drag and drop. A notebook with a %NULL group name will
     * not be able to exchange tabs with any other notebook.
     */
    public void setGroupName(java.lang.String groupName) {
        gtk_h.gtk_notebook_set_group_name(handle(), Interop.allocateNativeString(groupName).handle());
    }
    
    /**
     * Changes the menu label for the page containing @child.
     */
    public void setMenuLabel(Widget child, Widget menuLabel) {
        gtk_h.gtk_notebook_set_menu_label(handle(), child.handle(), menuLabel.handle());
    }
    
    /**
     * Creates a new label and sets it as the menu label of @child.
     */
    public void setMenuLabelText(Widget child, java.lang.String menuText) {
        gtk_h.gtk_notebook_set_menu_label_text(handle(), child.handle(), Interop.allocateNativeString(menuText).handle());
    }
    
    /**
     * Sets whether the tab label area will have arrows for
     * scrolling if there are too many tabs to fit in the area.
     */
    public void setScrollable(boolean scrollable) {
        gtk_h.gtk_notebook_set_scrollable(handle(), scrollable ? 1 : 0);
    }
    
    /**
     * Sets whether a bevel will be drawn around the notebook pages.
     * 
     * This only has a visual effect when the tabs are not shown.
     */
    public void setShowBorder(boolean showBorder) {
        gtk_h.gtk_notebook_set_show_border(handle(), showBorder ? 1 : 0);
    }
    
    /**
     * Sets whether to show the tabs for the notebook or not.
     */
    public void setShowTabs(boolean showTabs) {
        gtk_h.gtk_notebook_set_show_tabs(handle(), showTabs ? 1 : 0);
    }
    
    /**
     * Sets whether the tab can be detached from @notebook to another
     * notebook or widget.
     * 
     * Note that two notebooks must share a common group identificator
     * (see [method@Gtk.Notebook.set_group_name]) to allow automatic tabs
     * interchange between them.
     * 
     * If you want a widget to interact with a notebook through DnD
     * (i.e.: accept dragged tabs from it) it must be set as a drop
     * destination and accept the target “GTK_NOTEBOOK_TAB”. The notebook
     * will fill the selection with a GtkWidget** pointing to the child
     * widget that corresponds to the dropped tab.
     * 
     * Note that you should use [method@Gtk.Notebook.detach_tab] instead
     * of [method@Gtk.Notebook.remove_page] if you want to remove the tab
     * from the source notebook as part of accepting a drop. Otherwise,
     * the source notebook will think that the dragged tab was removed
     * from underneath the ongoing drag operation, and will initiate a
     * drag cancel animation.
     * 
     * ```c
     * static void
     * on_drag_data_received (GtkWidget        *widget,
     *                        GdkDrop          *drop,
     *                        GtkSelectionData *data,
     *                        guint             time,
     *                        gpointer          user_data)
     * {
     *   GtkDrag *drag;
     *   GtkWidget *notebook;
     *   GtkWidget **child;
     * 
     *   drag = gtk_drop_get_drag (drop);
     *   notebook = g_object_get_data (drag, "gtk-notebook-drag-origin");
     *   child = (void*) gtk_selection_data_get_data (data);
     * 
     *   // process_widget (*child);
     * 
     *   gtk_notebook_detach_tab (GTK_NOTEBOOK (notebook), *child);
     * }
     * ```
     * 
     * If you want a notebook to accept drags from other widgets,
     * you will have to set your own DnD code to do it.
     */
    public void setTabDetachable(Widget child, boolean detachable) {
        gtk_h.gtk_notebook_set_tab_detachable(handle(), child.handle(), detachable ? 1 : 0);
    }
    
    /**
     * Changes the tab label for @child.
     * 
     * If %NULL is specified for @tab_label, then the page will
     * have the label “page N”.
     */
    public void setTabLabel(Widget child, Widget tabLabel) {
        gtk_h.gtk_notebook_set_tab_label(handle(), child.handle(), tabLabel.handle());
    }
    
    /**
     * Creates a new label and sets it as the tab label for the page
     * containing @child.
     */
    public void setTabLabelText(Widget child, java.lang.String tabText) {
        gtk_h.gtk_notebook_set_tab_label_text(handle(), child.handle(), Interop.allocateNativeString(tabText).handle());
    }
    
    /**
     * Sets the edge at which the tabs are drawn.
     */
    public void setTabPos(PositionType pos) {
        gtk_h.gtk_notebook_set_tab_pos(handle(), pos.getValue());
    }
    
    /**
     * Sets whether the notebook tab can be reordered
     * via drag and drop or not.
     */
    public void setTabReorderable(Widget child, boolean reorderable) {
        gtk_h.gtk_notebook_set_tab_reorderable(handle(), child.handle(), reorderable ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPageHandler {
        boolean signalReceived(Notebook source, int object);
    }
    
    public void onChangeCurrentPage(ChangeCurrentPageHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookChangeCurrentPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("change-current-page").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CreateWindowHandler {
        void signalReceived(Notebook source, Widget page);
    }
    
    /**
     * The ::create-window signal is emitted when a detachable
     * tab is dropped on the root window.
     * 
     * A handler for this signal can create a window containing
     * a notebook where the tab will be attached. It is also
     * responsible for moving/resizing the window and adding the
     * necessary properties to the notebook (e.g. the
     * `GtkNotebook`:group-name ).
     */
    public void onCreateWindow(CreateWindowHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookCreateWindow", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("create-window").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FocusTabHandler {
        boolean signalReceived(Notebook source, NotebookTab object);
    }
    
    public void onFocusTab(FocusTabHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookFocusTab", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("focus-tab").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOutHandler {
        void signalReceived(Notebook source, DirectionType object);
    }
    
    public void onMoveFocusOut(MoveFocusOutHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookMoveFocusOut", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-focus-out").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PageAddedHandler {
        void signalReceived(Notebook source, Widget child, int pageNum);
    }
    
    /**
     * the ::page-added signal is emitted in the notebook
     * right after a page is added to the notebook.
     */
    public void onPageAdded(PageAddedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookPageAdded", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("page-added").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PageRemovedHandler {
        void signalReceived(Notebook source, Widget child, int pageNum);
    }
    
    /**
     * the ::page-removed signal is emitted in the notebook
     * right after a page is removed from the notebook.
     */
    public void onPageRemoved(PageRemovedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookPageRemoved", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("page-removed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PageReorderedHandler {
        void signalReceived(Notebook source, Widget child, int pageNum);
    }
    
    /**
     * the ::page-reordered signal is emitted in the notebook
     * right after a page has been reordered.
     */
    public void onPageReordered(PageReorderedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookPageReordered", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("page-reordered").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ReorderTabHandler {
        boolean signalReceived(Notebook source, DirectionType object, boolean p0);
    }
    
    public void onReorderTab(ReorderTabHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookReorderTab", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("reorder-tab").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectPageHandler {
        boolean signalReceived(Notebook source, boolean object);
    }
    
    public void onSelectPage(SelectPageHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookSelectPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-page").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SwitchPageHandler {
        void signalReceived(Notebook source, Widget page, int pageNum);
    }
    
    /**
     * Emitted when the user or a function changes the current page.
     */
    public void onSwitchPage(SwitchPageHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalNotebookSwitchPage", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("switch-page").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
