package org.gtk.gtk;

/**
 * The accessible role for a [iface@Accessible] implementation.
 * 
 * Abstract roles are only used as part of the ontology; application
 * developers must not use abstract roles in their code.
 */
public enum AccessibleRole {

    /**
     * An element with important, and usually
     *   time-sensitive, information
     */
    ALERT,
    
    /**
     * A type of dialog that contains an
     *   alert message
     */
    ALERT_DIALOG,
    
    /**
     * Unused
     */
    BANNER,
    
    /**
     * An input element that allows for
     *   user-triggered actions when clicked or pressed
     */
    BUTTON,
    
    /**
     * Unused
     */
    CAPTION,
    
    /**
     * Unused
     */
    CELL,
    
    /**
     * A checkable input element that has
     *   three possible values: `true`, `false`, or `mixed`
     */
    CHECKBOX,
    
    /**
     * A header in a columned list.
     */
    COLUMN_HEADER,
    
    /**
     * An input that controls another element,
     *   such as a list or a grid, that can dynamically pop up to help the user
     *   set the value of the input
     */
    COMBO_BOX,
    
    /**
     * Abstract role.
     */
    COMMAND,
    
    /**
     * Abstract role.
     */
    COMPOSITE,
    
    /**
     * A dialog is a window that is designed to interrupt
     *    the current processing of an application in order to prompt the user to enter
     *    information or require a response.
     */
    DIALOG,
    
    /**
     * Unused
     */
    DOCUMENT,
    
    /**
     * Unused
     */
    FEED,
    
    /**
     * Unused
     */
    FORM,
    
    /**
     * Unused
     */
    GENERIC,
    
    /**
     * A grid of items.
     */
    GRID,
    
    /**
     * An item in a grid or tree grid.
     */
    GRID_CELL,
    
    /**
     * An element that groups multiple widgets. GTK uses
     *   this role for various containers, like [class@Box], [class@Viewport], and [class@HeaderBar].
     */
    GROUP,
    
    /**
     * Unused
     */
    HEADING,
    
    /**
     * An image.
     */
    IMG,
    
    /**
     * Abstract role.
     */
    INPUT,
    
    /**
     * A visible name or caption for a user interface component.
     */
    LABEL,
    
    /**
     * Abstract role.
     */
    LANDMARK,
    
    /**
     * Unused
     */
    LEGEND,
    
    /**
     * A clickable link.
     */
    LINK,
    
    /**
     * A list of items.
     */
    LIST,
    
    /**
     * Unused.
     */
    LIST_BOX,
    
    /**
     * An item in a list.
     */
    LIST_ITEM,
    
    /**
     * Unused
     */
    LOG,
    
    /**
     * Unused
     */
    MAIN,
    
    /**
     * Unused
     */
    MARQUEE,
    
    /**
     * Unused
     */
    MATH,
    
    /**
     * An element that represents a value within a known range.
     */
    METER,
    
    /**
     * A menu.
     */
    MENU,
    
    /**
     * A menubar.
     */
    MENU_BAR,
    
    /**
     * An item in a menu.
     */
    MENU_ITEM,
    
    /**
     * A check item in a menu.
     */
    MENU_ITEM_CHECKBOX,
    
    /**
     * A radio item in a menu.
     */
    MENU_ITEM_RADIO,
    
    /**
     * Unused
     */
    NAVIGATION,
    
    /**
     * An element that is not represented to accessibility technologies.
     */
    NONE,
    
    /**
     * Unused
     */
    NOTE,
    
    /**
     * Unused
     */
    OPTION,
    
    /**
     * An element that is not represented to accessibility technologies.
     */
    PRESENTATION,
    
    /**
     * An element that displays the progress
     *    status for tasks that take a long time.
     */
    PROGRESS_BAR,
    
    /**
     * A checkable input in a group of radio roles,
     *    only one of which can be checked at a time.
     */
    RADIO,
    
    /**
     * Unused
     */
    RADIO_GROUP,
    
    /**
     * Abstract role.
     */
    RANGE,
    
    /**
     * Unused
     */
    REGION,
    
    /**
     * A row in a columned list.
     */
    ROW,
    
    /**
     * Unused
     */
    ROW_GROUP,
    
    /**
     * Unused
     */
    ROW_HEADER,
    
    /**
     * A graphical object that controls the scrolling
     *    of content within a viewing area, regardless of whether the content is fully
     *    displayed within the viewing area.
     */
    SCROLLBAR,
    
    /**
     * Unused
     */
    SEARCH,
    
    /**
     * A type of textbox intended for specifying
     *    search criteria.
     */
    SEARCH_BOX,
    
