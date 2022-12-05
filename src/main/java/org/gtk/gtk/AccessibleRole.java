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
public enum AccessibleRole implements io.github.jwharm.javagi.Enumeration {
    /**
     * An element with important, and usually
     *   time-sensitive, information
     */
    ALERT(0),
    /**
     * A type of dialog that contains an
     *   alert message
     */
    ALERT_DIALOG(1),
    /**
     * Unused
     */
    BANNER(2),
    /**
     * An input element that allows for
     *   user-triggered actions when clicked or pressed
     */
    BUTTON(3),
    /**
     * Unused
     */
    CAPTION(4),
    /**
     * Unused
     */
    CELL(5),
    /**
     * A checkable input element that has
     *   three possible values: {@code true}, {@code false}, or {@code mixed}
     */
    CHECKBOX(6),
    /**
     * A header in a columned list.
     */
    COLUMN_HEADER(7),
    /**
     * An input that controls another element,
     *   such as a list or a grid, that can dynamically pop up to help the user
     *   set the value of the input
     */
    COMBO_BOX(8),
    /**
     * Abstract role.
     */
    COMMAND(9),
    /**
     * Abstract role.
     */
    COMPOSITE(10),
    /**
     * A dialog is a window that is designed to interrupt
     *    the current processing of an application in order to prompt the user to enter
     *    information or require a response.
     */
    DIALOG(11),
    /**
     * Unused
     */
    DOCUMENT(12),
    /**
     * Unused
     */
    FEED(13),
    /**
     * Unused
     */
    FORM(14),
    /**
     * Unused
     */
    GENERIC(15),
    /**
     * A grid of items.
     */
    GRID(16),
    /**
     * An item in a grid or tree grid.
     */
    GRID_CELL(17),
    /**
     * An element that groups multiple widgets. GTK uses
     *   this role for various containers, like {@link Box}, and {@link HeaderBar}.
     */
    GROUP(18),
    /**
     * Unused
     */
    HEADING(19),
    /**
     * An image.
     */
    IMG(20),
    /**
     * Abstract role.
     */
    INPUT(21),
    /**
     * A visible name or caption for a user interface component.
     */
    LABEL(22),
    /**
     * Abstract role.
     */
    LANDMARK(23),
    /**
     * Unused
     */
    LEGEND(24),
    /**
     * A clickable link.
     */
    LINK(25),
    /**
     * A list of items.
     */
    LIST(26),
    /**
     * Unused.
     */
    LIST_BOX(27),
    /**
     * An item in a list.
     */
    LIST_ITEM(28),
    /**
     * Unused
     */
    LOG(29),
    /**
     * Unused
     */
    MAIN(30),
    /**
     * Unused
     */
    MARQUEE(31),
    /**
     * Unused
     */
    MATH(32),
    /**
     * An element that represents a value within a known range.
     */
    METER(33),
    /**
     * A menu.
     */
    MENU(34),
    /**
     * A menubar.
     */
    MENU_BAR(35),
    /**
     * An item in a menu.
     */
    MENU_ITEM(36),
    /**
     * A check item in a menu.
     */
    MENU_ITEM_CHECKBOX(37),
    /**
     * A radio item in a menu.
     */
    MENU_ITEM_RADIO(38),
    /**
     * Unused
     */
    NAVIGATION(39),
    /**
     * An element that is not represented to accessibility technologies.
     */
    NONE(40),
    /**
     * Unused
     */
    NOTE(41),
    /**
     * Unused
     */
    OPTION(42),
    /**
     * An element that is not represented to accessibility technologies.
     */
    PRESENTATION(43),
    /**
     * An element that displays the progress
     *    status for tasks that take a long time.
     */
    PROGRESS_BAR(44),
    /**
     * A checkable input in a group of radio roles,
     *    only one of which can be checked at a time.
     */
    RADIO(45),
    /**
     * Unused
     */
    RADIO_GROUP(46),
    /**
     * Abstract role.
     */
    RANGE(47),
    /**
     * Unused
     */
    REGION(48),
    /**
     * A row in a columned list.
     */
    ROW(49),
    /**
     * Unused
     */
    ROW_GROUP(50),
    /**
     * Unused
     */
    ROW_HEADER(51),
    /**
     * A graphical object that controls the scrolling
     *    of content within a viewing area, regardless of whether the content is fully
     *    displayed within the viewing area.
     */
    SCROLLBAR(52),
    /**
     * Unused
     */
    SEARCH(53),
    /**
     * A type of textbox intended for specifying
     *    search criteria.
     */
    SEARCH_BOX(54),
    /**
     * Abstract role.
     */
    SECTION(55),
    /**
     * Abstract role.
     */
    SECTION_HEAD(56),
    /**
     * Abstract role.
     */
    SELECT(57),
    /**
     * A divider that separates and distinguishes
     *    sections of content or groups of menuitems.
     */
    SEPARATOR(58),
    /**
     * A user input where the user selects a value
     *    from within a given range.
     */
    SLIDER(59),
    /**
     * A form of range that expects the user to
     *    select from among discrete choices.
     */
    SPIN_BUTTON(60),
    /**
     * Unused
     */
    STATUS(61),
    /**
     * Abstract role.
     */
    STRUCTURE(62),
    /**
     * A type of checkbox that represents on/off values,
     *    as opposed to checked/unchecked values.
     */
    SWITCH(63),
    /**
     * An item in a list of tab used for switching pages.
     */
    TAB(64),
    /**
     * Unused
     */
    TABLE(65),
    /**
     * A list of tabs for switching pages.
     */
    TAB_LIST(66),
    /**
     * A page in a notebook or stack.
     */
    TAB_PANEL(67),
    /**
     * A type of input that allows free-form text
     *    as its value.
     */
    TEXT_BOX(68),
    /**
     * Unused
     */
    TIME(69),
    /**
     * Unused
     */
    TIMER(70),
    /**
     * Unused
     */
    TOOLBAR(71),
    /**
     * Unused
     */
    TOOLTIP(72),
    /**
     * Unused
     */
    TREE(73),
    /**
     * A treeview-like, columned list.
     */
    TREE_GRID(74),
    /**
     * Unused
     */
    TREE_ITEM(75),
    /**
     * An interactive component of a graphical user
     *    interface. This is the role that GTK uses by default for widgets.
     */
    WIDGET(76),
    /**
     * An application window.
     */
    WINDOW(77);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleRole";
    
