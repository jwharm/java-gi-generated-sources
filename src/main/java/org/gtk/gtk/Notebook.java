package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>GtkNotebook as GtkBuildable</strong><br/>
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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkNotebook} uses the following roles:
 * <ul>
 * <li>{@link AccessibleRole#GROUP} for the notebook widget
 * <li>{@link AccessibleRole#TAB_LIST} for the list of tabs
 * <li>{@link AccessibleRole#TAB} role for each tab
 * <li>{@link AccessibleRole#TAB_PANEL} for each page
 * </ul>
 */
public class Notebook extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkNotebook";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Notebook proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Notebook(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Notebook if its GType is a (or inherits from) "GtkNotebook".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Notebook} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkNotebook", a ClassCastException will be thrown.
     */
    public static Notebook castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Notebook.getType())) {
            return new Notebook(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkNotebook");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkNotebook} widget with no pages.
     */
    public Notebook() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Appends a page to {@code notebook}.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @return the index (starting from 0) of the appended
     *   page in the notebook, or -1 if function fails
     */
    public int appendPage(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_append_page.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Appends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If {@code null}, and {@code tab_label}
     *   is a {@code GtkLabel} or {@code null}, then the menu label will be a newly
     *   created label with the same text as {@code tab_label}; if {@code tab_label}
     *   is not a {@code GtkLabel}, {@code menu_label} must be specified if the
     *   page-switch menu is to be used.
     * @return the index (starting from 0) of the appended
     *   page in the notebook, or -1 if function fails
     */
    public int appendPageMenu(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel, @Nullable org.gtk.gtk.Widget menuLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_append_page_menu.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()),
                    (Addressable) (menuLabel == null ? MemoryAddress.NULL : menuLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes the child from the notebook.
     * <p>
     * This function is very similar to {@link Notebook#removePage},
     * but additionally informs the notebook that the removal
     * is happening as part of a tab DND operation, which should
     * not be cancelled.
     * @param child a child
     */
    public void detachTab(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_detach_tab.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets one of the action widgets.
     * <p>
     * See {@link Notebook#setActionWidget}.
     * @param packType pack type of the action widget to receive
     * @return The action widget
     *   with the given {@code pack_type} or {@code null} when this action
     *   widget has not been set
     */
    public @Nullable org.gtk.gtk.Widget getActionWidget(@NotNull org.gtk.gtk.PackType packType) {
        java.util.Objects.requireNonNull(packType, "Parameter 'packType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_action_widget.invokeExact(
                    handle(),
                    packType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the page number of the current page.
     * @return the index (starting from 0) of the current
     *   page in the notebook. If the notebook has no pages,
     *   then -1 will be returned.
     */
    public int getCurrentPage() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_current_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current group name for {@code notebook}.
     * @return the group name,
     *   or {@code null} if none is set
     */
    public @Nullable java.lang.String getGroupName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_group_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the menu label widget of the page containing {@code child}.
     * @param child a widget contained in a page of {@code notebook}
     * @return the menu label, or {@code null}
     *   if the notebook page does not have a menu label other than
     *   the default (the tab label).
     */
    public @Nullable org.gtk.gtk.Widget getMenuLabel(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_menu_label.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the text of the menu label for the page containing
     * {@code child}.
     * @param child the child widget of a page of the notebook.
     * @return the text of the tab label, or {@code null} if
     *   the widget does not have a menu label other than the default
     *   menu label, or the menu label widget is not a {@code GtkLabel}.
     *   The string is owned by the widget and must not be freed.
     */
    public @Nullable java.lang.String getMenuLabelText(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_menu_label_text.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the number of pages in a notebook.
     * @return the number of pages in the notebook
     */
    public int getNPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_n_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the child widget contained in page number {@code page_num}.
     * @param pageNum the index of a page in the notebook, or -1
     *   to get the last page
     * @return the child widget, or {@code null} if {@code page_num}
     * is out of bounds
     */
    public @Nullable org.gtk.gtk.Widget getNthPage(int pageNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_nth_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code GtkNotebookPage} for {@code child}.
     * @param child a child of {@code notebook}
     * @return the {@code GtkNotebookPage} for {@code child}
     */
    public @NotNull org.gtk.gtk.NotebookPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.NotebookPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code GListModel} that contains the pages of the notebook.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     * @return a
     *   {@code GListModel} for the notebook's children
     */
    public @NotNull org.gtk.gio.ListModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns whether the tab label area has arrows for scrolling.
     * @return {@code true} if arrows for scrolling are present
     */
    public boolean getScrollable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_scrollable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether a bevel will be drawn around the notebook pages.
     * @return {@code true} if the bevel is drawn
     */
    public boolean getShowBorder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_show_border.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the tabs of the notebook are shown.
     * @return {@code true} if the tabs are shown
     */
    public boolean getShowTabs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_show_tabs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the tab contents can be detached from {@code notebook}.
     * @param child a child {@code GtkWidget}
     * @return {@code true} if the tab is detachable.
     */
    public boolean getTabDetachable(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_tab_detachable.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the tab label widget for the page {@code child}.
     * <p>
     * {@code null} is returned if {@code child} is not in {@code notebook} or
     * if no tab label has specifically been set for {@code child}.
     * @param child the page
     * @return the tab label
     */
    public @Nullable org.gtk.gtk.Widget getTabLabel(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_tab_label.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the text of the tab label for the page containing
     * {@code child}.
     * @param child a widget contained in a page of {@code notebook}
     * @return the text of the tab label, or {@code null} if
     *   the tab label idget is not a {@code GtkLabel}. The string is owned
     *   by the widget and must not be freed.
     */
    public @Nullable java.lang.String getTabLabelText(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_notebook_get_tab_label_text.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the edge at which the tabs are drawn.
     * @return the edge at which the tabs are drawn
     */
    public @NotNull org.gtk.gtk.PositionType getTabPos() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_tab_pos.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PositionType(RESULT);
    }
    
    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     * @param child a child {@code GtkWidget}
     * @return {@code true} if the tab is reorderable.
     */
    public boolean getTabReorderable(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_get_tab_reorderable.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Insert a page into {@code notebook} at the given position.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page after all other pages
     * @return the index (starting from 0) of the inserted
     *   page in the notebook, or -1 if function fails
     */
    public int insertPage(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_insert_page.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Insert a page into {@code notebook} at the given position, specifying
     * the widget to use as the label in the popup menu.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If {@code null}, and {@code tab_label}
     *   is a {@code GtkLabel} or {@code null}, then the menu label will be a newly
     *   created label with the same text as {@code tab_label}; if {@code tab_label}
     *   is not a {@code GtkLabel}, {@code menu_label} must be specified if the
     *   page-switch menu is to be used.
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page after all other pages.
     * @return the index (starting from 0) of the inserted
     *   page in the notebook
     */
    public int insertPageMenu(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel, @Nullable org.gtk.gtk.Widget menuLabel, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_insert_page_menu.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()),
                    (Addressable) (menuLabel == null ? MemoryAddress.NULL : menuLabel.handle()),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Switches to the next page.
     * <p>
     * Nothing happens if the current page is the last page.
     */
    public void nextPage() {
        try {
            DowncallHandles.gtk_notebook_next_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds the index of the page which contains the given child
     * widget.
     * @param child a {@code GtkWidget}
     * @return the index of the page containing {@code child}, or
     *   -1 if {@code child} is not in the notebook
     */
    public int pageNum(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_page_num.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Disables the popup menu.
     */
    public void popupDisable() {
        try {
            DowncallHandles.gtk_notebook_popup_disable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enables the popup menu.
     * <p>
     * If the user clicks with the right mouse button on the tab labels,
     * a menu with all the pages will be popped up.
     */
    public void popupEnable() {
        try {
            DowncallHandles.gtk_notebook_popup_enable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends a page to {@code notebook}.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @return the index (starting from 0) of the prepended
     *   page in the notebook, or -1 if function fails
     */
    public int prependPage(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_prepend_page.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Prepends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     * @param child the {@code GtkWidget} to use as the contents of the page
     * @param tabLabel the {@code GtkWidget} to be used as the label
     *   for the page, or {@code null} to use the default label, “page N”
     * @param menuLabel the widget to use as a label for the
     *   page-switch menu, if that is enabled. If {@code null}, and {@code tab_label}
     *   is a {@code GtkLabel} or {@code null}, then the menu label will be a newly
     *   created label with the same text as {@code tab_label}; if {@code tab_label}
     *   is not a {@code GtkLabel}, {@code menu_label} must be specified if the
     *   page-switch menu is to be used.
     * @return the index (starting from 0) of the prepended
     *   page in the notebook, or -1 if function fails
     */
    public int prependPageMenu(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel, @Nullable org.gtk.gtk.Widget menuLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_notebook_prepend_page_menu.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()),
                    (Addressable) (menuLabel == null ? MemoryAddress.NULL : menuLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Switches to the previous page.
     * <p>
     * Nothing happens if the current page is the first page.
     */
    public void prevPage() {
        try {
            DowncallHandles.gtk_notebook_prev_page.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a page from the notebook given its index
     * in the notebook.
     * @param pageNum the index of a notebook page, starting
     *   from 0. If -1, the last page will be removed.
     */
    public void removePage(int pageNum) {
        try {
            DowncallHandles.gtk_notebook_remove_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reorders the page containing {@code child}, so that it appears in position
     * {@code position}.
     * <p>
     * If {@code position} is greater than or equal to the number of children in
     * the list or negative, {@code child} will be moved to the end of the list.
     * @param child the child to move
     * @param position the new position, or -1 to move to the end
     */
    public void reorderChild(@NotNull org.gtk.gtk.Widget child, int position) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_reorder_child.invokeExact(
                    handle(),
                    child.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code widget} as one of the action widgets.
     * <p>
     * Depending on the pack type the widget will be placed before
     * or after the tabs. You can use a {@code GtkBox} if you need to pack
     * more than one widget on the same side.
     * @param widget a {@code GtkWidget}
     * @param packType pack type of the action widget
     */
    public void setActionWidget(@NotNull org.gtk.gtk.Widget widget, @NotNull org.gtk.gtk.PackType packType) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(packType, "Parameter 'packType' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_action_widget.invokeExact(
                    handle(),
                    widget.handle(),
                    packType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Switches to the page number {@code page_num}.
     * <p>
     * Note that due to historical reasons, GtkNotebook refuses
     * to switch to a page unless the child widget is visible.
     * Therefore, it is recommended to show child widgets before
     * adding them to a notebook.
     * @param pageNum index of the page to switch to, starting from 0.
     *   If negative, the last page will be used. If greater
     *   than the number of pages in the notebook, nothing
     *   will be done.
     */
    public void setCurrentPage(int pageNum) {
        try {
            DowncallHandles.gtk_notebook_set_current_page.invokeExact(
                    handle(),
                    pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a group name for {@code notebook}.
     * <p>
     * Notebooks with the same name will be able to exchange tabs
     * via drag and drop. A notebook with a {@code null} group name will
     * not be able to exchange tabs with any other notebook.
     * @param groupName the name of the notebook group,
     *   or {@code null} to unset it
     */
    public void setGroupName(@Nullable java.lang.String groupName) {
        try {
            DowncallHandles.gtk_notebook_set_group_name.invokeExact(
                    handle(),
                    (Addressable) (groupName == null ? MemoryAddress.NULL : Interop.allocateNativeString(groupName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the menu label for the page containing {@code child}.
     * @param child the child widget
     * @param menuLabel the menu label, or {@code null} for default
     */
    public void setMenuLabel(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget menuLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_menu_label.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (menuLabel == null ? MemoryAddress.NULL : menuLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new label and sets it as the menu label of {@code child}.
     * @param child the child widget
     * @param menuText the label text
     */
    public void setMenuLabelText(@NotNull org.gtk.gtk.Widget child, @NotNull java.lang.String menuText) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(menuText, "Parameter 'menuText' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_menu_label_text.invokeExact(
                    handle(),
                    child.handle(),
                    Interop.allocateNativeString(menuText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the tab label area will have arrows for
     * scrolling if there are too many tabs to fit in the area.
     * @param scrollable {@code true} if scroll arrows should be added
     */
    public void setScrollable(boolean scrollable) {
        try {
            DowncallHandles.gtk_notebook_set_scrollable.invokeExact(
                    handle(),
                    scrollable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether a bevel will be drawn around the notebook pages.
     * <p>
     * This only has a visual effect when the tabs are not shown.
     * @param showBorder {@code true} if a bevel should be drawn around the notebook
     */
    public void setShowBorder(boolean showBorder) {
        try {
            DowncallHandles.gtk_notebook_set_show_border.invokeExact(
                    handle(),
                    showBorder ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to show the tabs for the notebook or not.
     * @param showTabs {@code true} if the tabs should be shown
     */
    public void setShowTabs(boolean showTabs) {
        try {
            DowncallHandles.gtk_notebook_set_show_tabs.invokeExact(
                    handle(),
                    showTabs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param child a child {@code GtkWidget}
     * @param detachable whether the tab is detachable or not
     */
    public void setTabDetachable(@NotNull org.gtk.gtk.Widget child, boolean detachable) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_tab_detachable.invokeExact(
                    handle(),
                    child.handle(),
                    detachable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the tab label for {@code child}.
     * <p>
     * If {@code null} is specified for {@code tab_label}, then the page will
     * have the label “page N”.
     * @param child the page
     * @param tabLabel the tab label widget to use, or {@code null}
     *   for default tab label
     */
    public void setTabLabel(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget tabLabel) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_tab_label.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (tabLabel == null ? MemoryAddress.NULL : tabLabel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new label and sets it as the tab label for the page
     * containing {@code child}.
     * @param child the page
     * @param tabText the label text
     */
    public void setTabLabelText(@NotNull org.gtk.gtk.Widget child, @NotNull java.lang.String tabText) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(tabText, "Parameter 'tabText' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_tab_label_text.invokeExact(
                    handle(),
                    child.handle(),
                    Interop.allocateNativeString(tabText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the edge at which the tabs are drawn.
     * @param pos the edge to draw the tabs at
     */
    public void setTabPos(@NotNull org.gtk.gtk.PositionType pos) {
        java.util.Objects.requireNonNull(pos, "Parameter 'pos' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_tab_pos.invokeExact(
                    handle(),
                    pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the notebook tab can be reordered
     * via drag and drop or not.
     * @param child a child {@code GtkWidget}
     * @param reorderable whether the tab is reorderable or not
     */
    public void setTabReorderable(@NotNull org.gtk.gtk.Widget child, boolean reorderable) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_notebook_set_tab_reorderable.invokeExact(
                    handle(),
                    child.handle(),
                    reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_notebook_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPage {
        boolean signalReceived(Notebook source, int object);
    }
    
    public Signal<Notebook.ChangeCurrentPage> onChangeCurrentPage(Notebook.ChangeCurrentPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-current-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.ChangeCurrentPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CreateWindow {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.Widget page);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Notebook.CreateWindow> onCreateWindow(Notebook.CreateWindow handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-window"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookCreateWindow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.CreateWindow>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FocusTab {
        boolean signalReceived(Notebook source, @NotNull org.gtk.gtk.NotebookTab object);
    }
    
    public Signal<Notebook.FocusTab> onFocusTab(Notebook.FocusTab handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("focus-tab"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookFocusTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.FocusTab>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOut {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.DirectionType object);
    }
    
    public Signal<Notebook.MoveFocusOut> onMoveFocusOut(Notebook.MoveFocusOut handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-focus-out"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookMoveFocusOut",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.MoveFocusOut>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageAdded {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.Widget child, int pageNum);
    }
    
    /**
     * the ::page-added signal is emitted in the notebook
     * right after a page is added to the notebook.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Notebook.PageAdded> onPageAdded(Notebook.PageAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.PageAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageRemoved {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.Widget child, int pageNum);
    }
    
    /**
     * the ::page-removed signal is emitted in the notebook
     * right after a page is removed from the notebook.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Notebook.PageRemoved> onPageRemoved(Notebook.PageRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.PageRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageReordered {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.Widget child, int pageNum);
    }
    
    /**
     * the ::page-reordered signal is emitted in the notebook
     * right after a page has been reordered.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Notebook.PageReordered> onPageReordered(Notebook.PageReordered handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-reordered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.PageReordered>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ReorderTab {
        boolean signalReceived(Notebook source, @NotNull org.gtk.gtk.DirectionType object, boolean p0);
    }
    
    public Signal<Notebook.ReorderTab> onReorderTab(Notebook.ReorderTab handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reorder-tab"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookReorderTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.ReorderTab>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectPage {
        boolean signalReceived(Notebook source, boolean object);
    }
    
    public Signal<Notebook.SelectPage> onSelectPage(Notebook.SelectPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSelectPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.SelectPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SwitchPage {
        void signalReceived(Notebook source, @NotNull org.gtk.gtk.Widget page, int pageNum);
    }
    
    /**
     * Emitted when the user or a function changes the current page.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Notebook.SwitchPage> onSwitchPage(Notebook.SwitchPage handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("switch-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSwitchPage",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Notebook.SwitchPage>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Notebook.Build} object constructs a {@link Notebook} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Notebook} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Notebook} using {@link Notebook#castFrom}.
         * @return A new instance of {@code Notebook} with the properties 
         *         that were set in the Build object.
         */
        public Notebook construct() {
            return Notebook.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Notebook.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If {@code true}, pressing the right mouse button on the notebook shows a page switching menu.
         * @param enablePopup The value for the {@code enable-popup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnablePopup(boolean enablePopup) {
            names.add("enable-popup");
            values.add(org.gtk.gobject.Value.create(enablePopup));
            return this;
        }
        
        /**
         * Group name for tab drag and drop.
         * @param groupName The value for the {@code group-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGroupName(java.lang.String groupName) {
            names.add("group-name");
            values.add(org.gtk.gobject.Value.create(groupName));
            return this;
        }
        
        /**
         * The index of the current page.
         * @param page The value for the {@code page} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPage(int page) {
            names.add("page");
            values.add(org.gtk.gobject.Value.create(page));
            return this;
        }
        
        /**
         * A selection model with the pages.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPages(org.gtk.gio.ListModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * If {@code true}, scroll arrows are added if there are too many pages to fit.
         * @param scrollable The value for the {@code scrollable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setScrollable(boolean scrollable) {
            names.add("scrollable");
            values.add(org.gtk.gobject.Value.create(scrollable));
            return this;
        }
        
        /**
         * Whether the border should be shown.
         * @param showBorder The value for the {@code show-border} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowBorder(boolean showBorder) {
            names.add("show-border");
            values.add(org.gtk.gobject.Value.create(showBorder));
            return this;
        }
        
        /**
         * Whether tabs should be shown.
         * @param showTabs The value for the {@code show-tabs} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setShowTabs(boolean showTabs) {
            names.add("show-tabs");
            values.add(org.gtk.gobject.Value.create(showTabs));
            return this;
        }
        
        /**
         * Which side of the notebook holds the tabs.
         * @param tabPos The value for the {@code tab-pos} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTabPos(org.gtk.gtk.PositionType tabPos) {
            names.add("tab-pos");
            values.add(org.gtk.gobject.Value.create(tabPos));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_notebook_new = Interop.downcallHandle(
            "gtk_notebook_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_append_page = Interop.downcallHandle(
            "gtk_notebook_append_page",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_append_page_menu = Interop.downcallHandle(
            "gtk_notebook_append_page_menu",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_detach_tab = Interop.downcallHandle(
            "gtk_notebook_detach_tab",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_action_widget = Interop.downcallHandle(
            "gtk_notebook_get_action_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_current_page = Interop.downcallHandle(
            "gtk_notebook_get_current_page",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_group_name = Interop.downcallHandle(
            "gtk_notebook_get_group_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_menu_label = Interop.downcallHandle(
            "gtk_notebook_get_menu_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_menu_label_text = Interop.downcallHandle(
            "gtk_notebook_get_menu_label_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_n_pages = Interop.downcallHandle(
            "gtk_notebook_get_n_pages",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_nth_page = Interop.downcallHandle(
            "gtk_notebook_get_nth_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_page = Interop.downcallHandle(
            "gtk_notebook_get_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_pages = Interop.downcallHandle(
            "gtk_notebook_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_scrollable = Interop.downcallHandle(
            "gtk_notebook_get_scrollable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_show_border = Interop.downcallHandle(
            "gtk_notebook_get_show_border",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_show_tabs = Interop.downcallHandle(
            "gtk_notebook_get_show_tabs",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_tab_detachable = Interop.downcallHandle(
            "gtk_notebook_get_tab_detachable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_tab_label = Interop.downcallHandle(
            "gtk_notebook_get_tab_label",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_tab_label_text = Interop.downcallHandle(
            "gtk_notebook_get_tab_label_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_tab_pos = Interop.downcallHandle(
            "gtk_notebook_get_tab_pos",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_tab_reorderable = Interop.downcallHandle(
            "gtk_notebook_get_tab_reorderable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_insert_page = Interop.downcallHandle(
            "gtk_notebook_insert_page",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_insert_page_menu = Interop.downcallHandle(
            "gtk_notebook_insert_page_menu",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_next_page = Interop.downcallHandle(
            "gtk_notebook_next_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_page_num = Interop.downcallHandle(
            "gtk_notebook_page_num",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_popup_disable = Interop.downcallHandle(
            "gtk_notebook_popup_disable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_popup_enable = Interop.downcallHandle(
            "gtk_notebook_popup_enable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_prepend_page = Interop.downcallHandle(
            "gtk_notebook_prepend_page",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_prepend_page_menu = Interop.downcallHandle(
            "gtk_notebook_prepend_page_menu",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_prev_page = Interop.downcallHandle(
            "gtk_notebook_prev_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_remove_page = Interop.downcallHandle(
            "gtk_notebook_remove_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_reorder_child = Interop.downcallHandle(
            "gtk_notebook_reorder_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_action_widget = Interop.downcallHandle(
            "gtk_notebook_set_action_widget",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_current_page = Interop.downcallHandle(
            "gtk_notebook_set_current_page",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_group_name = Interop.downcallHandle(
            "gtk_notebook_set_group_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_menu_label = Interop.downcallHandle(
            "gtk_notebook_set_menu_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_menu_label_text = Interop.downcallHandle(
            "gtk_notebook_set_menu_label_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_scrollable = Interop.downcallHandle(
            "gtk_notebook_set_scrollable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_show_border = Interop.downcallHandle(
            "gtk_notebook_set_show_border",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_show_tabs = Interop.downcallHandle(
            "gtk_notebook_set_show_tabs",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_tab_detachable = Interop.downcallHandle(
            "gtk_notebook_set_tab_detachable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_tab_label = Interop.downcallHandle(
            "gtk_notebook_set_tab_label",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_tab_label_text = Interop.downcallHandle(
            "gtk_notebook_set_tab_label_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_tab_pos = Interop.downcallHandle(
            "gtk_notebook_set_tab_pos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_set_tab_reorderable = Interop.downcallHandle(
            "gtk_notebook_set_tab_reorderable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_notebook_get_type = Interop.downcallHandle(
            "gtk_notebook_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static boolean signalNotebookChangeCurrentPage(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.ChangeCurrentPage) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Notebook(source, Ownership.NONE), object);
        }
        
        public static void signalNotebookCreateWindow(MemoryAddress source, MemoryAddress page, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.CreateWindow) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.Widget(page, Ownership.NONE));
        }
        
        public static boolean signalNotebookFocusTab(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.FocusTab) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.NotebookTab(object));
        }
        
        public static void signalNotebookMoveFocusOut(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.MoveFocusOut) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.DirectionType(object));
        }
        
        public static void signalNotebookPageAdded(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.PageAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.Widget(child, Ownership.NONE), pageNum);
        }
        
        public static void signalNotebookPageRemoved(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.PageRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.Widget(child, Ownership.NONE), pageNum);
        }
        
        public static void signalNotebookPageReordered(MemoryAddress source, MemoryAddress child, int pageNum, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.PageReordered) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.Widget(child, Ownership.NONE), pageNum);
        }
        
        public static boolean signalNotebookReorderTab(MemoryAddress source, int object, int p0, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.ReorderTab) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.DirectionType(object), p0 != 0);
        }
        
        public static boolean signalNotebookSelectPage(MemoryAddress source, int object, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.SelectPage) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Notebook(source, Ownership.NONE), object != 0);
        }
        
        public static void signalNotebookSwitchPage(MemoryAddress source, MemoryAddress page, int pageNum, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Notebook.SwitchPage) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Notebook(source, Ownership.NONE), new org.gtk.gtk.Widget(page, Ownership.NONE), pageNum);
        }
    }
}