    /**
     * Abstract role.
     */
    SECTION,
    
    /**
     * Abstract role.
     */
    SECTION_HEAD,
    
    /**
     * Abstract role.
     */
    SELECT,
    
    /**
     * A divider that separates and distinguishes
     *    sections of content or groups of menuitems.
     */
    SEPARATOR,
    
    /**
     * A user input where the user selects a value
     *    from within a given range.
     */
    SLIDER,
    
    /**
     * A form of range that expects the user to
     *    select from among discrete choices.
     */
    SPIN_BUTTON,
    
    /**
     * Unused
     */
    STATUS,
    
    /**
     * Abstract role.
     */
    STRUCTURE,
    
    /**
     * A type of checkbox that represents on/off values,
     *    as opposed to checked/unchecked values.
     */
    SWITCH,
    
    /**
     * An item in a list of tab used for switching pages.
     */
    TAB,
    
    /**
     * Unused
     */
    TABLE,
    
    /**
     * A list of tabs for switching pages.
     */
    TAB_LIST,
    
    /**
     * A page in a notebook or stack.
     */
    TAB_PANEL,
    
    /**
     * A type of input that allows free-form text
     *    as its value.
     */
    TEXT_BOX,
    
    /**
     * Unused
     */
    TIME,
    
    /**
     * Unused
     */
    TIMER,
    
    /**
     * Unused
     */
    TOOLBAR,
    
    /**
     * Unused
     */
    TOOLTIP,
    
    /**
     * Unused
     */
    TREE,
    
    /**
     * A treeview-like, columned list.
     */
    TREE_GRID,
    
    /**
     * Unused
     */
    TREE_ITEM,
    
    /**
     * An interactive component of a graphical user
     *    interface. This is the role that GTK uses by default for widgets.
     */
    WIDGET,
    
    /**
     * An application window.
     */
    WINDOW;
    
    public static AccessibleRole fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALERT -> 0;
            case ALERT_DIALOG -> 1;
            case BANNER -> 2;
            case BUTTON -> 3;
            case CAPTION -> 4;
            case CELL -> 5;
            case CHECKBOX -> 6;
            case COLUMN_HEADER -> 7;
            case COMBO_BOX -> 8;
            case COMMAND -> 9;
            case COMPOSITE -> 10;
            case DIALOG -> 11;
            case DOCUMENT -> 12;
            case FEED -> 13;
            case FORM -> 14;
            case GENERIC -> 15;
            case GRID -> 16;
            case GRID_CELL -> 17;
            case GROUP -> 18;
            case HEADING -> 19;
            case IMG -> 20;
            case INPUT -> 21;
            case LABEL -> 22;
            case LANDMARK -> 23;
            case LEGEND -> 24;
            case LINK -> 25;
            case LIST -> 26;
            case LIST_BOX -> 27;
            case LIST_ITEM -> 28;
            case LOG -> 29;
            case MAIN -> 30;
            case MARQUEE -> 31;
            case MATH -> 32;
            case METER -> 33;
            case MENU -> 34;
            case MENU_BAR -> 35;
            case MENU_ITEM -> 36;
            case MENU_ITEM_CHECKBOX -> 37;
            case MENU_ITEM_RADIO -> 38;
            case NAVIGATION -> 39;
            case NONE -> 40;
            case NOTE -> 41;
            case OPTION -> 42;
            case PRESENTATION -> 43;
            case PROGRESS_BAR -> 44;
            case RADIO -> 45;
            case RADIO_GROUP -> 46;
            case RANGE -> 47;
            case REGION -> 48;
            case ROW -> 49;
            case ROW_GROUP -> 50;
            case ROW_HEADER -> 51;
            case SCROLLBAR -> 52;
            case SEARCH -> 53;
            case SEARCH_BOX -> 54;
            case SECTION -> 55;
            case SECTION_HEAD -> 56;
            case SELECT -> 57;
            case SEPARATOR -> 58;
            case SLIDER -> 59;
            case SPIN_BUTTON -> 60;
            case STATUS -> 61;
            case STRUCTURE -> 62;
            case SWITCH -> 63;
            case TAB -> 64;
            case TABLE -> 65;
            case TAB_LIST -> 66;
            case TAB_PANEL -> 67;
            case TEXT_BOX -> 68;
            case TIME -> 69;
            case TIMER -> 70;
            case TOOLBAR -> 71;
            case TOOLTIP -> 72;
            case TREE -> 73;
            case TREE_GRID -> 74;
            case TREE_ITEM -> 75;
            case WIDGET -> 76;
            case WINDOW -> 77;
        };
    }

}