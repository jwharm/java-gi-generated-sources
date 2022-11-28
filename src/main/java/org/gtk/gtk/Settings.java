package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSettings} provides a mechanism to share global settings between
 * applications.
 * <p>
 * On the X window system, this sharing is realized by an
 * <a href="http://www.freedesktop.org/wiki/Specifications/xsettings-spec">XSettings</a>
 * manager that is usually part of the desktop environment, along with
 * utilities that let the user change these settings.
 * <p>
 * On Wayland, the settings are obtained either via a settings portal,
 * or by reading desktop settings from DConf.
 * <p>
 * In the absence of these sharing mechanisms, GTK reads default values for
 * settings from {@code settings.ini} files in {@code /etc/gtk-4.0}, {@code $XDG_CONFIG_DIRS/gtk-4.0}
 * and {@code $XDG_CONFIG_HOME/gtk-4.0}. These files must be valid key files (see
 * {@code GKeyFile}), and have a section called Settings. Themes can also provide
 * default values for settings by installing a {@code settings.ini} file
 * next to their {@code gtk.css} file.
 * <p>
 * Applications can override system-wide settings by setting the property
 * of the {@code GtkSettings} object with g_object_set(). This should be restricted
 * to special cases though; {@code GtkSettings} are not meant as an application
 * configuration facility.
 * <p>
 * There is one {@code GtkSettings} instance per display. It can be obtained with
 * {@link Settings#getForDisplay}, but in many cases, it is more
 * convenient to use {@link Widget#getSettings}.
 */
public class Settings extends org.gtk.gobject.Object implements org.gtk.gtk.StyleProvider {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSettings";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Settings proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Settings(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Settings if its GType is a (or inherits from) "GtkSettings".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Settings} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSettings", a ClassCastException will be thrown.
     */
    public static Settings castFrom(org.gtk.gobject.Object gobject) {
            return new Settings(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Undoes the effect of calling g_object_set() to install an
     * application-specific value for a setting.
     * <p>
     * After this call, the setting will again follow the session-wide
     * value for this setting.
     * @param name the name of the setting to reset
     */
    public void resetProperty(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_settings_reset_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
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
            RESULT = (long) DowncallHandles.gtk_settings_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets the {@code GtkSettings} object for the default display, creating
     * it if necessary.
     * <p>
     * See {@link Settings#getForDisplay}.
     * @return a {@code GtkSettings} object. If there is
     *   no default display, then returns {@code null}.
     */
    public static @Nullable org.gtk.gtk.Settings getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_settings_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Settings(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GtkSettings} object for {@code display}, creating it if necessary.
     * @param display a {@code GdkDisplay}
     * @return a {@code GtkSettings} object
     */
    public static @NotNull org.gtk.gtk.Settings getForDisplay(@NotNull org.gtk.gdk.Display display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_settings_get_for_display.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Settings(RESULT, Ownership.NONE);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Settings.Build} object constructs a {@link Settings} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Settings} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Settings} using {@link Settings#castFrom}.
         * @return A new instance of {@code Settings} with the properties 
         *         that were set in the Build object.
         */
        public Settings construct() {
            return Settings.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Settings.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether buttons in dialogs should use the alternative button order.
         * @param gtkAlternativeButtonOrder The value for the {@code gtk-alternative-button-order} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkAlternativeButtonOrder(boolean gtkAlternativeButtonOrder) {
            names.add("gtk-alternative-button-order");
            values.add(org.gtk.gobject.Value.create(gtkAlternativeButtonOrder));
            return this;
        }
        
        /**
         * Controls the direction of the sort indicators in sorted list and tree
         * views.
         * <p>
         * By default an arrow pointing down means the column is sorted
         * in ascending order. When set to {@code true}, this order will be inverted.
         * @param gtkAlternativeSortArrows The value for the {@code gtk-alternative-sort-arrows} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkAlternativeSortArrows(boolean gtkAlternativeSortArrows) {
            names.add("gtk-alternative-sort-arrows");
            values.add(org.gtk.gobject.Value.create(gtkAlternativeSortArrows));
            return this;
        }
        
        /**
         * Whether the application prefers to use a dark theme.
         * <p>
         * If a GTK theme includes a dark variant, it will be used
         * instead of the configured theme.
         * <p>
         * Some applications benefit from minimizing the amount of light
         * pollution that interferes with the content. Good candidates for
         * dark themes are photo and video editors that make the actual
         * content get all the attention and minimize the distraction of
         * the chrome.
         * <p>
         * Dark themes should not be used for documents, where large spaces
         * are white/light and the dark chrome creates too much contrast
         * (web browser, text editor...).
         * @param gtkApplicationPreferDarkTheme The value for the {@code gtk-application-prefer-dark-theme} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkApplicationPreferDarkTheme(boolean gtkApplicationPreferDarkTheme) {
            names.add("gtk-application-prefer-dark-theme");
            values.add(org.gtk.gobject.Value.create(gtkApplicationPreferDarkTheme));
            return this;
        }
        
        /**
         * The aspect ratio of the text caret.
         * @param gtkCursorAspectRatio The value for the {@code gtk-cursor-aspect-ratio} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorAspectRatio(double gtkCursorAspectRatio) {
            names.add("gtk-cursor-aspect-ratio");
            values.add(org.gtk.gobject.Value.create(gtkCursorAspectRatio));
            return this;
        }
        
        /**
         * Whether the cursor should blink.
         * <p>
         * Also see the {@code Gtk.Settings:gtk-cursor-blink-timeout} setting,
         * which allows more flexible control over cursor blinking.
         * @param gtkCursorBlink The value for the {@code gtk-cursor-blink} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorBlink(boolean gtkCursorBlink) {
            names.add("gtk-cursor-blink");
            values.add(org.gtk.gobject.Value.create(gtkCursorBlink));
            return this;
        }
        
        /**
         * Length of the cursor blink cycle, in milliseconds.
         * @param gtkCursorBlinkTime The value for the {@code gtk-cursor-blink-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorBlinkTime(int gtkCursorBlinkTime) {
            names.add("gtk-cursor-blink-time");
            values.add(org.gtk.gobject.Value.create(gtkCursorBlinkTime));
            return this;
        }
        
        /**
         * Time after which the cursor stops blinking, in seconds.
         * <p>
         * The timer is reset after each user interaction.
         * <p>
         * Setting this to zero has the same effect as setting
         * {@code Gtk.Settings:gtk-cursor-blink} to {@code false}.
         * @param gtkCursorBlinkTimeout The value for the {@code gtk-cursor-blink-timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorBlinkTimeout(int gtkCursorBlinkTimeout) {
            names.add("gtk-cursor-blink-timeout");
            values.add(org.gtk.gobject.Value.create(gtkCursorBlinkTimeout));
            return this;
        }
        
        /**
         * Name of the cursor theme to use.
         * <p>
         * Use {@code null} to use the default theme.
         * @param gtkCursorThemeName The value for the {@code gtk-cursor-theme-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorThemeName(java.lang.String gtkCursorThemeName) {
            names.add("gtk-cursor-theme-name");
            values.add(org.gtk.gobject.Value.create(gtkCursorThemeName));
            return this;
        }
        
        /**
         * The size to use for cursors.
         * <p>
         * 0 means to use the default size.
         * @param gtkCursorThemeSize The value for the {@code gtk-cursor-theme-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkCursorThemeSize(int gtkCursorThemeSize) {
            names.add("gtk-cursor-theme-size");
            values.add(org.gtk.gobject.Value.create(gtkCursorThemeSize));
            return this;
        }
        
        /**
         * Determines which buttons should be put in the
         * titlebar of client-side decorated windows, and whether they
         * should be placed on the left or right.
         * <p>
         * The format of the string is button names, separated by commas.
         * A colon separates the buttons that should appear on the left
         * from those on the right. Recognized button names are minimize,
         * maximize, close, icon (the window icon) and menu (a menu button
         * for the fallback app menu).
         * <p>
         * For example, "menu:minimize,maximize,close" specifies a menu
         * on the left, and minimize, maximize and close buttons on the right.
         * <p>
         * Note that buttons will only be shown when they are meaningful.
         * E.g. a menu button only appears when the desktop shell does not
         * show the app menu, and a close button only appears on a window
         * that can be closed.
         * <p>
         * Also note that the setting can be overridden with the
         * {@code Gtk.HeaderBar:decoration-layout} property.
         * @param gtkDecorationLayout The value for the {@code gtk-decoration-layout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkDecorationLayout(java.lang.String gtkDecorationLayout) {
            names.add("gtk-decoration-layout");
            values.add(org.gtk.gobject.Value.create(gtkDecorationLayout));
            return this;
        }
        
        /**
         * Whether builtin GTK dialogs such as the file chooser, the
         * color chooser or the font chooser will use a header bar at
         * the top to show action widgets, or an action area at the bottom.
         * <p>
         * This setting does not affect custom dialogs using {@code GtkDialog}
         * directly, or message dialogs.
         * @param gtkDialogsUseHeader The value for the {@code gtk-dialogs-use-header} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkDialogsUseHeader(boolean gtkDialogsUseHeader) {
            names.add("gtk-dialogs-use-header");
            values.add(org.gtk.gobject.Value.create(gtkDialogsUseHeader));
            return this;
        }
        
        /**
         * The number of pixels the cursor can move before dragging.
         * @param gtkDndDragThreshold The value for the {@code gtk-dnd-drag-threshold} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkDndDragThreshold(int gtkDndDragThreshold) {
            names.add("gtk-dnd-drag-threshold");
            values.add(org.gtk.gobject.Value.create(gtkDndDragThreshold));
            return this;
        }
        
        /**
         * The maximum distance allowed between two clicks for them to be considered
         * a double click, in pixels.
         * @param gtkDoubleClickDistance The value for the {@code gtk-double-click-distance} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkDoubleClickDistance(int gtkDoubleClickDistance) {
            names.add("gtk-double-click-distance");
            values.add(org.gtk.gobject.Value.create(gtkDoubleClickDistance));
            return this;
        }
        
        /**
         * The maximum time to allow between two clicks for them to be considered
         * a double click, in milliseconds.
         * @param gtkDoubleClickTime The value for the {@code gtk-double-click-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkDoubleClickTime(int gtkDoubleClickTime) {
            names.add("gtk-double-click-time");
            values.add(org.gtk.gobject.Value.create(gtkDoubleClickTime));
            return this;
        }
        
        /**
         * Whether menu items should have visible accelerators which can be
         * activated.
         * @param gtkEnableAccels The value for the {@code gtk-enable-accels} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEnableAccels(boolean gtkEnableAccels) {
            names.add("gtk-enable-accels");
            values.add(org.gtk.gobject.Value.create(gtkEnableAccels));
            return this;
        }
        
        /**
         * Whether to enable toolkit-wide animations.
         * @param gtkEnableAnimations The value for the {@code gtk-enable-animations} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEnableAnimations(boolean gtkEnableAnimations) {
            names.add("gtk-enable-animations");
            values.add(org.gtk.gobject.Value.create(gtkEnableAnimations));
            return this;
        }
        
        /**
         * Whether to play any event sounds at all.
         * <p>
         * See the <a href="http://www.freedesktop.org/wiki/Specifications/sound-theme-spec">Sound Theme Specifications</a>
         * for more information on event sounds and sound themes.
         * <p>
         * GTK itself does not support event sounds, you have to use a loadable
         * module like the one that comes with libcanberra.
         * @param gtkEnableEventSounds The value for the {@code gtk-enable-event-sounds} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEnableEventSounds(boolean gtkEnableEventSounds) {
            names.add("gtk-enable-event-sounds");
            values.add(org.gtk.gobject.Value.create(gtkEnableEventSounds));
            return this;
        }
        
        /**
         * Whether to play event sounds as feedback to user input.
         * <p>
         * See the <a href="http://www.freedesktop.org/wiki/Specifications/sound-theme-spec">Sound Theme Specifications</a>
         * for more information on event sounds and sound themes.
         * <p>
         * GTK itself does not support event sounds, you have to use a loadable
         * module like the one that comes with libcanberra.
         * @param gtkEnableInputFeedbackSounds The value for the {@code gtk-enable-input-feedback-sounds} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEnableInputFeedbackSounds(boolean gtkEnableInputFeedbackSounds) {
            names.add("gtk-enable-input-feedback-sounds");
            values.add(org.gtk.gobject.Value.create(gtkEnableInputFeedbackSounds));
            return this;
        }
        
        /**
         * Whether a middle click on a mouse should paste the
         * 'PRIMARY' clipboard content at the cursor location.
         * @param gtkEnablePrimaryPaste The value for the {@code gtk-enable-primary-paste} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEnablePrimaryPaste(boolean gtkEnablePrimaryPaste) {
            names.add("gtk-enable-primary-paste");
            values.add(org.gtk.gobject.Value.create(gtkEnablePrimaryPaste));
            return this;
        }
        
        /**
         * How long to show the last input character in hidden
         * entries.
         * <p>
         * This value is in milliseconds. 0 disables showing the
         * last char. 600 is a good value for enabling it.
         * @param gtkEntryPasswordHintTimeout The value for the {@code gtk-entry-password-hint-timeout} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkEntryPasswordHintTimeout(int gtkEntryPasswordHintTimeout) {
            names.add("gtk-entry-password-hint-timeout");
            values.add(org.gtk.gobject.Value.create(gtkEntryPasswordHintTimeout));
            return this;
        }
        
        public Build setGtkEntrySelectOnFocus(boolean gtkEntrySelectOnFocus) {
            names.add("gtk-entry-select-on-focus");
            values.add(org.gtk.gobject.Value.create(gtkEntrySelectOnFocus));
            return this;
        }
        
        /**
         * When {@code true}, keyboard navigation and other input-related errors
         * will cause a beep.
         * <p>
         * Since the error bell is implemented using gdk_surface_beep(), the
         * windowing system may offer ways to configure the error bell in many
         * ways, such as flashing the window or similar visual effects.
         * @param gtkErrorBell The value for the {@code gtk-error-bell} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkErrorBell(boolean gtkErrorBell) {
            names.add("gtk-error-bell");
            values.add(org.gtk.gobject.Value.create(gtkErrorBell));
            return this;
        }
        
        /**
         * The default font to use.
         * <p>
         * GTK uses the family name and size from this string.
         * @param gtkFontName The value for the {@code gtk-font-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkFontName(java.lang.String gtkFontName) {
            names.add("gtk-font-name");
            values.add(org.gtk.gobject.Value.create(gtkFontName));
            return this;
        }
        
        /**
         * Timestamp of the curent fontconfig configuration.
         * @param gtkFontconfigTimestamp The value for the {@code gtk-fontconfig-timestamp} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkFontconfigTimestamp(int gtkFontconfigTimestamp) {
            names.add("gtk-fontconfig-timestamp");
            values.add(org.gtk.gobject.Value.create(gtkFontconfigTimestamp));
            return this;
        }
        
        /**
         * Whether hinting should be applied to font metrics.
         * <p>
         * Note that this also turns off subpixel positioning of glyphs,
         * since it conflicts with metrics hinting.
         * @param gtkHintFontMetrics The value for the {@code gtk-hint-font-metrics} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkHintFontMetrics(boolean gtkHintFontMetrics) {
            names.add("gtk-hint-font-metrics");
            values.add(org.gtk.gobject.Value.create(gtkHintFontMetrics));
            return this;
        }
        
        /**
         * Name of the icon theme to use.
         * <p>
         * See {@link IconTheme} for details about how
         * GTK handles icon themes.
         * @param gtkIconThemeName The value for the {@code gtk-icon-theme-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkIconThemeName(java.lang.String gtkIconThemeName) {
            names.add("gtk-icon-theme-name");
            values.add(org.gtk.gobject.Value.create(gtkIconThemeName));
            return this;
        }
        
        /**
         * Which IM (input method) module should be used by default.
         * <p>
         * This is the input method that will be used if the user has not
         * explicitly chosen another input method from the IM context menu.
         * This also can be a colon-separated list of input methods, which GTK
         * will try in turn until it finds one available on the system.
         * <p>
         * See {@link IMContext}.
         * @param gtkImModule The value for the {@code gtk-im-module} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkImModule(java.lang.String gtkImModule) {
            names.add("gtk-im-module");
            values.add(org.gtk.gobject.Value.create(gtkImModule));
            return this;
        }
        
        /**
         * Whether GTK should make sure that text can be navigated with
         * a caret, even if it is not editable.
         * <p>
         * This is useful when using a screen reader.
         * @param gtkKeynavUseCaret The value for the {@code gtk-keynav-use-caret} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkKeynavUseCaret(boolean gtkKeynavUseCaret) {
            names.add("gtk-keynav-use-caret");
            values.add(org.gtk.gobject.Value.create(gtkKeynavUseCaret));
            return this;
        }
        
        /**
         * Whether to select the contents of a selectable
         * label when it is focused.
         * @param gtkLabelSelectOnFocus The value for the {@code gtk-label-select-on-focus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkLabelSelectOnFocus(boolean gtkLabelSelectOnFocus) {
            names.add("gtk-label-select-on-focus");
            values.add(org.gtk.gobject.Value.create(gtkLabelSelectOnFocus));
            return this;
        }
        
        /**
         * The time for a button or touch press to be considered a “long press”.
         * <p>
         * See {@link GestureLongPress}.
         * @param gtkLongPressTime The value for the {@code gtk-long-press-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkLongPressTime(int gtkLongPressTime) {
            names.add("gtk-long-press-time");
            values.add(org.gtk.gobject.Value.create(gtkLongPressTime));
            return this;
        }
        
        /**
         * Whether scrolled windows may use overlaid scrolling indicators.
         * <p>
         * If this is set to {@code false}, scrolled windows will have permanent
         * scrollbars.
         * @param gtkOverlayScrolling The value for the {@code gtk-overlay-scrolling} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkOverlayScrolling(boolean gtkOverlayScrolling) {
            names.add("gtk-overlay-scrolling");
            values.add(org.gtk.gobject.Value.create(gtkOverlayScrolling));
            return this;
        }
        
        /**
         * If the value of this setting is {@code true}, clicking the primary button in a
         * {@code GtkRange} trough will move the slider, and hence set the range’s value, to
         * the point that you clicked.
         * <p>
         * If it is {@code false}, a primary click will cause the slider/value to move
         * by the range’s page-size towards the point clicked.
         * <p>
         * Whichever action you choose for the primary button, the other action will
         * be available by holding Shift and primary-clicking, or clicking the middle
         * mouse button.
         * @param gtkPrimaryButtonWarpsSlider The value for the {@code gtk-primary-button-warps-slider} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkPrimaryButtonWarpsSlider(boolean gtkPrimaryButtonWarpsSlider) {
            names.add("gtk-primary-button-warps-slider");
            values.add(org.gtk.gobject.Value.create(gtkPrimaryButtonWarpsSlider));
            return this;
        }
        
        /**
         * A comma-separated list of print backends to use in the print
         * dialog.
         * <p>
         * Available print backends depend on the GTK installation,
         * and may include "file", "cups", "lpr" or "papi".
         * @param gtkPrintBackends The value for the {@code gtk-print-backends} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkPrintBackends(java.lang.String gtkPrintBackends) {
            names.add("gtk-print-backends");
            values.add(org.gtk.gobject.Value.create(gtkPrintBackends));
            return this;
        }
        
        /**
         * A command to run for displaying the print preview.
         * <p>
         * The command should contain a {@code %f} placeholder, which will get
         * replaced by the path to the pdf file. The command may also
         * contain a {@code %s} placeholder, which will get replaced by the
         * path to a file containing the print settings in the format
         * produced by {@link PrintSettings#toFile}.
         * <p>
         * The preview application is responsible for removing the pdf
         * file and the print settings file when it is done.
         * @param gtkPrintPreviewCommand The value for the {@code gtk-print-preview-command} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkPrintPreviewCommand(java.lang.String gtkPrintPreviewCommand) {
            names.add("gtk-print-preview-command");
            values.add(org.gtk.gobject.Value.create(gtkPrintPreviewCommand));
            return this;
        }
        
        /**
         * Whether GTK should keep track of items inside the recently used
         * resources list.
         * <p>
         * If set to {@code false}, the list will always be empty.
         * @param gtkRecentFilesEnabled The value for the {@code gtk-recent-files-enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkRecentFilesEnabled(boolean gtkRecentFilesEnabled) {
            names.add("gtk-recent-files-enabled");
            values.add(org.gtk.gobject.Value.create(gtkRecentFilesEnabled));
            return this;
        }
        
        /**
         * The maximum age, in days, of the items inside the recently used
         * resources list.
         * <p>
         * Items older than this setting will be excised from the list.
         * If set to 0, the list will always be empty; if set to -1, no
         * item will be removed.
         * @param gtkRecentFilesMaxAge The value for the {@code gtk-recent-files-max-age} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkRecentFilesMaxAge(int gtkRecentFilesMaxAge) {
            names.add("gtk-recent-files-max-age");
            values.add(org.gtk.gobject.Value.create(gtkRecentFilesMaxAge));
            return this;
        }
        
        /**
         * Set to {@code true} if the desktop environment is displaying
         * the app menu, {@code false} if the app should display it itself.
         * @param gtkShellShowsAppMenu The value for the {@code gtk-shell-shows-app-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkShellShowsAppMenu(boolean gtkShellShowsAppMenu) {
            names.add("gtk-shell-shows-app-menu");
            values.add(org.gtk.gobject.Value.create(gtkShellShowsAppMenu));
            return this;
        }
        
        /**
         * Set to {@code true} if the desktop environment is displaying
         * the desktop folder, {@code false} if not.
         * @param gtkShellShowsDesktop The value for the {@code gtk-shell-shows-desktop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkShellShowsDesktop(boolean gtkShellShowsDesktop) {
            names.add("gtk-shell-shows-desktop");
            values.add(org.gtk.gobject.Value.create(gtkShellShowsDesktop));
            return this;
        }
        
        /**
         * Set to {@code true} if the desktop environment is displaying
         * the menubar, {@code false} if the app should display it itself.
         * @param gtkShellShowsMenubar The value for the {@code gtk-shell-shows-menubar} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkShellShowsMenubar(boolean gtkShellShowsMenubar) {
            names.add("gtk-shell-shows-menubar");
            values.add(org.gtk.gobject.Value.create(gtkShellShowsMenubar));
            return this;
        }
        
        /**
         * The XDG sound theme to use for event sounds.
         * <p>
         * See the <a href="http://www.freedesktop.org/wiki/Specifications/sound-theme-spec">Sound Theme Specifications</a>
         * for more information on event sounds and sound themes.
         * <p>
         * GTK itself does not support event sounds, you have to use
         * a loadable module like the one that comes with libcanberra.
         * @param gtkSoundThemeName The value for the {@code gtk-sound-theme-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkSoundThemeName(java.lang.String gtkSoundThemeName) {
            names.add("gtk-sound-theme-name");
            values.add(org.gtk.gobject.Value.create(gtkSoundThemeName));
            return this;
        }
        
        /**
         * Whether two cursors should be displayed for mixed left-to-right and
         * right-to-left text.
         * @param gtkSplitCursor The value for the {@code gtk-split-cursor} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkSplitCursor(boolean gtkSplitCursor) {
            names.add("gtk-split-cursor");
            values.add(org.gtk.gobject.Value.create(gtkSplitCursor));
            return this;
        }
        
        /**
         * Name of the theme to load.
         * <p>
         * See {@link CssProvider} for details about how
         * GTK finds the CSS stylesheet for a theme.
         * @param gtkThemeName The value for the {@code gtk-theme-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkThemeName(java.lang.String gtkThemeName) {
            names.add("gtk-theme-name");
            values.add(org.gtk.gobject.Value.create(gtkThemeName));
            return this;
        }
        
        /**
         * Determines the action to take when a double-click
         * occurs on the titlebar of client-side decorated windows.
         * <p>
         * Recognized actions are minimize, toggle-maximize, menu, lower
         * or none.
         * @param gtkTitlebarDoubleClick The value for the {@code gtk-titlebar-double-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkTitlebarDoubleClick(java.lang.String gtkTitlebarDoubleClick) {
            names.add("gtk-titlebar-double-click");
            values.add(org.gtk.gobject.Value.create(gtkTitlebarDoubleClick));
            return this;
        }
        
        /**
         * Determines the action to take when a middle-click
         * occurs on the titlebar of client-side decorated windows.
         * <p>
         * Recognized actions are minimize, toggle-maximize, menu, lower
         * or none.
         * @param gtkTitlebarMiddleClick The value for the {@code gtk-titlebar-middle-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkTitlebarMiddleClick(java.lang.String gtkTitlebarMiddleClick) {
            names.add("gtk-titlebar-middle-click");
            values.add(org.gtk.gobject.Value.create(gtkTitlebarMiddleClick));
            return this;
        }
        
        /**
         * Determines the action to take when a right-click
         * occurs on the titlebar of client-side decorated windows.
         * <p>
         * Recognized actions are minimize, toggle-maximize, menu, lower
         * or none.
         * @param gtkTitlebarRightClick The value for the {@code gtk-titlebar-right-click} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkTitlebarRightClick(java.lang.String gtkTitlebarRightClick) {
            names.add("gtk-titlebar-right-click");
            values.add(org.gtk.gobject.Value.create(gtkTitlebarRightClick));
            return this;
        }
        
        /**
         * Whether to antialias fonts.
         * <p>
         * The values are 0 for no, 1 for yes, or -1 for the system default.
         * @param gtkXftAntialias The value for the {@code gtk-xft-antialias} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkXftAntialias(int gtkXftAntialias) {
            names.add("gtk-xft-antialias");
            values.add(org.gtk.gobject.Value.create(gtkXftAntialias));
            return this;
        }
        
        /**
         * The font resolution, in 1024 * dots/inch.
         * <p>
         * -1 to use the default value.
         * @param gtkXftDpi The value for the {@code gtk-xft-dpi} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkXftDpi(int gtkXftDpi) {
            names.add("gtk-xft-dpi");
            values.add(org.gtk.gobject.Value.create(gtkXftDpi));
            return this;
        }
        
        /**
         * Whether to enable font hinting.
         * <p>
         * The values are 0 for no, 1 for yes, or -1 for the system default.
         * @param gtkXftHinting The value for the {@code gtk-xft-hinting} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkXftHinting(int gtkXftHinting) {
            names.add("gtk-xft-hinting");
            values.add(org.gtk.gobject.Value.create(gtkXftHinting));
            return this;
        }
        
        /**
         * What degree of font hinting to use.
         * <p>
         * The possible vaues are hintnone, hintslight,
         * hintmedium, hintfull.
         * @param gtkXftHintstyle The value for the {@code gtk-xft-hintstyle} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkXftHintstyle(java.lang.String gtkXftHintstyle) {
            names.add("gtk-xft-hintstyle");
            values.add(org.gtk.gobject.Value.create(gtkXftHintstyle));
            return this;
        }
        
        /**
         * The type of subpixel antialiasing to use.
         * <p>
         * The possible values are none, rgb, bgr, vrgb, vbgr.
         * @param gtkXftRgba The value for the {@code gtk-xft-rgba} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGtkXftRgba(java.lang.String gtkXftRgba) {
            names.add("gtk-xft-rgba");
            values.add(org.gtk.gobject.Value.create(gtkXftRgba));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_settings_reset_property = Interop.downcallHandle(
            "gtk_settings_reset_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_settings_get_type = Interop.downcallHandle(
            "gtk_settings_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gtk_settings_get_default = Interop.downcallHandle(
            "gtk_settings_get_default",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_settings_get_for_display = Interop.downcallHandle(
            "gtk_settings_get_for_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
