package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkNotebook} is a container whose children are pages switched
 * between using tabs.
 * <p>
 * <img src="./doc-files/notebook.png" alt="An example GtkNotebook">
 * <p>
 * There are many configuration options for {@code GtkNotebook}. Among
 * other things, you can choose on which edge the tabs appear
 * (see {@link Notebook#setTabPos}), whether, if there are
 * too many tabs to fit the notebook should be made bigger or scrolling
 * arrows added (see {@link Notebook#setScrollable}), and whether
 * there will be a popup menu allowing the users to switch pages.
 * (see {@link Notebook#popupEnable}).
 * <p>
 * <h1>GtkNotebook as GtkBuildable</h1>
 * <p>
 * The {@code GtkNotebook} implementation of the {@code GtkBuildable} interface
 * supports placing children into tabs by specifying “tab” as the
 * “type” attribute of a &lt;child&gt; element. Note that the content
 * of the tab must be created before the tab can be filled.
 * A tab child can be specified without specifying a &lt;child&gt;
 * type attribute.
 * <p>
 * To add a child widget in the notebooks action area, specify
 * "action-start" or “action-end” as the “type” attribute of the
 * &lt;child&gt; element.
 * <p>
 * An example of a UI definition fragment with {@code GtkNotebook}:
 * <p>
 * <pre>{@code xml
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
 * }</pre>
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
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
 * }</pre>
 * <p>
 * {@code GtkNotebook} has a main CSS node with name {@code notebook}, a subnode
 * with name {@code header} and below that a subnode with name {@code tabs} which
 * contains one subnode per tab with name {@code tab}.
 * <p>
 * If action widgets are present, their CSS nodes are placed next
 * to the {@code tabs} node. If the notebook is scrollable, CSS nodes with
 * name {@code arrow} are placed as first and last child of the {@code tabs} node.
 * <p>
 * The main node gets the {@code .frame} style class when the notebook
 * has a border (see {@link Notebook#setShowBorder}).
 * <p>
 * The header node gets one of the style class {@code .top}, {@code .bottom},
 * {@code .left} or {@code .right}, depending on where the tabs are placed. For
 * reorderable pages, the tab node gets the {@code .reorderable-page} class.
 * <p>
 * A {@code tab} node gets the {@code .dnd} style class while it is moved with drag-and-drop.
 * <p>
 * The nodes are always arranged from left-to-right, regardless of text direction.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkNotebook} uses the following roles:
 * <p>
 * <ul>
 * <li>{@link AccessibleRole#GROUP} for the notebook widget
 * <li>{@link AccessibleRole#TAB_LIST} for the list of tabs
 * <li>{@link AccessibleRole#TAB} role for each tab
 * <li>{@link AccessibleRole#TAB_PANEL} for each page
 */
public class Notebook extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Notebook(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Notebook */
    public static Notebook castFrom(org.gtk.gobject.Object gobject) {
        return new Notebook(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_notebook_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkNotebook} widget with no pages.
     */
    public Notebook() {
        super(constructNew());
    }
    
    /**
     * Appends a page to {@code notebook}.
     */
    public int appendPage(Widget child, Widget tabLabel) {
        var RESULT = gtk_h.gtk_notebook_append_page(handle(), child.handle(), tabLabel.handle());
        return RESULT;
    }
    
    /**
     * Appends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     */
    public int appendPageMenu(Widget child, Widget tabLabel, Widget menuLabel) {
        var RESULT = gtk_h.gtk_notebook_append_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        return RESULT;
    }
    
    /**
     * Removes the child from the notebook.
     * <p>
     * This function is very similar to {@link Notebook#removePage},
     * but additionally informs the notebook that the removal
     * is happening as part of a tab DND operation, which should
     * not be cancelled.
     */
    public void detachTab(Widget child) {
        gtk_h.gtk_notebook_detach_tab(handle(), child.handle());
    }
    
    /**
     * Gets one of the action widgets.
     * <p>
     * See {@link Notebook#setActionWidget}.
     */
    public Widget getActionWidget(PackType packType) {
        var RESULT = gtk_h.gtk_notebook_get_action_widget(handle(), packType.getValue());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        var RESULT = gtk_h.gtk_notebook_get_current_page(handle());
        return RESULT;
    }
    
    /**
     * Gets the current group name for {@code notebook}.
     */
    public java.lang.String getGroupName() {
        var RESULT = gtk_h.gtk_notebook_get_group_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the menu label widget of the page containing {@code child}.
     */
    public Widget getMenuLabel(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_menu_label(handle(), child.handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the text of the menu label for the page containing
     * {@code child}.
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
     * Returns the child widget contained in page number {@code page_num}.
     */
    public Widget getNthPage(int pageNum) {
        var RESULT = gtk_h.gtk_notebook_get_nth_page(handle(), pageNum);
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GtkNotebookPage} for {@code child}.
     */
    public NotebookPage getPage(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_page(handle(), child.handle());
        return new NotebookPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns a {@code GListModel} that contains the pages of the notebook.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     */
    public org.gtk.gio.ListModel getPages() {
        var RESULT = gtk_h.gtk_notebook_get_pages(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns whether the tab label area has arrows for scrolling.
     */
    public boolean getScrollable() {
        var RESULT = gtk_h.gtk_notebook_get_scrollable(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether a bevel will be drawn around the notebook pages.
     */
    public boolean getShowBorder() {
        var RESULT = gtk_h.gtk_notebook_get_show_border(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the tabs of the notebook are shown.
     */
    public boolean getShowTabs() {
        var RESULT = gtk_h.gtk_notebook_get_show_tabs(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the tab contents can be detached from {@code notebook}.
     */
    public boolean getTabDetachable(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_detachable(handle(), child.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the tab label widget for the page {@code child}.
     * <p>
     * {@code null} is returned if {@code child} is not in {@code notebook} or
     * if no tab label has specifically been set for {@code child}.
     */
    public Widget getTabLabel(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_label(handle(), child.handle());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the text of the tab label for the page containing
     * {@code child}.
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
        return new PositionType(RESULT);
    }
    
    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     */
    public boolean getTabReorderable(Widget child) {
        var RESULT = gtk_h.gtk_notebook_get_tab_reorderable(handle(), child.handle());
        return RESULT != 0;
    }
    
    /**
     * Insert a page into {@code notebook} at the given position.
     */
    public int insertPage(Widget child, Widget tabLabel, int position) {
        var RESULT = gtk_h.gtk_notebook_insert_page(handle(), child.handle(), tabLabel.handle(), position);
        return RESULT;
    }
    
    /**
     * Insert a page into {@code notebook} at the given position, specifying
     * the widget to use as the label in the popup menu.
     */
    public int insertPageMenu(Widget child, Widget tabLabel, Widget menuLabel, int position) {
        var RESULT = gtk_h.gtk_notebook_insert_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle(), position);
        return RESULT;
    }
    
    /**
     * Switches to the next page.
     * <p>
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
     * <p>
     * If the user clicks with the right mouse button on the tab labels,
     * a menu with all the pages will be popped up.
     */
    public void popupEnable() {
        gtk_h.gtk_notebook_popup_enable(handle());
    }
    
    /**
     * Prepends a page to {@code notebook}.
     */
    public int prependPage(Widget child, Widget tabLabel) {
        var RESULT = gtk_h.gtk_notebook_prepend_page(handle(), child.handle(), tabLabel.handle());
        return RESULT;
    }
    
    /**
     * Prepends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     */
    public int prependPageMenu(Widget child, Widget tabLabel, Widget menuLabel) {
        var RESULT = gtk_h.gtk_notebook_prepend_page_menu(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        return RESULT;
    }
    
    /**
     * Switches to the previous page.
     * <p>
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
     * Reorders the page containing {@code child}, so that it appears in position
     * {@code position}.
     * <p>
     * If {@code position} is greater than or equal to the number of children in
     * the list or negative, {@code child} will be moved to the end of the list.
     */
    public void reorderChild(Widget child, int position) {
        gtk_h.gtk_notebook_reorder_child(handle(), child.handle(), position);
    }
    
    /**
     * Sets {@code widget} as one of the action widgets.
     * <p>
     * Depending on the pack type the widget will be placed before
     * or after the tabs. You can use a {@code GtkBox} if you need to pack
     * more than one widget on the same side.
     */
    public void setActionWidget(Widget widget, PackType packType) {
        gtk_h.gtk_notebook_set_action_widget(handle(), widget.handle(), packType.getValue());
    }
    
    /**
     * Switches to the page number {@code page_num}.
     * <p>
     * Note that due to historical reasons, GtkNotebook refuses
     * to switch to a page unless the child widget is visible.
     * Therefore, it is recommended to show child widgets before
     * adding them to a notebook.
     */
    public void setCurrentPage(int pageNum) {
        gtk_h.gtk_notebook_set_current_page(handle(), pageNum);
    }
    
    /**
     * Sets a group name for {@code notebook}.
     * <p>
     * Notebooks with the same name will be able to exchange tabs
     * via drag and drop. A notebook with a {@code null} group name will
     * not be able to exchange tabs with any other notebook.
     */
    public void setGroupName(java.lang.String groupName) {
        gtk_h.gtk_notebook_set_group_name(handle(), Interop.allocateNativeString(groupName).handle());
    }
    
    /**
     * Changes the menu label for the page containing {@code child}.
     */
    public void setMenuLabel(Widget child, Widget menuLabel) {
        gtk_h.gtk_notebook_set_menu_label(handle(), child.handle(), menuLabel.handle());
    }
    
    /**
     * Creates a new label and sets it as the menu label of {@code child}.
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
     * <p>
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
     * Sets whether the tab can be detached from {@code notebook} to another
     * notebook or widget.
     * <p>
     * Note that two notebooks must share a common group identificator
     * (see {@link Notebook#setGroupName}) to allow automatic tabs
     * interchange between them.
     * <p>
     * If you want a widget to interact with a notebook through DnD
     * (i.e.: accept dragged tabs from it) it must be set as a drop
     * destination and accept the target “GTK_NOTEBOOK_TAB”. The notebook
     * will fill the selection with a GtkWidget** pointing to the child
     * widget that corresponds to the dropped tab.
     * <p>
     * Note that you should use {@link Notebook#detachTab} instead
     * of {@link Notebook#removePage} if you want to remove the tab
     * from the source notebook as part of accepting a drop. Otherwise,
     * the source notebook will think that the dragged tab was removed
     * from underneath the ongoing drag operation, and will initiate a
     * drag cancel animation.
     * <p>
     * <pre>{@code c
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
     * }</pre>
     * <p>
     * If you want a notebook to accept drags from other widgets,
     * you will have to set your own DnD code to do it.
     */
    public void setTabDetachable(Widget child, boolean detachable) {
        gtk_h.gtk_notebook_set_tab_detachable(handle(), child.handle(), detachable ? 1 : 0);
    }
    
    /**
     * Changes the tab label for {@code child}.
     * <p>
     * If {@code null} is specified for {@code tab_label}, then the page will
     * have the label “page N”.
     */
    public void setTabLabel(Widget child, Widget tabLabel) {
        gtk_h.gtk_notebook_set_tab_label(handle(), child.handle(), tabLabel.handle());
    }
    
    /**
     * Creates a new label and sets it as the tab label for the page
     * containing {@code child}.
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
    
    public SignalHandle onChangeCurrentPage(ChangeCurrentPageHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("change-current-page").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
     * <p>
     * A handler for this signal can create a window containing
     * a notebook where the tab will be attached. It is also
     * responsible for moving/resizing the window and adding the
     * necessary properties to the notebook (e.g. the
     * {@code GtkNotebook}:group-name ).
     */
    public SignalHandle onCreateWindow(CreateWindowHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("create-window").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookCreateWindow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface FocusTabHandler {
        boolean signalReceived(Notebook source, NotebookTab object);
    }
    
    public SignalHandle onFocusTab(FocusTabHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("focus-tab").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookFocusTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOutHandler {
        void signalReceived(Notebook source, DirectionType object);
    }
    
    public SignalHandle onMoveFocusOut(MoveFocusOutHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-focus-out").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookMoveFocusOut",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onPageAdded(PageAddedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("page-added").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onPageRemoved(PageRemovedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("page-removed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onPageReordered(PageReorderedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("page-reordered").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ReorderTabHandler {
        boolean signalReceived(Notebook source, DirectionType object, boolean p0);
    }
    
    public SignalHandle onReorderTab(ReorderTabHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("reorder-tab").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookReorderTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectPageHandler {
        boolean signalReceived(Notebook source, boolean object);
    }
    
    public SignalHandle onSelectPage(SelectPageHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("select-page").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSelectPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
    public SignalHandle onSwitchPage(SwitchPageHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("switch-page").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSwitchPage",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static boolean signalNotebookChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.ChangeCurrentPageHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Notebook(Refcounted.get(source)), object);
        }
        
        public static void signalNotebookCreateWindow(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.CreateWindowHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new Widget(Refcounted.get(page, false)));
        }
        
        public static boolean signalNotebookFocusTab(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.FocusTabHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Notebook(Refcounted.get(source)), new NotebookTab(object));
        }
        
        public static void signalNotebookMoveFocusOut(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.MoveFocusOutHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new DirectionType(object));
        }
        
        public static void signalNotebookPageAdded(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.PageAddedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new Widget(Refcounted.get(child, false)), pageNum);
        }
        
        public static void signalNotebookPageRemoved(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.PageRemovedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new Widget(Refcounted.get(child, false)), pageNum);
        }
        
        public static void signalNotebookPageReordered(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.PageReorderedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new Widget(Refcounted.get(child, false)), pageNum);
        }
        
        public static boolean signalNotebookReorderTab(MemoryAddress source, int object, int p0, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.ReorderTabHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Notebook(Refcounted.get(source)), new DirectionType(object), p0 != 0);
        }
        
        public static boolean signalNotebookSelectPage(MemoryAddress source, int object, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.SelectPageHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Notebook(Refcounted.get(source)), object != 0);
        }
        
        public static void signalNotebookSwitchPage(MemoryAddress source, MemoryAddress page, int pageNum, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Notebook.SwitchPageHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Notebook(Refcounted.get(source)), new Widget(Refcounted.get(page, false)), pageNum);
        }
        
    }
}
