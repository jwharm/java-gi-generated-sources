package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A set of commands that may be issued to an element providing the
 * {@link Navigation} interface. The available commands can be queried via
 * the gst_navigation_query_new_commands() query.
 * <p>
 * For convenience in handling DVD navigation, the MENU commands are aliased as:
 *    GST_NAVIGATION_COMMAND_DVD_MENU            = {@code GST_NAVIGATION_COMMAND_MENU1}
 *    GST_NAVIGATION_COMMAND_DVD_TITLE_MENU      = {@code GST_NAVIGATION_COMMAND_MENU2}
 *    GST_NAVIGATION_COMMAND_DVD_ROOT_MENU       = {@code GST_NAVIGATION_COMMAND_MENU3}
 *    GST_NAVIGATION_COMMAND_DVD_SUBPICTURE_MENU = {@code GST_NAVIGATION_COMMAND_MENU4}
 *    GST_NAVIGATION_COMMAND_DVD_AUDIO_MENU      = {@code GST_NAVIGATION_COMMAND_MENU5}
 *    GST_NAVIGATION_COMMAND_DVD_ANGLE_MENU      = {@code GST_NAVIGATION_COMMAND_MENU6}
 *    GST_NAVIGATION_COMMAND_DVD_CHAPTER_MENU    = {@code GST_NAVIGATION_COMMAND_MENU7}
 */
public enum NavigationCommand implements io.github.jwharm.javagi.Enumeration {
    /**
     * An invalid command entry
     */
    INVALID(0),
    /**
     * Execute navigation menu command 1. For DVD,
     * this enters the DVD root menu, or exits back to the title from the menu.
     */
    MENU1(1),
    /**
     * Execute navigation menu command 2. For DVD,
     * this jumps to the DVD title menu.
     */
    MENU2(2),
    /**
     * Execute navigation menu command 3. For DVD,
     * this jumps into the DVD root menu.
     */
    MENU3(3),
    /**
     * Execute navigation menu command 4. For DVD,
     * this jumps to the Subpicture menu.
     */
    MENU4(4),
    /**
     * Execute navigation menu command 5. For DVD,
     * the jumps to the audio menu.
     */
    MENU5(5),
    /**
     * Execute navigation menu command 6. For DVD,
     * this jumps to the angles menu.
     */
    MENU6(6),
    /**
     * Execute navigation menu command 7. For DVD,
     * this jumps to the chapter menu.
     */
    MENU7(7),
    /**
     * Select the next button to the left in a menu,
     * if such a button exists.
     */
    LEFT(20),
    /**
     * Select the next button to the right in a menu,
     * if such a button exists.
     */
    RIGHT(21),
    /**
     * Select the button above the current one in a
     * menu, if such a button exists.
     */
    UP(22),
    /**
     * Select the button below the current one in a
     * menu, if such a button exists.
     */
    DOWN(23),
    /**
     * Activate (click) the currently selected
     * button in a menu, if such a button exists.
     */
    ACTIVATE(24),
    /**
     * Switch to the previous angle in a
     * multiangle feature.
     */
    PREV_ANGLE(30),
    /**
     * Switch to the next angle in a multiangle
     * feature.
     */
    NEXT_ANGLE(31);
    
    private static final java.lang.String C_TYPE_NAME = "GstNavigationCommand";
    
    private final int value;
    NavigationCommand(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static NavigationCommand of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> MENU1;
            case 2 -> MENU2;
            case 3 -> MENU3;
            case 4 -> MENU4;
            case 5 -> MENU5;
            case 6 -> MENU6;
            case 7 -> MENU7;
            case 20 -> LEFT;
            case 21 -> RIGHT;
            case 22 -> UP;
            case 23 -> DOWN;
            case 24 -> ACTIVATE;
            case 30 -> PREV_ANGLE;
            case 31 -> NEXT_ANGLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