    private final int value;
    AccessibleRole(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AccessibleRole of(int value) {
        return switch (value) {
            case 0 -> ALERT;
            case 1 -> ALERT_DIALOG;
            case 2 -> BANNER;
            case 3 -> BUTTON;
            case 4 -> CAPTION;
            case 5 -> CELL;
            case 6 -> CHECKBOX;
            case 7 -> COLUMN_HEADER;
            case 8 -> COMBO_BOX;
            case 9 -> COMMAND;
            case 10 -> COMPOSITE;
            case 11 -> DIALOG;
            case 12 -> DOCUMENT;
            case 13 -> FEED;
            case 14 -> FORM;
            case 15 -> GENERIC;
            case 16 -> GRID;
            case 17 -> GRID_CELL;
            case 18 -> GROUP;
            case 19 -> HEADING;
            case 20 -> IMG;
            case 21 -> INPUT;
            case 22 -> LABEL;
            case 23 -> LANDMARK;
            case 24 -> LEGEND;
            case 25 -> LINK;
            case 26 -> LIST;
            case 27 -> LIST_BOX;
            case 28 -> LIST_ITEM;
            case 29 -> LOG;
            case 30 -> MAIN;
            case 31 -> MARQUEE;
            case 32 -> MATH;
            case 33 -> METER;
            case 34 -> MENU;
            case 35 -> MENU_BAR;
            case 36 -> MENU_ITEM;
            case 37 -> MENU_ITEM_CHECKBOX;
            case 38 -> MENU_ITEM_RADIO;
            case 39 -> NAVIGATION;
            case 40 -> NONE;
            case 41 -> NOTE;
            case 42 -> OPTION;
            case 43 -> PRESENTATION;
            case 44 -> PROGRESS_BAR;
            case 45 -> RADIO;
            case 46 -> RADIO_GROUP;
            case 47 -> RANGE;
            case 48 -> REGION;
            case 49 -> ROW;
            case 50 -> ROW_GROUP;
            case 51 -> ROW_HEADER;
            case 52 -> SCROLLBAR;
            case 53 -> SEARCH;
            case 54 -> SEARCH_BOX;
            case 55 -> SECTION;
            case 56 -> SECTION_HEAD;
            case 57 -> SELECT;
            case 58 -> SEPARATOR;
            case 59 -> SLIDER;
            case 60 -> SPIN_BUTTON;
            case 61 -> STATUS;
            case 62 -> STRUCTURE;
            case 63 -> SWITCH;
            case 64 -> TAB;
            case 65 -> TABLE;
            case 66 -> TAB_LIST;
            case 67 -> TAB_PANEL;
            case 68 -> TEXT_BOX;
            case 69 -> TIME;
            case 70 -> TIMER;
            case 71 -> TOOLBAR;
            case 72 -> TOOLTIP;
            case 73 -> TREE;
            case 74 -> TREE_GRID;
            case 75 -> TREE_ITEM;
            case 76 -> WIDGET;
            case 77 -> WINDOW;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
