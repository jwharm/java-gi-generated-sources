package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes available shortcuts in an {@link TabView}.
 * <p>
 * Shortcuts can be set with {@code TabView:shortcuts}, or added/removed
 * individually with {@code TabView#addShortcuts} and
 * {@code TabView#removeShortcuts}.
 * <p>
 * New values may be added to this enumeration over time.
 * @version 1.2
 */
public class TabViewShortcuts extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "AdwTabViewShortcuts";
    
    /**
     * No shortcuts
     */
    public static final TabViewShortcuts NONE = new TabViewShortcuts(0);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the next page, with looping
     */
    public static final TabViewShortcuts CONTROL_TAB = new TabViewShortcuts(1);
    
    /**
     * &lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Tab&lt;/kbd&gt; - switch to the previous
     *   page, with looping
     */
    public static final TabViewShortcuts CONTROL_SHIFT_TAB = new TabViewShortcuts(2);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - switch to the previous page
     */
    public static final TabViewShortcuts CONTROL_PAGE_UP = new TabViewShortcuts(4);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - switch to the next page
     */
    public static final TabViewShortcuts CONTROL_PAGE_DOWN = new TabViewShortcuts(8);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - switch to the first page
     */
    public static final TabViewShortcuts CONTROL_HOME = new TabViewShortcuts(16);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - switch to the last page
     */
    public static final TabViewShortcuts CONTROL_END = new TabViewShortcuts(32);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Up&lt;/kbd&gt; - move the selected
     *   page backward
     */
    public static final TabViewShortcuts CONTROL_SHIFT_PAGE_UP = new TabViewShortcuts(64);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Page Down&lt;/kbd&gt; - move the selected
     *   page forward
     */
    public static final TabViewShortcuts CONTROL_SHIFT_PAGE_DOWN = new TabViewShortcuts(128);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;Home&lt;/kbd&gt; - move the selected page
     *   at the start
     */
    public static final TabViewShortcuts CONTROL_SHIFT_HOME = new TabViewShortcuts(256);
    
    /**
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;+&lt;kbd&gt;Shift&lt;/kbd&gt;+&lt;kbd&gt;End&lt;/kbd&gt; - move the current page at
     *   the end
     */
    public static final TabViewShortcuts CONTROL_SHIFT_END = new TabViewShortcuts(512);
    
    /**
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;1&lt;/kbd&gt;⋯&lt;kbd&gt;9&lt;/kbd&gt; - switch to pages 1-9
     */
    public static final TabViewShortcuts ALT_DIGITS = new TabViewShortcuts(1024);
    
    /**
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;0&lt;/kbd&gt; - switch to page 10
     */
    public static final TabViewShortcuts ALT_ZERO = new TabViewShortcuts(2048);
    
    /**
     * All of the shortcuts
     */
    public static final TabViewShortcuts ALL_SHORTCUTS = new TabViewShortcuts(4095);
    
    public TabViewShortcuts(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TabViewShortcuts or(TabViewShortcuts... masks) {
        int value = this.getValue();
        for (TabViewShortcuts arg : masks) {
            value |= arg.getValue();
        }
        return new TabViewShortcuts(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TabViewShortcuts combined(TabViewShortcuts mask, TabViewShortcuts... masks) {
        int value = mask.getValue();
        for (TabViewShortcuts arg : masks) {
            value |= arg.getValue();
        }
        return new TabViewShortcuts(value);
    }
}
