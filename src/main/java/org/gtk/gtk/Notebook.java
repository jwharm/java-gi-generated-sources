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
 * 
 * <h1>GtkNotebook as GtkBuildable</h1>
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
 * 
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
 * 
 * <h1>CSS nodes</h1>
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
 * 
 * <h1>Accessibility</h1>
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
    
    private static final MethodHandle gtk_notebook_new = Interop.downcallHandle(
        "gtk_notebook_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_notebook_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkNotebook} widget with no pages.
     */
    public Notebook() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_notebook_append_page = Interop.downcallHandle(
        "gtk_notebook_append_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a page to {@code notebook}.
     */
    public int appendPage(@NotNull Widget child, @Nullable Widget tabLabel) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_append_page.invokeExact(handle(), child.handle(), tabLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_append_page_menu = Interop.downcallHandle(
        "gtk_notebook_append_page_menu",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     */
    public int appendPageMenu(@NotNull Widget child, @Nullable Widget tabLabel, @Nullable Widget menuLabel) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_append_page_menu.invokeExact(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_detach_tab = Interop.downcallHandle(
        "gtk_notebook_detach_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the child from the notebook.
     * <p>
     * This function is very similar to {@link Notebook#removePage},
     * but additionally informs the notebook that the removal
     * is happening as part of a tab DND operation, which should
     * not be cancelled.
     */
    public @NotNull void detachTab(@NotNull Widget child) {
        try {
            gtk_notebook_detach_tab.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_get_action_widget = Interop.downcallHandle(
        "gtk_notebook_get_action_widget",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets one of the action widgets.
     * <p>
     * See {@link Notebook#setActionWidget}.
     */
    public @Nullable Widget getActionWidget(@NotNull PackType packType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_action_widget.invokeExact(handle(), packType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_notebook_get_current_page = Interop.downcallHandle(
        "gtk_notebook_get_current_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the page number of the current page.
     */
    public int getCurrentPage() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_current_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_get_group_name = Interop.downcallHandle(
        "gtk_notebook_get_group_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current group name for {@code notebook}.
     */
    public @Nullable java.lang.String getGroupName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_group_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_notebook_get_menu_label = Interop.downcallHandle(
        "gtk_notebook_get_menu_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the menu label widget of the page containing {@code child}.
     */
    public @Nullable Widget getMenuLabel(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_menu_label.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_notebook_get_menu_label_text = Interop.downcallHandle(
        "gtk_notebook_get_menu_label_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text of the menu label for the page containing
     * {@code child}.
     */
    public @Nullable java.lang.String getMenuLabelText(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_menu_label_text.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_notebook_get_n_pages = Interop.downcallHandle(
        "gtk_notebook_get_n_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of pages in a notebook.
     */
    public int getNPages() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_n_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_get_nth_page = Interop.downcallHandle(
        "gtk_notebook_get_nth_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the child widget contained in page number {@code page_num}.
     */
    public @Nullable Widget getNthPage(@NotNull int pageNum) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_nth_page.invokeExact(handle(), pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_notebook_get_page = Interop.downcallHandle(
        "gtk_notebook_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkNotebookPage} for {@code child}.
     */
    public @NotNull NotebookPage getPage(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_page.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NotebookPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_notebook_get_pages = Interop.downcallHandle(
        "gtk_notebook_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code GListModel} that contains the pages of the notebook.
     * <p>
     * This can be used to keep an up-to-date view. The model also
     * implements {@code Gtk.SelectionModel} and can be used to track
     * and modify the visible page.
     */
    public @NotNull org.gtk.gio.ListModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_notebook_get_scrollable = Interop.downcallHandle(
        "gtk_notebook_get_scrollable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the tab label area has arrows for scrolling.
     */
    public boolean getScrollable() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_scrollable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_notebook_get_show_border = Interop.downcallHandle(
        "gtk_notebook_get_show_border",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether a bevel will be drawn around the notebook pages.
     */
    public boolean getShowBorder() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_show_border.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_notebook_get_show_tabs = Interop.downcallHandle(
        "gtk_notebook_get_show_tabs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the tabs of the notebook are shown.
     */
    public boolean getShowTabs() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_show_tabs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_notebook_get_tab_detachable = Interop.downcallHandle(
        "gtk_notebook_get_tab_detachable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the tab contents can be detached from {@code notebook}.
     */
    public boolean getTabDetachable(@NotNull Widget child) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_tab_detachable.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_notebook_get_tab_label = Interop.downcallHandle(
        "gtk_notebook_get_tab_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the tab label widget for the page {@code child}.
     * <p>
     * {@code null} is returned if {@code child} is not in {@code notebook} or
     * if no tab label has specifically been set for {@code child}.
     */
    public @Nullable Widget getTabLabel(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_tab_label.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_notebook_get_tab_label_text = Interop.downcallHandle(
        "gtk_notebook_get_tab_label_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the text of the tab label for the page containing
     * {@code child}.
     */
    public @Nullable java.lang.String getTabLabelText(@NotNull Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_notebook_get_tab_label_text.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_notebook_get_tab_pos = Interop.downcallHandle(
        "gtk_notebook_get_tab_pos",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the edge at which the tabs are drawn.
     */
    public @NotNull PositionType getTabPos() {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_tab_pos.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PositionType(RESULT);
    }
    
    private static final MethodHandle gtk_notebook_get_tab_reorderable = Interop.downcallHandle(
        "gtk_notebook_get_tab_reorderable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the tab can be reordered via drag and drop or not.
     */
    public boolean getTabReorderable(@NotNull Widget child) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_get_tab_reorderable.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_notebook_insert_page = Interop.downcallHandle(
        "gtk_notebook_insert_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Insert a page into {@code notebook} at the given position.
     */
    public int insertPage(@NotNull Widget child, @Nullable Widget tabLabel, @NotNull int position) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_insert_page.invokeExact(handle(), child.handle(), tabLabel.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_insert_page_menu = Interop.downcallHandle(
        "gtk_notebook_insert_page_menu",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Insert a page into {@code notebook} at the given position, specifying
     * the widget to use as the label in the popup menu.
     */
    public int insertPageMenu(@NotNull Widget child, @Nullable Widget tabLabel, @Nullable Widget menuLabel, @NotNull int position) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_insert_page_menu.invokeExact(handle(), child.handle(), tabLabel.handle(), menuLabel.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_next_page = Interop.downcallHandle(
        "gtk_notebook_next_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Switches to the next page.
     * <p>
     * Nothing happens if the current page is the last page.
     */
    public @NotNull void nextPage() {
        try {
            gtk_notebook_next_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_page_num = Interop.downcallHandle(
        "gtk_notebook_page_num",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the index of the page which contains the given child
     * widget.
     */
    public int pageNum(@NotNull Widget child) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_page_num.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_popup_disable = Interop.downcallHandle(
        "gtk_notebook_popup_disable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Disables the popup menu.
     */
    public @NotNull void popupDisable() {
        try {
            gtk_notebook_popup_disable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_popup_enable = Interop.downcallHandle(
        "gtk_notebook_popup_enable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Enables the popup menu.
     * <p>
     * If the user clicks with the right mouse button on the tab labels,
     * a menu with all the pages will be popped up.
     */
    public @NotNull void popupEnable() {
        try {
            gtk_notebook_popup_enable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_prepend_page = Interop.downcallHandle(
        "gtk_notebook_prepend_page",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a page to {@code notebook}.
     */
    public int prependPage(@NotNull Widget child, @Nullable Widget tabLabel) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_prepend_page.invokeExact(handle(), child.handle(), tabLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_prepend_page_menu = Interop.downcallHandle(
        "gtk_notebook_prepend_page_menu",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends a page to {@code notebook}, specifying the widget to use as the
     * label in the popup menu.
     */
    public int prependPageMenu(@NotNull Widget child, @Nullable Widget tabLabel, @Nullable Widget menuLabel) {
        int RESULT;
        try {
            RESULT = (int) gtk_notebook_prepend_page_menu.invokeExact(handle(), child.handle(), tabLabel.handle(), menuLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_notebook_prev_page = Interop.downcallHandle(
        "gtk_notebook_prev_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Switches to the previous page.
     * <p>
     * Nothing happens if the current page is the first page.
     */
    public @NotNull void prevPage() {
        try {
            gtk_notebook_prev_page.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_remove_page = Interop.downcallHandle(
        "gtk_notebook_remove_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Removes a page from the notebook given its index
     * in the notebook.
     */
    public @NotNull void removePage(@NotNull int pageNum) {
        try {
            gtk_notebook_remove_page.invokeExact(handle(), pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_reorder_child = Interop.downcallHandle(
        "gtk_notebook_reorder_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Reorders the page containing {@code child}, so that it appears in position
     * {@code position}.
     * <p>
     * If {@code position} is greater than or equal to the number of children in
     * the list or negative, {@code child} will be moved to the end of the list.
     */
    public @NotNull void reorderChild(@NotNull Widget child, @NotNull int position) {
        try {
            gtk_notebook_reorder_child.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_action_widget = Interop.downcallHandle(
        "gtk_notebook_set_action_widget",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code widget} as one of the action widgets.
     * <p>
     * Depending on the pack type the widget will be placed before
     * or after the tabs. You can use a {@code GtkBox} if you need to pack
     * more than one widget on the same side.
     */
    public @NotNull void setActionWidget(@NotNull Widget widget, @NotNull PackType packType) {
        try {
            gtk_notebook_set_action_widget.invokeExact(handle(), widget.handle(), packType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_current_page = Interop.downcallHandle(
        "gtk_notebook_set_current_page",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Switches to the page number {@code page_num}.
     * <p>
     * Note that due to historical reasons, GtkNotebook refuses
     * to switch to a page unless the child widget is visible.
     * Therefore, it is recommended to show child widgets before
     * adding them to a notebook.
     */
    public @NotNull void setCurrentPage(@NotNull int pageNum) {
        try {
            gtk_notebook_set_current_page.invokeExact(handle(), pageNum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_group_name = Interop.downcallHandle(
        "gtk_notebook_set_group_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a group name for {@code notebook}.
     * <p>
     * Notebooks with the same name will be able to exchange tabs
     * via drag and drop. A notebook with a {@code null} group name will
     * not be able to exchange tabs with any other notebook.
     */
    public @NotNull void setGroupName(@Nullable java.lang.String groupName) {
        try {
            gtk_notebook_set_group_name.invokeExact(handle(), Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_menu_label = Interop.downcallHandle(
        "gtk_notebook_set_menu_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the menu label for the page containing {@code child}.
     */
    public @NotNull void setMenuLabel(@NotNull Widget child, @Nullable Widget menuLabel) {
        try {
            gtk_notebook_set_menu_label.invokeExact(handle(), child.handle(), menuLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_menu_label_text = Interop.downcallHandle(
        "gtk_notebook_set_menu_label_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new label and sets it as the menu label of {@code child}.
     */
    public @NotNull void setMenuLabelText(@NotNull Widget child, @NotNull java.lang.String menuText) {
        try {
            gtk_notebook_set_menu_label_text.invokeExact(handle(), child.handle(), Interop.allocateNativeString(menuText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_scrollable = Interop.downcallHandle(
        "gtk_notebook_set_scrollable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the tab label area will have arrows for
     * scrolling if there are too many tabs to fit in the area.
     */
    public @NotNull void setScrollable(@NotNull boolean scrollable) {
        try {
            gtk_notebook_set_scrollable.invokeExact(handle(), scrollable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_show_border = Interop.downcallHandle(
        "gtk_notebook_set_show_border",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether a bevel will be drawn around the notebook pages.
     * <p>
     * This only has a visual effect when the tabs are not shown.
     */
    public @NotNull void setShowBorder(@NotNull boolean showBorder) {
        try {
            gtk_notebook_set_show_border.invokeExact(handle(), showBorder ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_show_tabs = Interop.downcallHandle(
        "gtk_notebook_set_show_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to show the tabs for the notebook or not.
     */
    public @NotNull void setShowTabs(@NotNull boolean showTabs) {
        try {
            gtk_notebook_set_show_tabs.invokeExact(handle(), showTabs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_tab_detachable = Interop.downcallHandle(
        "gtk_notebook_set_tab_detachable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     * 
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
    public @NotNull void setTabDetachable(@NotNull Widget child, @NotNull boolean detachable) {
        try {
            gtk_notebook_set_tab_detachable.invokeExact(handle(), child.handle(), detachable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_tab_label = Interop.downcallHandle(
        "gtk_notebook_set_tab_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the tab label for {@code child}.
     * <p>
     * If {@code null} is specified for {@code tab_label}, then the page will
     * have the label “page N”.
     */
    public @NotNull void setTabLabel(@NotNull Widget child, @Nullable Widget tabLabel) {
        try {
            gtk_notebook_set_tab_label.invokeExact(handle(), child.handle(), tabLabel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_tab_label_text = Interop.downcallHandle(
        "gtk_notebook_set_tab_label_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new label and sets it as the tab label for the page
     * containing {@code child}.
     */
    public @NotNull void setTabLabelText(@NotNull Widget child, @NotNull java.lang.String tabText) {
        try {
            gtk_notebook_set_tab_label_text.invokeExact(handle(), child.handle(), Interop.allocateNativeString(tabText));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_tab_pos = Interop.downcallHandle(
        "gtk_notebook_set_tab_pos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the edge at which the tabs are drawn.
     */
    public @NotNull void setTabPos(@NotNull PositionType pos) {
        try {
            gtk_notebook_set_tab_pos.invokeExact(handle(), pos.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_notebook_set_tab_reorderable = Interop.downcallHandle(
        "gtk_notebook_set_tab_reorderable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the notebook tab can be reordered
     * via drag and drop or not.
     */
    public @NotNull void setTabReorderable(@NotNull Widget child, @NotNull boolean reorderable) {
        try {
            gtk_notebook_set_tab_reorderable.invokeExact(handle(), child.handle(), reorderable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangeCurrentPageHandler {
        boolean signalReceived(Notebook source, @NotNull int object);
    }
    
    public SignalHandle onChangeCurrentPage(ChangeCurrentPageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("change-current-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookChangeCurrentPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CreateWindowHandler {
        void signalReceived(Notebook source, @NotNull Widget page);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-window"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookCreateWindow",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface FocusTabHandler {
        boolean signalReceived(Notebook source, @NotNull NotebookTab object);
    }
    
    public SignalHandle onFocusTab(FocusTabHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("focus-tab"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookFocusTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveFocusOutHandler {
        void signalReceived(Notebook source, @NotNull DirectionType object);
    }
    
    public SignalHandle onMoveFocusOut(MoveFocusOutHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-focus-out"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookMoveFocusOut",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageAddedHandler {
        void signalReceived(Notebook source, @NotNull Widget child, @NotNull int pageNum);
    }
    
    /**
     * the ::page-added signal is emitted in the notebook
     * right after a page is added to the notebook.
     */
    public SignalHandle onPageAdded(PageAddedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageRemovedHandler {
        void signalReceived(Notebook source, @NotNull Widget child, @NotNull int pageNum);
    }
    
    /**
     * the ::page-removed signal is emitted in the notebook
     * right after a page is removed from the notebook.
     */
    public SignalHandle onPageRemoved(PageRemovedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageReorderedHandler {
        void signalReceived(Notebook source, @NotNull Widget child, @NotNull int pageNum);
    }
    
    /**
     * the ::page-reordered signal is emitted in the notebook
     * right after a page has been reordered.
     */
    public SignalHandle onPageReordered(PageReorderedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-reordered"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookPageReordered",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ReorderTabHandler {
        boolean signalReceived(Notebook source, @NotNull DirectionType object, @NotNull boolean p0);
    }
    
    public SignalHandle onReorderTab(ReorderTabHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("reorder-tab"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookReorderTab",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectPageHandler {
        boolean signalReceived(Notebook source, @NotNull boolean object);
    }
    
    public SignalHandle onSelectPage(SelectPageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSelectPage",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SwitchPageHandler {
        void signalReceived(Notebook source, @NotNull Widget page, @NotNull int pageNum);
    }
    
    /**
     * Emitted when the user or a function changes the current page.
     */
    public SignalHandle onSwitchPage(SwitchPageHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("switch-page"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Notebook.Callbacks.class, "signalNotebookSwitchPage",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
