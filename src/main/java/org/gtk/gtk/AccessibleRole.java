package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The accessible role for a {@code Accessible} implementation.
 * <p>
 * Abstract roles are only used as part of the ontology; application
 * developers must not use abstract roles in their code.
 */
public class AccessibleRole extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * An element with important, and usually
     *   time-sensitive, information
     */
    public static final AccessibleRole ALERT = new AccessibleRole(0);
    
    /**
     * A type of dialog that contains an
     *   alert message
     */
    public static final AccessibleRole ALERT_DIALOG = new AccessibleRole(1);
    
    /**
     * Unused
     */
    public static final AccessibleRole BANNER = new AccessibleRole(2);
    
    /**
     * An input element that allows for
     *   user-triggered actions when clicked or pressed
     */
    public static final AccessibleRole BUTTON = new AccessibleRole(3);
    
    /**
     * Unused
     */
    public static final AccessibleRole CAPTION = new AccessibleRole(4);
    
    /**
     * Unused
     */
    public static final AccessibleRole CELL = new AccessibleRole(5);
    
    /**
     * A checkable input element that has
     *   three possible values: {@code true}, {@code false}, or {@code mixed}
     */
    public static final AccessibleRole CHECKBOX = new AccessibleRole(6);
    
    /**
     * A header in a columned list.
     */
    public static final AccessibleRole COLUMN_HEADER = new AccessibleRole(7);
    
    /**
     * An input that controls another element,
     *   such as a list or a grid, that can dynamically pop up to help the user
     *   set the value of the input
     */
    public static final AccessibleRole COMBO_BOX = new AccessibleRole(8);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole COMMAND = new AccessibleRole(9);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole COMPOSITE = new AccessibleRole(10);
    
    /**
     * A dialog is a window that is designed to interrupt
     *    the current processing of an application in order to prompt the user to enter
     *    information or require a response.
     */
    public static final AccessibleRole DIALOG = new AccessibleRole(11);
    
    /**
     * Unused
     */
    public static final AccessibleRole DOCUMENT = new AccessibleRole(12);
    
    /**
     * Unused
     */
    public static final AccessibleRole FEED = new AccessibleRole(13);
    
    /**
     * Unused
     */
    public static final AccessibleRole FORM = new AccessibleRole(14);
    
    /**
     * Unused
     */
    public static final AccessibleRole GENERIC = new AccessibleRole(15);
    
    /**
     * A grid of items.
     */
    public static final AccessibleRole GRID = new AccessibleRole(16);
    
    /**
     * An item in a grid or tree grid.
     */
    public static final AccessibleRole GRID_CELL = new AccessibleRole(17);
    
    /**
     * An element that groups multiple widgets. GTK uses
     *   this role for various containers, like {@link Box}, and {@link HeaderBar}.
     */
    public static final AccessibleRole GROUP = new AccessibleRole(18);
    
    /**
     * Unused
     */
    public static final AccessibleRole HEADING = new AccessibleRole(19);
    
    /**
     * An image.
     */
    public static final AccessibleRole IMG = new AccessibleRole(20);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole INPUT = new AccessibleRole(21);
    
    /**
     * A visible name or caption for a user interface component.
     */
    public static final AccessibleRole LABEL = new AccessibleRole(22);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole LANDMARK = new AccessibleRole(23);
    
    /**
     * Unused
     */
    public static final AccessibleRole LEGEND = new AccessibleRole(24);
    
    /**
     * A clickable link.
     */
    public static final AccessibleRole LINK = new AccessibleRole(25);
    
    /**
     * A list of items.
     */
    public static final AccessibleRole LIST = new AccessibleRole(26);
    
    /**
     * Unused.
     */
    public static final AccessibleRole LIST_BOX = new AccessibleRole(27);
    
    /**
     * An item in a list.
     */
    public static final AccessibleRole LIST_ITEM = new AccessibleRole(28);
    
    /**
     * Unused
     */
    public static final AccessibleRole LOG = new AccessibleRole(29);
    
    /**
     * Unused
     */
    public static final AccessibleRole MAIN = new AccessibleRole(30);
    
    /**
     * Unused
     */
    public static final AccessibleRole MARQUEE = new AccessibleRole(31);
    
    /**
     * Unused
     */
    public static final AccessibleRole MATH = new AccessibleRole(32);
    
    /**
     * An element that represents a value within a known range.
     */
    public static final AccessibleRole METER = new AccessibleRole(33);
    
    /**
     * A menu.
     */
    public static final AccessibleRole MENU = new AccessibleRole(34);
    
    /**
     * A menubar.
     */
    public static final AccessibleRole MENU_BAR = new AccessibleRole(35);
    
    /**
     * An item in a menu.
     */
    public static final AccessibleRole MENU_ITEM = new AccessibleRole(36);
    
    /**
     * A check item in a menu.
     */
    public static final AccessibleRole MENU_ITEM_CHECKBOX = new AccessibleRole(37);
    
    /**
     * A radio item in a menu.
     */
    public static final AccessibleRole MENU_ITEM_RADIO = new AccessibleRole(38);
    
    /**
     * Unused
     */
    public static final AccessibleRole NAVIGATION = new AccessibleRole(39);
    
    /**
     * An element that is not represented to accessibility technologies.
     */
    public static final AccessibleRole NONE = new AccessibleRole(40);
    
    /**
     * Unused
     */
    public static final AccessibleRole NOTE = new AccessibleRole(41);
    
    /**
     * Unused
     */
    public static final AccessibleRole OPTION = new AccessibleRole(42);
    
    /**
     * An element that is not represented to accessibility technologies.
     */
    public static final AccessibleRole PRESENTATION = new AccessibleRole(43);
    
    /**
     * An element that displays the progress
     *    status for tasks that take a long time.
     */
    public static final AccessibleRole PROGRESS_BAR = new AccessibleRole(44);
    
    /**
     * A checkable input in a group of radio roles,
     *    only one of which can be checked at a time.
     */
    public static final AccessibleRole RADIO = new AccessibleRole(45);
    
    /**
     * Unused
     */
    public static final AccessibleRole RADIO_GROUP = new AccessibleRole(46);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole RANGE = new AccessibleRole(47);
    
    /**
     * Unused
     */
    public static final AccessibleRole REGION = new AccessibleRole(48);
    
    /**
     * A row in a columned list.
     */
    public static final AccessibleRole ROW = new AccessibleRole(49);
    
    /**
     * Unused
     */
    public static final AccessibleRole ROW_GROUP = new AccessibleRole(50);
    
    /**
     * Unused
     */
    public static final AccessibleRole ROW_HEADER = new AccessibleRole(51);
    
    /**
     * A graphical object that controls the scrolling
     *    of content within a viewing area, regardless of whether the content is fully
     *    displayed within the viewing area.
     */
    public static final AccessibleRole SCROLLBAR = new AccessibleRole(52);
    
    /**
     * Unused
     */
    public static final AccessibleRole SEARCH = new AccessibleRole(53);
    
    /**
     * A type of textbox intended for specifying
     *    search criteria.
     */
    public static final AccessibleRole SEARCH_BOX = new AccessibleRole(54);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole SECTION = new AccessibleRole(55);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole SECTION_HEAD = new AccessibleRole(56);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole SELECT = new AccessibleRole(57);
    
    /**
     * A divider that separates and distinguishes
     *    sections of content or groups of menuitems.
     */
    public static final AccessibleRole SEPARATOR = new AccessibleRole(58);
    
    /**
     * A user input where the user selects a value
     *    from within a given range.
     */
    public static final AccessibleRole SLIDER = new AccessibleRole(59);
    
    /**
     * A form of range that expects the user to
     *    select from among discrete choices.
     */
    public static final AccessibleRole SPIN_BUTTON = new AccessibleRole(60);
    
    /**
     * Unused
     */
    public static final AccessibleRole STATUS = new AccessibleRole(61);
    
    /**
     * Abstract role.
     */
    public static final AccessibleRole STRUCTURE = new AccessibleRole(62);
    
    /**
     * A type of checkbox that represents on/off values,
     *    as opposed to checked/unchecked values.
     */
    public static final AccessibleRole SWITCH = new AccessibleRole(63);
    
    /**
     * An item in a list of tab used for switching pages.
     */
    public static final AccessibleRole TAB = new AccessibleRole(64);
    
    /**
     * Unused
     */
    public static final AccessibleRole TABLE = new AccessibleRole(65);
    
    /**
     * A list of tabs for switching pages.
     */
    public static final AccessibleRole TAB_LIST = new AccessibleRole(66);
    
    /**
     * A page in a notebook or stack.
     */
    public static final AccessibleRole TAB_PANEL = new AccessibleRole(67);
    
    /**
     * A type of input that allows free-form text
     *    as its value.
     */
    public static final AccessibleRole TEXT_BOX = new AccessibleRole(68);
    
    /**
     * Unused
     */
    public static final AccessibleRole TIME = new AccessibleRole(69);
    
    /**
     * Unused
     */
    public static final AccessibleRole TIMER = new AccessibleRole(70);
    
    /**
     * Unused
     */
    public static final AccessibleRole TOOLBAR = new AccessibleRole(71);
    
    /**
     * Unused
     */
    public static final AccessibleRole TOOLTIP = new AccessibleRole(72);
    
    /**
     * Unused
     */
    public static final AccessibleRole TREE = new AccessibleRole(73);
    
    /**
     * A treeview-like, columned list.
     */
    public static final AccessibleRole TREE_GRID = new AccessibleRole(74);
    
    /**
     * Unused
     */
    public static final AccessibleRole TREE_ITEM = new AccessibleRole(75);
    
    /**
     * An interactive component of a graphical user
     *    interface. This is the role that GTK uses by default for widgets.
     */
    public static final AccessibleRole WIDGET = new AccessibleRole(76);
    
    /**
     * An application window.
     */
    public static final AccessibleRole WINDOW = new AccessibleRole(77);
    
    public AccessibleRole(int value) {
        super(value);
    }
}
